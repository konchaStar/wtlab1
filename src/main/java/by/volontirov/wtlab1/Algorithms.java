package by.volontirov.wtlab1;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
    //Task 1
    public double getExpressionSolution(final double x, final double y) {
        return (1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - (x + x) / (1 + x * x * y * y))) + x;
    }

    //Task 2
    public boolean isInArea(final double x, final double y) {
        return isInFirstRectangle(x, y) || isInSecondRectangle(x, y);
    }

    private boolean isInFirstRectangle(final double x, final double y) {
        final int x1 = -4;
        final int x2 = 4;
        final int y1 = 0;
        final int y2 = 5;
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    private boolean isInSecondRectangle(final double x, final double y) {
        final int x1 = -6;
        final int x2 = 6;
        final int y1 = -3;
        final int y2 = 0;
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    //Task 3
    public Double[] getTanValues(final double a, final double b, final double h) {
        List<Double> values = new ArrayList<>();
        System.out.println("x \t f(x)");
        for (double i = a; i <= b; i += h) {
            System.out.printf("%.5f\t%.5f\n", i, Math.tan(i));
            values.add(Math.tan(i));
        }
        return values.toArray(new Double[0]);
    }

    //Task 4
    public List<Integer> findPrimes(final int[] nums) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(final int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Task 5
    public List<Integer> getAscSequence(final int[] numbers) {
        List<Integer> indexes = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            indexes.add(i);
        }
        List<Integer> ascIndexes = getAscSequenceIndexes();
        for (Integer index : ascIndexes) {
            indexes.remove(index);
        }
        return indexes;
    }

    private List<Integer> getAscSequenceIndexes() {
        return new ArrayList<>();
    }

    //Task 6
    public double[][] getMatrix(final double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(i + j) % arr.length];
            }
        }
        return matrix;
    }

    //Task 7
    public double[] bubbleSort(double[] arr) {
        boolean isChanged = true;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    double temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isChanged = true;
                }
            }
        }
        return arr;
    }

    //Task 8
    public List<Integer> getIndexes(final double[] arr1, final double[] arr2) {
        List<Integer> indexes = new ArrayList();
        int index1 = 0;
        int index2 = 0;
        while (index2 < arr2.length) {
            if (index1 == arr1.length) {
                indexes.add(index1 + indexes.size());
                index2++;
            } else {
                if (arr1[index1] < arr2[index2]) {
                    index1++;
                } else {
                    indexes.add(index1 + indexes.size());
                    index2++;
                }
            }
        }
        return indexes;
    }
}
