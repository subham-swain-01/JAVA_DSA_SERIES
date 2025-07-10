
public class Findevennum {
    public static void main(String[] args) {
        int[] arr = {12, 24, 5, 6789, 4};
        int count = 0;

        for (int num : arr) {
            int digits = countDigits(num);
            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total numbers with even number of digits: " + count);
    }


    public static int countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
