import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessTest {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Process p = Runtime.getRuntime().exec("/usr/local/bin/pstree");
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        while ((line = reader.readLine())!= null) {
            System.out.println(line);
        }
    }
}
