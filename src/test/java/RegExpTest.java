import org.junit.Test;

import static org.junit.Assert.*;

public class RegExpTest {
    private RegExp regexp;
    @Test
    public void check() {
        assertEquals("Наречий: " + 0 + "\n"+"Прилагательных: " + 0
                + "\n"+ "Глаголов: " + 1, regexp.check("я ушла одна"));
        assertEquals("Наречий: " + 0 + "\n"+"Прилагательных: " + 3
              + "\n"+ "Глаголов: " + 0, regexp.check("он красивый человек, синий дом, белое платье"));
        assertEquals("Наречий: " + 1 + "\n"+"Прилагательных: " + 0
                + "\n"+ "Глаголов: " + 0, regexp.check("звонко"));
    }
}