package VSTutorsLessons;
import java.util.Date;

public class StringMethods {
   
        public static void main(String[] args) {
            //Printing
            System.out.println("SAI");

            //Reference Types
            Date now = new Date(); //util one (methods avaliable)
            System.out.println(now.getTime());

            //Printing Variables vs Text
            System.out.println("now");
            System.out.println(now);

            //String (Reference types that doesn't use "new")
            String str = "Sai";
            System.out.println(str.endsWith("i"));
            System.out.println(str.startsWith("s"));
            System.out.println(str.length());
            System.out.println(str.indexOf("S")); //-1 if not there (explain indexing)
            System.out.println(str.replace("a", "o")); //Strings are immutable
            System.out.println(str); //Still "Sai"
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
            System.out.println(str);
            
            
      }
    
}