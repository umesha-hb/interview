package com.uttara.iterators;

import java.util.ArrayList;
import java.util.Iterator;



public class FailFastIterator2 {

	public static void main(String[] args)
	{
        //creating ArrayList  
        ArrayList<String> students = new ArrayList<String>();   
        students.add("Emma");   
        students.add("Paul");   
        students.add("Walker");  
        students.add("Elanie");  
        students.add("Amara");  
        
        //creating an instance of the Iterator class  
        Iterator itr = students.iterator();   
          
        //iterating ArrayList using Iterator   
        while (itr.hasNext()) {  
            if ((String)itr.next() == "Paul")   
                // It will not throw an exception   
                students.remove("Amara");  
        }  
          
        System.out.println(students);  
	}

}
