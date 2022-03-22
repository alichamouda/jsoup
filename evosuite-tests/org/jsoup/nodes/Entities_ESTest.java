/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 18:55:51 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.prepareEncoder();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(true);
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      String string0 = Entities.escape("org.jsoup.nodes.Entities$EscapeMode", document_OutputSettings1);
      assertEquals("org.jsoup.nodes.Entities$EscapeMode", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("ascii");
      String string0 = Entities.escape("ascii", document_OutputSettings1);
      assertEquals("ascii", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Entities.escape("UTF-\"NE.822WE ");
      assertEquals("UTF-\"NE.822WE ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Entities.escape("Hw>hnfjzgx1&nMtuN");
      assertEquals("Hw&gt;hnfjzgx1&amp;nMtuN", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Entities.escape((Appendable) stringWriter0, " etFw&7&_<]%f", document_OutputSettings1, true, true, true);
      assertEquals("etFw&amp;7&amp;_&lt;]%f", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      MockFileWriter mockFileWriter0 = new MockFileWriter(" etFw&7&_<]2f");
      Entities.escape((Appendable) mockFileWriter0, " etFw&7&_<]2f", document_OutputSettings0, true, true, true);
      assertEquals(30, document_OutputSettings0.maxPaddingWidth());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Entities.escape("7<)u/X'tj4n'*");
      assertEquals("7&lt;)u/X'tj4n'*", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      String string0 = Entities.escape("\u00A0", document_OutputSettings1);
      assertEquals("&#xa0;", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Entities.escape("\n");
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      MockFileWriter mockFileWriter0 = new MockFileWriter(" etFw&7&_<|]2f");
      Entities.escape((Appendable) mockFileWriter0, " etFw&7&_<|]2f", document_OutputSettings0, true, true, true);
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(566);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) charArrayWriter0, " 9z                ", document_OutputSettings0, false, true, false);
      assertEquals(" 9z ", charArrayWriter0.toString());
      assertEquals(4, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      MockFileWriter mockFileWriter0 = new MockFileWriter("Zx \">SZ&ap`OJk+g88");
      Entities.escape((Appendable) mockFileWriter0, "Zx \">SZ&ap`OJk+g88", document_OutputSettings0, true, true, true);
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Entities.escape((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Entities.codepointsForName("Hw>hnfjzgx1&nMtuN", (int[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Entities.getByName("$VALUES");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Entities.getByName("div");
      assertEquals("\u00F7", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Entities.unescape("Zx \">SZ&ap`OJk+g88");
      assertEquals("Zx \">SZ&ap`OJk+g88", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Entities.unescape("UTF-\"NE&822WE ");
      assertEquals("UTF-\"NE&822WE ", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(254);
      assertEquals("thorn", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(38);
      assertEquals("amp", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(250);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Entities.escape("\u00A0");
      assertEquals("&nbsp;", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Entities.unescape("&nbsp;");
      assertEquals("\u00A0", string0);
  }
}
