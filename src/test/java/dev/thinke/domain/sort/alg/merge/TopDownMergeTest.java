package dev.thinke.domain.sort.alg.merge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TopDownMergeTest {

    public void testMerge() {
        var list = Arrays.asList("f", "z", "a", "d", "n", "m", "l", "o", "s");
        var test = new ArrayList<>(list);
        test.sort(String::compareTo);
        var results = new TopDownMerge<String>().sort(list);
        Assertions.assertEquals(results, test);
    }
}
