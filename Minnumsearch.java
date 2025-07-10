public class Minnumsearch {
    public static void main(String[] args) {
        int[] arr={12,34,5,6,1,8};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min element is :" +min);
    }
}
