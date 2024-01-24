package ie.atu.sw;

import java.util.Arrays;

//Summation class that sums an array of integers & is executable by ObjectQueue.
public class Summation implements MathOperation, Executable {
 
 // Implementation of the operate method from MathOperation.
 @Override
 public double operate(Number[] numbers) {
     return Arrays.stream(numbers)
                  .mapToInt(Number::intValue)
                  .sum();
 }

 // Implementation of canExecute to check if the request is for summation operation.
 @Override
 public boolean canExecute(String request) {
     return "summation".equals(request);
 }

 // Executes the summation operation if the parameters are of the correct type.
 @Override
 public Object execute(Object params) {
     if (params instanceof Integer[]) {
         return operate((Integer[]) params);
     }
     return null;
 }
}
