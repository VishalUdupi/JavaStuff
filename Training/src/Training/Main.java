package Training;

import java.util.*;

class Product
{
int	productId;
	String productName;
     double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		//this is auto generated keyword by compiler
		//this holds the reference or address of currently running object
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
     
  }
//I have to store 5 product object
class ProductBO
{
//[ob1][obj2][][][][]
	//product--id,name,price
	Product[] listOfProducts=new Product[3];
	int[] cost = new int[3];
	List <Integer> costs = new ArrayList(Arrays.asList(cost));
	public void addProduct(Product product, int index)
	{
		
			listOfProducts[index]=product;
		
	}
	public void searchProduct(Product[] arr, int id)
	{
		for(int i=0; i<arr.length; i++) {
			if(arr[i].productId == id) {
				System.out.println("Product Found!");
				System.out.println(arr[i].getProductId() + " "+arr[i].getProductName() + " "+arr[i].getProductPrice());
			}
		}
	}
	public int calTotalCost(List<Integer> costs) {
		int sum=0;
		for(int j:costs)
		{
			sum+=j;
		}
		return sum;
	}
	public void withinPrice(Product[] arr, double minPriceRange, double maxPriceRange) {
		for(Product s:arr) {
			if((s.productPrice > minPriceRange) && (s.productPrice < maxPriceRange)) {
				System.out.println(s.getProductId() + " "+s.getProductName() + " "+s.getProductPrice());
			}
		}
	}
	public void dispProductMinCost(Product[] arr) {
		for(Product pq:arr) {
			costs.add((int) pq.productPrice);
		}
		int min= Collections.min(costs);
		System.out.println(min);
	}
	
	public Product[] getAllProduct()
	{
		return listOfProducts;
	}
	
	// define a method which search a product by product id
	// defines the method which display product within specified price range
	//define a method which calculate total cost of the product
	//define the method which display product which having minimum price
}

public class Main {

	public static void main(String[] args) {
		ProductBO pbo=new ProductBO();
		   Scanner scanner=new Scanner(System.in);
		System.out.println("Enter five objects of product");
		for(int i=0; i<3; i++)
		{
			Product pObject=new Product();
			System.out.println("Enter product Id");
			int id=scanner.nextInt();
			System.out.println("Enter product name");
			String name=scanner.next();
			System.out.println("Enter product price");
			double  price=scanner.nextDouble();
			pObject.setProductId(id);
			pObject.setProductName(name);
			pObject.setProductPrice(price);
			pbo.addProduct(pObject, i);
			
		}
		Product[] products = pbo.getAllProduct();
		pbo.withinPrice(products, 200, 400);
//				Product[] products= pbo.getAllProduct();
//				for(Product p:products)
//				{
//					System.out.println(p.getProductId() + " "+p.getProductName() + " "+p.getProductPrice());
//				}
	}

}
