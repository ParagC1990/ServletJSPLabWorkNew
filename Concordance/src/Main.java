import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		Path book = Paths.get("Book.txt");
		String line = null;
		Map<String, Integer> map = new HashMap<>();
		try {
			BufferedReader bufferedReader = Files.newBufferedReader(book);
			while((line = bufferedReader.readLine()) != null){
				String arr[] = line.split("\\W+");
				for (int i = 0; i < arr.length; i++) {
					if(map.containsKey(arr[i])){
						int val = map.get(arr[i]);
						val++;
						map.replace(arr[i], val);
					}else
						map.put(arr[i], 1);
				}
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry< String, Integer> entry = (Map.Entry<String, Integer>)it.next();
			System.out.println("Word "+entry.getKey()+" occurs "+entry.getValue()+ " times");
		}

	}

}
