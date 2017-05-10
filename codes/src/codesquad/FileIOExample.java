package codesquad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileIOExample {
	
	public void simpleWrite(String fileName, String[] lines) throws IOException {
		PrintWriter pw = new PrintWriter(fileName);
		for(String s:lines) {
			pw.println(s);
		}
		pw.close();
	}
	
	public String[] simpleRead(String fileName) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		File f = new File(fileName); //open
		System.out.println(f.getAbsolutePath());
		FileInputStream in = new FileInputStream(f);
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		//Scanner simple and easy
		
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		 	
		br.close();
		return list.toArray(new String[0]);
	}
	
	public static void main(String[] args) throws IOException {
		FileIOExample f = new FileIOExample();
		String[] result = f.simpleRead("hello.txt");
		
		for (String s: result) {
			System.out.println(s);
		}
		
		f.simpleWrite("codesquad.txt", result);
		System.out.println("IO Test ended");
	}
}