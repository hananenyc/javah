package class10;

public class arry2dHW05 {
    public static void main(String[] args) {
        int[][] evenoddnumbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Loop through each element of the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Check if the element is even
                if (evenoddnumbers[i][j] % 2 == 0) {
                    // If it is, print it out
                    System.out.print(evenoddnumbers[i][j] + " ");
                }
            }
        }
    }
}


