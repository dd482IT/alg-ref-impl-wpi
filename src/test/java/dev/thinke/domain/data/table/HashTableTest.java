package dev.thinke.domain.data.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    public void test_get_put() {
        var table = new StringHashTable<String>(16);
        table.insert("one", "one");
        table.insert("two", "two");
        table.insert("three", "three");
        table.insert("four", "four");
        table.insert("five", "five");

        Assertions.assertEquals("one", table.search("one"));
        Assertions.assertEquals("two", table.search("two"));
        Assertions.assertEquals("three", table.search("three"));
        Assertions.assertEquals("four", table.search("four"));
        Assertions.assertEquals("five", table.search("five"));
    }
}
