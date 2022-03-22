/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 20:17:52 GMT 2022
 */

package org.jsoup.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.SocketTimeoutException;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrainableInputStream_ESTest extends ConstrainableInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 32768);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(bufferedInputStream0, 418, 32768);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-4737L), 418);
      try { 
        constrainableInputStream1.readToByteBuffer(32768);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis(299L);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      ConstrainableInputStream.wrap(pipedInputStream0, 2147483623, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte)22;
      byteArray0[2] = (byte)36;
      byteArray0[3] = (byte) (-31);
      byteArray0[4] = (byte)87;
      byteArray0[5] = (byte)0;
      Enumeration<ConstrainableInputStream> enumeration0 = (Enumeration<ConstrainableInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(sequenceInputStream0, (byte)87, (byte)0);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-1L), (byte)87);
      // Undeclared exception!
      try { 
        constrainableInputStream1.read(byteArray0, (int) (byte)87, (int) (byte) (-31));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(bufferedInputStream0, 1, 1);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-78);
      // Undeclared exception!
      try { 
        constrainableInputStream0.readToByteBuffer(2564);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      System.setCurrentTimeMillis((-194L));
      System.setCurrentTimeMillis((-194L));
      InputStream inputStream0 = null;
      int int0 = 3486;
      int int1 = 1646;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 3486, 1646);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      byte[] byteArray0 = null;
      int int2 = 1;
      // Undeclared exception!
      try { 
        constrainableInputStream0.read((byte[]) null, 3486, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 1;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1, 1);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)0;
      try { 
        constrainableInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1, 0);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      long long0 = 1293L;
      try { 
        constrainableInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      int int0 = 412;
      int int1 = (-168);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte) (-96);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)89;
      byteArray0[4] = (byte) (-99);
      byteArray0[5] = (byte)0;
      mockFileInputStream0.read(byteArray0, 976, (-928));
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(mockFileInputStream0, 412, (-168));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 1232;
      int int1 = (-2039);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap((InputStream) null, 1232, (-2039));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      mockFileInputStream0.getChannel();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      int int0 = 32768;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(sequenceInputStream0, 32768, 32768);
      long long0 = 1L;
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(32768, 1L);
      constrainableInputStream1.timeout(32768, 1L);
      try { 
        constrainableInputStream0.readToByteBuffer(0);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)0);
      byteArrayInputStream0.close();
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 1068, (byte)0);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((byte)10, (byte)0);
      int int0 = 320;
      ConstrainableInputStream.wrap(byteArrayInputStream0, 320, 0);
      constrainableInputStream1.readToByteBuffer(0);
      ConstrainableInputStream.wrap(constrainableInputStream0, 1, (byte)0);
      try { 
        constrainableInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(981);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 981, 0);
      pipedInputStream0.markSupported();
      constrainableInputStream0.mark(981);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(0, 646L);
      ConstrainableInputStream.wrap(constrainableInputStream1, 0, 981);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1410);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 1410, 1410);
      try { 
        constrainableInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-5);
      byteArray0[1] = (byte) (-32);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-86);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-45);
      byteArray0[6] = (byte)0;
      byte byte0 = (byte)1;
      byteArray0[7] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, (byte)1, 0);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-2645L), (byte)1);
      byteArrayInputStream0.reset();
      // Undeclared exception!
      try { 
        constrainableInputStream1.readToByteBuffer((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1, 1);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(3784000000L, 3784000000L);
      // Undeclared exception!
      try { 
        constrainableInputStream1.readToByteBuffer((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)50;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)121;
      byteArray0[4] = (byte)31;
      byte byte0 = (byte) (-85);
      byteArray0[5] = (byte) (-85);
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-3);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)121, 0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, (byte)31, 32768);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-1410L), (-748L));
      constrainableInputStream1.close();
      try { 
        constrainableInputStream1.read(byteArray0, 1, 1276);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InputStream inputStream0 = null;
      int int0 = 2641;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 2641, 2641);
      byte[] byteArray0 = new byte[0];
      constrainableInputStream0.markSupported();
      constrainableInputStream0.close();
      int int1 = 0;
      try { 
        constrainableInputStream0.read(byteArray0, 2641, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 112;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 112, 112);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      int int1 = 1;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(dataInputStream0, 112, 1);
      // Undeclared exception!
      try { 
        constrainableInputStream0.read(byteArray0, 112, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 32768, 32768);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-778L), 516L);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-27);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-9);
      byteArray0[3] = (byte)120;
      byteArray0[4] = (byte) (-65);
      byteArray0[5] = (byte) (-66);
      byteArray0[6] = (byte)1;
      try { 
        constrainableInputStream1.read(byteArray0, (int) (byte)1, (-1741));
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)21;
      byteArray0[1] = (byte) (-20);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      byteArrayInputStream0.close();
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 3034, 0);
      constrainableInputStream0.readToByteBuffer(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1040, 0);
      try { 
        constrainableInputStream0.readToByteBuffer(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      int int0 = (-71);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (-71));
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(byteArrayInputStream0, (-3541), (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 32768);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 32768, 32768);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-1051L), (-1051L));
      try { 
        constrainableInputStream1.readToByteBuffer(32768);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      System.setCurrentTimeMillis(299L);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(pipedInputStream0, (-1), 32768);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      System.setCurrentTimeMillis((-194L));
      System.setCurrentTimeMillis((-194L));
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1, 1);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(1646, 1);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      try { 
        constrainableInputStream1.readToByteBuffer(1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      int int0 = (-1230);
      pushbackInputStream0.markSupported();
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(pushbackInputStream0, (-1230), (-1230));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)55;
      byteArray0[1] = (byte)55;
      byte byte2 = (byte)0;
      byteArray0[2] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = 1134;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, (byte)55, 1134);
      constrainableInputStream0.mark(2365);
      constrainableInputStream0.timeout(1245L, 1125L);
      constrainableInputStream0.close();
      try { 
        constrainableInputStream0.readToByteBuffer((byte)55);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 0;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(pushbackInputStream0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)21;
      byteArray0[1] = (byte) (-20);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)21;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)21, (byte)0);
      byteArrayInputStream0.close();
      byteArrayInputStream0.read(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 3034, 0);
      constrainableInputStream0.mark((byte)21);
      constrainableInputStream0.readToByteBuffer(0);
      constrainableInputStream0.reset();
      System.setCurrentTimeMillis((byte) (-20));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-112);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)65;
      byteArray0[6] = (byte) (-16);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, dataInputStream0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(sequenceInputStream0, 884, 884);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout(0L, 1373L);
      assertSame(constrainableInputStream0, constrainableInputStream1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 2641;
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 2641, 2641);
      byte[] byteArray0 = new byte[0];
      constrainableInputStream0.markSupported();
      constrainableInputStream0.close();
      try { 
        constrainableInputStream0.read(byteArray0, 2641, 2641);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }
}