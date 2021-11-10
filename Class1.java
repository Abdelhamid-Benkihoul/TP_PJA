package Dev_TP2;

import java.io.*;

import java.util.Scanner;


public class Class1{
	
   public static void main(String [] args)throws IOException, ClassNotFoundException{
	   
	   
	  Scanner x=new Scanner(System.in);
	  System.out.println("entrer le nombre des employees:");
	  int nbr_emp=x.nextInt();
	  Employee[] empls=new Employee[nbr_emp];
	  
	  for(int i=0;i<empls.length;i++){

			empls[i]= new Employee();
			
			System.out.println("Employee Numero " + (i+1) + "\nTappez le nom :");
			empls[i].name = x.next();
			
			System.out.println("Tappez l`address :");
			empls[i].address = x.next();
			
			System.out.println("Tappez l`SSN :");
			empls[i].SSN = x.nextInt();
			
			System.out.println("Tappez le number :");
			empls[i].number = x.nextInt();
		  
	  }
		
	
		
		FileOutputStream fileOut = new FileOutputStream("emp.dat");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(empls);
		out.close();
		fileOut.close();
		System.out.printf("donnees serialisees sauvegardees dans emp.dat");

  
   }
}