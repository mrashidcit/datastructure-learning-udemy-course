import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // 1st way
//        Pattern p = Pattern.compile(".s");
//        Matcher m = p.matcher("as");
//        boolean b = m.matches();
//
//        System.out.println("b = " + b);
//
//        // 2nd Way
//        boolean b2 = Pattern.matches(".s", "as");
//        System.out.println("b2 = " + b2);

//        System.out.println(Pattern.matches(".s", "as"));
//        System.out.println(Pattern.matches(".s", "mk"));
//        System.out.println(Pattern.matches(".s", "mst"));
//        System.out.println(Pattern.matches("..s", "tts"));

//        System.out.println(Pattern.matches("[amn]", "m"));
//        System.out.println(Pattern.matches("[amn]", "amn"));
//        System.out.println(Pattern.matches("[abc]", "ab"));

        // Quantifier
//        System.out.println(Pattern.matches("[amn]?", "m"));
//        System.out.println(Pattern.matches("[amn]?", "aa"));
//        System.out.println(Pattern.matches("[amn]?", "ammmna"));
//        System.out.println(Pattern.matches("[amn]+", "aammnna"));
//        System.out.println(Pattern.matches("[amn]+", "aazta"));
//        System.out.println(Pattern.matches("[amn]*", "ammmna"));
//        System.out.println(Pattern.matches("[amn]*", "aazta"));

        // Metacharacter
//        System.out.println(Pattern.matches("\\d", "abc"));
//        System.out.println(Pattern.matches("\\d", "1"));
//        System.out.println(Pattern.matches("\\d", "4443"));
//        System.out.println(Pattern.matches("\\d", "323abc"));
//        System.out.println(Pattern.matches("\\D", "abc"));
//        System.out.println(Pattern.matches("\\D", "1"));
//        System.out.println(Pattern.matches("\\D", "4443"));
//        System.out.println(Pattern.matches("\\D", "m"));
//        System.out.println(Pattern.matches("\\D*", "mak"));

        // Question 1
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abc23aa"));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2"));
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2U$2"));

        // Question 2
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9789873234"));
//        System.out.println(Pattern.matches("[789][0-9]{9}","7789873234"));
        // by meta characters
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8789873234"));

//        System.out.println(Pattern.matches("c(?!o)", "chocolate"));
        System.out.println(
                Pattern.compile("c(?!o)")
                        .matcher("chocolate")
                        .find()
        );

    }
}