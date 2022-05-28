package org.system;

//Applying inheritance
public class Desktop extends Computer {

	public void desktopSize(){
		System.out.println("The desktop size");
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
