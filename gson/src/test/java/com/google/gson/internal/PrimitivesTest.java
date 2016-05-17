/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.internal;

import static com.google.gson.internal.Primitives.areEquivalentTypes;

import junit.framework.TestCase;

public class PrimitivesTest extends TestCase {

  public static void testAreEquivalentTypes() throws Exception {
    assertTrue(areEquivalentTypes(boolean.class, boolean.class)); // reflexive

    assertTrue(areEquivalentTypes(boolean.class, Boolean.class));
    assertTrue(areEquivalentTypes(Boolean.class, boolean.class));
    assertTrue(areEquivalentTypes(byte.class, Byte.class));
    assertTrue(areEquivalentTypes(Byte.class, byte.class));
    assertTrue(areEquivalentTypes(char.class, Character.class));
    assertTrue(areEquivalentTypes(Character.class, char.class));
    assertTrue(areEquivalentTypes(double.class, Double.class));
    assertTrue(areEquivalentTypes(Double.class, double.class));
    assertTrue(areEquivalentTypes(float.class, Float.class));
    assertTrue(areEquivalentTypes(Float.class, float.class));
    assertTrue(areEquivalentTypes(int.class, Integer.class));
    assertTrue(areEquivalentTypes(Integer.class, int.class));
    assertTrue(areEquivalentTypes(long.class, Long.class));
    assertTrue(areEquivalentTypes(Long.class, long.class));
    assertTrue(areEquivalentTypes(short.class, Short.class));
    assertTrue(areEquivalentTypes(Short.class, short.class));

    assertFalse(areEquivalentTypes(long.class, Short.class));
    assertFalse(areEquivalentTypes(double.class, float.class));
    assertFalse(areEquivalentTypes(PrimitivesTest.class, long.class));
  }
}
