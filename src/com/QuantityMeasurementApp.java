package com;

/**
 * Main class responsible for checking equality of measurements.
 */
public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            //check if both reference point to the same object
            if (this == o)
                return true;
            //check if the object is null or not the same class
            if (o == null || getClass() != o.getClass()) return
                    false;
            // Cast and compare the underlying numerical values
            Feet feet = (Feet) o;
            return
                    Double.compare(feet.value, value) == 0;
        }

        //Good practice to override hashCode when overriding equals
        @Override
        public int hashCode() {
            return
                    Double.hashCode(value);
        }
    }

    public boolean compareFeet(double val1, double val2) {
        // Input and Validation(java's double type ensures numeric)
        Feet firstValue = new Feet(val1);
        Feet secondValue = new Feet(val2);

        return
                firstValue.equals(secondValue);
    }
    public static void main(String[] args){
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        //Example Usage;
        double input1=4.0;
        double input2=4.0;

        boolean result = app.compareFeet(input1, input2);
        System.out.println("Are the values equals? " + result);
    }

}

