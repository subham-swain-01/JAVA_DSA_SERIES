public class Recursion6
{
    public static void main(String[] args) {
        System.out.println(isPalindrum(9812189));
    }

    static boolean isPalindrum(int n){

        return n==reverse(n,0);
    }
    static int reverse(int num,int rev){
        if(num==0) return rev;

        return reverse(num/10,rev*10+num%10);
    }
}
