package class10;

public class arry2dHW04 {
    public static void main(String[] args) {
        int[][] num = {
                {30, 40, 20, 50},
                {15, 25, 35, 45},
                {1, 2, 3, 4,}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
            }
        }
        System.out.println(sum);


    }
}
