import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    private LocalDate datetime;

    public Deadline(String description, LocalDate datetime) {
        super(description);
        this.datetime = datetime;
    }

    public Deadline(String isDone, String description, LocalDate datetime) {
        super(isDone, description);
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + datetime.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    @Override
    public String toTxt() {
        return String.format("D @@ %s @@ %s", super.toTxt(), datetime);
    }
}