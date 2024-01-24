package ie.atu.sw;

public class Flipper implements Executable {

 // Method to reverse a string.
 public String flip(String s) {
     return new StringBuilder(s).reverse().toString();
 }

 // canExecute to check if the request is for flip operation.
 @Override
 public boolean canExecute(String request) {
     return "flip".equals(request);
 }

 // Executes the flip operation if the parameters are of the correct type.
 @Override
 public Object execute(Object params) {
     if (params instanceof String) {
         return flip((String) params);
     }
     return null;
 }
}
