package SREDDY;

import java.util.ArrayList;
public class Arraylistsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> al=new ArrayList <Integer>();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
System.out.println("Size after adding elements:"+al.size());
al.remove(1);
al.remove(2);
System.out.println("Final Arraylist");
for(int num:al){
	System.out.println(num);
}
	}

}
