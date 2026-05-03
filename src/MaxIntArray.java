public class MaxIntArray {

    static void main() {
        int[] arr={788,5,24,6,39,78,5,789};
        System.out.print("Max is: " +max(arr));
    }

    static int max(int[] arr) {
        int max=arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i]>max)
                max=arr[i];
        return max;
        //alternative method
    }
}
