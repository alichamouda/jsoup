/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:16:02 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokeniserState_ESTest extends TokeniserState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TokeniserState[] tokeniserStateArray0 = TokeniserState.values();
      assertEquals(67, tokeniserStateArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TokeniserState.valueOf("AttributeName");
  }
}