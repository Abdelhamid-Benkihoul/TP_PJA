package Dev_TP2;

import java.util.Scanner;
import java.io.*;

public class Class3 {
	public static void main(String [] args) throws IOException, ClassNotFoundException{
		
	Employee [] empls = null;
	FileInputStream fileIn = new FileInputStream("empdirect.dat");
	ObjectInputStream in = new ObjectInputStream(fileIn);
	empls = (Employee []) in.readObject();
	in.close();
	fileIn.close();
	
	Scanner x=new Scanner(System.in);	
	System.out.println("entrer num d'employee");
	int  emp=x.nextInt();

	for (int i = 0; i < empls.length; i++) {
		if(emp == empls[i].number) {
			System.out.println("Name : "+empls[i].name + "\n"+"address:"+ empls[i].address +"\n"
					+"SSN:"+empls[i].SSN + "\n"+"number:"+empls[i].number + "\n--------------");
		}
		}
	}
}
