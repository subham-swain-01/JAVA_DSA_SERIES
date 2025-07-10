public class Celling {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 9, 12, 18, 34};
        int target = 15;

int ans = searchceling(array,target);
        System.out.println(ans);
    }

    static int searchceling(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == n) {
             return mid;
            } else if (arr[mid]<n) {
               start=mid+1;
            }
            else {
                end= mid -1;
            }
        }
        if(start<arr.length){
            return arr[start];
        }
        return -1;
    }

}
