package trng.java8ftrs;

import java.util.function.Function;

public class Funcs {

	public static void main(String[] args) {
		Student[] s= {
				new Student("Sunny",100),
				new Student("Bunny",90),
				new Student("Chinny",80),
				new Student("Vinny",70),
				new Student("Munny",40),
				};
		Function<Student,String> f=s1->
		{
			String grade="";
			if(s1.Marks>=90) grade="Distinction";
			else if(s1.Marks>=80) grade="First Class";
			else if(s1.Marks>=60) grade="Second Class";
			else if(s1.Marks>=45) grade="Third Class";
			else grade="Fail";
			return grade;
		};
		for(Student s2:s) {
			System.out.println("Student Name: "+s2.Name);
			System.out.println("Student Marks: "+s2.Marks);
			System.out.println("Student Grade: "+f.apply(s2));
			System.out.println();
		}
	}

}
