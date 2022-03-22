/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 19:16:35 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(1);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        tokeniser0.error("OVM]+;UP,Ou{bSJS^yc", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseError", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(750);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      // Undeclared exception!
      try { 
        tokeniser0.error("~%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.ParseError", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.error("");
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&amp\"");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(98);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(5, characterReader0.pos());
      assertEquals("&\"", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" a<~");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 9);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(9);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.BeforeDoctypeSystemIdentifier;
      tokeniser0.eofError(tokeniserState0);
      assertFalse(parseErrorList0.isEmpty());
      assertEquals(1, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(65533);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataDoubleEscapeEnd;
      // Undeclared exception!
      try { 
        tokeniser0.error(tokeniserState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("String must not be )mpty");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.appropriateEndTagSeq();
      String string0 = tokeniser0.appropriateEndTagSeq();
      assertNotNull(string0);
      assertEquals("</null", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#0VP5");
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.nameAttr("#0VP5", attributes0);
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.tagPending = (Token.Tag) token_StartTag0;
      tokeniser0.emit(token_StartTag0);
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#0VP5");
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.nameAttr("#0VP5", attributes0);
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.tagPending = (Token.Tag) token_StartTag0;
      tokeniser0.emit(token_StartTag0);
      token_StartTag0.appendTagName("#0VP5");
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&amp;");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
      assertNotNull(token_Tag0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      Character character0 = Character.valueOf('D');
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, true);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&amp;");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(5, characterReader0.pos());
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(" &mp");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(4, characterReader0.pos());
      assertEquals(" &mp", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&ap;");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
      assertEquals(4, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#915,");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      int[] intArray0 = tokeniser0.consumeCharacterReference((Character) null, false);
      assertEquals(4, characterReader0.pos());
      assertArrayEquals(new int[] {915}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("missing semi6olo on [&#%s]");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      // Undeclared exception!
      try { 
        tokeniser0.unescapeEntities(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("#x1(");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.consumeCharacterReference((Character) null, true);
      assertEquals(3, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("!U<O&x6G|`_&<kW]5?U");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(false);
      assertEquals(19, characterReader0.pos());
      assertEquals("!U<O&x6G|`_&<kW]5?U", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(":]Y{QH&:4q/3-H");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = new Character(':');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, false);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(":]Y{QH&:64q/3-DH");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emit('4');
      char[] charArray0 = new char[2];
      tokeniser0.emit(charArray0);
      Token.Doctype token_Doctype0 = tokeniser0.doctypePending;
      StringBuilder stringBuilder0 = token_Doctype0.publicIdentifier;
      tokeniser0.emit(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      StringBuilder stringBuilder0 = tokeniser0.dataBuffer;
      tokeniser0.emit(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&amp;");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 28);
      ParseErrorList parseErrorList0 = new ParseErrorList(28, 28);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.Doctype token_Doctype0 = new Token.Doctype();
      StringBuilder stringBuilder0 = token_Doctype0.systemIdentifier;
      char[] charArray0 = new char[1];
      tokeniser0.emit(charArray0);
      tokeniser0.emit(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("-/&lBt57Y-N,?'ij");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.newAttribute();
      tokeniser0.emit(token_EndTag0);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(":]Y{QH&:64q/3-H");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.EndTag token_EndTag0 = tokeniser0.endPending;
      tokeniser0.emit(token_EndTag0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token token0 = tokeniser0.read();
      assertEquals("", token0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("dR8)fd6SY");
      ParseErrorList parseErrorList0 = new ParseErrorList(29, 29);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.getState();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("B<^pOo");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createDoctypePending();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.emitCommentPending();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
      assertEquals(34, characterReader0.pos());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("`0C,@q<c/<V");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
      assertEquals(10, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      CharacterReader characterReader0 = new CharacterReader("&m;");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("p3^Mj*Hq`c)}v.m");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createBogusCommentPending();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.createCommentPending();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.emitDoctypePending();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      String string0 = tokeniser0.appropriateEndTagName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.createTempBuffer();
  }
}
