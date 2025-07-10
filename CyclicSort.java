import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {

        int[] array = {3,1,2,5,4};
        cyclicsort(array);
        System.out.println(Arrays.toString(array));

    }

    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
    }

}
