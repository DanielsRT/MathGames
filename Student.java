import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private List<LocalDate> absences; 

    public Student() {
        id = 1234;
        absences = new ArrayList<>();
    }

    @Override
    public String toString() {
        return id + " " + absences;
    }

    
}
