import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {
        int[] array  = {4,2,7,1,3};
         sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

}
