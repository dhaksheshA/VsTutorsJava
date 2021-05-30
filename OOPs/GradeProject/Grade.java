package OOPs.GradeProject;

public class Grade {
    private String subject;
    private double score;
    private boolean pass;

    public Grade(String student_subject, double student_score, boolean student_pass) {
        this.subject = student_subject;
        this.score = student_score;
        this.pass = student_pass;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }

    public boolean getPass() {
        return pass;

    }

    @Override
    public String toString() {
        return "pass = " + pass + ", score = " + score + ", subject = " + subject;
    }
}
