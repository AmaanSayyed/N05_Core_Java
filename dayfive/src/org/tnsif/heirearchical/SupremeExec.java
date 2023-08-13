package org.tnsif.heirearchical;

public class SupremeExec {
	public static void main(String[] args) {
		HighCourt hc =new HighCourt("Amaan", "Delhi", 978, 5, "Mumbai HC");
		DistrictCourt dc=new DistrictCourt("Amaan", "Delhi", 978,"LandDispute",10 );
		System.out.println(hc);
		System.out.println(dc);
	}
}
