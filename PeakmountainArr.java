public class PeakmountainArr {
    public static void main(String[] args) {
        int[] arr= {2,4,7,9,16,12,6,1};
        int start =0;
        int end = arr.length-1;
        int abc = search(arr);
        System.out.println(arr[abc]);
    }
    static int search(int arr[]){
        int start =0;
        int end = arr.length-1;


        while (start<end){
            int mid = start+(end - start)/2;
            if(arr[mid]<arr[mid+1]){

                start=mid+1;
            }else {

                    end=mid;

            }
        }
        return start;
    }

}
