package ie.atu.sw;

import java.util.Arrays;

//LogFunction class that calculates the log product of an array of numbers.
public class LogFunction implements MathOperation, Executable {
 
 // Implementation of the operate method from MathOperation.
 @Override
 public double operate(Number[] numbers) {
     return Arrays.stream(numbers)
                  .mapToDouble(Number::doubleValue)
                  .map(Math::log)
                  .sum();
 }

 // Implementation of canExecute to check if the request is for logProduct operation.
 @Override
 public boolean canExecute(String request) {
     return "logProduct".equals(request);
 }

 // Executes the log product operation if the parameters are of the correct type.
 @Override
 public Object execute(Object params) {
     if (params instanceof Double[]) {
         return operate((Double[]) params);
     }
     return null;
 }
}
