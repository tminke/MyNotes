
package com.mobileday.interview.tminke.mynotes.test;

import java.util.UUID;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.TTCCLayout;
import org.hamcrest.Matcher;
import org.junit.Assert;

/**
 * Abstract UnitTest Class
 * 
 * Top level abstract UnitTest class. This is a place-holder for generic functionality usable by any kind of test.
 */
public abstract class UnitTest
{
    static
    {
        // Disable Loading Of log4j.properties File
        System.setProperty("log4j.defaultInitOverride", "true");

        // Initialize Log4J Logging For Unit Tests
        initializeLogging();
    }

    /**
     * Get A Random UUID String To Separate Parallel Test Execution
     * 
     * @return The unique random value.
     */
    public static String getUniqueId()
    {
        return UUID.randomUUID().toString();
    }

    /**
     * Initialize Log4J For Unit Testing
     * 
     * This will setup a simple console appender with log levels adjusted appropriately for unit test purposes. Most third party stuff will
     * be at ERROR threshold, with a few key tools being set at INFO. All com.emc logging is set to DEBUG.
     * 
     * To get a Logger instance in your tests simply use the same Apache Commons LogFactory that you would use in production.
     * 
     * Note - This will clear out any existing Log4j configuration!
     */
    private static synchronized void initializeLogging()
    {
        // Remove Existing Configuration
        Logger.getRootLogger().removeAllAppenders();

        // Crate A New Console Appender
        Logger.getRootLogger().addAppender(new ConsoleAppender(new TTCCLayout()));

        // Set Debug LogLevels According To Testing Needs
        Logger.getRootLogger().setLevel(Level.ERROR);
        Logger.getLogger("org.springframework").setLevel(Level.WARN);
        Logger.getLogger("com.mobileday").setLevel(Level.DEBUG);
    }

    //
    // NOTE: The following methods are simply wrappers all of the static mocking methods for Mockito to avoid repetitive static imports.
    //

