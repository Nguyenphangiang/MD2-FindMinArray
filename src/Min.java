import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.print("Enter size of array: ");
             size = sc.nextInt();
            if (size<0){
                System.out.print("pls resize: ");
                size = sc.nextInt();
            }
        }while (size >20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("At position: " + i + " Enter element: " );
            arr[i] = sc.nextInt();
        }
        System.out.print("Min in array is: " + findMin(arr));
    }
    public static int findMin(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        } return min;
    }
}
