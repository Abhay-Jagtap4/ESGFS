import java.util.ArrayList;
import java.util.LinkedList;

public class Semester {

    int year;
    String semester;
    String department;

    ArrayList<String> coursesTaken = new ArrayList<>();
    ArrayList<Achievements> achievementsArrayList = new ArrayList<Achievements>();
    LinkedList<Exam> examLinkedList = new LinkedList<Exam>();


    //Getters and setters
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //Adding objects to achievementsArrayList
    public void addAchievement(){
        Achievements achievement = new Achievements();
        //TODO: add something according to Achievements class
        achievementsArrayList.add(achievement);
    }

}
