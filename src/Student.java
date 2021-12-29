import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String StudentId;
    private Boolean isUG;
    private String phone_no;
    private String Probation;
    final String[] listOfclubs = {"Design Club","Coding Club","Sports Club","Photography Club","Music club","Finance club","Drama Club","EBSB club","Gaming Club"};


    private ArrayList<Achievement> achievementsArrayList = new ArrayList<Achievement>();
    private ArrayList<Club> clubArrayList = new ArrayList<Club>();

    public Student(String name, String StudentId, Boolean isUG, String phone_no, String probation) {

        this.name = name;
        this.StudentId = StudentId;
        this.isUG = isUG;
        this.phone_no = phone_no;
        this.Probation = Probation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Boolean getIsUG() {
        return isUG;
    }

    public void setIsUG(Boolean isUG) {
        this.isUG = isUG;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getProbation() {
        return Probation;
    }

    public void setProbation(String probation) {
        this.Probation = probation;
    }

    //Adding objects to achievementsArrayList
    public void addAchievement(String name) {
        Achievement Achievement = new Achievement(name);
        //TODO: add something according to Achievements class
        achievementsArrayList.add(Achievement);
    }

    public void addAchievement(String name, Date date) {
        Achievement Achievement = new Achievement(name, date);
        achievementsArrayList.add(Achievement);
    }

    public void addAchievement(String name, Date date, String type) {
        Achievement Achievement = new Achievement(name, date, type);
        achievementsArrayList.add(Achievement);
    }

    public void removeAchievement(String Name) {
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == Name) {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }

    public void removeAchievement(String Name, Date date) {
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == Name && achievementsArrayList.get(i).achievementDate == date) {
                achievementsArrayList.remove(i);
                break;
            }
        }
    }

    public boolean modifyAchievement(String name, Date date, String type, String worth) {
        //searching with name and modifying other details
        for (int i = 0; i < achievementsArrayList.size(); i++) {
            if (achievementsArrayList.get(i).titleOfAchievement == name) {
                achievementsArrayList.get(i).setAchievementInfo(date, type, worth);
                return true;
            }
        }
        return false;
    }

    // CHECK WHETHER CLUB IS VALID

    // Adding Object to clubArrayList
    public void addClub(String nameOfTheClub){
        Club club = new Club();
        club.setNameOfClub(nameOfTheClub);
        // secretary
        // jsec
        clubArrayList.add(club);
    }

    // removeClub

    // club mai event add karne ke liye
    public void addEventInClub(String nameOfTheClub, String event){
//        clubArrayList SEARCH FOR CLUB
    }

    // CLUB MAI EVENT REMOVE KARNE KE LIYE


    // getter for clubArrayList
    public ArrayList<Club> getClubArrayList() {
        return clubArrayList;
    }

    // to check if student has joined a specific club or not
    public boolean joinedClub(Club checkClub){
        if (clubArrayList.contains(checkClub))
            return true;
        else
            return false;
    }
}
