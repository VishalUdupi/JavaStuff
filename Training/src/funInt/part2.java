package funInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
	private int productId;
	private String productName;
	private double productPrice;
	
	public <T> Stream <T> convertListToStream(List<T> list)
    {
        return list.stream();
    }
	public String returnAllProducts(List list1) {
		return list1.toString();
	}
	public String returnAllProductsByName(List list1, String name) {
		Product[] arr = (Product[]) list1.toArray();
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i].productName)) {
				return arr[i].productName;
			}
			else {
				return "invalid search result";
			}
		}
	}

@Override
public String toString(){
    return "Product Id: "+productId+", Product Name:" +productName+ ", Product Price:"+ productPrice;
}

public class part2 {
	List <Product> list1 = new ArrayList<Product>();
	Product p = new Product();
	Stream<Product> stream = p.convertListToStream(list1);
	System.out.println(p.returnAllProducts(list1));
}
