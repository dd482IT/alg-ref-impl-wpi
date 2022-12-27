package dev.thinke.domain.sort.alg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CursorTest {

    public void testFindLeft() {
        var cursor = new Cursor(5, new FromRight());
        Assertions.assertEquals(4, cursor.next());
    }
}
