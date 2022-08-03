public class Main {
    public static void main(String[] args) {

        //Задача 1

        int [] arrayOne = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        double [] arrayTwo = {1.57, 7.654, 9.986};
        int [] arrayThree = {3, 7, 12};

        //Задача 2

        for (int a = 0; a <= 2; a++) {
            System.out.print(arrayOne[a]);
            if (a <= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = 0; b <= 2 ; b++) {
            System.out.print(arrayTwo[b]);
            if (b <= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int c = 0; c <= 2; c++) {
            System.out.print(arrayThree[c]);
            if (c <= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        //Задача 3

        for (int a = 2; a >= 0; a--) {
            System.out.print(arrayOne[a]);
            if (a >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = 2; b >= 0 ; b--) {
            System.out.print(arrayTwo[b]);
            if (b >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int c = 2; c >= 0; c--) {
            System.out.print(arrayThree[c]);
            if (c >= 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        //Задача 4

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0 ) {
                arrayOne[i] = arrayOne[i] + 1;
                }
            if (i >= 1) {
                System.out.print(", ");
            }
            System.out.print(arrayOne[i]);
        }
    }
}
