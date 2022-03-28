package trng.testing.NormalTests;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers=Arrays.asList(10,20,30,40,30,50);
        int a=numbers.stream().filter(i->i>=35).findAny().get();
        System.out.println(a);
    }
}
