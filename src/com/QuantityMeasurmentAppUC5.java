package com;

public class QuantityMeasurmentAppUC5 {
    public static boolean lengthEquality(Length lenght1, Length length2) {
        return lenght1.equals(length2);
    }
    public static void main(String[] args){
        Length feet = new Length(1.0,LengthUnit.FEET);
        Length inches = feet.convertTo(LengthUnit.INCHES);
        System.out.println("Result ==="+ inches);
        Length yard = new Length(1.0,LengthUnit.YARDS);
        Length feet2 = yard.convertTo(LengthUnit.FEET);
        System.out.println("result2 ==="+feet2);
        Length cm = new Length(2.54,LengthUnit.CENTEMETERS);
        Length inches1 = new Length(1.0,LengthUnit.CENTEMETERS);
        System.out.println("result3 ==="+ cm.equals(inches1));
    }
}
