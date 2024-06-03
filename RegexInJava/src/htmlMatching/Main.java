package htmlMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String text = "some.text.here only but not Some other " +
//                "there some.name.separated.by.dots and.we are done!";
//        String text = "some.text.here only but not Some other";
        String text = "<p><a href=\"google.com\">some.<h1>text</h1>.here</a></p>";

//        Pattern p = Pattern.compile("\\w+(?:\\.\\w+)+");
//        Pattern p = Pattern.compile("(\\w)\\.(\\w)");
//        Pattern p = Pattern.compile("(<p>).(</p>)");
        Pattern p = Pattern.compile("<([a-z0-9]+)");
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.println(m.group().replace("<", ""));
        }
    }
}
