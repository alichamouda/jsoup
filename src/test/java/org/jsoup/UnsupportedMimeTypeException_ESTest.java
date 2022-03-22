/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:25:25 GMT 2022
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnsupportedMimeTypeException_ESTest extends UnsupportedMimeTypeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("Exclude Predicate", (String) null, (String) null);
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("I_%|3", "I_%|3", "");
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("Exclude Predicate", (String) null, (String) null);
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("", "", "W2$+lP]pXiC;n7");
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("o", "o", "o");
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("o", "o", "o");
      String string0 = unsupportedMimeTypeException0.toString();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: o. Mimetype=o, URL=o", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("o", "o", "o");
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertEquals("o", string0);
  }
}