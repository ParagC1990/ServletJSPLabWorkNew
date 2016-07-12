import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File inFile, outFile;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter input file name ");
		String fName = scan.nextLine();
		inFile = new File(fName);
		do{
		
		if(!inFile.exists())
		{
			System.out.println("Please enter valid input file name ");
			 fName = scan.nextLine();
			inFile = new File(fName);
		}else
			break;
			
		}while(true);
		
		
		System.out.println("Please enter ouput file name ");
		String outName = scan.nextLine();
		boolean status = copyContent(inFile, outName);
		if(!status)
		{
			while(true){
				System.out.println("Please enter valid file path");
				outName = scan.nextLine();
				status = copyContent(inFile, outName);
				if(!status)
					continue;
				break;
			}
		}
		
	}

	private static boolean copyContent(File inFile, String outName) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		
		File fOut = new File(outName);
		FileWriter fstream = null;
		try {
			fstream = new FileWriter(fOut, true);
		} catch (IOException e) {
			System.err.println("Following exception while wrting to the file ");
			e.printStackTrace();
			return false;
			
		}
		BufferedWriter out = new BufferedWriter(fstream);
		
		String line = null;
		try {
			while ((line = in.readLine()) != null) {
				
				out.write(line);
				out.newLine();
			}
		} catch (IOException e) {
			System.err.println("Following exception while wrting to the file ");
			e.printStackTrace();
			return false;
		}
		
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return true;
	}

}
