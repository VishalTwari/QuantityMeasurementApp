package com;

public class QualityMeasurementApp {
    public static void  main(String[] args) {
        Length lenght1 = new Length(1.0, LengthUnit.FEET);
        Length lenght2 = new Length(1.0,LengthUnit.FEET);
        System.out.println("Feet equality : " + lenght1.equals(lenght2));

        Length length3=new Length(12.0,LengthUnit.INCH);
        Length length4=new Length(12.0,LengthUnit.INCH);
        System.out.println("inces equality : " + length3.equals(length4));

        Length length5=new Length(12.0,LengthUnit.INCH);
        Length length6=new Length(11.0,LengthUnit.INCH);
        System.out.println("inces equality : " + length5.equals(length6 ));


    }

}
