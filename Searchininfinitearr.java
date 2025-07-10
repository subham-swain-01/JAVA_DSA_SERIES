
public class Searchininfinitearr {


    public static int findPosition(int[] arr, int target) {
        if (arr.length == 0) return -1;

        int start = 0;
        int end   = 1;


        while ( arr[end] < target) {
            int newStart = end + 1;

            end = newStart + (end - start + 1) * 2;


            if (end >= arr.length) end = arr.length - 1;

            start = newStart;
        }


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)      return mid;
            else if (arr[mid] < target)  start = mid + 1;
            else                         end   = mid - 1;
        }
        return -1;
    }

    // Simple demo
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 9, 15, 18, 21, 24, 30, 35, 40};
        int target = 18;
        int index = findPosition(arr, target);

        if (index != -1)
            System.out.println("Target found at index " + index);
        else
            System.out.println("Target not present in array.");
    }
}

