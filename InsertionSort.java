import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {
int[] array = {2,5,7,1,9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){

                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
    }

}
