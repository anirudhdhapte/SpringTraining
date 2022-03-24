package trng.sprng.singleton;

public class SingletonTest {

	public static void main(String[] args) {
	Printing p1=Printing.instance;
	Printing p2=Printing.instance;
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	p1.printer();
	p2.printer();
	}

}
