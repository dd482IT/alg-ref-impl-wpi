package dev.thinke.domain.sort.alg.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MinHeapTest {

    public void minHeapElementRetrievalTest() {
        List<String> items = Arrays.asList("a", "o", "t", "f", "z", "m", "l", "s", "e", "r");
        new MinHeap<>(items).sort(items);
        List<String> result = Arrays.asList("a", "e", "f", "l", "m", "o", "r", "s", "t", "z");
        Assertions.assertEquals(result, items);
    }
}
