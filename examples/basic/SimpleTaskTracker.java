import com.traktite.TrakTite;

/**
 * Simple tracking example for monitoring tasks
 * 
 * This example demonstrates how to use TrakTite
 * to monitor a sequence of tasks or operations.
 */
public class SimpleTaskTracker {
    public static void main(String[] args) {
        TrakTite taskTracker = new TrakTite("Task Monitor");
        
        // Simulate various tasks
        simulateTask(taskTracker, "Initialize database connection");
        simulateTask(taskTracker, "Load configuration");
        simulateTask(taskTracker, "Start HTTP server");
        simulateTask(taskTracker, "Register endpoints");
        simulateTask(taskTracker, "Ready to accept requests");
        
        // Display the tracking log
        System.out.println("\n--- Task Execution Log ---");
        taskTracker.printEntries();
    }
    
    private static void simulateTask(TrakTite tracker, String taskName) {
        tracker.track(taskName);
        try {
            // Simulate task execution time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
