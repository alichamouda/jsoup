/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:24:22 GMT 2022
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.UncheckedIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UncheckedIOException_ESTest extends UncheckedIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException((IOException) null);
      IOException iOException0 = uncheckedIOException0.ioException();
      assertNull(iOException0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException("I>88hNRL&Pr`6");
      IOException iOException0 = uncheckedIOException0.ioException();
      assertNotNull(iOException0);
  }
}
