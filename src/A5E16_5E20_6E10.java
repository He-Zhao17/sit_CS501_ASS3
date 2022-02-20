import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class A5E16_5E20_6E10 {
    public static void main (String[] args) {
        System.out.println("Now we find the number of the prime numbers less than 1000.");
        System.out.println("And we will populate an array to store those numebrs.");
        System.out.println("-----------------------------------------------------------");

        int num = 0;
        for (int q = 2; q < 1000; q++) {
            if (isPrime(q)) {
                num++;
            }
        }

        int[] Pnumbers = new int[num];
        num = 0;
        for (int q = 2; q < 1000; q++) {
            if (isPrime(q)) {
                Pnumbers[num] = q;
                num++;
            }
        }

        System.out.println("The number of prime numbers less than 1000 is " + num + ".");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Now we will show the prime number less than 1000.");
        System.out.println("Each 8 numbers will be in one line.");
        System.out.println("We will only show the first 50 number.");
        System.out.println("-----------------------------------------------------------");

        final int Every_Line_Num = 8;
        int No = 2;
        int LineNum = 0;
        int NumSum = 0;
        while ( No <= 1000 && No >= 2 && NumSum < 50) {
            if (isPrime(No)) {
                System.out.print(No + " ");
                NumSum++;
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
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Now you can enter one number less than 1000 and more than 1." +
                "\nIf it is a prime number, I will reply by" +
                " \"Prime Number\", otherwise I will show you its factors.");
        System.out.println("-----------------------------------------------------------");
        Scanner scan = new Scanner(System.in);

        System.out.print("Now please input a number less than 1000: ");
        while (scan.hasNextInt()) {
            int input1 = scan.nextInt();
            if (input1 < 2 || input1 >= 1000) {
                System.out.println("Error: incorrect number input.\n\n");
                System.out.print("Now please input a number less than 1000: ");
                continue;
            }
            int dIndex = 0;
            int uIndex = Pnumbers.length - 1;
            boolean isInArr = false;
            while (input1 <= Pnumbers[uIndex] && input1 >= Pnumbers[dIndex]) {
                if (uIndex == dIndex) {
                    if (input1 == Pnumbers[dIndex]) {
                        isInArr = true;
                    }
                    break;
                }
                if (input1 > Pnumbers[(uIndex + dIndex) / 2]){
                    dIndex = (uIndex + dIndex) / 2 + 1;
                } else {
                    uIndex = (uIndex + dIndex) / 2;
                }
            }
            if (isInArr) {
                System.out.println("Prime Number.\n\n");
                System.out.print("Now please input a number less than 1000: ");
            } else {
                ArrayList<Integer> sol = new ArrayList<Integer>();
                int i = 2;
                while (input1 > 1 && i <= input1) {
                    if (input1 % i == 0) {
                        sol.add(i);
                        input1 = input1 / i;
                        i = 2;
                    } else {
                        i++;
                    }
                }
                System.out.print("The factors of the integer are: ");
                for (int j = 0; j < sol.size(); j++) {
                    System.out.print(sol.get(j) + " ");
                }
                System.out.println("\n\n");
                System.out.print("Now please input a number less than 1000: ");
            }
        }






        /*
        System.out.println("5E16 is to find the factors of the given integer.");
        System.out.print("Now input a integer: ");
        Scanner scan = new Scanner(System.in);
        int k = 0;
        if (scan.hasNextInt()) {
            k = scan.nextInt();
            if (k <= 0) {
                System.out.println("\nError: Please input a positive integer.");
                return;
            }
        } else {
            System.out.println("\nError.");
            return;
        }
        int f = k;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int i = 2;
        while (f > 1 && i <= f) {
            if (f % i == 0) {
                sol.add(i);
                f = f / i;
                i = 2;
            } else {
                i++;
            }
        }
        System.out.print("The factors of the integer are: ");
        for (int j = 0; j < sol.size(); j++) {
            System.out.print(sol.get(j) + " ");
        }

        System.out.print("\n\n-----------------------------");
        System.out.println("\n5E20 is to out put the prime numbers from 2 to 1000. Each 8 prime numbers will be in a line.");
        System.out.println("We only show the first 50.");
        System.out.println("\n");
        final int Every_Line_Num = 8;
        int No = 2;
        int LineNum = 0;
        int NumSum = 0;
        while ( No <= 1000 && No >= 2 && NumSum < 50) {
            if (isPrime(No)) {
                System.out.print(No + " ");
                NumSum++;
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

        System.out.print("\n\n-----------------------------");
        System.out.println("\n 6E10 is to get the number of prime numbers less than 10000.\n");
        int num = 0;
        for (int q = 2; q < 10000; q++) {
            if (isPrime(q)) {
                num++;
            }
        }
        System.out.print("\nThe number of prime numbers less than 10000 is " + num + ".");

        System.out.print("\n\n-----------------------------");

        System.out.println("Now we have made a array storing all the prime numbers less than 1000;");
        */

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
