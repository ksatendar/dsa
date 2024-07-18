package dsa;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("ba");
		list.add("ca");
		
		for(String ele: list) {
			System.out.println(ele);
		}
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String ele = iterator.next();
//			System.out.println(ele);
//			
//		}
		
	}

}
