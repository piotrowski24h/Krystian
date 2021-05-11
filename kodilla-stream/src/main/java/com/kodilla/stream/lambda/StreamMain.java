package com.kodilla.stream.lambda;

import com.kodilla.stream.beautfier.Filter;
import com.kodilla.stream.beautfier.PoemBeautifier;
import com.kodilla.stream.beautfier.PoemDecorator;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.ArrayList;
import java.util.List;


 public class StreamMain {
     // private static Object Filter;

     public static <ExpressionExecutor> void main(String[] args) {
     //public static List<String> main(String[] args) {
         //StreamMain streamMain = new StreamMain();


         ExpressionExecutor expressionExecutor = new ExpressionExecutor();

         System.out.println("Calculating expressions with lambdas");
         expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
         expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
         expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
         expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

         System.out.println("Calculating expressions with method references");
         expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
         expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
         expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
         expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


         PoemBeautifier.poemBeautifier = new PoemBeautifier();                                       // - czy to wygląda ok?
         PoemBeautifier.beautify("It is nice Spring", text -> text.toUpperCase());
         PoemBeautifier.beautify("Today is \"ABC\" lesson", text -> "ABC" + text);


         List<String> beautify = new ArrayList<>();
         beautify.add("Spring");
         beautify.add("flower");
         beautify.add("day");

      //   beautify = filter(beautify, beauti -> beauti.endsWith("a"));    //chciałem dodać na koniec a ale cos nie wyszło.
      //   toUpperCase(beautify, n -> n);


      //   private List<String> filter (List < String > input, Filter filter){
      //       List<String> resultList = new ArrayList<>();
      //       for (String beauti : input) {
      //           if (filter.filter(beauti)) {
      //               resultList.add(beauti);
                 }
             }
      //       return resultList;
      //   }
         // list<String> filter beautify = filter(beautify, beauti -> beauti.endsWith("!"));

      //   private void List<String > modifiBeautify(List < String > beautify, PoemDecorator poemdecorator) {
      //       List<String> modifiBeautify = new ArrayList<>();
      //       for (String beauti : beautify) {
      //           String modifiBeutif = modifi(beauti poemdecorator);
      //           modifiBeautify.add(modifiBeauti);

      //       }
       //  }
      //   System.out.println(modifiBeatify);
  //   }

  //   String poemDecorator = beauti + " " + random.nextInt(2);

  //   public static void setFilter(Object filter) {
  //       Filter = filter;
 //    }


// 7.1

     // }
     //  Processor processor = new Processor();
     //Executor codeToExecute = () -> System.out.println("This is an example text.");
     //processor.execute(codeToExecute);
     //System.out.println("Welcome to modul 7 - Stream");
//ExecuteSaySomething executeSaySomething= new ExecuteSaySomething();
//processor.execute(executeSaySomething);
     //   SaySamething saySamething = new SaySamething();
     //   saySamething.say();


 //    private static void toUpperCase(List<String> beautify, Object poemDecorator) {
 //        List<String> poemDecoratorBeauti = new ArrayList<>();

  //   }
  // }
