public class Searchin2darr {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int key = 5;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
