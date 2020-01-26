public class DrawBox {

    public void drawBox(int x, int y) {
        if (x == 0 | y == 0) {
            return;
        }

        printVerticalSides(x);

        System.out.println("");
        for (int i = 0; i < y - 1; i++) {
            System.out.print('\'');
            for (int z = 0; z < x - 2; z++) {
                System.out.print(" ");
            }
            System.out.print('\'');
            System.out.println("");
        }

        printVerticalSides(x);

    }

    private void printVerticalSides(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("-");
        }
    }
}
