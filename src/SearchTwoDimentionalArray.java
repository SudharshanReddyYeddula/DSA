import java.util.Arrays;
import java.util.Scanner;

public class SearchTwoDimentionalArray {
    static void main() {
        int[][] arr = {
                {1,23,43},{2,6,56,443},{234,3,63,34}
        };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] ans=searchElement(arr, target);
        System.out.println(Arrays.toString(ans));


    }

    private static int[] searchElement(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}