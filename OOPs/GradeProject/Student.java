package OOPs.GradeProject;

public class Student {
    private String name;
    private int gradeLevel;
    private Grade grade;

    public Student(String name, int gradeLevel, Grade grade) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return " grade = " + grade + ", gradeLevel = " + gradeLevel + ", name = " + name;
    }  
}
