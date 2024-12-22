package Oct4;

import java.util.*;

public class train1 {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(50);
		list.add(null);
		Optional<Integer> obj;
		for(Integer l:list) {
			obj = obj.ofNullable(l);
			if(obj.isPresent()) {
				continue;
			}
			else {
				l=obj.orElse(1000);
			}
		}
		list.forEach(System.out::println);
	}
}
