package package2;
import package1.Pack1;
public class Pack2 extends Pack1 {	
	public static void main(String[] args) {
		Pack2 obj=new Pack2();
		obj.tryMePublic();
		System.out.println(); 
		obj.tryMeProtected();
		// We can access the protected member function in another package by inheritance

	}

}
