package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.alg.selection.Selection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class ShellTest {

    public void selectionStringSort() {
        var sorter = new Selection<String>();
        var items = new String[]{"me", "testing", "my", "alg", "my"};
        Assertions.assertArrayEquals(
                new String[]{"alg", "me", "my", "my", "testing"},
                sorter.sort(Arrays.asList(items)).toArray());
    }
}
