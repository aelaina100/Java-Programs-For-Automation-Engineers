package JavaPkg;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testingzzzzz {
	
	// 1- Sum up the numbers contained within the following array.
	// 2- print out the number at the index of '3'
	// 3- print out the index, at which number 5 is at
	
	
		@Test
		public void P_StreamsTest()
		{
			List<String> names1=  Arrays.asList("ahmad", "Yansin", "Jen"); // or ArrayList<String> names1= new ArrayList<String>();  
			List<String> names2=  Arrays.asList("Adam", "Syra", "lynda");
			
			// For the above arrayLists- Merge them together and verify that "Adam" exists in the merged ArrayList.
			Stream<String> combined_names= Stream.concat(names1.stream(), names2.stream());
			// to verify:
			Boolean b= combined_names.anyMatch(s->s.equals("Adamuuu")); // It has to return 'true'.
			Assert.assertTrue(b);
			
			/* Separate Note:  The match() operations are [They return a boolean True or False):
			                   
			                    anyMatch(): Boolean
			                    allMatch(): Boolean
			                    noneMatch:  Boolean   */  
			
		}

	}
	
	
	

	


