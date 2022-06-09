import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {

    public static List<Monomial> parsePolynomial(String s){

        Pattern pattern = Pattern.compile("([+-]?(?:(?:\\d+x\\^\\d+)|(?:\\d+x)|(?:\\d+)|(?:x)))");
        Matcher matcher = pattern.matcher(s);
        List<Monomial> monomialList = new ArrayList<Monomial>();
        while (matcher.find()) {
            int coef=0,expon=0;
            coef = Integer.parseInt(matcher.group(1));
            if(matcher.find()) {
                if(matcher.find()) {
                    expon = Integer.parseInt(matcher.group(1));
                }
            }
            monomialList.add(new Monomial(coef,expon));
        }

        return monomialList;
    }

}
