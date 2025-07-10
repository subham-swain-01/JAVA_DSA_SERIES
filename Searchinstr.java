import java.util.*;
public class Searchinstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string :");
        String str = sc.next();
        System.out.print("enter your target to search :");
        char terget = sc.next().charAt(0);
        System.out.println(search(str, terget));

    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        else{
            // for(int i=0;i<name.length();i++){
            //     if(name.charAt(i)==target){
            //         return true;
            //     }
            // }
            for (char ch: name.toCharArray()) {
                if(ch == target){
                    return true;
                }

            }
            return false;
        }
    }
}
