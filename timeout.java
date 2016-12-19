package Core_javaS6 ;

public class timeout extends Thread {
	
	private String msg = "TIME OUT";
	private int timeout = 2;
	private int temp=0;
	
	public timeout(String msg, int time) {
		this.msg = msg;
		this.timeout = time;
		this.temp=0;
		}
	
	public void run() {
		while(true)
		{
		try {
			
		Thread.sleep(timeout * 1000);
		temp++;
		} catch (InterruptedException e) { }
		System.out.println("("+temp+") "+msg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeout b1 =new timeout("Time_out",1);  // creating object for class
		Thread c1 =new Thread(b1);		// creating object for thread class and passing class object
		
			
		c1.run();
	}
	

}
