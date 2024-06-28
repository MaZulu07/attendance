import java.time.LocalDateTime;

public class Attendance {
    private Worker worker;
    private LocalDateTime timestamp;

    public Attendance(Worker worker) {
        this.worker = worker;
        this.timestamp = LocalDateTime.now();
    }

    public Worker getWorker() {
        return worker;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "worker=" + worker +
                ", timestamp=" + timestamp +
                '}';
    }
}
