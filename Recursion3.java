public class Recursion3
{
    public static void main(String[] args) {
        System.out.println(sum1ton(3));
    }
    static int sum1ton(int n){
        if(n<1){
            return 0;
        }
        return n+sum1ton(n-1);
    }

}
