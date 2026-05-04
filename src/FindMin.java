import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={788,10,24,6,39,78,5,2,789};
        System.out.println("Min is: " +min(arr));
        System.out.println("Array is: " + Arrays.toString(arr));
    }

    private static int min(int[] arr) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){

            if(min>arr[i]){
                min=arr[i];

            }
        }

        return min;

    }
}
