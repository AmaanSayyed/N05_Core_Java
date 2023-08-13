package org.tnsif.interfacejava;

//class implements interface
//interface extends interfaces
public class CardExec implements DebitCard {

	public void displayCardDetails() {
		System.out.println("Card No is : "+cardNo);
		
	}
	public static void main(String[] args) {
		CardExec ce=new CardExec();
		ce.displayCardDetails();
		ce.display();
		//to call static method need to use interface_name.method -- bcoz method declared in interface not visible to class
		DebitCard.displayStatic();
	}
}
