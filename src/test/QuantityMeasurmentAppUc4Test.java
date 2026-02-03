package test;
import com.Length;
import com.LengthUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class QuantityMeasurmentAppUc4Test {

    @Test
    public void testFeetAndInchesEquality_SameValue() {
        Length foot = new Length(1.0,LengthUnit.FEET);
        Length tweleveInches = new Length(12,LengthUnit.INCHES);
        Assertions.assertTrue(foot.equals(tweleveInches));
    }
    @Test
    public void testFeetAndYardEquality_SameValue() {
        Length yard = new Length(1.0,LengthUnit.YARDS);
        Length foot = new Length(3.0,LengthUnit.FEET);
        Assertions.assertTrue(yard.equals(foot));
    }
    @Test
    public void testFeetEquality_sameValue() {
        Length i1 = new Length(1.0,LengthUnit.INCHES);
        Length i2 = new Length(12.0,LengthUnit.INCHES);
        Assertions.assertFalse(i1.equals(i2));
    }

    @Test
    public void testInvalidValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Length(Double.NaN, LengthUnit.FEET));
    }
    @Test
    public void testnullUnit() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> new Length(10.0,null));
    }
}
