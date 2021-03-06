package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DemoThreadPoolExecutor {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		  for (int i = 0; i < 10; i++) {  
	        Runnable worker = new Task("" + i);  
	        executor.execute(worker);//calling execute method of ExecutorService  
	      } 
		  
	    executor.shutdown(); 
	    
	    while (!executor.isTerminated()) {   
	  	  
	    }  

	    System.out.println("Finished all threads");  
	}
	
}


