package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



/*      ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/
        //zadnie 7.1
/*      PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = "Na gorze roze na dole bez.";
        // dopisuje "ABC" na poczatku i koncu
        poemBeautifier.beautify(poem, toBeDecorated -> {
            System.out.println("\"ABC\" " + toBeDecorated + " \"ABC\"");
            return toBeDecorated;
        });
        // metoda toUpperCase
        poemBeautifier.beautify(poem, toBeDecorated -> {
            System.out.println(toBeDecorated.toUpperCase());
            return toBeDecorated;
        });
        //wlasna metoda
        poemBeautifier.beautify(poem, toBeDecorated -> {
            System.out.println(new StringBuilder(toBeDecorated).reverse());
            return toBeDecorated;
        });
        //wlasna metoda
        poemBeautifier.beautify(poem, toBeDecorated -> {
            System.out.println(toBeDecorated.replace(toBeDecorated, "666"));
            return toBeDecorated;
        });
        //jednolinijkowa lambda
        System.out.println(poemBeautifier.beautify(poem,(toBeDecorated)-> toBeDecorated + "\nA ty koduj jesli chcesz."));
*/

    }
}