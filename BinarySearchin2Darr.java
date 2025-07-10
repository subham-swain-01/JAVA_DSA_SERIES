import java.util.Arrays;

public class BinarySearchin2Darr
{
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 6},
                {7, 8, 9},
                {23, 45, 67}
        };
        int k= 8;
        System.out.println(Arrays.toString(search(array, k)));

    }
    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
        while (r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[] {r,c};
            } else if (arr[r][c]<target) {
                r++;
            }else {
                c--;
            }

        }

    return new int[] {-1,-1};
    }

}
