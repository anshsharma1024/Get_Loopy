public class GetLoopy {
    public static void main(String[] args) {

        // Task 1: count up by 1 from 0 to 30
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2: count down by 1 from 30 to 0
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 3: count up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 4: count down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 5: right triangle, 1 to 5 stars per row
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 6: upside-down triangle, 5 to 1 stars per row
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 7: 5x5 square
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}