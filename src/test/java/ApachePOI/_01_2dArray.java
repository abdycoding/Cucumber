package ApachePOI;

public class _01_2dArray {
    public static void main(String[] args) {

        String[][] zoo={
                {"Tiger", "1"},
                {"Giraffe", "2"},
                {"Elephant", "3"},
                {"Monkey", "4"}

        };

        System.out.println("-----------------------------");
        System.out.println("zoo[2][0] = " + zoo[2][0]);
        System.out.println("zoo[2][0] = " + zoo[2][1]);

        System.out.println("--------------------");

        for (int z = 0; z <zoo.length ; z++) {

            for (int i = 0; i < zoo[z].length; i++) {
                System.out.print(zoo[z][i] + " ");
            }
            System.out.println();
        }

    }
}
