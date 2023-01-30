package dev.thinke.domain.data.type;

public record DictionaryItem<K extends Comparable<K>, V>(K key, V value) {}
