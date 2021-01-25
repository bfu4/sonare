package com.github.bfu4.sonare.reflection;

/**
 * ClassLocator - Locate classes by name.
 *
 * @author bfu4
 * @since 25/01/2021 @ 13.17
 */
public interface ClassLocator {

   Class<?> findClass(String name);
   boolean validateClass(String className);

}
