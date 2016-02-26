package cn.dy.biblioteca.actions;

/**
 * Created by eric on 2/26/16.
 */
public class TriangleAction implements IAction {
    @Override
    public void print() {
        System.out.println("\n=======================  TriangleAction  =======================");
        this.printEasiest();
        this.printHorizontal();
        this.printVertical();
        this.printRight();
    }

    private void printRight() {
        System.out.println("Draw a right triangle.");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printVertical() {
        System.out.println("Draw a vertical line.");
        int i = 3;
        while (i > 0) {
            System.out.println("*");
            i--;
        }
    }

    private void printEasiest() {
        System.out.println("Easiest exercise ever.");
        System.out.println("*");
    }

    private void printHorizontal() {
        System.out.println("Draw a horizontal line.");
        int i = 8;
        while (i > 0) {
            System.out.print("*");
            i--;
        }
        System.out.println();
    }
}
