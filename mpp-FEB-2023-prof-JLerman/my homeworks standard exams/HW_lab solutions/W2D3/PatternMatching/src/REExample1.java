import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REExample1 {

//    Write a regular expression for a license plate number
//    whose format is two letters followed by four digits followed by three letters

    // AZ1234OPI
    // UT1234IUS
    // IW4567ABS

    //[a-zA-Z][a-zA-Z]\\d{3}[a-zA-Z]{3}

    public static void main(String[] args) {

        //2)  Write a regular expression for a license plate number whose format is two letters
        // followed by four digits followed by three letters
        Pattern p = Pattern.compile("\\w\\w\\d\\d");
        Matcher a = p.matcher("AB11");
        Matcher b = p.matcher("XXXX");
        System.out.println(a.matches());
        System.out.println(b.matches());

//        3) Replace every occurrence of  8  with  ‘eight’.
        String str8 = "8 Cats were sitting near the House-8 on the 8 Avenue looking for 8 Mouses";
        System.out.println(str8);
        str8 = str8.replaceAll("8", "eight");
        System.out.println(str8);

//       4)  Create some exercises yourself which gives you practice with pattern matching and regular expressions.
//       E-mail me these exercises.
//        validate email address
//        validate date format
//        validate phone number

//        ansuman13@gmail.com
//        final String EMAIL_FORMAT;
//        EMAIL_FORMAT =
        Pattern pEmail = Pattern.compile("[^@ ]+@[^@ ]+\\.[^@ \\.]{2,}$");
        Matcher m = p.matcher(pEmail);



//        System.out.println(a.matches("AZ1234ABC"));
//        String test = "AZ1234ABC";
//        System.out.println(test.matches("[a-zA-Z][a-zA-Z]\\d{4}[a-zA-Z]{3}"));

//        1AU12CS002
//        1NT15CS012

//        String a = "1AU12CS003";
//        String b = "1UI12ME012";
//        String c = "2YT23EC001";
//
//        String d = "1AU12CV002";
//        String e = "1AU12CS02";
//
//        System.out.println(a.matches("\\d{1}[A-Z]{2}\\d{2}(CS|EC|EE|ME)\\d{3}"));
//        System.out.println(b.matches("\\d{1}[A-Z]{2}\\d{2}(CS|EC|EE|ME)\\d{3}"));
//        System.out.println(c.matches("\\d{1}[A-Z]{2}\\d{2}(CS|EC|EE|ME)\\d{3}"));
//        System.out.println(d.matches("\\d{1}[A-Z]{2}\\d{2}(CS|EC|EE|ME)\\d{3}"));
//        System.out.println(e.matches("\\d{1}[A-Z]{2}\\d{2}(CS|EC|EE|ME)\\d{3}"));


    }
}
