import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackerrank {
	public void pp()
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> grades = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			grades.add(scanner.nextInt());
		}
		List<Integer> finalGrades=gradingStudents(grades);
		for(Integer grade: finalGrades)
		{
			System.out.println(grade);
		}
		
	}
	public List<Integer> gradingStudents(List<Integer> grades)
	{
		List<Integer> finalGrades = new ArrayList<Integer>();
		for(int i=0;i<grades.size();i++)
		{
			int grade=grades.get(i);
			if(grade>37)
			{
				if(grade%5>2)
				{
					int a= grade/5;
					a++;
					int finalGrade=a*5;
					finalGrades.add(finalGrade);
				}
				else
				{
					finalGrades.add(grade);
				}
			}
			else
			{
				finalGrades.add(grade);
			}
		}
		
		return finalGrades;
	}
}
