package week3.day1;
//applying inheritance
public class AxisBank extends bankInfo {

	
	public void deposit() {
		System.out.println("The deposit of Axis bank");
	}
	public static void main(String[] args) {
		AxisBank object = new AxisBank();
		object.deposit();
		object.savings();
		object.fixed();
	}
}
