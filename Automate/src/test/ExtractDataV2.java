package test;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class ExtractDataV2 {
	public static void main(String[] args){
		File input = new File("C:\\tmp\\input.html");
		Document doc;
		try {
			//doc = Jsoup.parse(input, "UTF-8", "http://www.netshoes.com.br/search?Ntt=sapato+social");
			//doc = Jsoup.parse(input, "UTF-8", "http://netshoes-br-hmg02.ns2online.com.br/search?Ntt=camisa");
			
			doc = Jsoup.connect("http://netshoes-br-hmg02.ns2online.com.br/search?Ntt=camisa").get();
			Elements content = doc.getElementsByClass("product-list-item");
			
			System.out.println(content.size());
			System.out.println(content);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*private static List getPids(String[] ary) {
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
	}*/
}
