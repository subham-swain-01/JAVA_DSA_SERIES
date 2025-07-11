public class Recursion7
{
    public static void main(String[] args) {
        System.out.println(countNoOfZero(20280));
    }
    static int countNoOfZero(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if (n==0) return count;
        if(n%10==0){
            return helper(n/10,++count);
        }else {
            return helper(n/10,count);
        }
    }

}
