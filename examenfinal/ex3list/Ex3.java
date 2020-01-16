package examenfinal.ex3list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Ex3
 */
public class Ex3 {

    // READ FILE NAME to ArrayList<Integer>
    public static ArrayList<Integer> readIntegerFileContent(String filename) {
        ArrayList<Integer> list_integers = new ArrayList<Integer>();
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                // READING lines
                while ((line = file.readLine()) != null) {
                    // CONVERT ROW TO <Integer>
                    Integer row = Integer.parseInt(line);
                    //Add ROW to ArrayList<Integer>
                    list_integers.add(row);
                }
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println();
        }
        return list_integers;
    }


    // 
    public static void statsList(ArrayList<Integer> arr) {
        // arr.sort(>);
        // System.out.println(arr.);
    }


    // SORT ALL NUMBER IN ODD POSITION
    public static void insertionSortOddNumber(ArrayList<Integer> arr)
    { 
        int n = arr.size();
        // create oddArr[]
        List<Integer> oddArr = new ArrayList<Integer>();

        // Put elements in oddArr[] and evenArr[] as
        // per their position
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                oddArr.add(arr.get(i));
            }
        }

        for (int i = 1; i < n; ++i) { 
            int key = oddArr.get(i);
            int j = i - 1; 
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && oddArr.get(j) > key) {
                int next = j + 1;
                oddArr.set(next, oddArr.get(j));
                j = j - 1; 
            } 
            oddArr.set(j + 1, key);
        } 
    } 

    public static void main(String[] args) {

        String fileName = "demo.txt";
        ArrayList<Integer> listInt = Ex3.readIntegerFileContent(fileName);


        // INSERTION SORT ODD NUMBER
        int n = listInt.size();
        Ex3.insertionSortOddNumber(listInt);

        // PRINT ALL ELEMENTS
        for (int i = 0; i < n; i++) {
            System.out.print(listInt.get(i) + " ");
        }
    }
}