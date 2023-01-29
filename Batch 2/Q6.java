class Thread1 extends Thread{
	String greet;
	Thread1(String greet){
		this.greet=greet;
	}
	public void run(){
		System.out.println(this.greet);
	}
}
class Q6{
	public static void main(String []args){
		Thread1 t1=new Thread1("Hello");
		Thread1 t2=new Thread1("Hi");
		t1.start();
		t2.start();
	}
}