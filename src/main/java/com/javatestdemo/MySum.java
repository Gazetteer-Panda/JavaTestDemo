package com.javatestdemo;
//Main Class
public class MySum {
	
	static int sumofnumbers (int numbers) {
		int output = 0;
		for(int i=1;i<=numbers;i++) {
			output += i;
		}
		return output;
	}

	public static void main(String[] args) {
		int numbers = Integer.parseInt(args[0]);
		System.out.println(sumofnumbers(numbers));
		
		String s = "Pramodh";
		int name = Integer.parseInt(s);
		System.out.println(name);
	}
}
