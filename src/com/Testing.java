package com;

public class Testing {

    private static final double PRECISION = 0.01;

    /*
    String = 'abcd' and str1 = 'bcade';

    O(n) -> time
    O(1) -> space
     */

    /*
    n1 = 27 and n2 = 3
     */

    public static double calculateRoot(double n1, int n2) {

        for (int i=2; i < n1; i++) {

            double product = calculateProduct(i, n2);

            if (n1 == product) {
                return i;
            }
            if (product > n1) {

                return sqrt(n1, i-1, i, n2);

            }
        }

        return -1;
    }

    private static double calculateProduct(double i, int n2) {

        double product = i;

        for (int j=1; j < n2; j++) {

            product *= i;
        }
        return product;
    }

    private static double sqrt(double X, double low, double high, int n2) {
        double mid = (low + high) / 2;
        double p = calculateProduct(mid, n2);

        if (p == X || (Math.abs(X - p) < PRECISION)) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high, n2);
        }
        return sqrt(X, low, mid, n2);
    }

    public static void main(String[] args) {

        //System.out.println(calculateRoot(27, 3));
        //System.out.println(calculateRoot(11, 2));
        //System.out.println(calculateRoot(27, 2));
        System.out.println(calculateRoot(11, 3));

        String s2 = new String("abc");
    }


}
