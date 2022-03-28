package trng.java8ftrs;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service=Executors.newFixedThreadPool(2);
		CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->{
			try {
				return getno();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		});
		System.out.println(future.get());
		System.out.println("Ending this....");
		service.shutdown();
	}
	public static Integer getno() throws InterruptedException {
		Thread.currentThread();
		Thread.sleep(5000);
		return 3;
	}
}
