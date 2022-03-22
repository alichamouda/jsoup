/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:24:18 GMT 2022
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.HttpStatusException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpStatusException_ESTest extends HttpStatusException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException((String) null, 86400000, (String) null);
      String string0 = httpStatusException0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("", 11, "");
      String string0 = httpStatusException0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("", 0, "");
      int int0 = httpStatusException0.getStatusCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("DKv\"oFgO'", 15000, "DKv\"oFgO'");
      int int0 = httpStatusException0.getStatusCode();
      assertEquals(15000, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("mIZg^A,s(cz", Integer.MIN_VALUE, "mIZg^A,s(cz");
      int int0 = httpStatusException0.getStatusCode();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("mIZg^A,s(cz", Integer.MIN_VALUE, "mIZg^A,s(cz");
      String string0 = httpStatusException0.getUrl();
      assertEquals("mIZg^A,s(cz", string0);
  }
}