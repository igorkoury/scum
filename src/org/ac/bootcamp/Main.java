package org.ac.bootcamp;

import java.util.Locale;

public class Main {

   public static void main(String[] args) {

      int result;
      String name;

      MonoOperation<Integer> addOne = (value) -> value + 1;
      result = addOne.operation(2);
      System.out.println(result);

      BiOperation<Integer> sum = (value, otherValue) -> value + otherValue;
      result = sum.operation(2, 2);
      System.out.println(result);

      MonoOperation<String> toUpper = (value) -> value.toUpperCase(Locale.ROOT);
      name = toUpper.operation("ta feito, velhinho");
      System.out.println(name);

      Machine<Integer> machine = new Machine<>();

      System.out.println(machine.operation((num) -> num - 2, 5));
      System.out.println(machine.operation((num, otherNum) -> num - otherNum, 10, 5));
   }
}
