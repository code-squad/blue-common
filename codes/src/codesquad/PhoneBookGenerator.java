package codesquad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class PhoneBookGenerator {
	public void generate(String fileName, int count) throws FileNotFoundException {
		Random r = new Random();
		PrintWriter pw = new PrintWriter(new File(fileName));
		int base = 1000000;
		int max = 10000000 - base;
		int num;
		for ( int i = 0; i < count; i ++) {
			num = r.nextInt(max) + base;
			pw.println(num);
		}
		pw.close();
	}
	
	public void printFile(String fileName) throws FileNotFoundException {
		Scanner s = new Scanner(new File(fileName));
		int count = 0;
		while(s.hasNextLine()) {
			System.out.println(count + ": " + s.nextLine());
			count++;
		}
		s.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		PhoneBookGenerator p = new PhoneBookGenerator();
		p.generate("input.txt", 100);
		long end = System.currentTimeMillis() - start;
		System.out.println("generate ended: " + end + "(ms)");
		
		p.printFile("input.txt");
		System.out.println("print file ended");

	}

}
