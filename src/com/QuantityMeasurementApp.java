package com;
import com.QuantityMeasurementApp.Feet;
import com.QuantityMeasurementApp.Inches;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class QuantityMeasurementTest {
    @Test
    public void testFeetEquality_SameValue() {
        Feet f1 = new Feet(12.0);
        Feet f2 = new Feet(12.0);
        Assertions.assertTrue(f1.equals(f2));

    }
    @Test
    public void testFeetEquality_DifferenceValue() {
        Feet f1 = new Feet(   2.0);
        Feet f2 = new Feet(  1.0);
        Assertions.assertFalse(f1.equals(f2));

    }

    @Test
    public void testFeetEquality_NullComprasion() {

        Feet f1 = new Feet( 2.0);
        Assertions.assertFalse(f1.equals(null));
    }

    @Test
    public void testFeetEquality_sameRefrence() {
        Feet f1 = new Feet( 2.0);
        Assertions.assertTrue(f1.equals(f1));
    }

    public void testFeetEquality_NonNumericInput() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Feet(Double.NaN);

        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            new Feet(Double.POSITIVE_INFINITY);
        });
    }
    public void testInchesEquality_SameValue() {
        Inches f1 = new Inches(12.0);
        Inches f2 = new Inches(12.0);
        Assertions.assertTrue(f1.equals(f2));

    }
    @Test
    public void testInchesEquality_DifferenceValue() {
        Inches f1 = new Inches(   2.0);
        Inches f2 = new Inches(  1.0);
        Assertions.assertFalse(f1.equals(f2));

    }

    @Test
    public void testInchesEquality_NullComprasion() {

        Inches f1 = new Inches( 2.0);
        Assertions.assertFalse(f1.equals(null));
    }

    @Test
    public void testInchesEquality_sameRefrence() {
        Inches f1 = new Inches( 2.0);
        Assertions.assertTrue(f1.equals(f1));
    }

    public void testInchesEquality_NonNumericInput() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Inches(Double.NaN);

        });
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            new Inches(Double.POSITIVE_INFINITY);
        });
    }

}


