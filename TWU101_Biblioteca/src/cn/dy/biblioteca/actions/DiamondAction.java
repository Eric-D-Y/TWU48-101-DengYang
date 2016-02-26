package cn.dy.biblioteca.actions;

/**
 * Created by eric on 2/26/16.
 */
public class DiamondAction implements IAction {
    @Override
    public void print() {
        System.out.println("\n=======================  DiamondAction  =======================");
        this.printIsoscelesTriangle();
        this.printDiamond();
        this.printDiamondWithName();
    }

    private void printIsoscelesTriangle() {
        System.out.println("print isosceles diamond.");
        int N = 3;
        for (int i = -N + 1; i <= 0; i++) {
            for (int j = -N + 1; j <= N - 1; j++) {
                if (Math.abs(i) + Math.abs(j) <= N - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printDiamond() {
        System.out.println("print diamond.");
        int N = 3;
        for (int i = -N + 1; i <= N - 1; i++) {
            for (int j = -N + 1; j <= N - 1; j++) {
                if (Math.abs(i) + Math.abs(j) <= N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void printDiamondWithName() {
        System.out.println("print diamond with name.");
        int N = 3;
        for (int i = -N + 1; i <= N - 1; i++) {
            if (i == 0) {
                System.out.println("Bill");
                continue;
            }
            for (int j = -N + 1; j <= N - 1; j++) {
                if (Math.abs(i) + Math.abs(j) <= N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
