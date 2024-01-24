package ie.atu.sw;

public interface Executable {
 // See's if the class can execute based on the request.
 boolean canExecute(String request);
 
 // Executes the operation and returns the result.
 Object execute(Object params);
}
