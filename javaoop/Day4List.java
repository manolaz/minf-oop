package javaoop;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.Comparator;
import java.util.Date;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Day4 List
 */
public class Day4List {
    // ArrayList:
    // Exercise 1.
    // With a file name as input, read all the words in this file as a list.
    // a) Print all the contens of file.
    // b) Print in reverse order.
    // c) Print all words (ending in "s").
    // d) Remove all duplicate words and print the rest.
    // e) Find all the duplicated words in this list
    // f) Print the words and the frequency
    // g) Replaces every word ending with an "es" with its lower version.
    // h) Removes every word in the list ending with an "as", case-insensitively
    // i) Insert a * after each element
    
    public ArrayList<String> printFileContent(String filename) {
        ArrayList<String> words = new ArrayList<String>();
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                // READING lines
                while ((line = file.readLine()) != null ) {
                    String[] line_words = line.split(" ");
                    words.addAll(Arrays.asList(line_words));
                    // System.out.println(line);
                }
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println();
        }
        return words;
    }

    // b) Print in reverse order.
    // Read last line of the file
    public void readFromLast(String path){
        
    }

    // c) Print all words (ending in "s").
    public void printWordsS(String filename) {
        // With a file name as user input and an integer n, 
        // read first n lines from a file. 
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                // READING lines
                while ((line = file.readLine()) != null ) {
                    String[] words = line.split(" ");
                    // line.split(" ");
                    for (int i = 0; i < words.length; i++){
                        // Print all words (ending in "s").
                        if(words[i].contains("s") ){
                            System.out.println(line);
                        }   
                    }
                }
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println();
        }
    }

    // f) Print the words and the frequency
    public void printWordFrequency(String filename) {
        // With a file name as user input and an integer n, 
        // read first n lines from a file. 
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                // READING lines
                while ((line = file.readLine()) != null ) {

                    System.out.println(line);
                }
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println();
        }
    }
    
    // Exercise 2:
    // With a file name as input, reads the content of this file with full of numbers then:
    // a) Prints the max, min, average of the numbers.
    // b) Sort all this number using Insertion Sort, Bubble Sort and Heap Sort.
    // c) Find all the prime number
    // d) Find all the Fibonacci value in this list
    // e) Remove all the duplcate values and print the rest (keep the order)

    // Exercise 3:
    // With two array lists of integers (not sorted) as input, returns a new list that contains only the
    // duplicate elements both lists.
    // Example:
    // With two list [1, 4, 8, 9, 11, 15, 17, 28, 41, 59] [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
    // The returned list: [4, 11, 17, 28, 59]

    // Exercise 4:
    // Implement all the necessary methods for LinkedList.
    // Insert at the beginning of the list
    // Inserts to the end of this list.
    // Return the first element in the list
    // Removes the first element in the list.
    // Returns the last element in the list
    // Removes the last element in the list.
    // Removes all nodes from the list
    // Returns true if this list contains the specified element
    // Returns the data at the givem position in the list
    // Inserts a new node after a node containing the key
    // Inserts a new node before a node containing the key
    // Removes the first occurrence of the specified element in this list

    // Exercise 5:
    // Using the Exercise 1, implement the following LinkedList

    // Exercise 6:
    // With a linked list of characters as user input, 
    // remove all consecutive duplite values 
    // (nonconsecutive duplicates need not be deleted). The original order must be kept. 

    // Exercise 7:
    // With a linked list of characters as user input, removes all Nodes with info 'A' from the list. The
    // original order must be kept.
}