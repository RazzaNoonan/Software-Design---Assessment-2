package ie.atu.sw;

import java.util.ArrayDeque;
import java.util.Deque;

public class ObjectQueue {
 // Priority level of the queue - not in use but can be 
 private Priority level = Priority.NORMAL_PRIORITY;
 // Queue to hold Executable objects.
 private Deque<Executable> queue = new ArrayDeque<>();

 // Method to add Executable objects to the queue.
 public void add(Executable executable) {
     queue.push(executable);
 }
 
 // Executes an operation based on the request and parameters provided.
 public Object execute(String request, Object params) {
     for (Executable executable : queue) {
         if (executable.canExecute(request)) {
             return executable.execute(params);
         }
     }
     return null;
 }
}
