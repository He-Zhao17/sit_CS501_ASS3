/*
* (Display prime numbers between 2 and 1,000)
* Modify the program given in Listing 5.15 to display
* all the prime numbers between 2 and 1,000, inclusive.
* Display eight prime numbers per line. Numbers are separated by exactly one space.
* */


import javax.sound.sampled.Line;

public class A5_20 {
    public static void main (String[] args) {
        System.out.println("This tool is to out put the prime numbers from 2 to 1000. Each 8 prime numbers will be in a line.");
        System.out.println("\n");
        final int Every_Line_Num = 8;
        int No = 2;
        int LineNum = 0;
        while ( No <= 1000 && No >= 2) {
            if (isPrime(No)) {
                System.out.print(No + " ");
                if (LineNum == Every_Line_Num - 1) {
                    LineNum = 0;
                    System.out.print("\n");
                } else {
                    LineNum++;
                }
                No++;
            } else {
                No++;
            }
        }

    }

    public static boolean isPrime(int n) {
        for (int d = 2; d <= n/2; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

}
