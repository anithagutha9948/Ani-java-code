package SREDDY;

public class Multi3implementsrunnable {
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		Multi3 m1=new Multi3();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		}  
