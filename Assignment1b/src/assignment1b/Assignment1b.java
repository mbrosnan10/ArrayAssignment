/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1b;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author antho
 */
public class Assignment1b {


    public static void main(String[] args)
    {
        /* Task One */        int[][] table = initArray(3, 5);
        /* Task Two */        System.out.println("Task Two");
        print(table);
        /* Task Three */        swapElements(table);
        /* Task Four */        System.out.println("Task Four");
        print(table);
        /* Task Five */        System.out.println("Task Five");
        printMaximalSequence(table);
        printMaximalSequence(testArray1());
        printMaximalSequence(testArray2());
    }
    private static int[][] initArray(int rowCount, int columnCount)
    {
        int min = 1;
        int max = 9;
        int[][] table = new int[rowCount][columnCount];
        for(int[] row : table)
        {
            for(int index = 0; index < columnCount; index++)
                row[index] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return table;
    }
    public static void print(int[][] table)
    {
        for(int[] row : table)
        {
            for(int number : row)
                System.out.printf("%d\t", number);
            System.out.println();
        }
    }
    private static void swapElements(int[][] tables)
    {
        for(int index = 0; index < tables.length; index++)
        {
            int[] array = tables[index];
            if(index % 2 == 0)
                swapElements(array, 0, array.length - 1);
            else                swapElements(array, 1, array.length - 2);
        }
    }
    public static void printMaximalSequence(int[][] tables)
    {
        boolean isLastElement1 = false;
        for(int[] row : tables)
        {
            for(int index = 0; index < row.length; index++)
            {
                if(!(isLastElement1 && row[index] == 1))
                    System.out.printf("%d, ", row[index]);
                isLastElement1 = row[index] == 1;
            }
        }
        System.out.println();
    }
    private static void swapElements(int[] array, int lhsIndex, int rhsIndex)
    {
        int lhsCopy = array[lhsIndex];
        array[lhsIndex] = array[rhsIndex];
        array[rhsIndex] = lhsCopy;
    }
    private static int[][] testArray1()
    {
        return new int[][]
        {
            {
                4, 5, 1, 1, 1            },
            {
                5, 7, 7, 1, 4            },
            {
                4, 1, 1, 8, 6            }
        };
    }
    private static int[][] testArray2()
    {
        return new int[][]
        {
            {
                4, 5, 1, 1, 1            },
            {
                1, 1, 7, 1, 4            },
            {
                4, 1, 1, 8, 6            }
        };
    }
}