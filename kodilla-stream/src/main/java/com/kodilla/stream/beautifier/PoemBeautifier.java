package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public String beautify(String someString, PoemDecorator decorator) {
        return decorator.decorate(someString);
    }
}