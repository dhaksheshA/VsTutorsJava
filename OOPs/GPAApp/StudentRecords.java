import java.util.Scanner;

public class StudentRecords {
    private double[] grades;
    private String student_name;
    private int[] level;

    public StudentRecords(double[] grades, String student_name, int[] level) {
        this.grades = grades;
        this.student_name = student_name;
        this.level = level;
    }

    public double getUnweightedGPA() {
        // go through the grades
        //98.0, 90.25, 89.6, 94.0, 100.0
        double gpaScore = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                gpaScore += 4;
            } else if (grades[i] >= 80 && grades[i] < 90) {
                gpaScore += 3;
            } else if (grades[i] >= 70 && grades[i] < 80) {
                gpaScore += 2;
            } else {
                gpaScore += 0;
            }
        }
        double unweightedGPA = gpaScore / grades.length;
        return unweightedGPA;
    }

    public int getClassRank() {
        return 0;
    }

    public double getWeightedGPA() {
        double gpa = 0;
        for (int i = 0; i < grades.length; i++) {
            if (level[i] == 4 && grades[i] >= 97) {
                gpa += 6.0;
            } else if (level[i] == 4 && grades[i] >= 94 && grades[i] < 97) {
                gpa += 5.8;
            } else if (level[i] == 4 && grades[i] >= 90 && grades[i] < 94) {
                gpa += 5.6;
            } else if (level[i] == 4 && grades[i] >= 87 && grades[i] < 90) {
                gpa += 5.4;
            } else if (level[i] == 4 && grades[i] >= 84 && grades[i] < 87) {
                gpa += 5.2;
            } else if (level[i] == 4 && grades[i] >= 80 && grades[i] < 84) {
                gpa += 5.0;
            } else if (level[i] == 4 && grades[i] >= 77 && grades[i] < 80) {
                gpa += 4.8;
            } else if (level[i] == 4 && grades[i] >= 74 && grades[i] < 77) {
                gpa += 4.6;
            } else if (level[i] == 4 && grades[i] >= 71 && grades[i] < 74) {
                gpa += 4.4;
            } else if (level[i] == 4 && grades[i] == 70) {
                gpa += 4.2;
            } else if (level[i] == 3 && grades[i] >= 97) {
                gpa += 5.5;
            } else if (level[i] == 3 && grades[i] >= 94 && grades[i] < 97) {
                gpa += 5.3;
            } else if (level[i] == 3 && grades[i] >= 90 && grades[i] < 94) {
                gpa += 5.1;
            } else if (level[i] == 3 && grades[i] >= 87 && grades[i] < 90) {
                gpa += 4.9;
            } else if (level[i] == 3 && grades[i] >= 84 && grades[i] < 87) {
                gpa += 4.7;
            } else if (level[i] == 3 && grades[i] >= 80 && grades[i] < 84) {
                gpa += 4.5;
            } else if (level[i] == 3 && grades[i] >= 77 && grades[i] < 80) {
                gpa += 4.3;
            } else if (level[i] == 3 && grades[i] >= 74 && grades[i] < 77) {
                gpa += 4.1;
            } else if (level[i] == 3 && grades[i] >= 71 && grades[i] < 74) {
                gpa += 3.9;
            } else if (level[i] == 3 && grades[i] == 70) {
                gpa += 3.7;
            } else if (level[i] == 2 && grades[i] >= 97) {
                gpa += 5.0;
            } else if (level[i] == 2 && grades[i] >= 94 && grades[i] < 97) {
                gpa += 4.8;
            } else if (level[i] == 2 && grades[i] >= 90 && grades[i] < 94) {
                gpa += 4.6;
            } else if (level[i] == 2 && grades[i] >= 87 && grades[i] < 90) {
                gpa += 4.4;
            } else if (level[i] == 2 && grades[i] >= 84 && grades[i] < 87) {
                gpa += 4.2;
            } else if (level[i] == 2 && grades[i] >= 80 && grades[i] < 84) {
                gpa += 4.0;
            } else if (level[i] == 2 && grades[i] >= 77 && grades[i] < 80) {
                gpa += 3.8;
            } else if (level[i] == 2 && grades[i] >= 74 && grades[i] < 77) {
                gpa += 3.6;
            } else if (level[i] == 2 && grades[i] >= 71 && grades[i] < 74) {
                gpa += 3.4;
            } else if (level[i] == 2 && grades[i] == 70) {
                gpa += 3.2;
            } else if (level[i] == 1 && grades[i] >= 97) {
                gpa += 4.0;
            } else if (level[i] == 1 && grades[i] >= 94 && grades[i] < 97) {
                gpa += 3.8;
            } else if (level[i] == 1 && grades[i] >= 90 && grades[i] < 94) {
                gpa += 3.6;
            } else if (level[i] == 1 && grades[i] >= 87 && grades[i] < 90) {
                gpa += 3.4;
            } else if (level[i] == 1 && grades[i] >= 84 && grades[i] < 87) {
                gpa += 3.2;
            } else if (level[i] == 1 && grades[i] >= 80 && grades[i] < 84) {
                gpa += 3.0;
            } else if (level[i] == 1 && grades[i] >= 77 && grades[i] < 80) {
                gpa += 2.8;
            } else if (level[i] == 1 && grades[i] >= 74 && grades[i] < 77) {
                gpa += 2.6;
            } else if (level[i] == 1 && grades[i] >= 71 && grades[i] < 74) {
                gpa += 2.4;
            } else if (level[i] == 1 && grades[i] == 70) {
                gpa += 2.2;
            } else {
                gpa += 0;
            }
        }
        double weightedGPA = gpa / grades.length;
        return weightedGPA;
    }
}