package org.jfree.data;

import static org.junit.Assert.*;
import org.jfree.data.Range; 
import org.junit.*;

public class RangeAndDataUtilitiesAllOtherMethodsTests {

	private Range Range1;
	private Range Range2;
	private Range combinedRange;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception {
    }
	
	@Test
	public void testCombine() {
    	//This test is testing partition of (positive, positive)
    	
    	Range1 = new Range(2,8);
    	Range2 = new Range(10,12);
    	Range combinedRange = Range.combine(Range1, Range2);
        assertEquals("The lower bound should be 2",
        2, combinedRange.getLowerBound(), .000000001d);
        assertEquals("The upper bound should be 12",
                12, combinedRange.getUpperBound(), .000000001d);
    }
	@Test
	public void testCombineRange1Null() {
		Range2 = new Range(10,12);
		Range combinedRange = Range.combine(Range1, Range2);
	}
	@Test
	public void testCombineRange2Null() {
		Range1 = new Range(10,12);
		Range combinedRange = Range.combine(Range1, Range2);
	}
	@Test
	public void testConstructorLowerRange() {
		try {
			Range1 = new Range(4,2);
		}
		catch(Exception exc) {
			assertNotNull(exc);
		}
	}
	@Test
	public void testCombineIgnoringNAN() {
		Range1 = new Range(5,8);
    	Range2 = new Range(10,12);
    	Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
        assertEquals("The lower bound should be 5",
        5, combinedRange.getLowerBound(), .000000001d);
        assertEquals("The upper bound should be 12",
                12, combinedRange.getUpperBound(), .000000001d);
	}
	@Test
	public void testCombineIgnoringNANRange1Null() {
    	Range2 = new Range(10,12);
    	Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
        assertEquals("The lower bound should be 10",
        10, combinedRange.getLowerBound(), .000000001d);
        assertEquals("The upper bound should be 12",
                12, combinedRange.getUpperBound(), .000000001d);
	}
	@Test
	public void testCombineIgnoringNANRange2Null() {
    	Range1 = new Range(10,12);
    	Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
        assertEquals("The lower bound should be 10",
        10, combinedRange.getLowerBound(), .000000001d);
        assertEquals("The upper bound should be 12",
                12, combinedRange.getUpperBound(), .000000001d);
	}
	@Test public void testCombineIgnoringNANNull() {
		Range1 = new Range(Double.NaN,Double.NaN);
		Range2 = new Range(Double.NaN,Double.NaN);
		Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
		assertEquals(combinedRange,null);
		
	}
	@Test public void testCombineIgnoringNANRange1NullRange2NAN() {
		Range2 = new Range(Double.NaN,Double.NaN);
		Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
		assertEquals(combinedRange,null);
	}
	@Test public void testCombineIgnoringNANRange2NullRange1NAN() {
		Range1 = new Range(Double.NaN,Double.NaN);
		Range combinedRange = Range.combineIgnoringNaN(Range1, Range2);
		assertEquals(combinedRange,null);
	}
	@Test
	public void testExpand() {
		Range1 = new Range(2,3);
		Range expandedRange = Range.expand(Range1, 4, 12);
		assertEquals("The lower bound should be -2", -2, expandedRange.getLowerBound(), .000000001d);
		assertEquals("The upper bound should be 15", 15, expandedRange.getUpperBound(), .000000001d);
	}
	@Test
	public void testExpandToInclude() {
		Range1 = new Range(2,7);
		Range expandToIncludeRange = Range.expandToInclude(Range1, 8);
		assertEquals("upper bound should be 8", 8, expandToIncludeRange.getUpperBound(), 000000001d);
	}
	@Test
	public void testScale() {
		Range1 = new Range(2,4);
		Range1 = Range.scale(Range1, 2);
		assertEquals("Upper bound should be 8", 8, Range1.getUpperBound(), 000000001d);
		assertEquals("The lower bound should be 4", 4, Range1.getLowerBound(), .000000001d);
	}
	@Test
	public void testShift() {
		Range1 = new Range(2,4);
		Range1 = Range.shift(Range1, 2);
		assertEquals("Upper bound should be 6", 6, Range1.getUpperBound(), 000000001d);
		assertEquals("Lower bound should be 4", 4, Range1.getLowerBound(), 000000001d);
	}
	@Test
	public void testIntersects() {
		Range1 = new Range(2,4);
		Range2 = new Range(2,4);
		assertEquals(Range1.intersects(2,4), true);
	}
	@Test
	public void testIntersectsWithRange() {
		Range1 = new Range(2,4);
		Range2 = new Range(2,4);
		assertEquals(Range1.intersects(Range2), true);
	}
	@Test 
	public void testDoesNotIntersect() {
		Range1 = new Range(2,4);
		assertEquals(Range1.intersects(5,7), false);
	}
	@Test
	public void testLowerBoundBranch() {
		Range1 = new Range(2,4);
		assertEquals(Range1.intersects(3,4), true);
	}
	@Test
	public void testToString() {
		Range1 = new Range(2,4);
		String a = Range1.toString();
		String result = "Range[2.0,4.0]";
		System.out.println(result);
		assertEquals(result, a);
	}
	@Test
    public void testConstrain() {
        Range1 = new Range(-5, 15);
        double value = Range1.constrain(6);
        assertEquals(6, value, .000000001d);
    }
	@Test
    public void testEquals() {
        Range1 = new Range(-5, 15);
        Range2 = new Range(-5, 15);
        boolean isEqual = Range1.equals(Range2);
        assertTrue(isEqual);
    }
	@Test
    public void testIsNaNRange() {
        Range1 = new Range(-5, 15);
        boolean value = Range1.isNaNRange();
        assertFalse(value);
    }
	 @Test
	    public void testHasCode() {
	        Range1 = new Range(-5, 15);
	        int value = Range1.hashCode();
	        System.out.println(value);
	        assertEquals(41025536, value, .000000001d);
	    }
	 //Data Utilities New Methods
	 @Test
	    public void testClone() throws Exception {
	        // setup
	        double[][] array = {{1,2,3,4},{2,3,4,5}};
	        // exercise    
	        double[][] result = DataUtilities.clone(array);
	        // verify
	        assertArrayEquals("The arrays should be equal", array, result);
	        // tear-down: NONE in this test method
	    }
	    
