package SREDDY;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Java Program to find the length of array list");
	       ArrayList<String> listOfCities = new ArrayList<>();
	       int size = listOfCities.size();
	       System.out.println("size of array list after creating: " + size);
	       listOfCities.add("California");
	       listOfCities.add("Boston");
	       listOfCities.add("New York");
       size = listOfCities.size();
	       System.out.println("length of ArrayList after adding elements: " + size);
	       listOfCities.clear();
	       size = listOfCities.size();
	       System.out.println("size of ArrayList after clearing elements: " + size);
	   }
	
	}


