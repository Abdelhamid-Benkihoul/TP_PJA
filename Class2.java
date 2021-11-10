package Dev_TP2;
import java.io.*;
public class Class2{
	
   public static void main(String [] args) throws IOException, ClassNotFoundException{
	   
	   
	    Employee [] empls = null;
		FileInputStream fileIn = new FileInputStream("emp.dat");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		empls = (Employee []) in.readObject();
		in.close();
		fileIn.close();
		
		
		RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
		
		for (int i = 0; i < empls.length; i++) {
			raf.writeUTF("Name : "+empls[i].name + "\n"+"address:"+ empls[i].address +"\n"
					+"SSN:"+empls[i].SSN + "\n"+"number:"+empls[i].number + "\n--------------");
		}
		raf.seek(0);
		while (raf.getFilePointer() < raf.length()) {
			System.out.println(raf.readUTF());
			}
	   
	   raf.close();
    }
}