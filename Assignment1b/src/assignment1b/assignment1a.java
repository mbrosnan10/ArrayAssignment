/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1b;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author antho
 */
public class assignment1a {
   

    static int row = 10;
    static int col = 15;

    static int min = 1;
    static int max = 100;
    static int[][] sales = new int[row][col];

    public static void main(String[] args) {

        //Task One
        initArray(row, col);
        //Task2
        printData(sales);
        //task3
        printAdjacentSum(sales, 45);
        //task4
        range(sales, row, col);

    }

    private static int[][] initArray(int row, int col) {
     Random r = new Random();

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
               switch(i){
                   case 1:
                                sales[i][j] = ThreadLocalRandom.current().nextInt(min, max + 1);
                         break;
                   case 2:
                         sales[i][j] = r.nextInt(1+100/2)*2;break;
                   case 3:
                         sales[i][j] = r.nextInt(100/3)*3;
                                break;
                   case 4:
                         sales[i][j] = r.nextInt(100/4)*4;
                         break;
                          case 5:
                         sales[i][j] = r.nextInt(1+100/5)*5;
                         break;
//                            case 6:
//                         sales[row][col] = r.nextInt(100/6)*6;
//                         break; 
//                            case 7:
//                         sales[row][col] = r.nextInt(100/7)*7;
//                         break;
//                            case 8:
//                         sales[row][col] = r.nextInt(100/8)*8;
//                         break;
                          case 9:
                         sales[i][j] = r.nextInt(1+100/10)*10;
                         break;
                 }
              
            }//end for
        }//end for
        return sales;
    }
    
//
    private static void printData(int[][] sales) {
        //print the array
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                System.out.print(sales[i][j] + ", ");
                 
            }
            System.out.println("");

        }
    }

    private static void printAdjacentSum(int[][] sales, int x) {
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                if (sales[row][col] == 45) {
                    System.out.println("Row: " + row + " Col: " + col + " has value 45");
                }
            }
        }

    }

    private static void range(int[][] sales, int row, int col) {
        for (int i = 0; i < sales.length; i++) {
            int minInRow = sales[i][0];
            int maxInRow = sales[i][0];
            for (int j = 0; j < sales[i].length; j++) {
                if (minInRow > sales[i][j]) {
                    minInRow = sales[i][j];
                }

                if (maxInRow < sales[i][j]) {
                    maxInRow = sales[i][j];
                }

            }
            int sumRow = maxInRow - minInRow;
            System.out.println("Range of " + (i + 1) + " row: " + sumRow);
            minInRow = sales[i][0];
            maxInRow = sales[i][0];
        }
    }
}

