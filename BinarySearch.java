public class BinarySearch {
        public static void main(String[] args) {
            int[] arr= {2,4,6,8,10,12,14,16,18,20};
            int key = 1;
            int start = 0;
            int end = arr.length-1;
            boolean found = false;
            while (start<=end){
                int mid = start + (end-start)/2;

                if(arr[mid]==key){
                    System.out.println("element found at :"+mid);
                    found  = true;
                    break;
                } else if (arr[mid]<key) {
                    start= mid+1;
                }else {
                    end=mid-1;
                }

            }
            if(!found){
                System.out.println("element not found");
            }
        }
    }

