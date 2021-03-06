/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:23:18 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseErrorList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseErrorList_ESTest extends ParseErrorList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(2019, (-3689));
      boolean boolean0 = parseErrorList0.canAddError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(4924, 4924);
      int int0 = parseErrorList0.getMaxSize();
      assertEquals(4924, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-1137));
      int int0 = parseErrorList0.getMaxSize();
      assertEquals((-1137), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseErrorList parseErrorList0 = null;
      try {
        parseErrorList0 = new ParseErrorList((ParseErrorList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseErrorList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(Integer.MAX_VALUE, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParseErrorList parseErrorList0 = null;
      try {
        parseErrorList0 = new ParseErrorList((-3668), 339);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -3668
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(50);
      boolean boolean0 = parseErrorList0.canAddError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      boolean boolean0 = parseErrorList0.canAddError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(50);
      ParseErrorList parseErrorList1 = (ParseErrorList)parseErrorList0.clone();
      assertTrue(parseErrorList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      int int0 = parseErrorList0.getMaxSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseErrorList parseErrorList1 = new ParseErrorList(parseErrorList0);
      assertEquals(0, parseErrorList1.size());
  }
}
