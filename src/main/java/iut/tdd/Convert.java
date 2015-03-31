package iut.tdd;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.*;

public class Convert {
	
	
	static HashMap <String,String> num = new HashMap<String, String>(); 

	public static String num2text(String input) {
		
		num.put("zero", "0");
		num.put("un", "1");
		num.put("deux", "2");
		num.put("trois", "3");
		num.put("quatre", "4");
		num.put("cinq", "5");
		num.put("six", "6");
		num.put("sept", "7");
		num.put("huit", "8");
		num.put("neuf", "9");
		num.put("dix", "10");
		num.put("onze", "11");
		num.put("douze", "12");
		num.put("treize", "13");
		num.put("quatorze", "14");
		num.put("quinze", "15");
		num.put("seize", "16");
		num.put("vingt", "20");
		num.put("trente", "30");
		num.put("quarante", "40");
		num.put("cinquante", "50");
		num.put("soixante", "60");
		num.put("cent", "100");
		num.put("mille", "1000");
			
	//	Iterable it = num.entrySet().iterator();
		
		
		
		
		
		
		

		return num.get(input);
	}	
	
	
	public static String text2num(String input) {

		num.put("0", "zero");
		num.put("1", "un");
		num.put("2", "deux");
		num.put("3", "trois");
		num.put("4", "quatre");
		num.put("5", "cinq");
		num.put("6", "six");
		num.put("7", "sept");
		num.put("8", "huit");
		num.put("9", "neuf");
		num.put("10", "dix");
		num.put("11", "onze");
		num.put("12", "douze");
		num.put("13", "treize");
		num.put("14", "quatorze");
		num.put("15", "quinze");
		num.put("16", "seize");
		num.put("20", "vingt");
		num.put("30", "trente");
		num.put("40", "quarante");
		num.put("50", "cinquante");
		num.put("60", "soixante");
		num.put("100", "cent");
		num.put("1000", "mille");
		
		return num.get(input);
		
	}
}