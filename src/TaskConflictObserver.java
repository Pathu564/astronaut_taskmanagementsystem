/**
 * Observer interface for task conflict notifications.
 */
public interface TaskConflictObserver {
    /**
     * Called when a task conflict occurs.
     *
     * @param existingTask The existing task that conflicts.
     * @param newTask      The new task that causes the conflict.
     */
    void onTaskConflict(Task existingTask, Task newTask);
}
