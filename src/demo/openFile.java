package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class openFile {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader("/Users/chiwah/test.py"));
		List<String> records = new ArrayList<String>();
		String fline;
		while((fline = reader.readLine()) != null){
			records.add(fline);
		}
		System.out.println(records.toString());
	}
}
