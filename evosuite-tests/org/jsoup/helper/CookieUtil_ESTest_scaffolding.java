/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 22 19:09:39 GMT 2022
 */

package org.jsoup.helper;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CookieUtil_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.helper.CookieUtil"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/evosuite"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CookieUtil_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.internal.StringUtil",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.Connection$Response",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.nodes.Comment",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.parser.Parser",
      "org.jsoup.Connection$Base",
      "org.jsoup.nodes.Element",
      "org.jsoup.Connection",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.Connection$Method",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.helper.Validate",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.helper.CookieUtil",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.nodes.Node",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.nodes.Document",
      "org.jsoup.Connection$KeyVal",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.FormElement"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CookieUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.helper.CookieUtil",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.helper.Validate",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.internal.StringUtil$1",
      "org.jsoup.internal.StringUtil",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.EntitiesData",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.select.Elements",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.nodes.Attributes$Dataset$EntrySet",
      "org.jsoup.nodes.Attributes$Dataset$DatasetIterator",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.internal.StringUtil$StringJoiner",
      "org.jsoup.parser.HtmlTreeBuilderState$7",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.HtmlTreeBuilderState$25",
      "org.jsoup.nodes.NodeUtils",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.Connection$Method"
    );
  }
}
