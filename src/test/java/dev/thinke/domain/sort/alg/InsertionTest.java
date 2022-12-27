package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.alg.insertion.Insertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InsertionTest {

    public void selectionStringSort() {
        var sorter = new Insertion<String>();
        var items = new String[]{"i", "am", "testing", "b", "b", "b", "b", "b", "glen", "pepper"};
        Assertions.assertArrayEquals(
                new String[]{"am", "b", "b", "b", "b", "b", "glen", "i", "pepper", "testing"},
                sorter.sort(Arrays.asList(items)).toArray());
    }
}
