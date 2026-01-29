package com;
import com.QuantityMeasurementApp.Feet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class QuantityMeasurementTest {
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
    }


