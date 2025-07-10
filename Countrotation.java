public class Countrotation
{
    public static void main(String[] args) {
        // original array = {2,4,5,7,8,9,10,12};
        int[] array = {9,10,12,2,4,5,7,8};
        System.out.println(findpivot(array));
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+ (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }

        return -1;
    }

}
