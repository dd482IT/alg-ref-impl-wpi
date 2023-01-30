package dev.thinke.domain.data.table;

import dev.thinke.domain.data.type.Dictionary;
import org.apache.commons.math3.primes.Primes;

public class StringHashTable<K extends Comparable<K>> implements Dictionary<K, String> {

  private final String[] values;
  private final Integer n;

  public StringHashTable(int capacity) {
    this.n = Primes.nextPrime(capacity * 2);
    this.values = new String[this.n];
  }

  @Override
  public String search(K key) {
    int i = deriveKey(key);
    return values[i];
  }

  @Override
  public void insert(K key, String value) {
    int i = deriveKey(key);
    values[i] = value;
  }

  @Override
  public void delete(K key) {
    int i = deriveKey(key);
    values[i] = null;
  }

  @Override
  public Integer size() {
    return n;
  }
}
