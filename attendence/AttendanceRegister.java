import java.util.ArrayList;
import java.util.List;

public class AttendanceRegister {
    private List<Attendance> attendances;

    public AttendanceRegister() {
        this.attendances = new ArrayList<>();
    }

    public void addAttendance(Attendance attendance) {
        attendances.add(attendance);
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void displayAttendances() {
        if (attendances.isEmpty()) {
            System.out.println("No attendance records found.");
        } else {
            for (Attendance attendance : attendances) {
                System.out.println(attendance);
            }
        }
    }
}
