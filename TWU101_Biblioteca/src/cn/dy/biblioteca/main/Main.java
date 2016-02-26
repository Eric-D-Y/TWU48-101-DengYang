package cn.dy.biblioteca.main;

import cn.dy.biblioteca.actions.*;

/**
 * Created by eric on 2/26/16.
 */
public class Main {
    public static void main(String[] args) {
        IAction actionTriangle = null;
        IAction[] actionArray = {new TriangleAction(), new DiamondAction(), new FizzBuzzAction(), new PrimeFactorsAction()};
        for (IAction act : actionArray) {
            act.print();
        }
    }
}
