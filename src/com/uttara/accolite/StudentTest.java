package com.uttara.accolite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) 
	{
		List<StudentTwo> al = new ArrayList<StudentTwo>();
		al.add(new StudentTwo("umesh",25));
		al.add(new StudentTwo("umesh1",26));
		al.add(new StudentTwo("umesh2",27));
	Map<String,Integer> m = al.stream().collect(Collectors.toMap(s1->s1.getName(),s1->s1.getAge()));
	System.out.println(m);
		
		//0,1,2,1,0,2,1
		//0,0,1,1,1,2,2
		int[] arr = {0,1,2,1,0,2,1};
		int n = arr.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n - 1 ; j++)
			{
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for ( int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		
		}

	}

}
class StudentTwo
{
	private String name;
	private int age;
	StudentTwo(String name, int age)
	{
		this.name=name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
