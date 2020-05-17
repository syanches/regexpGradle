import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExp {
    static Pattern p;
    static Matcher m;

    static String check(String s){
        int nar = 0;
        int glag = 0;
        int pril = 0;
        p = Pattern.compile("[а-яА-Я]+о([^а-яА-Я]|$)");
        m = p.matcher(s);
        while (m.find()) {
            nar++;
        }
        System.out.println("Наречий: " + nar);

        p = Pattern.compile("[а-яА-Я]+(ый|ая|ое|ые|ий)[^а-яА-Я]");
        m = p.matcher(s);
        while (m.find()) {
            pril++;
        }
        System.out.println("Прилагательные: " + pril);

        p = Pattern.compile("[а-яА-Я]+(ть|ла|ли|ал|аю)[^а-яА-Я]");
        m = p.matcher(s);
        while (m.find()) {
            glag++;
        }
        System.out.println("Глаголов: " + glag);
        return "Наречий: " + nar + "\n"+"Прилагательных: " + pril
                 + "\n"+ "Глаголов: " + glag;
    }

}