package SREDDY;
import java.io.FileOutputStream;
public class SelfString {
	public static void main(String[] args){
		try{
			  FileOutputStream fout=new FileOutputStream("D:\\sravya2\\Soutfile.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  
		
