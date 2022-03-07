package org.ac.bootcamp;

public class Machine<T> {

   public T operation(MonoOperation<T> operation, T value) {
      return operation.operation(value);
   }

   public T operation(BiOperation<T> operation, T value, T otherValue) {
      return operation.operation(value, otherValue);
   }
}
