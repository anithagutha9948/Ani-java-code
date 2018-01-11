package SREDDY;

import java.io.FileOutputStream;

public class DataStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
	             FileOutputStream fout=new FileOutputStream("D:\\sravya3\\Soutfile.txt");    
	             String s="Welcome to javaTpoint.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	   }    
	}  
	


