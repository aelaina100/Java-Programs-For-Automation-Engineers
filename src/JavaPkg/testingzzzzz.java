package JavaPkg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testingzzzzz {
	
	// 1- Sum up the numbers contained within the following array.
	// 2- print out the number at the index of '3'
	// 3- print out the index, at which number 5 is at
	
	@Test
	public void test()
	{
		int a[]= {1,3,5,7};
		
		System.out.println(a[3]);
		int number= 7;
		for(int i=0; i< a.length; i++)
		{
			if(a[i]==number)
			{
				System.out.println(number + " is at the index of: " +i);
				break;
			}
			
			else if(i==a.length-1)
			{
				System.out.println("The number: " + number + " isnt an element of the array");
				Assert.assertTrue(false);
			}
		}
		
	}
	
	
}
	


