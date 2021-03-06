/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:18:53 GMT 2022
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.Validate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Validate_ESTest extends Validate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.noNullElements((Object[]) null, "|<:~VU h2/&Vk'nUt$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.noNullElements((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Validate.noNullElements(objectArray0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Validate.noNullElements(objectArray0, (String) null);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notEmpty("", "XXs?uAt _:]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // XXs?uAt _:]
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Validate.notEmpty("UO", "");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notEmpty((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notEmpty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Validate.notEmpty("i");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notEmpty((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "UO";
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "UO";
      objectArray0[5] = (Object) "";
      objectArray0[6] = (Object) "UO";
      objectArray0[7] = (Object) "";
      Validate.noNullElements(objectArray0);
      assertEquals(8, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.isFalse(true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Validate.isFalse(false, "UO");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.isFalse(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Validate.isFalse(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.isTrue(false, "YKgt^bY2i*a3*5\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YKgt^bY2i*a3*5\"
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Validate.isTrue(true, "");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.isTrue(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Validate.isTrue(true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notNull((Object) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "";
      Validate.notNull(objectArray0[0], "Zo.yUsW&qK");
      assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.notNull((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Validate.notNull((Object) "");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        Validate.noNullElements(objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array must not contain any null objects
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.fail("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Validate.wtf("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
