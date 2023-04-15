package class10;

public class arry2dHW06 {
    public static void main(String[] args) {
        String[][]countries={
                {"mexico", "brazil", "usa"},
                {"india", "UAE", "china", "korea"},
                {"Nigeria", "Ghana", "morocco", "algeria", "tunisia"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] Strings : countries) {
            for (String string : Strings) {
                System.out.print(string+ " ");
            }
            System.out.println();
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            count += countries[i].length;
        }
        System.out.println("Total number of countries: " + count);
    }
}

