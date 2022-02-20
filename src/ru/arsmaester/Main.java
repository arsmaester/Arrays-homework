package ru.arsmaester;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Array length: ");
        int n = in.nextInt();
        int[] array = new int[n];

        int[][] frequencyArray = new int[2][n];
        int evenNums = 0;
        for (int j = 0; j < n; j++) {
            array[j] = rd.nextInt(5);
            if (array[j] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        int[] evenArray = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Array of evens: " + Arrays.toString(evenArray));

        System.out.println("Frequency array:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 2; i++) {
                frequencyArray[0][j] = array[j];
                frequencyArray[1][j] = countFrequency(array, j);
                System.out.print(frequencyArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countFrequency(int[] array, int index) {
        int k = 0;
        for (int j : array) {
            if (j == array[index]) k++;
        }
        return k;
    }

}
