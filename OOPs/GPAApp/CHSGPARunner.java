import java.util.Scanner;

public class CHSGPARunner {
    public static void main(String[] args) {
      double[] grades = {100.0, 100.0, 100.0, 100.0, 100.0};
      int[] levels = {4,4,4,4,4};
      StudentRecords bulma = new StudentRecords(grades, "Bulma", levels);
      System.out.println(bulma.getUnweightedGPA());  
      System.out.println(bulma.getWeightedGPA());

      double[] grades2 = {100.0, 95.0, 100.0, 96.80, 99.0};
      int[] levels2 = {4,3,4,4,3};
      StudentRecords gohan = new StudentRecords(grades2, "Gohan", levels2);
      System.out.println(gohan.getUnweightedGPA());  
      System.out.println(gohan.getWeightedGPA());

      double[] grades3 = {97.0, 99.25, 100.0, 98.7, 100.0};
      int[] levels3 = {4,3,4,4,3};
      StudentRecords goten = new StudentRecords(grades3, "Goten", levels3);
      System.out.println(goten.getUnweightedGPA());  
      System.out.println(goten.getWeightedGPA());

      double[] grades4 = {90.0, 95.0, 70.0, 96.0, 80.0};
      int[] levels4 = {3,2,4,2,4};
      StudentRecords goku = new StudentRecords(grades4, "Goku", levels4);
      System.out.println(goku.getUnweightedGPA());  
      System.out.println(goku.getWeightedGPA());

      double[] grades5 = {95.0, 94.25, 93.0, 98.0, 100.0};
      int[] levels5 = {3,3,4,3,4};
      StudentRecords vegeta = new StudentRecords(grades5, "Vegeta", levels5);
      System.out.println(vegeta.getUnweightedGPA());  
      System.out.println(vegeta.getWeightedGPA());
    }

}
