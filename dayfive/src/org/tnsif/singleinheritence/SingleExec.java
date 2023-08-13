package org.tnsif.singleinheritence;

public class SingleExec {
	public static void main(String[] args) {
		Child obj=new Child();
		ParentClass obj1=new ParentClass("2nd Parent",76000,12); 
		obj.setName("Parent");
		obj.setMoney(78000);
		obj.setHouse(2);
		System.out.println(obj);
	}
}
