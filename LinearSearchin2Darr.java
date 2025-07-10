public class LinearSearchin2Darr
{
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,6},
                {7,91,5},
                {23,45,67}
        };
        boolean f= false;
        int k =9;
        for(int i= 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==k){
                    System.out.println("element found aat row: {"+(i+1)+" "+(j+1)+"}");
                    f=true;
                }
            }

        }
        if(f==false){
            System.out.println("element not found");
        }
    }
}
