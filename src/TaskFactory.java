/**
 * Factory class for creating Task objects.
 */
public class TaskFactory {
    /**
     * Create a new task with validation.
     *
     * @param name     The name of the task.
     * @param start    The start time of the task.
     * @param end      The end time of the task.
     * @param priority The priority level of the task.
     * @return The created task or null if invalid.
     */
    public Task createTask(String name, String start, String end, String priority) {
        if (name.isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return null;
        }

        if (!Task.isValidTimeFormat(start) || !Task.isValidTimeFormat(end)) {
            System.out.println("Invalid time format. Please use HH:mm format.");
            return null;
        }

        if (!isValidPriority(priority)) {
            System.out.println("Invalid priority level. Please choose High, Medium, or Low.");
            return null;
        }

        if (start.compareTo(end) >= 0) {
            System.out.println("End time must be after start time.");
            return null;
        }

        return new Task(name, start, end, priority);
    }

    /**
     * Check if the priority level is valid.
     *
     * @param priority The priority level to check.
     * @return True if valid, false otherwise.
     */
    private boolean isValidPriority(String priority) {
        return priority.equalsIgnoreCase("High") ||
               priority.equalsIgnoreCase("Medium") ||
               priority.equalsIgnoreCase("Low");
    }
}
