package A_JavaPkg;

public class C_basics2 {

	public static void main(String[] args) {
		
		D_1methods2 m2= new D_1methods2();
		m2.validateResults(); // Going to execute what's between the brackets of the validateResults() method.
		System.out.println("################################################");
		
		System.out.println(	m2.validateResults());  
		System.out.println("************************************************");
		
		int value= m2.validateResults(); // value stores "10"  // this line also prints out "Programming fundementals"
		
		System.out.println("=======================================================");
		System.out.println("returned value is " + value);
         

	}

}
