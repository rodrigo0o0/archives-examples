package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the folder path :  ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		
		//pega o nome das pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Files : ");
		for (File file : folders) {
			System.out.println(file);
		}
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files : ");
		//pega o nome dos arquivos
		for (File file : files) {
			System.out.println(file);
		}
		//criando uma subpasta
		boolean success  = new File(strPath + "\\subdir").mkdir();
		System.out.println("The subdir created : " + success);
		sc.close();
	}
}
