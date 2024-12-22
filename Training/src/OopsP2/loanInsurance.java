package OopsP2;

class Vehicle implements Loan,Insurance{
	private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle() {
		
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
		if(vehicleType != "2 wheeler" || vehicleType != "3 wheeler" || vehicleType != "4 wheeler") {
			System.out.println("Wrong Vehicle Type");
		}
	}
	@Override
	public double takeInsurance() {
		// TODO Auto-generated method stub
		double insuranceAmount=0;
		if(price <= 150000) {
			insuranceAmount = 3500;
		}
		if(price > 150000 && price < 300000) {
			insuranceAmount = 4000;
		}
		if(price > 300000) {
			insuranceAmount = 5000;
		}
		return 0;
	}
	@Override
	public double issueLoan() {
		double loanAmount=0;
		// TODO Auto-generated method stub
		switch (vehicleType) {
		case "2 wheeler":
			loanAmount = 0.8*price;
			break;
		case "3 wheeler":
			loanAmount = 0.75*price;
			break;
		case "4 wheeler":
			loanAmount = 0.50*price;
			break;
		}
		return loanAmount;
	}
}

interface Loan{
	double issueLoan();
}

interface Insurance{
	double takeInsurance();
}

public class loanInsurance {
	public static void main(String[] args) {
		
	}
}
