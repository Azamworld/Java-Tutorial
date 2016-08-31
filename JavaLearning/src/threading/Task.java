package threading;

public class Task implements Runnable {
	private String message ;
	
	public Task(String msgg) {
		// TODO Auto-generated constructor stub
		message = msgg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + "(Start) = Message "+ message);
		
		processmessage();
		
		System.out.println(Thread.currentThread().getName()+ " End");
		
	}
	
	
	 private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  
	
}
