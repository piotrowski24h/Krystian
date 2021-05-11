package com.kodilla.stream.beautfier;

public class PoemBeautifier  {
    public static PoemBeautifier poemBeautifier;

    public static void beautify(String text, PoemDecorator poemDecorator) {
         String result = poemDecorator.decorate(text);
         System.out.println(result);
   }
}
