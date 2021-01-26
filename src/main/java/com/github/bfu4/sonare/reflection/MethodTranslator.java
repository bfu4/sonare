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

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * MethodTranslator - Utility class for turning method objects into human readable strings
 *
 * @since 25/01/2021 @ 20.18
 * @author bfu4
 */
public final class MethodTranslator {

    public static HumanReadableMethod getHumanReadableMethod(Method method) {
        return new HumanReadableMethod(method);
    }

    public static Class<?> getReturnType(Method method) {
        return method.getReturnType();
    }

    public static String getHumanClassName(String className) {
        String[] s = className.split(".");
        return s[s.length - 1];
    }

    public static String[] getSerializedHumanParameters(Parameter[] parameters) {
        String[] arr = new String[parameters.length];
        for (int i = 0; i < parameters.length; i ++) {
            arr[i] = "{\"" + getHumanClassName(parameters[i].getClass().getName()) + "\""
                    + ": \"" + parameters[i].getName() + "\"}";
        }
        return arr;
    }

}