	    @Test
	    public void testCreateArray() throws Exception {
	        // setup
	        double[] array = {1,2,3,4};
	        // exercise    
	        Number[] result = DataUtilities.createNumberArray(array);
	        // verify
	        assertEquals("The numbers should be equal", array[0], result[0]);
	        assertEquals("The numbers should be equal", array[1], result[1]);
	        assertEquals("The numbers should be equal", array[2], result[2]);
	        assertEquals("The numbers should be equal", array[3], result[3]);
	        // tear-down: NONE in this test method
	    }
	    
	    @Test
	    public void testCreateArray2D() throws Exception {
	        // setup
	        double[][] array = {{1,2},{2,3}};
	        // exercise    
	        Number[][] result = DataUtilities.createNumberArray2D(array);
	        // verify
	        assertEquals("The numbers should be equal", array[0][0], result[0][0]);
	        assertEquals("The numbers should be equal", array[1][0], result[1][0]);
	        assertEquals("The numbers should be equal", array[0][1], result[0][1]);
	        assertEquals("The numbers should be equal", array[1][1], result[1][1]);
	        // tear-down: NONE in this test method
	    }
	    
	    @Test
	    public void testEqual() throws Exception {
	        // setup
	        double[][] array1 = {{1,2},{2,3}};
	        double[][] array2 = {{1,2},{2,3}};
	        double[][] array3 = {{4,5,6},{7,8,9}};
	        double[][] array4 = {{1,3},{3,3}};
	        double[][] arrayNull1 = null;
	        
	        // verify
	        assertTrue("The arrays should be equal, return true", DataUtilities.equal(array1, array2));
	        assertFalse("The arrays should not same length, return false", DataUtilities.equal(array1, array3));
	        assertFalse("The arrays should not equal, return false", DataUtilities.equal(array1, array4));
	        assertFalse("Array b is null, return false", DataUtilities.equal(array1, arrayNull1));
	        assertFalse("Array a is null, return false", DataUtilities.equal(arrayNull1, array1));
	        
	        // tear-down: NONE in this test method
	    }
	    @Test
	    public void testEqualsNegative() {
	        Range1 = new Range(-5, 15);
	        Range2 = new Range(-5, 15);
	        boolean isEqual = Range1.equals(Range2);
	        assertTrue(isEqual);
	    }
	    @Test
	    public void testEqualsLower() {
	        Range1 = new Range(-4, 15);
	        Range2 = new Range(-5, 15);
	        boolean isEqual = Range1.equals(Range2);
	        assertFalse(isEqual);
	    }
	    @Test
	    public void testEqualsUpper() {
	        Range1 = new Range(-5, 14);
	        Range2 = new Range(-5, 15);
	        boolean isEqual = Range1.equals(Range2);
	        assertFalse(isEqual);
	    }
	    @Test
	    public void testIsNaNRangeMoreBranch() {
	        Range1 = new Range(-5, 15);
	        boolean value = Range1.isNaNRange();
	        assertFalse(value);
	    }
	    @Test
	    public void testShiftWithNoZeroCrossing() {
	        Range1 = new Range(-5, 14);
	        Range value = Range1.shift(Range1, -2.0, true);
	        double out = value.getLowerBound();
	        assertEquals(-7, out, .000000001d);
	    }
	     @Test
	        public void testHasCodeMoreBranch() {
	            Range1 = new Range(-5, 15);
	            int value = Range1.hashCode();
	            System.out.println(value);
	            assertEquals(41025536, value, .000000001d);
	      }
	     @Test
	     public void testConstrainDoesNotContain2() {
	    	 Range1 = new Range(-5,15);
	    	 double a = Range1.constrain(-6);
	    	 assertEquals(-5,a,.000000001d);
	     }
	     @Test
	     public void testConstrainDoesNotContain3() {
	    	 Range1 = new Range(-5,15);
	    	 double a = Range1.constrain(16);
	    	 assertEquals(15,a,.000000001d);
	     }
	     @Test
	     public void expandToIncludeNull() {
	    	 Range1 = new Range(2,4);
	    	 Range1 = Range.expandToInclude(Range2, 4);
	    	 assertEquals(4,Range1.getUpperBound(),.000000001d);
	     }
	     @Test
	     public void expandToIncludeLess() {
	    	 Range1 = new Range(2,4);
	    	 Range1 = Range.expandToInclude(Range1, 1);
	    	 assertEquals(1,Range1.getLowerBound(),.000000001d);
	     }
	     @Test
	     public void expandToIncludeElse() {
	    	 Range1 = new Range(4,4);
	    	 Range1 = Range.expandToInclude(Range1, 4);
	    	 assertEquals(4,Range1.getLowerBound(),.000000001d);
	     }
	     @After
	     public void tearDown() throws Exception {
	     }
	     @AfterClass
	     public static void tearDownAfterClass() throws Exception {
	     }
}
