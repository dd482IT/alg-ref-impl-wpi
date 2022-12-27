package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.alg.bubble.Bubble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleTest {

    public void selectionStringSort() {
        var sorter = new Bubble<Integer>();
        var items = new Integer[]{5, 2, 6, 87, 23, 56};
        Assertions.assertArrayEquals(
                new Integer[]{2, 5, 6, 23, 56, 87},
                sorter.sort(Arrays.asList(items)).toArray());
    }
}
