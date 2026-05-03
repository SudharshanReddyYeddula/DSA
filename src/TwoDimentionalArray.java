import java.util.Scanner;

public class TwoDimentionalArray {
    static void main() {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
