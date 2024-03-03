package StudentExample;

public class StudentProfile {
    String studentFirstName;
    String studentLastName;
    int expectedGraduationYear;
    double GPA;
    String declaredMajor;
    public StudentProfile (String studentFirstName, String studentLastName,int expectedGraduationYear, double GPA, String declaredMajor){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }
    public int incrementGraduationYear () {
        expectedGraduationYear = expectedGraduationYear + 1;
        return expectedGraduationYear;
    }
}
