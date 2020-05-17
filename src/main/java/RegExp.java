import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExp {
    static int nar = 0;
    static int glag = 0;
    static int pril = 0;
    static Pattern p;
    static Matcher m;

    static int check(String s){
        p = Pattern.compile("[а-яА-Я]+о[^а-яА-Я]");
        m = p.matcher(s);
        while (m.find()) {
            nar++;
        }
        System.out.println("Наречий: " + nar);

        p = Pattern.compile("[а-яА-Я]+(ый|ая|ое|ые|ий)");
        m = p.matcher(s);
        while (m.find()) {
            pril++;
        }
        System.out.println("Прилагательные: " + pril);

        p = Pattern.compile("[а-яА-Я]+(ть|ла|ли|ал|аю)");
        m = p.matcher(s);
        while (m.find()) {
            glag++;
        }
        System.out.println("Глаголов: " + glag);
        return 5;
    }
}