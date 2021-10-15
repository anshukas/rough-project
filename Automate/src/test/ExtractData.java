package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * xyz
 * @author anshu
 *
 */

public class ExtractData {
	public static void main(String[] args){
		File input = new File("C:\\tmp\\input.html");
		Document doc;
		try {
			
			doc = Jsoup.connect("http://netshoes-br-hmg02.ns2online.com.br/search?Ntt=camisa").get();
			Elements links = doc.getElementsByAttribute("data-product");
			List listOfPid = new ArrayList<String>();
			for (Element link : links) {
			  String linkAtrtr = link.attr("data-product");
			  String[] ary = linkAtrtr.split(",");
			  
			  //System.out.println(linkAtrtr);
			  
			  listOfPid.add(getPids(ary));
			}
			if(listOfPid.size()>0)
				System.out.println(listOfPid.size());
			else
				System.out.println("No Product ids found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List getPids(String[] ary) {
		List list = new ArrayList<String>();
		for (int i = 0; i < ary.length; i++) {
			if(ary[i].contains("sku")){
				String[] skuStringAry = ary[i].split(":");
				String pIds = skuStringAry[1].replace("\"", "").substring(0, 8);
				list.add(pIds);
				System.out.println(pIds);
			}
		}
		return list;
	}
}
