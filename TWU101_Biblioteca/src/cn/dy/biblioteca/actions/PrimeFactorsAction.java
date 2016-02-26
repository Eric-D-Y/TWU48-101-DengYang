package cn.dy.biblioteca.actions;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by eric on 2/27/16.
 */
public class PrimeFactorsAction implements IAction {
    @Override
    public void print() {
        System.out.println("\n=======================  PrimeFactorsAction  =======================");
        System.out.println(generate(1));
        System.out.println(generate(30));
        System.out.println(generate(100));
    }

    private List<Integer> generate(int n){
        System.out.print("generate ---> "+n+"  :  ");
        List<Integer> factors= new LinkedList<>();
        int num = n;
        for (int i = 2; i <= num / i; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if (num > 1) {
            factors.add(num);
        }
        return factors;
    }
}
