package com.example.strategy.remover;

public class RemoveStrategyRunner {
    public static void main(String[] args) {
        RemoveStrategy removeStrategy = RemoveStrategyHolder.get(RemoveType.NUMBER);
        String input = "Hel9l9o m111y frie987nd00";
        String result = removeStrategy.execute(input);
        System.out.println(result);
        RemoveStrategy removeStrategy1 = RemoveStrategyHolder.get(RemoveType.WHITE_SPACE);
        System.out.println(removeStrategy1.execute(result));

        System.out.println("******************************************************************************");

        String resultLambda = Remover.remove(input, s -> s.replaceAll("\\d", ""));
        System.out.println(resultLambda);
        String resultLambda1 = Remover.remove(result, s -> s.replaceAll("\\s", ""));
        System.out.println(resultLambda1);
    }
}
