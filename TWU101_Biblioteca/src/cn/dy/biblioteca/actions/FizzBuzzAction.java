package cn.dy.biblioteca.actions;

/**
 * Created by eric on 2/27/16.
 */
public class FizzBuzzAction implements IAction {
    @Override
    public void print() {
        System.out.println("\n=======================  FizzBuzzAction  =======================");
        for (int i = 1; i <= 100; i++) {
            System.out.println(getOutput(i));
        }
    }

    private String getOutput(int num) {
        String result = "";
        if (num % 3 == 0)
            result += "Fizz";
        if (num % 5 == 0)
            result += "Buzz";
        if (result.equals(""))
            result = Integer.toString(num);
        return result;
    }
}
