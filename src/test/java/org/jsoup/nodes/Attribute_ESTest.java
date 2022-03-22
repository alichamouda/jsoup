/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:14:26 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute attribute0 = new Attribute(":;S8o", "formnovalidate");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      attribute0.setKey("formnovalidate");
      boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-Q;q}W");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = new Attribute("inert", "");
      String string0 = attribute0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute attribute0 = new Attribute("-LBg^*M&8X=lRaaCkd3", (String) null);
      Attribute attribute1 = attribute0.clone();
      assertFalse(attribute1.hasDeclaredValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded(";1S<n|SHn!E4~E%8Vu", ";1S<n|SHn!E4~E%8Vu");
      // Undeclared exception!
      try { 
        attribute0.shouldCollapseAttribute((Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Attribute.shouldCollapseAttribute((String) null, (String) null, (Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-ifNdp", "+8J7NJG7'cCm}R~aS,&");
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put(attribute0);
      Attributes attributes2 = attributes1.put(".GOkRPyTimxN):", true);
      attributes2.keys = null;
      // Undeclared exception!
      try { 
        attribute0.setValue("data-ifNdp");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attribute attribute0 = new Attribute("?j.Jw)t\"|z?[t_c", "");
      // Undeclared exception!
      try { 
        attribute0.setKey("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.add("data-:z#iu+h<Q+Jle;", "data-:ziuhQJle");
      Attribute attribute0 = new Attribute("g5*3Hjf", "g5*3Hjf", attributes1);
      String[] stringArray0 = new String[0];
      attributes1.keys = stringArray0;
      // Undeclared exception!
      try { 
        attribute0.setKey("data-OmV&2)0Ko");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jsoup.nodes.Attributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Attribute.isDataAttribute((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "K<w)c");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Attribute.htmlNoValidate("K<w)c", "M&PqZumlxBM", charBuffer0, document_OutputSettings0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Attribute.htmlNoValidate((String) null, "", charBuffer0, document_OutputSettings0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Attribute.htmlNoValidate("KPb", "", (Appendable) null, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      try { 
        Attribute.htmlNoValidate("", (String) null, pipedWriter0, document_OutputSettings0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      // Undeclared exception!
      try { 
        Attribute.html("data-Q;q}W", "d&'R8b*'JEp&f", (Appendable) charBuffer0, document_OutputSettings1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("m'',NLzZ", "m'',NLzZ");
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      // Undeclared exception!
      try { 
        attribute0.html((Appendable) charBuffer0, document_OutputSettings1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attribute attribute0 = new Attribute("S{9spDq|!&O_>~", "S{9spDq|!&O_>~");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0, true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      document_OutputSettings1.charset((Charset) null);
      // Undeclared exception!
      try { 
        attribute0.html((Appendable) mockPrintWriter0, document_OutputSettings1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Document$OutputSettings", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      // Undeclared exception!
      try { 
        Attribute.getValidKey((String) null, document_OutputSettings_Syntax0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Attribute.createFromEncoded("71:77", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Attribute.createFromEncoded("", "pZ4Z|c}AHx\"kL$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = null;
      try {
        attribute0 = new Attribute("", "", attributes0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute attribute0 = null;
      try {
        attribute0 = new Attribute("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Attribute.isBooleanAttribute(":e/[U`a&^g:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Attribute.isBooleanAttribute("formnovalidate");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      String string0 = Attribute.getValidKey("L`=6rzn0jU9j'F", document_OutputSettings_Syntax0);
      assertNotNull(string0);
      assertEquals("L6rzn0jU9jF", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      String string0 = Attribute.getValidKey("defer", document_OutputSettings_Syntax0);
      assertEquals("defer", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      String string0 = Attribute.getValidKey("YTVq5w~1E:sG{", document_OutputSettings_Syntax0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      // Undeclared exception!
      try { 
        Attribute.html("UTF-32", "multiple", (Appendable) null, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "{} acceptor={}");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Attribute.html("", "", (Appendable) charBuffer0, document_OutputSettings0);
      assertEquals("{} acceptor={}", charBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("g*", (String) null, attributes0);
      attribute0.hashCode();
      assertEquals("", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Attribute attribute0 = new Attribute(":;S8o", "formnovalidate");
      attribute0.hashCode();
      assertEquals("formnovalidate", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-Q;q}W", "data-Q;q}W");
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Attribute attribute0 = new Attribute("S{9spDq|!&O_>~", "S{9spDq|!&O_>~");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      boolean boolean0 = attribute0.equals(charArrayWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("fYA49wQC^~<BIR#R", "PC&wV)#sD]?");
      boolean boolean0 = attribute0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("PC&wV)#sD]?", attribute0.getValue());
      assertEquals("fYA49wQC^~<BIR#R", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-Q;q}W", "data-Q;q}W");
      boolean boolean0 = attribute0.equals(attribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute(":;S8o", "formnovalidate");
      Attribute attribute1 = new Attribute("formnovalidate", "8d1;<Bp8cB V m\"~", attributes0);
      boolean boolean0 = attribute1.equals(attribute0);
      assertFalse(boolean0);
      assertEquals("8d1;<Bp8cB V m\"~", attribute1.getValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = Attribute.shouldCollapseAttribute("formnovalidate", "formnovalidate", document_OutputSettings0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("org.eclipse.jetty.util.thread.QueuedThreadPool", "org.eclipse.jetty.util.thread.QueuedThreadPool", attributes0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = Attribute.shouldCollapseAttribute("`h]X.", "", document_OutputSettings0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Attribute attribute0 = new Attribute("tMl ", (String) null);
      boolean boolean0 = attribute0.isDataAttribute();
      assertFalse(boolean0);
      assertFalse(attribute0.hasDeclaredValue());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Attribute attribute0 = new Attribute("", "ri!Gi]Vm", (Attributes) null);
      String string0 = attribute0.html();
      assertEquals("=\"ri!Gi]Vm\"", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      String string0 = Attribute.getValidKey("", document_OutputSettings_Syntax0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("eD", "[:05@`&*:^^0");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(78);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      attribute0.html((Appendable) charArrayWriter0, document_OutputSettings1);
      assertEquals("eD=\"[:05@`&amp;*:^^0\"", charArrayWriter0.toString());
      assertEquals(21, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      MockFileWriter mockFileWriter0 = new MockFileWriter("OmV&2)0Ko");
      Attribute.htmlNoValidate("y", (String) null, mockFileWriter0, document_OutputSettings0);
      assertEquals(30, document_OutputSettings0.maxPaddingWidth());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.add("M&PqZumlxBM", "M&PqZumlxBM");
      Attribute attribute0 = new Attribute("M&PqZumlxBM", "M&PqZumlxBM", attributes1);
      String string0 = attribute0.setValue("M&PqZumlxBM");
      assertEquals("M&PqZumlxBM", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("M&PqZumlxBM", "M&PqZumlxBM", attributes0);
      String string0 = attribute0.setValue("M&PqZumlxBM");
      assertEquals("M&PqZumlxBM", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Attribute attribute0 = new Attribute("tMl ", (String) null);
      attribute0.setValue("");
      assertEquals("", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Attribute attribute0 = new Attribute(":;S8o", "formnovalidate");
      boolean boolean0 = attribute0.hasDeclaredValue();
      assertEquals(":;S8o", attribute0.getKey());
      assertTrue(boolean0);
      assertEquals("formnovalidate", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Attribute attribute0 = new Attribute("tMl ", (String) null);
      boolean boolean0 = attribute0.hasDeclaredValue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("data-\u0003`Lq0}?:3@{\",)%", "data-\u0003`Lq0}?:3@{\",)%", attributes0);
      attribute0.setKey("data-\u0003`Lq0}?:3@{\",)%");
      assertEquals("data-\u0003`Lq0}?:3@{\",)%", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute(":;S8o", "formnovalidate");
      attributes0.put(attribute0);
      assertEquals(":;S8o", attribute0.getKey());
      
      attribute0.setKey("formnovalidate");
      assertEquals("formnovalidate", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Attribute attribute0 = new Attribute("rvw", "eStb18\"smZo1");
      String string0 = attribute0.toString();
      assertEquals("rvw", attribute0.getKey());
      assertEquals("eStb18\"smZo1", attribute0.getValue());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-Q;q}W", "data-Q;q}W");
      String string0 = attribute0.getValue();
      assertEquals("data-Q;q}W", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-Q;q}W", "data-Q;q}W");
      boolean boolean0 = attribute0.isDataAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-ifNdp", "+8J7NJG7'cCm}R~aS,&");
      String string0 = attribute0.getKey();
      assertEquals("data-ifNdp", string0);
      assertEquals("+8J7NJG7'cCm}R~aS,&", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("data-ifNdp", "+8J7NJG7'cCm}R~aS,&");
      attribute0.html();
  }
}
