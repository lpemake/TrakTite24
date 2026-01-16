# TrakTite24

A simple and lightweight Java tracking and monitoring utility for recording events, tasks, and system activities with timestamps.

## Overview

TrakTite24 provides an easy-to-use API for tracking events in your Java applications. Whether you're monitoring application startup, tracking user actions, or logging system events, TrakTite24 offers a clean and straightforward interface.

## Features

- ✅ Simple event tracking with timestamps
- ✅ Multiple tracker instances support
- ✅ Automatic timestamp formatting
- ✅ Entry counting and retrieval
- ✅ Clean, readable output
- ✅ No external dependencies

## Getting Started

### Basic Usage

```java
import com.traktite.TrakTite;

public class Example {
    public static void main(String[] args) {
        // Create a new tracker
        TrakTite tracker = new TrakTite("My Tracker");
        
        // Track events
        tracker.track("Application started");
        tracker.track("User logged in");
        
        // Display tracked entries
        tracker.printEntries();
    }
}
```

### Creating a Tracker

```java
// Create a tracker with a descriptive name
TrakTite tracker = new TrakTite("Authentication System");
```

### Recording Events

```java
// Track simple events
tracker.track("User authentication successful");
tracker.track("Session created");
tracker.track("Redirecting to dashboard");
```

### Viewing Tracked Data

```java
// Print all entries with timestamps
tracker.printEntries();

// Get entry count
int count = tracker.getEntryCount();
System.out.println("Total entries: " + count);

// Access individual entries
List<TrackingEntry> entries = tracker.getEntries();
for (TrackingEntry entry : entries) {
    System.out.println(entry.getMessage());
}
```

## Examples

The `examples` directory contains several demonstrations of TrakTite24 usage:

### Basic Examples

Located in `examples/basic/`:

- **BasicExample.java** - Simple introduction to TrakTite
  ```
  Demonstrates: Creating a tracker, recording events, displaying output
  ```

- **SimpleTaskTracker.java** - Task monitoring example
  ```
  Demonstrates: Tracking sequential tasks, simulating real operations
  ```

### Advanced Examples

Located in `examples/advanced/`:

- **AdvancedExample.java** - Multiple tracker management
  ```
  Demonstrates: Using multiple trackers, generating reports, system-wide tracking
  ```

- **CustomAnalysis.java** - Custom data analysis
  ```
  Demonstrates: Accessing tracking data, time-based analysis, custom filtering
  ```

## Running the Examples

To run any example, compile it with the TrakTite source and execute:

```bash
# Compile the main class
javac src/main/java/com/traktite/TrakTite.java

# Compile and run a basic example
javac -cp src/main/java examples/basic/BasicExample.java
java -cp .:src/main/java examples/basic/BasicExample

# Compile and run an advanced example
javac -cp src/main/java examples/advanced/AdvancedExample.java
java -cp .:src/main/java examples/advanced/AdvancedExample
```

## API Reference

### TrakTite Class

#### Constructor
- `TrakTite(String name)` - Creates a new tracker with the specified name

#### Methods
- `void track(String message)` - Records a new tracking entry with current timestamp
- `void printEntries()` - Prints all tracking entries to console
- `List<TrackingEntry> getEntries()` - Returns a list of all tracking entries
- `int getEntryCount()` - Returns the number of tracked entries
- `String getName()` - Returns the tracker name
- `void clear()` - Removes all tracking entries

### TrackingEntry Class

#### Methods
- `String getMessage()` - Returns the entry message
- `LocalDateTime getTimestamp()` - Returns the entry timestamp

## Use Cases

- **Application Monitoring**: Track application lifecycle events
- **Performance Analysis**: Monitor operation timing and sequence
- **Debugging**: Record execution flow for troubleshooting
- **Audit Logging**: Keep track of user actions and system events
- **Task Management**: Monitor task execution in workflows

## Requirements

- Java 8 or higher
- No external dependencies required

## License

This project is open source and available under the MIT License.

## Contributing

Contributions, issues, and feature requests are welcome!

## Author

Created for tracking and monitoring needs in Java applications.