package com.calc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateDate {
	public static void main(String[] args){
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		
		// current date and time
		Date currentDate = new Date();
		System.out.println("currentDate: "+currentDate);
		
		//Format accordingly - sdf1 i.e dd/MM/yyyy
		System.out.println("sdf1 (dd/MM/yyyy): "+sdf1.format(currentDate));
		
		//Format accordingly - sdf2 - dd-MM-yyyy
		System.out.println("sdf2 (dd-MM-yyyy) "+sdf2.format(currentDate));
		
		//Formate accordingly - sdf3 
		System.out.println("sdf3 "+ sdf3.format(currentDate));
		
		//
		System.out.println("sdf4: "+sdf4.format(currentDate));
	}
}