    /**
     * {@link org.junit.Assert#assertArrayEquals(byte[], byte[])}
     */
    public void assertArrayEquals(byte[] expecteds, byte[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(char[], char[])}
     */
    public void assertArrayEquals(char[] expecteds, char[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(double[], double[], double)}
     */
    public void assertArrayEquals(double[] expecteds, double[] actuals, double delta)
    {
        Assert.assertArrayEquals(expecteds, actuals, delta);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(float[], float[], float)}
     */
    public void assertArrayEquals(float[] expecteds, float[] actuals, float delta)
    {
        Assert.assertArrayEquals(expecteds, actuals, delta);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(int[], int[])}
     */
    public void assertArrayEquals(int[] expecteds, int[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(long[], long[])}
     */
    public void assertArrayEquals(long[] expecteds, long[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(Object[], Object[])}
     */
    public void assertArrayEquals(Object[] expecteds, Object[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(short[], short[])}
     */
    public void assertArrayEquals(short[] expecteds, short[] actuals)
    {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, byte[], byte[])}
     */
    public void assertArrayEquals(String message, byte[] expecteds, byte[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, char[], char[])}
     */
    public void assertArrayEquals(String message, char[] expecteds, char[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, double[], double[], double)}
     */
    public void assertArrayEquals(String message, double[] expecteds, double[] actuals, double delta)
    {
        Assert.assertArrayEquals(message, expecteds, actuals, delta);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, float[], float[], float)}
     */
    public void assertArrayEquals(String message, float[] expecteds, float[] actuals, float delta)
    {
        Assert.assertArrayEquals(message, expecteds, actuals, delta);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, int[], int[])}
     */
    public void assertArrayEquals(String message, int[] expecteds, int[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, long[], long[])}
     */
    public void assertArrayEquals(String message, long[] expecteds, long[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, Object[], Object[])}
     */
    public void assertArrayEquals(String message, Object[] expecteds, Object[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertArrayEquals(String, short[], short[])}
     */
    public void assertArrayEquals(String message, short[] expecteds, short[] actuals)
    {
        Assert.assertArrayEquals(message, expecteds, actuals);
    }

    /**
     * {@link org.junit.Assert#assertEquals(double, double, double)}
     */
    public void assertEquals(double expected, double actual, double delta)
    {
        Assert.assertEquals(expected, actual, delta);
    }

    /**
     * {@link org.junit.Assert#assertEquals(float, float, float)}
     */

    public void assertEquals(float expected, float actual, float delta)
    {
        Assert.assertEquals(expected, actual, delta);
    }

    /**
     * {@link org.junit.Assert#assertEquals(long, long)}
     */
    public void assertEquals(long expected, long actual)
    {
        Assert.assertEquals(expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertEquals(Object, Object)}
     */
    public void assertEquals(Object expected, Object actual)
    {
        Assert.assertEquals(expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertEquals(String, double, double, double)}
     */
    public void assertEquals(String message, double expected, double actual, double delta)
    {
        Assert.assertEquals(message, expected, actual, delta);
    }

    /**
     * {@link org.junit.Assert#assertEquals(String, float, float)}
     */
    public void assertEquals(String message, float expected, float actual, float delta)
    {
        Assert.assertEquals(message, expected, actual, delta);
    }

    /**
     * {@link org.junit.Assert#assertEquals(String, long, long)}
     */
    public void assertEquals(String message, long expected, long actual)
    {
        Assert.assertEquals(message, expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertEquals(String, Object, Object)}
     */
    public void assertEquals(String message, Object expected, Object actual)
    {
        Assert.assertEquals(message, expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertFalse(boolean)}
     */
    public void assertFalse(boolean condition)
    {
        Assert.assertFalse(condition);
    }

    /**
     * {@link org.junit.Assert#assertFalse(String, boolean)}
     */
    public void assertFalse(String message, boolean condition)
    {
        Assert.assertFalse(message, condition);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(double, double, double)}
     */
    public void assertNotEquals(double first, double second, double delta)
    {
        Assert.assertNotEquals(first, second, delta);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(long, long)}
     */
    public void assertNotEquals(long first, long second)
    {
        Assert.assertNotEquals(first, second);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(Object, Object)}
     */
    public void assertNotEquals(Object first, Object second)
    {
        Assert.assertNotEquals(first, second);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(String, double, double, double)}
     */
    public void assertNotEquals(String message, double first, double second, double delta)
    {
        Assert.assertNotEquals(message, first, second, delta);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(String, long, long)}
     */
    public void assertNotEquals(String message, long first, long second)
    {
        Assert.assertNotEquals(message, first, second);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(String, Object, Object)}
     */
    public void assertNotEquals(String message, Object first, Object second)
    {
        Assert.assertNotEquals(message, first, second);
    }

    /**
     * {@link org.junit.Assert#assertNotNull(Object)}
     */
    public void assertNotNull(Object object)
    {
        Assert.assertNotNull(object);
    }

    /**
     * {@link org.junit.Assert#assertNotNull(String, Object)}
     */
    public void assertNotNull(String message, Object object)
    {
        Assert.assertNotNull(message, object);
    }

    /**
     * {@link org.junit.Assert#assertNotEquals(Object, Object)}
     */
    public void assertNotSame(Object unexpected, Object actual)
    {
        Assert.assertNotSame(unexpected, actual);
    }

    /**
     * {@link org.junit.Assert#assertNotSame(String, Object, Object)}
     */
    public void assertNotSame(String message, Object unexpected, Object actual)
    {
        Assert.assertNotSame(message, unexpected, actual);
    }

    /**
     * {@link org.junit.Assert#assertNull(Object)}
     */
    public void assertNull(Object object)
    {
        Assert.assertNull(object);
    }

    /**
     * {@link org.junit.Assert#assertNull(String, Object)}
     */
    public void assertNull(String message, Object object)
    {
        Assert.assertNull(message, object);
    }

    /**
     * {@link org.junit.Assert#assertSame(Object, Object)}
     */
    public void assertSame(Object expected, Object actual)
    {
        Assert.assertSame(expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertSame(String, Object, Object)}
     */
    public void assertSame(String message, Object expected, Object actual)
    {
        Assert.assertSame(message, expected, actual);
    }

    /**
     * {@link org.junit.Assert#assertThat(String, Object, Matcher)}
     */
    public <T> void assertThat(String reason, T actual, Matcher<? super T> matcher)
    {
        Assert.assertThat(reason, actual, matcher);
    }

    /**
     * {@link org.junit.Assert#assertThat(Object, Matcher)}
     */
    public <T> void assertThat(T actual, Matcher<? super T> matcher)
    {
        Assert.assertThat(actual, matcher);
    }

    /**
     * {@link org.junit.Assert#assertTrue(boolean)}
     */
    public void assertTrue(boolean condition)
    {
        Assert.assertTrue(condition);
    }

    /**
     * {@link org.junit.Assert#assertTrue(String, boolean)}
     */
    public void assertTrue(String message, boolean condition)
    {
        Assert.assertTrue(message, condition);
    }

    /**
     * {@link org.junit.Assert#fail()}
     */
    public void fail()
    {
        Assert.fail();
    }

    /**
     * {@link org.junit.Assert#fail(String)}
     */
    public void fail(String message)
    {
        Assert.fail(message);
    }

}
