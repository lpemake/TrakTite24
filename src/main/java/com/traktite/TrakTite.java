package com.traktite;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * TrakTite - A simple tracking and monitoring utility
 * Version: 2024
 */
public class TrakTite {
    private String name;
    private List<TrackingEntry> entries;
    private DateTimeFormatter formatter;

    /**
     * Creates a new TrakTite instance with the given name
     * @param name The name of this tracker
     */
    public TrakTite(String name) {
        this.name = name;
        this.entries = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * Records a new tracking entry
     * @param message The message to track
     */
    public void track(String message) {
        TrackingEntry entry = new TrackingEntry(message, LocalDateTime.now());
        entries.add(entry);
    }

    /**
     * Gets all tracking entries
     * @return List of all tracking entries
     */
    public List<TrackingEntry> getEntries() {
        return new ArrayList<>(entries);
    }

    /**
     * Gets the name of this tracker
     * @return The tracker name
     */
    public String getName() {
        return name;
    }

    /**
     * Prints all tracking entries
     */
    public void printEntries() {
        System.out.println("=== " + name + " ===");
        for (TrackingEntry entry : entries) {
            System.out.println("[" + entry.getTimestamp().format(formatter) + "] " + entry.getMessage());
        }
    }

    /**
     * Clears all tracking entries
     */
    public void clear() {
        entries.clear();
    }

    /**
     * Gets the number of entries
     * @return The count of tracking entries
     */
    public int getEntryCount() {
        return entries.size();
    }

    /**
     * Inner class representing a tracking entry
     */
    public static class TrackingEntry {
        private String message;
        private LocalDateTime timestamp;

        public TrackingEntry(String message, LocalDateTime timestamp) {
            this.message = message;
            this.timestamp = timestamp;
        }

        public String getMessage() {
            return message;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }
}
