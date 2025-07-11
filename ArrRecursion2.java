import java.util.ArrayList;

public class ArrRecursion2
{
    public static void main(String[] args) {
        int[] array={1,3,24,54,45,32,8};
        System.out.println(linearSearch(array,0,45));
        int[] aarr = {1,2,3,4,4,8,6};
        search(aarr,0,4);
        System.out.println(list);
    }
    static int linearSearch(int[] arr,int i,int target){
        if(i== arr.length) return -1;
        if(arr[i]==target) return i;

        return linearSearch(arr,i+1,target);
    }

    //if in an array element is repeated and i want all the indeces.

    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr,int index,int target){
        if(index==arr.length) return;

        if(arr[index]==target){
            list.add(index);
        }
        search(arr,index+1,target);
    }
}
