/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:25:13 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataNode dataNode0 = new DataNode("MK");
      StringBuilder stringBuilder0 = new StringBuilder("7");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      dataNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataNode dataNode0 = new DataNode("**Q>R%&3L?w3T;");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      dataNode0.outerHtmlTail((Appendable) null, 47, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataNode dataNode0 = new DataNode("");
      dataNode0.toString();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataNode dataNode0 = new DataNode("gQ$Y=2U.m");
      dataNode0.setSiblingIndex(1048);
      dataNode0.setWholeData("org.jsoup.select.Evaluator$IsNthLastOfType");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataNode dataNode0 = new DataNode("W");
      DataNode dataNode1 = dataNode0.setWholeData("#data");
      dataNode1.siblingIndex = (-2713);
      dataNode0.setWholeData("W");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataNode dataNode0 = new DataNode("MK");
      DataNode dataNode1 = dataNode0.clone();
      dataNode1.parentNode = (Node) dataNode0;
      dataNode1.setWholeData("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null);
      dataNode0.getWholeData();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataNode dataNode0 = new DataNode("hr");
      dataNode0.getWholeData();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataNode dataNode0 = new DataNode("W");
      dataNode0.wrap("W");
      dataNode0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataNode dataNode0 = new DataNode("Not directory or doesn't exist: ");
      dataNode0.setParentNode(dataNode0);
      // Undeclared exception!
      dataNode0.toString();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataNode dataNode0 = new DataNode("U");
      Object object0 = new Object();
      dataNode0.value = object0;
      // Undeclared exception!
      try { 
        dataNode0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null);
      dataNode0.attributes();
      dataNode0.reparentChild(dataNode0);
      // Undeclared exception!
      dataNode0.setWholeData("n7by-");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataNode dataNode0 = new DataNode("I>81J8%K6g`)ItxYt");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "#data", 0, 0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        dataNode0.outerHtmlHead(charBuffer0, 0, document_OutputSettings0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataNode dataNode0 = new DataNode("Yc?Ys6}1");
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      try { 
        dataNode0.outerHtmlHead(pipedWriter0, 0, document_OutputSettings0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataNode dataNode0 = new DataNode(")g^oPg:bS@4");
      dataNode0.reparentChild(dataNode0);
      // Undeclared exception!
      dataNode0.clone();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataNode dataNode0 = new DataNode("");
      dataNode0.nodeName();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataNode dataNode0 = new DataNode("");
      dataNode0.getWholeData();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataNode dataNode0 = new DataNode("~-Mx) 7v16");
      dataNode0.toString();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataNode dataNode0 = new DataNode("3K5}l]6uJ,");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        dataNode0.outerHtmlHead((Appendable) null, 3753, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.DataNode", e);
      }
  }
}