
public class Example extends Thread {
	
	public void run() {
		System.out.println("this is the run method");
	    m1();
	}
	public void m1() {
		System.out.println("hii");
	}
    public static void main(String[] args) {
    	System.out.println("main method start");
		Example e=new Example();
	 Thread t=new Thread(e);
	 t.start();
	 
	 Thread t1=Thread.currentThread();
	 String name=t1.getName();
	 System.out.println("Thread name is : "+name);
	 System.out.println("Thread Prioriry: "+t1.getPriority());
	 
	 System.out.println("Main method end");
	}
}
