/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:23:51 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[0];
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      combiningEvaluator_Or0.toString();
      combiningEvaluator_Or0.num = (-2106);
      combiningEvaluator_Or0.updateNumEvaluators();
      combiningEvaluator_Or0.num = (-2430);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.matches(element0, element0);
      combiningEvaluator_Or0.num = 0;
      combiningEvaluator_Or0.num = (-2106);
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.num = 0;
      combiningEvaluator_Or0.matches(element1, element1);
      combiningEvaluator_Or0.toString();
      combiningEvaluator_Or0.rightMostEvaluator();
      combiningEvaluator_Or0.rightMostEvaluator();
      combiningEvaluator_Or0.matches((Element) null, (Element) null);
      combiningEvaluator_Or0.toString();
      combiningEvaluator_Or0.toString();
      Evaluator evaluator0 = combiningEvaluator_Or0.rightMostEvaluator();
      assertNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[0];
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      combiningEvaluator_And0.num = 29;
      combiningEvaluator_And0.updateNumEvaluators();
      combiningEvaluator_And0.toString();
      combiningEvaluator_And0.updateNumEvaluators();
      combiningEvaluator_And0.rightMostEvaluator();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.updateNumEvaluators();
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.matches(element0, element1);
      combiningEvaluator_Or0.num = 1241;
      combiningEvaluator_Or0.num = 0;
      combiningEvaluator_And0.updateNumEvaluators();
      combiningEvaluator_Or0.add(combiningEvaluator_And0);
      combiningEvaluator_Or0.num = 29;
      combiningEvaluator_Or0.toString();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator((Evaluator) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 28, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      doReturn((Attributes) null).when(element1).attributes();
      Evaluator.AttributeStarting evaluator_AttributeStarting0 = new Evaluator.AttributeStarting("org.jsoup.nodes.Element");
      combiningEvaluator_Or0.add(evaluator_AttributeStarting0);
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.matches(element0, element1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Evaluator$AttributeStarting", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.updateNumEvaluators();
      combiningEvaluator_Or0.toString();
      combiningEvaluator_Or0.num = 1388;
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.rightMostEvaluator();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1387, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[1];
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      evaluatorArray0[0] = (Evaluator) evaluator_AllElements0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = combiningEvaluator_And0.matches(element0, element1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[2];
      Evaluator.AttributeWithValue evaluator_AttributeWithValue0 = new Evaluator.AttributeWithValue("{}{Elk>Jt}", "ALG{R1}");
      evaluatorArray0[0] = (Evaluator) evaluator_AttributeWithValue0;
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      evaluatorArray0[1] = (Evaluator) evaluator_AllElements0;
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      combiningEvaluator_Or0.replaceRightMostEvaluator(evaluatorArray0[0]);
      combiningEvaluator_Or0.updateNumEvaluators();
      combiningEvaluator_Or0.rightMostEvaluator();
      combiningEvaluator_Or0.add(evaluator_AllElements0);
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      combiningEvaluator_And0.toString();
      Evaluator evaluator0 = combiningEvaluator_And0.rightMostEvaluator();
      assertNotNull(evaluator0);
      
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(element0).hasAttr(anyString());
      boolean boolean0 = combiningEvaluator_Or0.matches(element0, element0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CombiningEvaluator.And combiningEvaluator_And0 = null;
      try {
        combiningEvaluator_And0 = new CombiningEvaluator.And((Collection<Evaluator>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = null;
      try {
        combiningEvaluator_Or0 = new CombiningEvaluator.Or((Collection<Evaluator>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[4];
      Evaluator.Attribute evaluator_Attribute0 = new Evaluator.Attribute("Split offset must be not be negative");
      evaluatorArray0[0] = (Evaluator) evaluator_Attribute0;
      Evaluator.AttributeWithValueContaining evaluator_AttributeWithValueContaining0 = new Evaluator.AttributeWithValueContaining("Split offset must be not be negative", "Split offset must be not be negative");
      evaluatorArray0[1] = (Evaluator) evaluator_AttributeWithValueContaining0;
      Evaluator.AttributeStarting evaluator_AttributeStarting0 = new Evaluator.AttributeStarting("Split offset must be not be negative");
      evaluatorArray0[2] = (Evaluator) evaluator_AttributeStarting0;
      Evaluator.Attribute evaluator_Attribute1 = new Evaluator.Attribute("Split offset must be not be negative");
      evaluatorArray0[3] = (Evaluator) evaluator_Attribute1;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Evaluator evaluator0 = combiningEvaluator_And0.rightMostEvaluator();
      assertNotSame(evaluator0, evaluator_Attribute0);
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.toString();
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.matches(element0, element1);
      Evaluator[] evaluatorArray0 = new Evaluator[7];
      evaluatorArray0[0] = (Evaluator) combiningEvaluator_Or0;
      evaluatorArray0[1] = (Evaluator) combiningEvaluator_Or0;
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator(evaluatorArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.rightMostEvaluator();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator((Evaluator) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[2];
      Evaluator.Attribute evaluator_Attribute0 = new Evaluator.Attribute("");
      evaluatorArray0[0] = (Evaluator) evaluator_Attribute0;
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      evaluatorArray0[1] = (Evaluator) evaluator_AllElements0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(element0).hasAttr(anyString());
      combiningEvaluator_And0.matches(element0, element0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.matches(element1, element1);
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator(evaluatorArray0[0]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.rightMostEvaluator();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator((Evaluator) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[6];
      Evaluator.AttributeWithValue evaluator_AttributeWithValue0 = new Evaluator.AttributeWithValue("P", "tn151![1(1~");
      evaluatorArray0[0] = (Evaluator) evaluator_AttributeWithValue0;
      Evaluator.AttributeWithValue evaluator_AttributeWithValue1 = new Evaluator.AttributeWithValue(", ", "}zR&_,b9/j]\"o?Tc0");
      evaluatorArray0[1] = (Evaluator) evaluator_AttributeWithValue1;
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      evaluatorArray0[2] = (Evaluator) combiningEvaluator_Or0;
      Evaluator.AttributeWithValue evaluator_AttributeWithValue2 = null;
      try {
        evaluator_AttributeWithValue2 = new Evaluator.AttributeWithValue("", "}zR&_,b9/j]\"o?Tc0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[0];
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      combiningEvaluator_Or0.toString();
      combiningEvaluator_Or0.num = 0;
      combiningEvaluator_Or0.add(combiningEvaluator_And0);
      combiningEvaluator_Or0.toString();
      combiningEvaluator_And0.num = 1;
      // Undeclared exception!
      try { 
        combiningEvaluator_And0.matches((Element) null, (Element) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[2];
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.rightMostEvaluator();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator((Evaluator) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_Or0.matches(element0, element0);
      CombiningEvaluator.Or combiningEvaluator_Or1 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.add(combiningEvaluator_Or1);
      combiningEvaluator_Or0.updateNumEvaluators();
      Evaluator[] evaluatorArray0 = new Evaluator[5];
      evaluatorArray0[0] = (Evaluator) combiningEvaluator_Or1;
      combiningEvaluator_Or0.add(evaluatorArray0[0]);
      combiningEvaluator_Or0.add(evaluatorArray0[0]);
      evaluatorArray0[1] = (Evaluator) combiningEvaluator_Or0;
      evaluatorArray0[2] = (Evaluator) combiningEvaluator_Or1;
      evaluatorArray0[3] = (Evaluator) combiningEvaluator_Or0;
      evaluatorArray0[4] = (Evaluator) combiningEvaluator_Or0;
      combiningEvaluator_Or1.updateNumEvaluators();
      combiningEvaluator_Or0.updateNumEvaluators();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      combiningEvaluator_And0.toString();
      combiningEvaluator_And0.toString();
      Element element1 = mock(Element.class, new ViolatedAssumptionAnswer());
      combiningEvaluator_And0.matches(element1, element1);
      combiningEvaluator_Or1.num = 1246;
      combiningEvaluator_Or0.toString();
      combiningEvaluator_And0.replaceRightMostEvaluator(combiningEvaluator_Or1);
      combiningEvaluator_And0.toString();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or1.rightMostEvaluator();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1245, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      CombiningEvaluator.Or combiningEvaluator_Or1 = new CombiningEvaluator.Or();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator(combiningEvaluator_Or1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Evaluator[] evaluatorArray0 = null;
      CombiningEvaluator.Or combiningEvaluator_Or0 = null;
      try {
        combiningEvaluator_Or0 = new CombiningEvaluator.Or((Evaluator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[1];
      Evaluator.AttributeWithValue evaluator_AttributeWithValue0 = null;
      try {
        evaluator_AttributeWithValue0 = new Evaluator.AttributeWithValue((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
