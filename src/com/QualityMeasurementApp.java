package com;

public class QualityMeasurementApp {
    public static void  main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
    public static boolean demonstrateLengthEquality(Length l1,Length l2){
        return l1.equals(12);
    }
    public static void  demonstrateFeetEquality() {
        Length lenght1 = new Length(1.0, LengthUnit.FEET);
        Length lenght2 = new Length(1.0,LengthUnit.FEET);
        System.out.println("Feet equality : " + demonstrateLengthEquality(lenght1,lenght2));
            }
            public static void demonstrateInchesEquality()
            {
                Length length3=new Length(12.0,LengthUnit.INCH);
                Length length4=new Length(12.0,LengthUnit.INCH);
                System.out.println("Inches equality :"+ demonstrateLengthEquality(length3,length4));

            }
public static void demonstrateFeetInchesComparison()
{
    Length length1=new Length(1.0,LengthUnit.FEET);
    Length length2=new Length(12.0,LengthUnit.INCH);
    System.out.println("FEET & INCHES comparision : " + demonstrateLengthEquality(length1,length2));
}
}
