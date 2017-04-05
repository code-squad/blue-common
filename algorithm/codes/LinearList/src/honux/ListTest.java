package honux;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import honux.util.Time;

public class ListTest {
	
	public static void stringTest(long num) {
		String temp = "";
		long part = num / 10;
		Time.start();
		for (long i = 0; i < num; i++) {
			temp +="a";
			if (i % part == 0) System.out.print("*");
		}
		System.out.println();
		Time.end();
		Time.printTime();
		
		StringBuffer sb = new StringBuffer();
		Time.start();
		for (long i = 0; i < num; i++) {
			sb.append("a");
			if (i % part == 0) System.out.print("*");
		}
		System.out.println();
		Time.end();
		Time.printTime();
	}
	public static void main(String[] args) {
		double[][] d = {
				{1,2},
				{3,4,5,6}
		};
		System.out.println(d.length);
		System.out.println(d[1].length);
		
		//error
		//List a = new List();
		
		//code here...
		
		//string test here
		stringTest(200000);
	}
	
}

