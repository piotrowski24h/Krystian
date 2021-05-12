package com.kodilla.stream.beautfier;

public class PoemBeautifier  {
    private PoemBeautifier poemBeautifier;

    public String beautify(String text, PoemDecorator poemDecorator) {
         String result = poemDecorator.decorate(text);
         System.out.println(result);
         return result;
   }
}
