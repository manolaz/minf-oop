package javaoop;

import java.util.ArrayList;
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
 * OOP Day2
 * Author: NGUYEN VU ANH TRUNG
 */
public class Day2 {

    public char ex1(final String str, final int index) {
        if (str != null) {
            char letter = str.charAt(index);
            return letter;
        }
        else {
            return '_';
        }
    }

    public String ex2(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }
        else {
            return "null";
        }
    }

    public String ex3(String str, Boolean conversion) {
        if (str != null) {
            if (conversion){
                return str.toUpperCase();
            } else {
                return str.toLowerCase();
            }
        }
        else {
            return "null";
        }
    }
    
    public String ex4(String str, int begin, int end) {
        if (str != null) {
            return str.substring(begin, end);
        }
        else {
            return null;
        }
    }

    public String ex5(String str) {
        if (str != null) {
            // DEFINE list of consonants
            // List<Character> list_consonants = Collections.synchronizedList(new ArrayList<>());
            StringBuilder result = new StringBuilder(str.length());
            StringBuilder list_consonants = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                // Checks whether a character is a consonant
                if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                        && str.charAt(i) != 'u') {
                    // cCount++;
                    list_consonants.append(str.charAt(i));
                }
            }

            if (list_consonants.length() % 2 == 0) {
                return list_consonants.reverse().toString();
            }
            else {
                
            }

            return result.toString();
        }
        else {
            return null;
        }
    }

    public String ex6(String str) {
        // With a string as user input, convert all vowel characters of this string into Upper case. 
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                // 4. Checks whether a character is a vowel
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    String.valueOf(str.charAt(i)).toUpperCase();
                }
            }
            return str;
        } else {
            return "";
        }
    }

    public int ex7(String str) {
        if (str != null) {
            int vCount = 0;
            for (int i = 0; i < str.length(); i++) {
                // 4. Checks whether a character is a vowel
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    // Increments the vowel counter
                    vCount++;
                }
            }
            return vCount;
        } else {
            return 0;
        }
    }
    
    public int ex8(String number) {
        // With an integer as user input, sum all the digit of this integer.
        if (number != null) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Character.getNumericValue(number.charAt(i));
            }
            return sum;
        } else {
            return 0;
        }
    }

    public int ex10(int n) {
        // With an integer n as user input, list the first n Fibonacci values. 
        int zero = 0, one = 1, sum = 0;
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                sum = zero + one;
                one = zero;
                zero = sum;
            }
            return sum;
        } else {
            return 0;
        }
    }

    public void ex11(String filename, int lines) {
        // With a file name as user input and an integer n, 
        // read first n lines from a file. 
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                int passed_lines = 0;
                // READING lines
                while (((line = file.readLine()) != null ) || (passed_lines < lines)) {
                    passed_lines += 1;
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
    

    public String ex17(String word) {
        // With a string as user input,
        //  count the frequency of all characters in this string.
        if (word != null) {
            Set<Character> chars = new HashSet<>();
            StringBuilder result = new StringBuilder(word.length());
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (chars.add(ch)) {
                    result.append(ch);
                }
            }
            return result.toString();
        } else {
            return "";
        }
    }


    // Exercise 13.
    // With an file name as user input,
    // export a file content line by line.
    public void ex21(String filename) {
        // With a file name as user input, export a file content line by line.
        if (filename != null) {
            try {
                RandomAccessFile file = new RandomAccessFile(filename, "r");
                String line;
                // READING lines
                while ((line = file.readLine()) != null) {
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

    public void ex24(String word, String permutations) {
        // With a string as user input, print all permutation of this string.
        if (word != null) {
            System.out.print(permutations);
        } else {
            boolean alpha[] = new boolean[26];
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                // Rest of the string after excluding
                // the ith character
                String ros = word.substring(0, i) + word.substring(i + 1);

                if (alpha[ch - 'a'] == false)
                    ex24(ros, permutations + ch);
                alpha[ch - 'a'] = true;
            }
        }
    }
    
    public static Stream<String> permutationStream(String str) {
        if (str.isEmpty()) {
            return Stream.of("");
            }
        return IntStream.range(0, str.length()).boxed().flatMap(
            i -> permutationStream(str.substring(0, i) + str.substring(i + 1)).map(
                        t -> str.charAt(i) + t));
    }

    public String ex25(String word) {
        // With a string as user input, remove all the duplicate word of this string. 
        if (word != null) {
            Set<Character> chars = new HashSet<>();
            StringBuilder result = new StringBuilder(word.length());
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (chars.add(ch)) {
                    result.append(ch);
                }
            }
            return result.toString();
        } else {
            return "";
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = input.nextLine();
        System.out.println(str);
        // permutationStream
        // permutations("xyz").parallel().collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);
    }   
}