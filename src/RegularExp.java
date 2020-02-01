import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args){
        String str = "I am a string. Yes, I am";
        System.out.println(str);
        String yourString = str.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiijk14xz";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.replaceAll("^bcDeee", "YYY"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiijk14xz"));

        System.out.println(alphanumeric.replaceAll("jk14xz$", "The End"));

        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced the letter"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        System.out.println("Harry".replaceAll("[Hh]arry", "harry"));

        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(alphanumeric.replaceAll("[A-Fa-f3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace ="I have blanks and\ta tab, and also a newLine\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", "X"));

        System.out.println(alphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(alphanumeric.replaceAll("h+i*j", "YYY"));

        StringBuilder htmlTxt = new StringBuilder("<h1>My Heading</h1>");
        htmlTxt.append("<h2>Sub-heading</h2>");
        htmlTxt.append("<p>This is a paragraph about something.</p>");
        htmlTxt.append("<p>This is another paragraph about something else.</p>");
        htmlTxt.append("<h2>Summary</h2>");
        htmlTxt.append("<p>Here is the summary.</p>");
        System.out.println(htmlTxt);
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlTxt);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlTxt);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        while(groupMatcher.find()){
            System.out.println("Occurence : " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.*?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlTxt);
        while (h2TextMatcher.find()){
            System.out.println("Occurences : " + h2TextMatcher.group(2));
        }
    }
}
