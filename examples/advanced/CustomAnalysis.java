import com.traktite.TrakTite;
import com.traktite.TrakTite.TrackingEntry;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Advanced example demonstrating custom analysis of tracking data
 * 
 * This example shows:
 * - Accessing individual tracking entries
 * - Performing time-based analysis
 * - Custom filtering and reporting
 */
public class CustomAnalysis {
    public static void main(String[] args) {
        TrakTite tracker = new TrakTite("Performance Monitor");
        
        // Record various events
        tracker.track("Service startup initiated");
        sleep(50);
        tracker.track("Configuration loaded");
        sleep(100);
        tracker.track("Database connection established");
        sleep(75);
        tracker.track("Cache warmed up");
        sleep(30);
        tracker.track("Service ready");
        
        // Perform custom analysis
        System.out.println("=== Custom Analysis Report ===\n");
        
        List<TrackingEntry> entries = tracker.getEntries();
        System.out.println("Total events tracked: " + entries.size());
        
        // Show first and last events
        if (!entries.isEmpty()) {
            System.out.println("\nFirst event: " + entries.get(0).getMessage());
            System.out.println("Last event: " + entries.get(entries.size() - 1).getMessage());
            
            // Calculate time span
            LocalDateTime first = entries.get(0).getTimestamp();
            LocalDateTime last = entries.get(entries.size() - 1).getTimestamp();
            long seconds = java.time.Duration.between(first, last).getSeconds();
            System.out.println("\nTotal monitoring duration: " + seconds + " seconds");
        }
        
        // Show all entries with timestamps
        System.out.println("\n--- Detailed Timeline ---");
        tracker.printEntries();
        
        // Custom filtering example: find entries containing "connection"
        System.out.println("\n--- Events containing 'connection' ---");
        entries.stream()
            .filter(e -> e.getMessage().toLowerCase().contains("connection"))
            .forEach(e -> System.out.println("  - " + e.getMessage()));
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
