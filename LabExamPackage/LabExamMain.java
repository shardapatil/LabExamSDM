package LabExamPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LabExamMain {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.println("Welcome, " + name + "!");
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Date currentDate = new Date();
	        System.out.println("Current Date and Time: " + sdf.format(currentDate));

	        System.out.println("Welcome, " + name + "! Current Date and Time: " + sdf.format(currentDate));
	       
	        scanner.close();
	}
}
