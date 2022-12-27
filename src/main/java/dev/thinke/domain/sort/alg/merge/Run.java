package dev.thinke.domain.sort.alg.merge;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.List;

public record Run(Integer startIndex, Integer endIndex) {

    public Integer size() {
        return (this.endIndex - this.startIndex) + 1;
    }

    public <T> List<T> deriveRun(final List<T> items) {
        final var run = new ArrayList<T>(this.size());
        for (int i = this.startIndex; i <= this.endIndex; i++) {
            run.add(items.get(i));
        }
        return run;
    }
}
