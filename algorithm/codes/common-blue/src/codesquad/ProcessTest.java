package codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Process Creation Test");
		Process p = Runtime.getRuntime().exec("/usr/local/bin/pstree");
		p.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";
		while ((line = reader.readLine())!= null) {
			if(line.contains("pstree"))
				line += "***********";
			System.out.println(line);
		}
	}

}
