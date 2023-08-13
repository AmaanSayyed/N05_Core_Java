package org.tnsif.singleinheritence;

//Base class,Parent,Super class
public class ParentClass {
	private String name;
	private int money;
	private int House;
	
	//Default Constructor
	public ParentClass() {
		System.out.println("Parent Default Constructor");
	}
	//Parameterized constructor
	public ParentClass(String name, int money, int house) {
		super();
		this.name = name;
		this.money = money;
		House = house;
		System.out.println("Parent Parameterized Constructor");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHouse() {
		return House;
	}
	public void setHouse(int house) {
		House = house;
	}
	@Override
	public String toString() {
		return "ParentClass [name=" + name + ", money=" + money + ", House=" + House + "]";
	}
	
}

//derived,child class
class Child extends ParentClass{

	public Child() {
		System.out.println("Child class default constructor");
	}
	public Child(String name, int money, int house) {
		super(name, money, house);
		System.out.println("Child class Parameterized constructor");
		System.out.println(name+"  "+money+"  "+house);
		// TODO Auto-generated constructor stub
	}
	
}
