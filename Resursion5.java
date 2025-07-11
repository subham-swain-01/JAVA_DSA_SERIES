public class Resursion5
{
//    static int sum =0;
//    static void  reverseno(int n){
//        if(n==0){
//            return;
//        }
//    int rem = n%10;
//        sum= sum*10 + rem;
//       reverseno(n= n/10);
//    }
    public static void main(String[] args) {
        reverseno(234);
//        System.out.println(sum);

        System.out.println(reverseno(543));
    }
static int reverseno(int n){
        return reverse(n,0);
}
static int reverse(int num,int rev){
        if(num==0){
            return rev;
        }
        return reverse(num/10,rev*10+num%10);
}

}
