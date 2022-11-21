package Org.Sample;

public class Sample {

	public Sample() {
		
		
		System.out.println("I am default constructor");

	}
	
	public Sample(String name) {
		
		
		System.out.println(name);

	}
	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample("tharik");
		
	}
	
	
	
	

}