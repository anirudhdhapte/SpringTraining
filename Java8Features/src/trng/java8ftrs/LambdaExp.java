package trng.java8ftrs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExp {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("PPPPPP");
	al.add("RRRR");
	al.add("III");
	al.add("MMMMMMM");
	al.add("E");
	al.add("HH");
	/*
	 * Comparator<String> c=(e1,e2)->{ int l1=e1.length(); int l2=e2.length();
	 * if(l1<l2) return -1; else if(l1>l2) return 1; else return e1.compareTo(e2);
	 * }; List<String> al2=al.stream().sorted(c).collect(Collectors.toList());
	 */
	String[] al2=al.stream().toArray(String[]::new);
	Stream<String> s1=Stream.of(al2);
	s1.forEach(System.out::println);
	s1.forEach(System.out::println);
	}

}
