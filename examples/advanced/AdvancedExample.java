import com.traktite.TrakTite;
import java.util.List;

/**
 * Advanced example showing multiple trackers and analysis
 * 
 * This example demonstrates:
 * - Using multiple TrakTite instances
 * - Analyzing tracking data
 * - Comparing different trackers
 */
public class AdvancedExample {
    public static void main(String[] args) {
        // Create multiple trackers for different components
        TrakTite authTracker = new TrakTite("Authentication System");
        TrakTite dataTracker = new TrakTite("Data Processing");
        TrakTite apiTracker = new TrakTite("API Gateway");
        
        // Simulate concurrent operations
        simulateAuthOperations(authTracker);
        simulateDataOperations(dataTracker);
        simulateApiOperations(apiTracker);
        
        // Display results from all trackers
        System.out.println("\n=== SYSTEM TRACKING REPORT ===\n");
        authTracker.printEntries();
        System.out.println();
        dataTracker.printEntries();
        System.out.println();
        apiTracker.printEntries();
        
        // Summary
        System.out.println("\n=== SUMMARY ===");
        System.out.println("Authentication events: " + authTracker.getEntryCount());
        System.out.println("Data processing events: " + dataTracker.getEntryCount());
        System.out.println("API events: " + apiTracker.getEntryCount());
        System.out.println("Total system events: " + 
            (authTracker.getEntryCount() + dataTracker.getEntryCount() + apiTracker.getEntryCount()));
    }
    
    private static void simulateAuthOperations(TrakTite tracker) {
        tracker.track("User authentication request received");
        tracker.track("Credentials validated successfully");
        tracker.track("Session token generated");
        tracker.track("User logged in");
    }
    
    private static void simulateDataOperations(TrakTite tracker) {
        tracker.track("Data import started");
        tracker.track("Validating data format");
        tracker.track("Processing 1000 records");
        tracker.track("Data import completed successfully");
        tracker.track("Cache updated");
    }
    
    private static void simulateApiOperations(TrakTite tracker) {
        tracker.track("API request received: GET /users");
        tracker.track("Request authorized");
        tracker.track("Database query executed");
        tracker.track("Response formatted");
        tracker.track("Response sent: 200 OK");
    }
}
