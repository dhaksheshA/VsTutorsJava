package OOPs.GradeProject;

public class StudentRunner {
   public static void main(String[] args) {
       Grade dhaksheshGrade = new Grade("Java", 100.0, true);
       Student dhakshesh = new Student("dhakshesh", 10, dhaksheshGrade);
       String name = dhakshesh.getName();
       int gradeLevel = dhakshesh.getGradeLevel();
       Grade grade = dhakshesh.getGrade();
       System.out.println(dhakshesh);
       Grade lattikaGrade = new Grade("Pre Algebra", 100.0, true);
       Student lattika = new Student("lattika", 7, lattikaGrade);
       System.out.println("Name: " + lattika.getName());
       System.out.println("Grade Level: " + lattika.getGradeLevel());
       System.out.println("Grade on " + lattika.getGrade().getSubject() + ": " + lattika.toString());
   }
}
