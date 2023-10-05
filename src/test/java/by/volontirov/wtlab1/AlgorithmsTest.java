package by.volontirov.wtlab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AlgorithmsTest {
    private Algorithms algorithms;

    @Before
    public void init() {
        algorithms = new Algorithms();
    }

    //Task 1
    @Test
    public void getExpressionSolutionTest() {
        final double expectedValue = 0.5;
        Assert.assertEquals(expectedValue, algorithms.getExpressionSolution(0, 0), 0.1);
    }

    //Task 2
    @Test
    public void notInAreaTest() {
        final double x = -7;
        final double y = 0;
        Assert.assertFalse(algorithms.isInArea(x, y));
    }

    @Test
    public void inAreaTest() {
        final double x = -6;
        final double y = 0;
        Assert.assertTrue(algorithms.isInArea(x, y));
    }

    //Task 3
    @Test
    public void getTanValuesTest() {
        final Double[] expectedValues = {0.0, Math.sqrt(3) / 3.0, Math.sqrt(3), Math.tan(Math.PI / 2)};
        final Double[] actualValues = algorithms.getTanValues(0, Math.PI / 2.0, Math.PI / 6.0);
        for (int i = 0; i < actualValues.length; i++) {
            Assert.assertEquals(expectedValues[i], actualValues[i], 0.0001);
        }
    }

    @Test
    public void aMoreThanBGetTanValuesTest() {
        final Double[] expectedValues = {};
        final Double[] actualValues = algorithms.getTanValues(Math.PI / 2.0, 0, Math.PI / 6.0);
        for (int i = 0; i < actualValues.length; i++) {
            Assert.assertEquals(expectedValues[i], actualValues[i], 0.0001);
        }
    }

    //Task 4
    @Test
    public void findPrimesTest() {
        List<Integer> expectedPrimes = List.of(1, 2, 4);
        List<Integer> actualPrimes = algorithms.findPrimes(new int[]{-1, 2, 3, 100, 29});
        Assert.assertEquals(expectedPrimes, actualPrimes);
    }

    //Task 5
    //Task 6
    @Test
    public void getMatrixTest() {
        double[][] expectedMatrix = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        double[][] actualMatrix = algorithms.getMatrix(new double[]{1, 2, 3});
        Assert.assertEquals(expectedMatrix, actualMatrix);
    }

    //Task 7
    @Test
    public void bubbleSortTest() {
        double[] expectedArr = {0.1, 2, 3};
        double[] actualArr = algorithms.bubbleSort(new double[]{2, 3, 0.1});
        Assert.assertEquals(expectedArr.length, actualArr.length);
        for (int i = 0; i < expectedArr.length; i++) {
            Assert.assertEquals(expectedArr[i], actualArr[i], 0.01);
        }
    }

    //Task 8
    @Test
    public void getIndexesTest() {
        List<Integer> expectedIndexes = List.of(0, 3, 4, 5, 7);
        List<Integer> actualIndexes = algorithms.getIndexes(new double[]{1, 5, 10}, new double[]{-1, 6, 7, 8, 11});
        Assert.assertEquals(expectedIndexes, actualIndexes);
    }
}
