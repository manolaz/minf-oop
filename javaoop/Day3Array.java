package javaoop;

import java.util.Arrays;
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
            // int last = naturals.length - 1;
            int[] result = Arrays.sort(naturals, Collections.reverseOrder());
            return result[0];
        } else {
            return naturals;
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

    static int ext7(int arr[], int n) {
        // With an arrays of integers, 
        // remove all the duplicate values in this arrays. 
        // Return, if array is empty
        // or contains a single element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n - 1];
        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
        return j;
    }
    
    
    public static void ex8(int[] a, int[] b) {
        int res[];
        // Concatenate two arrays
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        // Merge two sorted arrays into res[]
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i += 1;
                k += 1;
            } else {
                res[k] = b[j];
                j += 1;
                k += 1;
            }
        }

        while (i < n) { // Merging remaining
                        // elements of a[] (if any)
            res[k] = a[i];
            i += 1;
            k += 1;
        }
        while (j < m) { // Merging remaining
                        // elements of b[] (if any)
            res[k] = b[j];
            j += 1;
            k += 1;
        }
    }

    public static void ex9(int a[], int b[]) {
        // With two arrays of integers, 
        // list all the values in the first array which are not in the second array.
        int n = a.length;
        int m = b.length; 
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;
            if (j == m)
                System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter naturals list:");
        // String str = input.nextLine();
        // System.out.println(str);
        int actual[] = { 5, 1, 6, 2, 3, 4 };
        int second[]= { 10, 20, 20, 30, 30, 40, 50, 50 };
        int expected[] = { 1, 2, 3, 4, 5, 6 };
        //  run MERGE SORT
        mergeSort(actual, actual.length);
        int set[] = { 3, 34, 4, 12, 5, 2 };
    }
}