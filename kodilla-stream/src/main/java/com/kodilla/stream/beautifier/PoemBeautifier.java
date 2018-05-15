package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String someString, PoemDecorator decorator) {
        decorator.decorate(someString);
    }

}
