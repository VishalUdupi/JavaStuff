package practiceQues;

import java.util.ArrayList;
import java.util.HashMap;

class Mobile{
	private HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
		if(mobiles.containsKey(company)) {
			mobiles.compute(company, null).add(model);
		}
		else {
			mobiles.computeIfAbsent(company, (k) -> new ArrayList<String>()).add(model);
		}
		return "model successfully added";
		
	}
	public ArrayList<String> getModels(String company) {
		ArrayList<String> m1 = null;
		if(mobiles.containsKey(company)) {
			m1 = mobiles.get(company);
		}
		
		return m1;
		
	}
	public String buyMobile(String company, String model) {
		if(mobiles.containsKey(company)) {
			mobiles.compute(company, null).remove(model);
		}
		return "mobile sold successfully";
		
	}
}

public class ques2 {

}
