import com.traktite.TrakTite;

/**
 * Basic example demonstrating TrakTite usage
 * 
 * This example shows:
 * - Creating a TrakTite instance
 * - Recording tracking entries
 * - Displaying tracked information
 */
public class BasicExample {
    public static void main(String[] args) {
        // Create a new tracker
        TrakTite tracker = new TrakTite("My First Tracker");
        
        // Track some events
        tracker.track("Application started");
        tracker.track("User logged in");
        tracker.track("Data processing completed");
        
        // Display all tracked entries
        tracker.printEntries();
        
        // Show entry count
        System.out.println("\nTotal entries: " + tracker.getEntryCount());
    }
}
