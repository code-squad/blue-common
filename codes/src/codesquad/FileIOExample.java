package codesquad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileIOExample {
	
	public String[] simpleRead(String filename) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		File f = new File(filename);
		FileInputStream in = new FileInputStream(f);
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(ir);
		
		String line;
		while((line = reader.readLine()) != null) {
			list.add(line);
		}
		reader.close();
		return list.toArray(new String[0]);
	}
	
	public void simpleWrite(String filename, String[] lines) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(filename);
		for(String line:lines) {
			pw.println(line);
		}
		pw.close();
	}
	
	public static void main(String[] args) throws IOException {
		FileIOExample f = new FileIOExample();
		String[] result = f.simpleRead("hello.txt");
		for(String r: result) {
			System.out.println(r);
		}
		
		f.simpleWrite("copy.txt", result);
		
		System.out.println("Program ended");
	}
}
