import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	
	static ArrayList<String> packet = new ArrayList<>();
	public static String[] str = new String[packet.size()];
	BufferedReader br = null;
	
	public ReadFile() {
	}
	
	public String[] readFile(String path) {
		try {
			br = new BufferedReader(new FileReader(new File(path)));
			String s;
			
			while((s = br.readLine()) != null) {
				packet.add(s);
			}
			str = packet.toArray(str);
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return str;
	}	
}
