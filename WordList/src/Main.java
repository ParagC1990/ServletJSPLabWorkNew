import java.io.BufferedReader;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
			Path book = Paths.get("Book.txt");
			String line = null;
			Set set = new HashSet<String>();
			try {
				BufferedReader bufferedReader = Files.newBufferedReader(book);
				while((line = bufferedReader.readLine()) != null){
					String arr[] = line.split("\\W+");
					for (int i = 0; i < arr.length; i++) {
						set.add(arr[i]);
					}
					
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
			}

	}

}
