import javax.swing.text.html.MinimalHTMLWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        int[] bigBox = {5, 6, 12};
//        System.out.println(bigBox[0]);

//        System.out.println("\n");

//        int[] weight = new int[12];
//        weight[0] = 90;
//        for (int i = 0; i < 12; i++) {
//            System.out.println(weight[i]);
//        }


//        System.out.println("\n");

//        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        for (int i = 0; i < weight.length; i++) {
//            System.out.println(weight[i]);


//        System.out.println("\n");
//        int[] arr = new int[10];
//        int arrSize = arr.length;
//        System.out.println(arrSize);

//        System.out.println("\n");

//        int[] arr = new int[2];
//        int i = arr[1];
//        for (int a = 0; a < arr.length; a++) {
//            arr[a] = a + 1;
//            System.out.println(arr[a]);


        System.out.println("Homework");
        System.out.println("Task №1\n");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("Task №1.1\n");

        double[] fractionalNumbers = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.println(fractionalNumbers[i]);
        }

        System.out.println("Task №2\n");

        for (int z = 0; z < numbers.length - 1; z++) {
            System.out.print(numbers[z] + ", ");
        }
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("Task №2.1\n");

        for (int z = 0; z < fractionalNumbers.length - 1; z++) {
            System.out.print(fractionalNumbers[z] + ", ");
        }
        System.out.println(fractionalNumbers[fractionalNumbers.length - 1]);

        System.out.println("Task №3\n");

        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};

        for (int x = a.length - 1; x >= 0; x--) {
            System.out.print(a[x]);
            if (x != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int c = b.length - 1; c >= 0; c--) {
            System.out.print(b[c]);
            if (c != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Task №4\n");


        for (int m = 0; m < numbers.length; m++) {
            if (numbers[m] % 2 != 0) {
                numbers[m] = numbers[m] + 1;
            }
            System.out.print(numbers[m] + ", ");
        }
    }

}