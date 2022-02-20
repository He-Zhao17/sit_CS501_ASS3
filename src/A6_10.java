public class A6_10 {

    public static void main (String[] args) {
        System.out.println("This tool is to get the number of prime numbers less than 10000.\n");
        int num = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                num++;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nThe number of prime numbers less than 10000 is " + num + ".");

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
