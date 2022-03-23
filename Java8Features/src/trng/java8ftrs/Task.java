package trng.java8ftrs;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.currentThread();
		Thread.sleep(5000);
		return 3;
	}

}
