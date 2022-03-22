/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:20:10 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.ServiceLoader;
import java.util.TreeSet;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Selector_ESTest extends Selector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      assertNotNull(parser0);
      assertFalse(parser0.isTrackErrors());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      Document document0 = parser0.parseInput((Reader) stringReader0, "%Qda>`\"q\"");
      assertNotNull(document0);
      assertFalse(parser0.isTrackErrors());
      assertEquals("%Qda>`\"q\"", document0.location());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
      
      Element element0 = Selector.selectFirst("org.jsoup.select.Selector", document0);
      assertNull(element0);
      assertFalse(parser0.isTrackErrors());
      assertEquals("%Qda>`\"q\"", document0.location());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tag tag0 = Tag.valueOf("scanned ");
      assertNotNull(tag0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isEmpty());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isKnownTag());
      assertTrue(tag0.formatAsBlock());
      assertTrue(tag0.isInline());
      assertEquals("scanned", tag0.normalName());
      assertEquals("scanned", tag0.toString());
      assertFalse(tag0.isBlock());
      assertFalse(tag0.isSelfClosing());
      assertEquals("scanned", tag0.getName());
      
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertTrue(attributes0.isEmpty());
      assertEquals(0, attributes0.size());
      
      FormElement formElement0 = new FormElement(tag0, "scanned ", attributes0);
      assertNotNull(formElement0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isEmpty());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isKnownTag());
      assertTrue(tag0.formatAsBlock());
      assertTrue(tag0.isInline());
      assertEquals("scanned", tag0.normalName());
      assertEquals("scanned", tag0.toString());
      assertFalse(tag0.isBlock());
      assertFalse(tag0.isSelfClosing());
      assertEquals("scanned", tag0.getName());
      assertEquals(1, attributes0.size());
      assertFalse(attributes0.isEmpty());
      assertEquals(0, formElement0.childNodeSize());
      assertEquals("scanned", formElement0.nodeName());
      assertFalse(formElement0.hasParent());
      assertEquals("scanned", formElement0.normalName());
      assertEquals("scanned", formElement0.tagName());
      assertFalse(formElement0.isBlock());
      assertEquals(0, formElement0.siblingIndex());
      
      Element element0 = Selector.selectFirst("scanned ", formElement0);
      assertNotNull(element0);
      assertSame(formElement0, element0);
      assertSame(element0, formElement0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isEmpty());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isKnownTag());
      assertTrue(tag0.formatAsBlock());
      assertTrue(tag0.isInline());
      assertEquals("scanned", tag0.normalName());
      assertEquals("scanned", tag0.toString());
      assertFalse(tag0.isBlock());
      assertFalse(tag0.isSelfClosing());
      assertEquals("scanned", tag0.getName());
      assertEquals(1, attributes0.size());
      assertFalse(attributes0.isEmpty());
      assertEquals(0, formElement0.childNodeSize());
      assertEquals("scanned", formElement0.nodeName());
      assertFalse(formElement0.hasParent());
      assertEquals("scanned", formElement0.normalName());
      assertEquals("scanned", formElement0.tagName());
      assertFalse(formElement0.isBlock());
      assertEquals(0, formElement0.siblingIndex());
      assertEquals(0, element0.siblingIndex());
      assertEquals(0, element0.childNodeSize());
      assertFalse(element0.isBlock());
      assertFalse(element0.hasParent());
      assertEquals("scanned", element0.tagName());
      assertEquals("scanned", element0.nodeName());
      assertEquals("scanned", element0.normalName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Evaluator.AttributeWithValueNot evaluator_AttributeWithValueNot0 = new Evaluator.AttributeWithValueNot("7ue1h,%+La>8?5d", "7ue1h,%+La>8?5d");
      assertNotNull(evaluator_AttributeWithValueNot0);
      
      Document document0 = new Document("Q5&@XU3;uQ5KX");
      assertNotNull(document0);
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertEquals("Q5&@XU3;uQ5KX", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      
      Elements elements0 = Selector.select((Evaluator) evaluator_AttributeWithValueNot0, (Element) document0);
      assertNotNull(elements0);
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertEquals("Q5&@XU3;uQ5KX", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, elements0.size());
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Document.createShell("U<:xr*.`ig/");
      assertNotNull(document0);
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertEquals("U<:xr*.`ig/", document0.location());
      
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches((Pattern) null);
      assertNotNull(evaluator_Matches0);
      
      // Undeclared exception!
      try { 
        Selector.select((Evaluator) evaluator_Matches0, (Element) document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Evaluator$Matches", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Element element0 = new Element("org.jsoup.select.Selector");
      assertNotNull(element0);
      assertEquals("org.jsoup.select.Selector", element0.nodeName());
      assertEquals("org.jsoup.select.Selector", element0.tagName());
      assertEquals("org.jsoup.select.selector", element0.normalName());
      assertEquals(0, element0.childNodeSize());
      assertEquals(0, element0.siblingIndex());
      assertFalse(element0.isBlock());
      assertFalse(element0.hasParent());
      
      // Undeclared exception!
      try { 
        Selector.select((Evaluator) null, element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      doReturn((Attributes) null).when(attributes0).put(anyString() , anyString());
      Element element0 = new Element(tag0, "`md5i-)JJKJ;;6[H", attributes0);
      assertNotNull(element0);
      assertNull(element0.normalName());
      assertEquals(0, element0.childNodeSize());
      assertFalse(element0.hasParent());
      assertNull(element0.nodeName());
      assertFalse(element0.isBlock());
      assertNull(element0.tagName());
      assertEquals(0, element0.siblingIndex());
      
      // Undeclared exception!
      try { 
        Selector.select("`md5i-)JJKJ;;6[H", element0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '`md5i-)JJKJ;;6[H': unexpected token at '`md5i-)JJKJ;;6[H'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = mock(Attributes.class, new ViolatedAssumptionAnswer());
      doReturn((Attributes) null).when(attributes0).put(anyString() , anyString());
      Element element0 = new Element(tag0, "", attributes0);
      assertNotNull(element0);
      assertFalse(element0.hasParent());
      assertNull(element0.normalName());
      assertFalse(element0.isBlock());
      assertNull(element0.nodeName());
      assertEquals(0, element0.siblingIndex());
      assertNull(element0.tagName());
      assertEquals(0, element0.childNodeSize());
      
      // Undeclared exception!
      try { 
        Selector.select("", element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Element> class0 = Element.class;
      ServiceLoader<Element> serviceLoader0 = ServiceLoader.loadInstalled(class0);
      assertNotNull(serviceLoader0);
      assertEquals("java.util.ServiceLoader[org.jsoup.nodes.Element]", serviceLoader0.toString());
      
      // Undeclared exception!
      try { 
        Selector.select("se||4(Ty[bL,J", (Iterable<Element>) serviceLoader0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'se||4(Ty[bL,J': unexpected token at '(Ty[bL,J'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = new Document("");
      assertNotNull(document0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.normalName());
      
      Elements elements0 = document0.getElementsByAttributeValueMatching("%s@%x{%s,eio=%d/%d,di=%d,fill=%s,flush=%s}~>%s=>%s", "");
      assertNotNull(elements0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.normalName());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
      
      TreeSet<Element> treeSet0 = new TreeSet<Element>(elements0);
      assertNotNull(treeSet0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.normalName());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
      
      // Undeclared exception!
      try { 
        Selector.select("", (Iterable<Element>) treeSet0);
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
      // Undeclared exception!
      try { 
        Selector.filterOut((Collection<Element>) null, (Collection<Element>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Selector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Selector.SelectorParseException selector_SelectorParseException0 = new Selector.SelectorParseException("Connect Timeout", objectArray0);
      assertNotNull(selector_SelectorParseException0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      assertNotNull(document0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#root", document0.normalName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      assertNotNull(evaluator_IsOnlyChild0);
      assertEquals(":only-child", evaluator_IsOnlyChild0.toString());
      
      Elements elements0 = Selector.select((Evaluator) evaluator_IsOnlyChild0, (Element) document0);
      assertNotNull(elements0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#root", document0.normalName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertEquals(":only-child", evaluator_IsOnlyChild0.toString());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Document.createShell("WTF: No buffer left to unconsume.");
      assertNotNull(document0);
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.normalName());
      assertEquals("#root", document0.tagName());
      assertEquals("WTF: No buffer left to unconsume.", document0.location());
      assertFalse(document0.hasParent());
      
      Elements elements0 = document0.siblingElements();
      assertNotNull(elements0);
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.normalName());
      assertEquals("#root", document0.tagName());
      assertEquals("WTF: No buffer left to unconsume.", document0.location());
      assertFalse(document0.hasParent());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
      
      Elements elements1 = document0.getAllElements();
      assertNotNull(elements1);
      assertNotSame(elements1, elements0);
      assertFalse(elements1.equals((Object)elements0));
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.normalName());
      assertEquals("#root", document0.tagName());
      assertEquals("WTF: No buffer left to unconsume.", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(4, elements1.size());
      assertFalse(elements1.isEmpty());
      
      Elements elements2 = Selector.filterOut(elements1, elements0);
      assertNotNull(elements2);
      assertNotSame(elements0, elements1);
      assertNotSame(elements0, elements2);
      assertNotSame(elements1, elements0);
      assertNotSame(elements1, elements2);
      assertNotSame(elements2, elements0);
      assertNotSame(elements2, elements1);
      assertFalse(elements0.equals((Object)elements1));
      assertFalse(elements1.equals((Object)elements0));
      assertTrue(elements2.equals((Object)elements1));
      assertFalse(elements2.equals((Object)elements0));
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.normalName());
      assertEquals("#root", document0.tagName());
      assertEquals("WTF: No buffer left to unconsume.", document0.location());
      assertFalse(document0.hasParent());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
      assertEquals(4, elements1.size());
      assertFalse(elements1.isEmpty());
      assertFalse(elements2.isEmpty());
      assertEquals(4, elements2.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      assertNotNull(document0);
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.location());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      
      Elements elements0 = document0.getElementsMatchingOwnText("");
      assertNotNull(elements0);
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.location());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertFalse(elements0.isEmpty());
      assertEquals(4, elements0.size());
      
      Elements elements1 = Selector.filterOut(elements0, elements0);
      assertNotNull(elements1);
      assertNotSame(elements0, elements1);
      assertNotSame(elements1, elements0);
      assertFalse(elements1.equals((Object)elements0));
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.location());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertFalse(elements0.isEmpty());
      assertEquals(4, elements0.size());
      assertEquals(0, elements1.size());
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      assertNotNull(document0);
      assertFalse(document0.hasParent());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#root", document0.normalName());
      
      Elements elements0 = document0.getElementsMatchingOwnText("");
      assertNotNull(elements0);
      assertFalse(document0.hasParent());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#root", document0.normalName());
      assertEquals(4, elements0.size());
      assertFalse(elements0.isEmpty());
      
      Elements elements1 = Selector.select("HANDSHAKE", (Iterable<Element>) elements0);
      assertNotNull(elements1);
      assertNotSame(elements0, elements1);
      assertNotSame(elements1, elements0);
      assertFalse(elements1.equals((Object)elements0));
      assertFalse(document0.hasParent());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("#root", document0.normalName());
      assertEquals(4, elements0.size());
      assertFalse(elements0.isEmpty());
      assertTrue(elements1.isEmpty());
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Selector.SelectorParseException selector_SelectorParseException0 = new Selector.SelectorParseException("");
      assertNotNull(selector_SelectorParseException0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell("WTF: No buffer left to unconsume.");
      assertNotNull(document0);
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.normalName());
      assertEquals("WTF: No buffer left to unconsume.", document0.location());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      
      // Undeclared exception!
      try { 
        Selector.selectFirst(".S'r1[O)L", document0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '.S'r1[O)L': unexpected token at ''r1[O)L'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document("");
      assertNotNull(document0);
      assertEquals("#root", document0.tagName());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.childNodeSize());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.normalName());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      
      // Undeclared exception!
      try { 
        Selector.selectFirst("", document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("");
      Selector.select("hidden", (Element) document0);
  }
}