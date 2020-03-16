package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) {
		String [] lines = new String [] {
				"Good Morning", "Good evening", "Good Night"
		};
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String string : lines) {
				bw.write(string);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error : " +e.getMessage());
		}		
				
				
	}
}
