public class Recursion2
{
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n<2)
            return n;
        return n*factorial(n-1);
    }
}
