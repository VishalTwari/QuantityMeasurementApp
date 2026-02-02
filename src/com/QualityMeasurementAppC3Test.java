package com;
//package com.QualityMeasurementAppTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Nested
class QualityMeasurementAppTest {
   @Test
    public void testFeetEquality() {
        Length length1=new Length(1.0,LengthUnit.FEET);
        Length length2=new Length(1.0,LengthUnit.FEET);
        assertEquals(length1,length2);
    }

    private void assertEquals(Length length1, Length length2) {
    }

    @Test
    public void testInchesEquality(){
        Length length1 = new Length(12.0,LengthUnit.INCH);
        Length length2 = new Length(12.0,LengthUnit.INCH);
        assertEquals(length1,length2);
    }
    @Test
    public void testFeetInequality(){
        Length length1=new Length(1.0,LengthUnit.FEET);
        Length length2 = new Length(12.0,LengthUnit.INCH);
        assertEquals(length1,length2);
    }



   @Test
    public void testInchesInequality() {
        Length length1 = new Length(10.0,LengthUnit.INCH);
        Length length2 = new Length(2.0,LengthUnit.INCH);
        assertNotEquals(length1,length2);
    }
    @Test
    public void testCrossUnitInequality(){
        Length length1 = new Length(1.0,LengthUnit.FEET);
        Length length2 = new Length(10.0,LengthUnit.INCH);
        assertNotEquals(length1,length2);
    }
    @Test
    public void testMultipleFeetComparison(){
        Length length1=new Length(2.0,LengthUnit.FEET);
        Length length2=new Length(24.0,LengthUnit.INCH);
        assertEquals(length1,length2);
    }

    }

