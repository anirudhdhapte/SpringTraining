package trng.sprng.singleton;

public class PrintEnum {
	static PrintEnum instance;
	private PrintEnum() {
//	System.out.println("Private Constructor");
}
public static PrintEnum getinstance() {
	if(instance==null)
		instance=new PrintEnum();
	return instance;
}
}
