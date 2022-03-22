/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:24:03 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.util.IllegalFormatConversionException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseError_ESTest extends ParseError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseError parseError0 = new ParseError(0, "");
      int int0 = parseError0.getPosition();
      assertEquals("0", parseError0.getCursorPos());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParseError parseError0 = new ParseError(32, "R$%Z8mTA842GXQJ");
      int int0 = parseError0.getPosition();
      assertEquals(32, int0);
      assertEquals("32", parseError0.getCursorPos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseError parseError0 = new ParseError((-476), (String) null);
      parseError0.getErrorMessage();
      assertEquals("-476", parseError0.getCursorPos());
      assertEquals((-476), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseError parseError0 = new ParseError(characterReader0, "", (Object[]) null);
      String string0 = parseError0.getErrorMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IU;cf<Ht#/lvIMwGQ:@");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Object[] objectArray0 = new Object[9];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(characterReader0, "l8%Vr0g", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'V'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("sWGk-?vD6");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) characterReader0;
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(characterReader0, "(bn%C5yhR(U+ad", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // c != org.jsoup.parser.CharacterReader
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError((CharacterReader) null, "", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseError", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError((CharacterReader) null, "0[4<>o4mwOBu3qEr =:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseError", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError((-1), "o; D%i1|::QSRA)~", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'i'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "QH=-*uA//C['y2%oR";
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(1, "QH=-*uA//C['y2%oR", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // o != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "dM _`", (Object[]) null);
      String string0 = parseError0.toString();
      assertEquals("<-1>: dM _`", string0);
      assertEquals((-1), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "dM _`", (Object[]) null);
      parseError0.getErrorMessage();
      assertEquals("-1", parseError0.getCursorPos());
      assertEquals((-1), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.UncheckedIOException");
      ParseError parseError0 = new ParseError(characterReader0, "org.jsoup.UncheckedIOException");
      String string0 = parseError0.getCursorPos();
      assertEquals("1:1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "dM _`", (Object[]) null);
      int int0 = parseError0.getPosition();
      assertEquals((-1), int0);
      assertEquals("-1", parseError0.getCursorPos());
  }
}