package StudentExample;

public class Student {
    int id;
    int studentAge; // Attribute variable
    double studentGPA;
    char studentFNInitial;
    char studentLNInitial;
    boolean hasPerfectAttendance;

    public Student (int studentAge, char studentFNInitial, char studentLNInitial, double studentGPA, boolean hasPerfectAttendance) {
        this.studentAge = studentAge; // Parameter variables
        this.studentFNInitial = studentFNInitial;
        this.studentLNInitial = studentLNInitial;
        this.studentGPA = studentGPA;
        this.hasPerfectAttendance = hasPerfectAttendance;
    }
}
