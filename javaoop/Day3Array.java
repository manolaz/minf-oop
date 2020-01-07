package javaoop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.Comparator;
import java.util.Date;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * OOP Day3 Array
 * Author: NGUYEN VU ANH TRUNG
 */
public class Day3Array {

    public int[] bubleSort(int[] naturals, int n) {
        // Exercise 1.
        // With an array of integers in any order and a number k,
        // find the k largest elements in this array.
        if (naturals != null) {
            int i, j, temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (naturals[j] > naturals[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        temp = naturals[j];
                        naturals[j] = naturals[j + 1];
                        naturals[j + 1] = temp;
                        swapped = true;
                    }
                }
                // IF no two elements were
                // swapped by inner loop, then break
                if (swapped == false)
                    break;
            }
            return naturals;
        } else {
            return [0];
        }
    }
    
    public int SelectionShort(ArrayList[] naturals) {
        // Exercise 2.
        // SelectionShort
        if (naturals != null) {
            int result = 0;
            return result;
        } else {
            return 0;
        }
    }

    public static void selectionSortDescending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxElementIndex] < arr[j]) {
                    maxElementIndex = j;
                }
            }

            if (maxElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxElementIndex];
                arr[maxElementIndex] = temp;
            }
        }
    }
    
    public void quickSort(int naturals[], int begin, int end) {
        // Exercise 2.
        // QuickSort
        if (begin < end) {
            int partitionIndex = partition(naturals, begin, end);

            quickSort(naturals, begin, partitionIndex - 1);
            quickSort(naturals, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // SWAP INTS
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
    
    public static void mergeSort(int[] naturals, int n) {
        // Ex 2.
        // MergeSort : Complexity
        // T(n) = 2T(n/2) + O(n)

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = naturals[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = naturals[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(naturals, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    

    public ArrayList<ArrayList<Integer>> ex3_subsetsum(
            int[] naturals, int sum) {
        // Exercise 3.
        //  Sub set SUM
        // With an array of integers in any order and a number k, 
        // find all the continuous subarrays in the given array whose sum
        // equals to an given integer.
        // Expected Output:
        // Original Array: [2, 1, 2, 3, 2, 2, 4]
        // Value of k: 6
        // Total number of continuous subarrays: [4, 2] [3, 3] [2, 4]
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            
        int n = naturals.length;
        boolean[][] T = new boolean[n + 1][sum + 1];

        // do for ith item
        for (int i = 1; i <= n; i++) {
            int sum = nat i;
            // consider all sum from 1 to sum
            for (int j = 1; j <= sum; j++) {
                sum += natj
                if (sum == k)
                for (y from i to j )
                  print naty
                  i = j;
                // don't include ith element if j-A[i-1] is negative
                if (naturals[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    // find subset with sum j by excluding or including
                    // the ith item
                    T[i][j] = T[i - 1][j] || T[i - 1][j - naturals[i - 1]];
                    result.add(T[i][j]);
                }
            }
        }
        return result;
    }
    

    public int[] ex9(int[] first, int[] second) {
        int[] res =  new int[];

        quickSort(first);
        quickSort(second, begin, end);


        return res;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter naturals list:");
        String str = input.nextLine();
        System.out.println(str);
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        //  run MERGE SORT
        mergeSort(actual, actual.length);

        // Exercise 3.
        // Sub set SUM
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        
    }
}