package com.kodilla.stream.lambda;

public class StreamMain {
  public static void main(String[] args) {
      Processor processor =new Processor();
      Executor codeToExecute = () -> System.out.println("This is an example");
      processor.execute(codeToExecute);

  }
}
