import java.util.Scanner;

public class A7E9_7E10_7E20 {
    public static void main (String[] args) {
        System.out.println("This tool is to give the smallest number and its index in a double number " +
                "array.");
        Boolean conti = true;
        while (conti) {
            System.out.println("Please enter 10 double numbers. Seperated by one space: ");
            Scanner scan = new Scanner(System.in);
            double[] nums = new double[10];
            for (int i = 0; i < 10; i++) {
                if (scan.hasNextDouble()) {
                    nums[i] = scan.nextDouble();
                } else {
                    System.out.println("Error input.");
                    System.exit(1);
                }
            }

            //Find the smallest number and index
            double minNum = nums[0];
            int minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < minNum) {
                    minNum = nums[i];
                    minIndex = i;
                }
            }
            System.out.println("\nThe smallest number is " + minNum + " and the index is " + minIndex);

            //Sort smallest
            System.out.println("\nThe arrary after sorting is :");
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        double temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            for (int i= 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }

            System.out.println("\n\nDo you want continue to input another array? (Y/N)?");
            scan = new Scanner(System.in);
            while (scan.hasNext()) {
                String yn = scan.next();
                if (yn.equals("Y")) {
                    conti = true;
                    System.out.println("\n\n");
                    break;
                } else if (yn.equals("N")){
                    conti = false;
                    break;
                } else {
                    System.out.println("Error input, please input again.");
                    System.out.println("\n\nDo you want continue to input another array? (Y/N)?");
                    continue;
                }
            }

        }



    }
}
