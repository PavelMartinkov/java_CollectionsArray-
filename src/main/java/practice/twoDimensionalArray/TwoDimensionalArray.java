package practice.twoDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static void main(String[] args) {
        System.out.println(getTwoDimensionalArray(7));
    }

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array.length - 1 - i) {
                    array[i][j] = SYMBOL;
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        Arrays.stream(array).forEach(System.out::println);



        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return array;
    }
}