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

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * HumanReadableMethod - A method parsed into human readable strings.
 *
 * @since 25/01/2021 @ 20.18
 * @author bfu4
 */
public class HumanReadableMethod implements Serializable {

    private final String className;
    private final String methodName;
    private final String[] parameters;
    private final String returnTypeClassName;

    /**
     * Create a new HumanReadableMethod parsed for human readability.
     *
     * @param method method object to make readable.
     */
    public HumanReadableMethod(Method method) {
        this.className = MethodTranslator.getHumanClassName(method.getDeclaringClass().getName());
        this.methodName = method.getName();
        this.parameters = MethodTranslator.getSerializedHumanParameters(method.getParameters());
        this.returnTypeClassName = MethodTranslator.getHumanClassName(method.getReturnType().getName());
    }

    /**
     * Get the name of the method's parent class.
     *
     * @return class name
     */
    public String getClassName() { return this.className; }

    /**
     * Get the name of the method
     *
     * @return method name
     */
    public String getMethodName() { return this.methodName; }

    /**
     * Get the human readable parameters
     *
     * @return parameters
     */
    public String[] getParameters() { return this.parameters; }

    /**
     * Get a human readable version of the return type class name
     *
     * @return return type's class name
     */
    public String getReturnTypeClassName() { return this.returnTypeClassName; }

    /**
     * Serialize into human-readable semi-valid json-type format.
     *
     * @return "serialized" version of this class's attributes.
     */
    protected String serialize() {
        return "{\"ClassName\":\"" + className + "\", \"MethodName\":\"" + methodName
                + "\", \"Parameters\":" + Arrays.toString(parameters)
                + ", \"ReturnType\":\"" + returnTypeClassName + "\"}";
    }

    @Override
    public String toString() {
        return serialize();
    }

}
