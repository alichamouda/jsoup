/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:26:37 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingDeque;
import org.eclipse.jetty.io.ArrayByteBufferPool;
import org.eclipse.jetty.io.LeakTrackingByteBufferPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayByteBufferPool arrayByteBufferPool0 = new ArrayByteBufferPool();
      LeakTrackingByteBufferPool leakTrackingByteBufferPool0 = new LeakTrackingByteBufferPool(arrayByteBufferPool0);
      Class<Evaluator> class0 = Evaluator.class;
      Collection<Evaluator> collection0 = leakTrackingByteBufferPool0.getContainedBeans(class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(collection0);
      Document document0 = Parser.parse("STOPPED", "STOPPED");
      Collector.collect(combiningEvaluator_Or0, document0);
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.collect(evaluator_MatchText0, document0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder0.head(document0, (-2525));
      evaluator_MatchText0.matches(document0, document0);
      collector_FirstFinder0.head(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(combiningEvaluator_Or0);
      Parser parser0 = Parser.xmlParser();
      Document document1 = document0.parser(parser0);
      document1.appendChild(document0);
      Element element0 = Collector.findFirst(evaluator_MatchText0, document1);
      Collector.findFirst(combiningEvaluator_Or0, element0);
      Evaluator.AttributeWithValueEnding evaluator_AttributeWithValueEnding0 = new Evaluator.AttributeWithValueEnding("W],s`_", "RUNNING");
      // Undeclared exception!
      Collector.findFirst(evaluator_AttributeWithValueEnding0, document1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayByteBufferPool arrayByteBufferPool0 = new ArrayByteBufferPool();
      LeakTrackingByteBufferPool leakTrackingByteBufferPool0 = new LeakTrackingByteBufferPool(arrayByteBufferPool0);
      Class<Evaluator> class0 = Evaluator.class;
      Collection<Evaluator> collection0 = leakTrackingByteBufferPool0.getContainedBeans(class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(collection0);
      Document document0 = Parser.parse("STOPPED", "STOPPED");
      Collector.collect(combiningEvaluator_Or0, document0);
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.collect(evaluator_MatchText0, document0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_MatchText0);
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder1.head(document0, (-2525));
      evaluator_MatchText0.matches(document0, document0);
      Element element0 = collector_FirstFinder0.find(document0, document0);
      collector_FirstFinder1.tail(document0, (-2));
      collector_FirstFinder1.head(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder2 = new Collector.FirstFinder(combiningEvaluator_Or0);
      Parser parser0 = Parser.xmlParser();
      Document document1 = document0.parser(parser0);
      Element element1 = Collector.findFirst(evaluator_MatchText0, document1);
      element1.before((Node) document0);
      Collector.findFirst(combiningEvaluator_Or0, element1);
      document1.hasAttr("");
      collector_FirstFinder0.head(document0, (-2525));
      Collector.collect(evaluator_MatchText0, element1);
      Element element2 = Collector.findFirst(evaluator_MatchText0, element0);
      assertTrue(element2.isBlock());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayByteBufferPool arrayByteBufferPool0 = new ArrayByteBufferPool();
      LeakTrackingByteBufferPool leakTrackingByteBufferPool0 = new LeakTrackingByteBufferPool(arrayByteBufferPool0);
      Class<Evaluator> class0 = Evaluator.class;
      Collection<Evaluator> collection0 = leakTrackingByteBufferPool0.getContainedBeans(class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(collection0);
      Document document0 = Parser.parse("STOPPED", "STOPPED");
      Collector.collect(combiningEvaluator_Or0, document0);
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.collect(evaluator_MatchText0, document0);
      int int0 = (-415);
      combiningEvaluator_Or0.num = 1;
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder0.tail(document0, (-415));
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder1.head(document0, (-415));
      evaluator_MatchText0.matches(document0, document0);
      collector_FirstFinder0.find(document0, document0);
      collector_FirstFinder1.tail(document0, 1);
      collector_FirstFinder1.head(document0, (-415));
      Collector.FirstFinder collector_FirstFinder2 = new Collector.FirstFinder(combiningEvaluator_Or0);
      document0.appendElement("STARTING");
      Parser parser0 = Parser.xmlParser();
      Document document1 = document0.parser(parser0);
      Element element0 = Collector.findFirst(evaluator_MatchText0, document1);
      // Undeclared exception!
      try { 
        Collector.findFirst(combiningEvaluator_Or0, element0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayByteBufferPool arrayByteBufferPool0 = new ArrayByteBufferPool();
      LeakTrackingByteBufferPool leakTrackingByteBufferPool0 = new LeakTrackingByteBufferPool(arrayByteBufferPool0);
      Class<Evaluator> class0 = Evaluator.class;
      Collection<Evaluator> collection0 = leakTrackingByteBufferPool0.getContainedBeans(class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(collection0);
      Document document0 = Parser.parse("STOPPED", "STOPPED");
      Collector.collect(combiningEvaluator_Or0, document0);
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.collect(evaluator_MatchText0, document0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_MatchText0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      collector_FirstFinder0.head(document0, 1);
      structuralEvaluator_Has0.toString();
      collector_FirstFinder0.tail(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder1.tail(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder2 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder2.head(document0, (-2525));
      evaluator_MatchText0.matches(document0, document0);
      collector_FirstFinder0.head(document0, (-2525));
      collector_FirstFinder1.find(document0, document0);
      collector_FirstFinder2.tail(document0, 1);
      collector_FirstFinder2.head(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder3 = new Collector.FirstFinder(combiningEvaluator_Or0);
      Parser parser0 = Parser.xmlParser();
      Document document1 = document0.parser(parser0);
      Element element0 = Collector.findFirst(evaluator_MatchText0, document1);
      Collector.findFirst(combiningEvaluator_Or0, element0);
      collector_FirstFinder1.head(document0, (-2525));
      document1.appendChild(document0);
      collector_FirstFinder0.find(element0, (Element) null);
      collector_FirstFinder0.find((Element) null, (Element) null);
      collector_FirstFinder0.find(document1, (Element) null);
      // Undeclared exception!
      Collector.collect(evaluator_MatchText0, document1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(combiningEvaluator_Or0);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("TN4v':hZt^", parseSettings0);
      Element element0 = new Element(tag0, "a");
      element0.ownerDocument();
      Collector.findFirst((Evaluator) null, (Element) null);
      // Undeclared exception!
      try { 
        Collector.collect((Evaluator) null, (Element) null);
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
      Evaluator.IsEmpty evaluator_IsEmpty0 = new Evaluator.IsEmpty();
      Document document0 = Parser.parseBodyFragment("%uBV8", "%uBV8");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(false);
      Document document1 = document0.outputSettings(document_OutputSettings1);
      Parser parser0 = Parser.xmlParser();
      Parser parser1 = parser0.setTrackErrors(0);
      Document document2 = document1.parser(parser1);
      Element element0 = Collector.findFirst(evaluator_IsEmpty0, document2);
      assertTrue(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator evaluator0 = null;
      Document document0 = Parser.parse("", "");
      // Undeclared exception!
      try { 
        Collector.collect((Evaluator) null, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Collector$Accumulator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      Parser parser0 = Parser.htmlParser();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Document document0 = parser0.parseInput("", "closed accept of {}");
      FileSystemHandling.shouldAllThrowIOExceptions();
      document0.getElementsMatchingText("n");
      Element element0 = Collector.findFirst(evaluator_AllElements0, document0);
      assertNotNull(element0);
      
      Collector.collect(evaluator_AllElements0, document0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Collector.collect(combiningEvaluator_Or0, document0);
      Elements elements0 = Collector.collect(combiningEvaluator_Or0, document0);
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator.Attribute evaluator_Attribute0 = new Evaluator.Attribute(", state=");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_Attribute0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Document document0 = Parser.parseBodyFragment("", "");
      Collector.findFirst(structuralEvaluator_Has0, document0);
      Element element0 = collector_FirstFinder0.find((Element) null, (Element) null);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator.IndexLessThan evaluator_IndexLessThan0 = new Evaluator.IndexLessThan((-4057));
      evaluator_IndexLessThan0.toString();
      evaluator_IndexLessThan0.index = (-4057);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_IndexLessThan0);
      evaluator_IndexLessThan0.index = (-4057);
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(evaluator_IndexLessThan0);
      Document document0 = Parser.parse("e(%\f+^C=^dpvs{D", "/$CH0m(m>Fj<u\"YxB]*");
      document0.shallowClone();
      document0.getElementsByAttributeValueStarting(":lt(-4057)", "DiGD@*-$");
      document0.normalName();
      Element element0 = collector_FirstFinder0.find(document0, document0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag(" > ");
      evaluator_Tag0.toString();
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_Tag0);
      Document document0 = new Document(" > ");
      Elements elements0 = Collector.collect(evaluator_Tag0, document0);
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_MatchText0);
      String string0 = "";
      Document document0 = Document.createShell("");
      collector_FirstFinder0.head(document0, (-1));
      String string1 = "6Su";
      TextNode textNode0 = TextNode.createFromEncoded("6Su");
      int int0 = 224;
      collector_FirstFinder0.tail(textNode0, 224);
      LinkedBlockingDeque<Evaluator> linkedBlockingDeque0 = new LinkedBlockingDeque<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedBlockingDeque0);
      combiningEvaluator_And0.rightMostEvaluator();
      combiningEvaluator_And0.num = 224;
      Document document1 = Parser.parseBodyFragment("6Su", "Request not made");
      Document document2 = document1.shallowClone();
      // Undeclared exception!
      try { 
        Collector.findFirst((Evaluator) null, document2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent((Evaluator) null);
      Document document0 = Document.createShell("org.jsoup.select.Collector$FirstFinder");
      document0.getElementsByAttributeValueNot("org.jsoup.select.Collector$FirstFinder", "org.jsoup.select.Collector$FirstFinder");
      document0.getElementsMatchingText("org.jsoup.select.Collector$FirstFinder");
      document0.wholeText();
      // Undeclared exception!
      try { 
        Collector.findFirst(structuralEvaluator_Parent0, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.StructuralEvaluator$Parent", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_Tag0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      CDataNode cDataNode0 = new CDataNode("");
      cDataNode0.parent();
      NodeFilter.FilterResult nodeFilter_FilterResult0 = collector_FirstFinder0.head((Node) null, (-3097));
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag(" _xTrZSU");
      Document document0 = new Document("org.jsoup.select.Collector$Accumulator");
      Collector.findFirst(evaluator_Tag0, document0);
      Collector.collect(evaluator_Tag0, document0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_Tag0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator.IsFirstOfType evaluator_IsFirstOfType0 = new Evaluator.IsFirstOfType();
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(evaluator_IsFirstOfType0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(structuralEvaluator_Not0);
      Tag tag0 = Tag.valueOf("org.jsoup.select.Collector");
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "", (Attributes) null);
      Element element0 = collector_FirstFinder0.find(pseudoTextElement0, pseudoTextElement0);
      assertSame(pseudoTextElement0, element0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("+? ", "+? ");
      Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.quirks;
      Document document1 = document0.quirksMode(document_QuirksMode0);
      // Undeclared exception!
      try { 
        Collector.findFirst((Evaluator) null, document1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Evaluator.IsFirstChild evaluator_IsFirstChild0 = new Evaluator.IsFirstChild();
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_IsFirstChild0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayByteBufferPool arrayByteBufferPool0 = new ArrayByteBufferPool();
      LeakTrackingByteBufferPool leakTrackingByteBufferPool0 = new LeakTrackingByteBufferPool(arrayByteBufferPool0);
      Class<Evaluator> class0 = Evaluator.class;
      Collection<Evaluator> collection0 = leakTrackingByteBufferPool0.getContainedBeans(class0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(collection0);
      Document document0 = Parser.parse("STOPPED", "STOPPED");
      Collector.collect(combiningEvaluator_Or0, document0);
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      Collector.collect(evaluator_MatchText0, document0);
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_MatchText0);
      collector_FirstFinder0.head(document0, (-2525));
      collector_FirstFinder0.head(document0, (-2525));
      Collector.FirstFinder collector_FirstFinder1 = new Collector.FirstFinder(combiningEvaluator_Or0);
      Parser parser0 = Parser.xmlParser();
      Document document1 = document0.parser(parser0);
      Element element0 = Collector.findFirst(evaluator_MatchText0, document1);
      Collector.findFirst(combiningEvaluator_Or0, element0);
  }
}
