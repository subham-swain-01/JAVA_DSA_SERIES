public class Recursion4
{
    public static void main(String[] args) {
        System.out.println(digitsum(505));
    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        if(n<10){
            return n;
        }
        return digitsum(n/10)+(n%10);
    }
}
