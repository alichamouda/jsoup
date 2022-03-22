/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 19:23:28 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParseSettings_ESTest extends ParseSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Attributes attributes0 = new Attributes();
      parseSettings0.normalizeAttributes(attributes0);
      assertTrue(parseSettings0.preserveAttributeCase());
      assertTrue(parseSettings0.preserveTagCase());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.htmlDefault.normalizeAttributes(attributes0);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Attributes attributes0 = parseSettings0.normalizeAttributes((Attributes) null);
      assertNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.preserveCase.normalizeAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.preserveCase.normalizeTag("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = ParseSettings.normalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      ParseSettings parseSettings1 = new ParseSettings(parseSettings0);
      assertTrue(parseSettings0.preserveAttributeCase());
      assertTrue(parseSettings0.preserveTagCase());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      boolean boolean0 = parseSettings0.preserveAttributeCase();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      boolean boolean0 = parseSettings0.preserveTagCase();
      assertFalse(boolean0);
  }
}
