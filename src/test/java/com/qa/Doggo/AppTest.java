package com.qa.Doggo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 

{
	@Test
    public void returnFith()
    {
        assertEquals("Error!","5th",Lister.inputData(1, 5, 2).get(3));
    }
	@Test
    public void returnFourteenth()
    {
        assertEquals("Error!","14th",Lister.inputData(1, 17, 2).get(12));
    }
	@Test
    public void returnTwentyThird()
    {
        assertEquals("Error!","23rd",Lister.inputData(1, 25, 2).get(21));
    }
	@Test
    public void returnSeventyth()
    {
        assertEquals("Error!","70th",Lister.inputData(1, 77, 2).get(68));
    }
	@Test
    public void returnOneHundredAndNineteenth()
    {
        assertEquals("Error!","119th",Lister.inputData(1, 123, 2).get(117));
    }
}
