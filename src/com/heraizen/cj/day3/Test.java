package com.heraizen.cj.day3;

public class Test {
	public static void main(String[] args) {
		 int i=3;
		 do{
		    if(i<2)
		       break;
		    System.out.print(i--+" ");
		 }while(2<3);
	}

	void showResult() {
		boolean a = false, b = false, c = true;
		if (a & (b = true) & (c = false))
			;
		System.out.println(a + " " + b + " " + c);
	}

}
