package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExercicesIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExercicesIntroTesting.findLast(new int []{2, 3, 5}, 2);
         assertEquals(result, 0);
    }

    @Test
    public void testFindLastEmpty(){
        final int result = ExercicesIntroTesting.findLast(new int []{}, 2);
        assertEquals(result, -1);
    }

    @Test
    public void testLastZero(){
        final int result = ExercicesIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testLastZeroTwoElements(){
        final int result = ExercicesIntroTesting.lastZero(new int []{0, 1});
        assertEquals(result, 0);
    }

    @Test
    public void testCountPositive(){
        final int result = ExercicesIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositiveNullArray(){
        assertThrows(NullPointerException.class,
                () -> ExercicesIntroTesting.countPositive(null),"Array nula");
    }

    @Test
    public void testOddOrPos(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }

    @Test
    public void testOddOrPosOneElement(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{1});
        assertEquals(result, 1);
    }
}
