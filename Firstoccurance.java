//
//public class Firstoccurance {
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 5, 8, 7, 6, 3, 1};
//        int target = 3;
//
//        int index = findFirstIndex(arr, target);
//        System.out.println("First occurrence index: " + index);
//    }
//
//    static int findFirstIndex(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i; // Return as soon as first match is found
//            }
//        }
//        return -1; // If target not found
//    }
//}




public class Firstoccurance {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 7, 6, 3, 1};
        int target = 3;

        int ans = findFirstOccurrenceInMountainArray(arr, target);
        System.out.println("First occurrence index: " + ans);
    }

    static int findFirstOccurrenceInMountainArray(int[] arr, int target) {
        int peak = findPeak(arr);

        // Search in the ascending part
        int leftIndex = orderAgnosticBS(arr, target, 0, peak);

        // Search in the descending part
        int rightIndex = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

        // Compare both indices
        if (leftIndex != -1 && rightIndex != -1)
            return Math.min(leftIndex, rightIndex);
        else if (leftIndex != -1)
            return leftIndex;
        else
            return rightIndex;
    }

    // Find peak in mountain array
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    // Order-agnostic binary search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1; // search left for first occurrence
            } else if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return ans;
    }
}


