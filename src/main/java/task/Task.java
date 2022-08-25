public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public Task(String isDone, String description) {
        this.isDone = isDone.equals("X");
        this.description = description;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        isDone = true;
    }

    public void markAsUndone() {
        isDone = false;
    }

    public String toString() {
        return String.format("[%s] %s", getStatusIcon(), description);
    }

    public String toTxt() {
        return String.format("%s @@ %s", getStatusIcon(), description);
    }
}