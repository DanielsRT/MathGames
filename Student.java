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

    public Student(int id, List<LocalDate> absences) {
        this.id = id;
        this.absences = absences;
    }

    @Override
    public String toString() {
        return id + " " + absences;
    }

    public int getId(){return id;}
    public List<LocalDate> getAbsences(){return absences;}

    public void setId(int id) {
        this.id = id;
    }

    public void setAbsences(List<LocalDate> absences) {
        this.absences = absences;
    }


    
}
