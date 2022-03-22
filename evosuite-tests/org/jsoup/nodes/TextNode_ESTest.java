/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 19:00:03 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      char[] charArray0 = new char[9];
      charArray0[8] = ' ';
      stringBuilder0.append(charArray0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.append("nap");
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = new TextNode("^#");
      TextNode textNode1 = (TextNode)textNode0.wrap("^#");
      TextNode textNode2 = textNode1.clone();
      String string0 = textNode2.toString();
      assertEquals("#text", textNode2.nodeName());
      assertEquals("\n^#", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = new TextNode("}[t&oqDlao|d|o)B");
      textNode0.wrap("}[t&oqDlao|d|o)B");
      StringBuilder stringBuilder0 = new StringBuilder("");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      document_OutputSettings0.outline(true);
      textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
      assertEquals("", stringBuilder0.toString());
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = new TextNode("}[t&oqDlao|d|o)B");
      textNode0.wrap("}[t&oqDlao|d|o)B");
      TextNode textNode1 = textNode0.splitText(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      // Undeclared exception!
      try { 
        textNode1.outerHtmlHead((Appendable) null, 0, document_OutputSettings1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = new TextNode("}[t&oqDlao|d|o)B");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead((Appendable) null, 0, document_OutputSettings1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = new TextNode("}[t&oqDlao|d|o)B");
      textNode0.wrap("}[t&oqDlao|d|o)B");
      StringBuilder stringBuilder0 = new StringBuilder("");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("]H/N");
      textNode0.wrap("\"X s`#");
      textNode0.text("\n");
      String string0 = textNode0.toString();
      assertEquals("#text", textNode0.nodeName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("}[t&oqDlao|d|o)B");
      TextNode textNode1 = (TextNode)textNode0.wrap("}[t&oqDlao|d|o)B");
      TextNode textNode2 = textNode1.text("\n}[t&amp;oqDlao|d|o)B");
      String string0 = textNode2.toString();
      assertEquals("#text", textNode2.nodeName());
      assertEquals("\n }[t&amp;amp;oqDlao|d|o)B", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("/8[tOv^");
      textNode0.wrap("/8[tOv^");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead((Appendable) null, (-1938), document_OutputSettings1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      // Undeclared exception!
      try { 
        textNode0.splitText(732);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextNode textNode0 = new TextNode("}[t&oqDlao|d|o)B");
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals("#text", textNode1.nodeName());
      assertNotSame(textNode1, textNode0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("Split offset must be not be negative");
      // Undeclared exception!
      try { 
        textNode0.splitText((-1470));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("Split offset must be not be negative");
      textNode0.outerHtmlTail((Appendable) null, 2037, (Document.OutputSettings) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("Split offset must be not be negative");
      assertEquals("Split offset must be not be negative", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = TextNode.normaliseWhitespace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextNode textNode0 = new TextNode("Split offset must be not be negative");
      String string0 = textNode0.text();
      assertEquals("Split offset must be not be negative", string0);
      assertEquals("#text", textNode0.nodeName());
  }
}
