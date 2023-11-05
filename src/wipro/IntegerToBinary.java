package wipro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class IntegerToBinary {
	public int solution(int num1,int num2)
	{
		
		
		int num3 = num1*num2;
		List<Integer> binary = new ArrayList<Integer>();
		while (num3 > 0) {
			binary.add(num3 % 2);           
            num3 = num3 / 2;
        }
 
		binary.stream().forEach(System.out::println);
		int count = (int) binary.stream().filter(e->e.intValue()==1).count();
		return count;
	}

	public static void main(String[] args) {
		IntegerToBinary  integerToBinary = new IntegerToBinary();
//		System.out.println(integerToBinary.solution(5, 7));
		
		List<Integer> al = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		IntSummaryStatistics stat = al.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("count : "+stat.getCount());
		System.out.println("min : "+stat.getMin());	
		System.out.println("average : "+stat.getAverage());
		System.out.println("max : "+stat.getMax());
		
	}

}
