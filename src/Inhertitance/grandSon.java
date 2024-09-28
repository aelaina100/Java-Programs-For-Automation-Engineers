package Inhertitance;

public class grandSon extends son {
// Note: Java does not support multiple inhertitance (Ex:'grandSon' class can only extend the 'son'one only or the 'grandFather' one only)
	// So if you want, in this class, to access the methods/variables contained in the other two classes,
	 // then let the 'son' class extend the 'grandFather' one.
	public static void main(String[] args) {
		grandSon gs= new grandSon();
		
		gs.activities(); // method contained in the 'grandfather' class [only possible because 'son'class extended the 'grandfather' one.
		gs.city();
		gs.country();
		System.out.println(gs.z);

	}

}
