import org.junit.Test;

import static org.junit.Assert.*;

public class RegExpTest {
    private RegExp regexp;
    @Test
    public void check() {
        assertEquals(5, regexp.check("hgf"));
        assertEquals(4, regexp.check("gfds"));
        assertEquals(5, regexp.check("g33333s"));
    }
}