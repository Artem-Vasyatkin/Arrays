import javax.swing.text.html.MinimalHTMLWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] bigBox = {5, 6, 12};
        System.out.println(bigBox[0]);

        System.out.println("\n");

//        int[] weight = new int[12];
//        weight[0] = 90;
//        for (int i = 0; i < 12; i++) {
//            System.out.println(weight[i]);
//        }


        System.out.println("\n");

        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        System.out.println("\n");
//        int[] arr = new int[10];
//        int arrSize = arr.length;
//        System.out.println(arrSize);

        System.out.println("\n");

        int[] arr = new int[2];
        int i = arr[1];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
            System.out.println(arr[a]);
        }
    }
}