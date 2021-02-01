/**
 * MIT License
 * <p>
 * Copyright (c) 2021 bfu4
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.bfu4.sonare.reflection;

import com.google.common.reflect.ClassPath;
import org.bukkit.plugin.Plugin;

import java.io.IOException;

/**
 * ClasspathBuilder - Build a classpath.
 *
 * @since 28/01/2021 @ 21.25
 * @author bfu4
 */
public class ClasspathBuilder {

   public static String getClasspathOf(Object o) {
      StringBuilder builder = new StringBuilder(o.getClass().getName().split(o.getClass().getSimpleName())[0]);
      return builder.deleteCharAt(builder.length()).toString();
   }

   @SuppressWarnings("all")
   public static ClassPath from(Plugin plugin) {
      try {
         return ClassPath.from(plugin.getClass().getClassLoader()) ;
      } catch (IOException e) {
         return null;
      }
   }

}
