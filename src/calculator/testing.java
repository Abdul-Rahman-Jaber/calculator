package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testing {

	@Test
	public void testAdding_addingTwoNumbers_ShouldReturnSumOfThem() {
		//Arrange 
		int a=10;
		int b= 20; 
		int c=30;
		int d=40;
		calc c1=new calc();
		calc c2=new calc();
		calc c3=new calc();
		
		//Act
		int result1=c1.add(a,b);
		int result2=c2.add(c,d);
		int result3=c3.add(a,d);
		
		
		//Assert
		Assert.assertTrue(result1==30);
		Assert.assertTrue(result2==70);
		Assert.assertTrue(result3==50);
		
		
		
	}
	

}
