package com.object;

public class Calculator {
	public static void main(String args[]) {
	Addition a =new Addition();
	Sub b = new Sub();
	Multi m =new Multi();
	Division d = new Division();
	 a.add(20, 10);
	
	b.mySub(8,4);
	m.myMul(2, 5);
	d.myDiv(60, 5);
	}
}
