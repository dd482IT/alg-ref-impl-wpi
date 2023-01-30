package dev.thinke.domain.util;

import java.util.List;

public class Printer {

  public static void say(final Object object) {
    System.out.println(object);
  }

  public static void say(final List<?> items) {
    items.forEach(System.out::println);
  }
}
