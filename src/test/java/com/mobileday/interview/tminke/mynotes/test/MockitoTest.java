
package com.mobileday.interview.tminke.mynotes.test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.mockito.InOrder;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.verification.VerificationMode;
import org.mockito.verification.VerificationWithTimeout;

/**
 * Abstract MockitoTest Class
 * 
 * Top level abstract MockitoTest class. This is a place-holder for generic functionality usable by Mockito tests.
 */
public abstract class MockitoTest extends UnitTest
{
    /**
     * JUnit Initialization Method
     */
    @Before
    public void initializeMockitoTest()
    {
        // Perform Any Necessary Creation / Injection Of Mocks
        MockitoAnnotations.initMocks(this);
    }

    //
    // NOTE: The following methods are simply wrappers all of the static mocking methods for Mockito to avoid repetitive static imports.
    //

    /**
     * {@link org.mockito.Mockito#atLeast(int)}
     */
    public VerificationMode atLeast(int minNumberOfInvocations)
    {
        return Mockito.atLeast(minNumberOfInvocations);
    }

    /**
     * {@link org.mockito.Mockito#atLeastOnce()}
     */
    public VerificationMode atLeastOnce()
    {
        return Mockito.atLeastOnce();
    }

    /**
     * {@link org.mockito.Mockito#atMost(int)}
     */
    public VerificationMode atMost(int maxNumberOfInvocations)
    {
        return Mockito.atMost(maxNumberOfInvocations);
    }

    /**
     * {@link org.mockito.Mockito#doAnswer(Answer)}
     */
    public Stubber doAnswer(Answer<?> answer)
    {
        return Mockito.doAnswer(answer);
    }

    /**
     * {@link org.mockito.Mockito#doCallRealMethod()}
     */
    public Stubber doCallRealMethod()
    {
        return Mockito.doCallRealMethod();
    }

    /**
     * {@link org.mockito.Mockito#doNothing()}
     */
    public Stubber doNothing()
    {
        return Mockito.doNothing();
    }

    /**
     * {@link org.mockito.Mockito#doReturn(Object)}
     */
    public Stubber doReturn(Object toBeReturned)
    {
        return Mockito.doReturn(toBeReturned);
    }

    /**
     * {@link org.mockito.Mockito#doThrow(Throwable)}
     */

    public Stubber doThrow(Throwable toBeThrown)
    {
        return Mockito.doThrow(toBeThrown);
    }

    /**
     * {@link org.mockito.Mockito#inOrder(Object...)}
     */
    public InOrder inOrder(Object... mocks)
    {
        return Mockito.inOrder(mocks);
    }

    /**
     * {@link org.mockito.Mockito#mock(Class)}
     */
    public <T> T mock(Class<T> classToMock)
    {
        return Mockito.mock(classToMock);
    }

    /**
     * {@link org.mockito.Mockito#mock(Class, Answer)}
     */
    public <T> T mock(Class<T> classToMock, Answer<?> defaultAnswer)
    {
        return Mockito.mock(classToMock, defaultAnswer);
    }

    /**
     * {@link org.mockito.Mockito#mock(Class, MockSettings)}
     */
    public <T> T mock(Class<T> classToMock, MockSettings mockSettings)
    {
        return Mockito.mock(classToMock, mockSettings);
    }

    /**
     * {@link org.mockito.Mockito#mock(Class, String)}
     */
    public <T> T mock(Class<T> classToMock, String name)
    {
        return Mockito.mock(classToMock, name);
    }

    /**
     * {@link org.mockito.Mockito#never()}
     */
    public VerificationMode never()
    {
        return Mockito.never();
    }

    /**
     * {@link org.mockito.Mockito#only()}
     */
    public VerificationMode only()
    {
        return Mockito.only();
    }

    /**
     * {@link org.mockito.Mockito#reset(Object...)}
     */
    public <T> void reset(@SuppressWarnings("unchecked") T... mocks)
    {
        Mockito.reset(mocks);
    }

    /**
     * {@link org.mockito.Mockito#spy(Object)}
     */
    public <T> T spy(T object)
    {
        return Mockito.spy(object);
    }

    /**
     * {@link org.mockito.Mockito#timeout(int)}
     */
    public VerificationWithTimeout timeout(int millis)
    {
        return Mockito.timeout(millis);
    }

    /**
     * {@link org.mockito.Mockito#times(int)}
     */
    public VerificationMode times(int wantedNumberOfInvocations)
    {
        return Mockito.times(wantedNumberOfInvocations);
    }

    /**
     * {@link org.mockito.Mockito#validateMockitoUsage()}
     */
    public void validateMockitoUsage()
    {
        Mockito.validateMockitoUsage();
    }

    /**
     * {@link org.mockito.Mockito#verify(Object)}
     */
    public <T> T verify(T mock)
    {
        return Mockito.verify(mock);
    }

    /**
     * {@link org.mockito.Mockito#verify(Object, VerificationMode)}
     */
    public <T> T verify(T mock, VerificationMode mode)
    {
        return Mockito.verify(mock, mode);
    }

    /**
     * {@link org.mockito.Mockito#verifyNoMoreInteractions(Object...)}
     */
    public void verifyNoMoreInteractions(Object... mocks)
    {
        Mockito.verifyNoMoreInteractions(mocks);
    }

    /**
     * {@link org.mockito.Mockito#verifyZeroInteractions(Object...)}
     */
    public void verifyZeroInteractions(Object... mocks)
    {
        Mockito.verifyZeroInteractions(mocks);
    }

    /**
     * {@link org.mockito.Mockito#when(Object)}
     */
    public <T> OngoingStubbing<T> when(T methodCall)
    {
        return Mockito.when(methodCall);
    }

    /**
     * {@link org.mockito.Mockito#withSettings()}
     */
    public MockSettings withSettings()
    {
        return Mockito.withSettings();
    }

    /**
     * {@link org.mockito.Mockito#any()}
     */
    public <T> T any()
    {
        return Mockito.any();
    }

    /**
     * {@link org.mockito.Mockito#any(Class)}
     */
    public <T> T any(Class<T> clazz)
    {
        return Mockito.any(clazz);
    }

    /**
     * {@link org.mockito.Mockito#anyBoolean()}
     */
    public boolean anyBoolean()
    {
        return Mockito.anyBoolean();
    }

    /**
     * {@link org.mockito.Mockito#anyByte()}
     */
    public byte anyByte()
    {
        return Mockito.anyByte();
    }

    /**
     * {@link org.mockito.Mockito#anyChar()}
     */
    public char anyChar()
    {
        return Mockito.anyChar();
    }

    /**
     * {@link org.mockito.Mockito#anyCollection()}
     */
    public Collection<?> anyCollection()
    {
        return Mockito.anyCollection();
    }

    /**
     * {@link org.mockito.Mockito#anyCollectionOf(Class)}
     */
    public <T> Collection<T> anyCollectionOf(Class<T> clazz)
    {
        return Mockito.anyCollectionOf(clazz);
    }

    /**
     * {@link org.mockito.Mockito#anyDouble()}
     */
    public double anyDouble()
    {
        return Mockito.anyDouble();
    }

    /**
     * {@link org.mockito.Mockito#anyFloat()}
     */
    public float anyFloat()
    {
        return Mockito.anyFloat();
    }

    /**
     * {@link org.mockito.Mockito#anyInt()}
     */
    public int anyInt()
    {
        return Mockito.anyInt();
    }

    /**
     * {@link org.mockito.Mockito#anyList()}
     */
    public List<?> anyList()
    {
        return Mockito.anyList();
    }

    /**
     * {@link org.mockito.Mockito#anyListOf(Class)}
     */
    public <T> List<T> anyListOf(Class<T> clazz)
    {
        return Mockito.anyListOf(clazz);
    }

    /**
     * {@link org.mockito.Mockito#anyLong()}
     */
    public long anyLong()
    {
        return Mockito.anyLong();
    }

    /**
     * {@link org.mockito.Mockito#anyMap()}
     */
    public Map<?, ?> anyMap()
    {
        return Mockito.anyMap();
    }

    /**
     * {@link org.mockito.Mockito#anyObject()}
     */
    public <T> T anyObject()
    {
        return Mockito.anyObject();
    }

    /**
     * {@link org.mockito.Mockito#anySet()}
     */
    public Set<?> anySet()
    {
        return Mockito.anySet();
    }

    /**
     * {@link org.mockito.Mockito#anySetOf(Class)}
     */
    public <T> Set<T> anySetOf(Class<T> clazz)
    {
        return Mockito.anySetOf(clazz);
    }

    /**
     * {@link org.mockito.Mockito#anyShort()}
     */
    public short anyShort()
    {
        return Mockito.anyShort();
    }

    /**
     * {@link org.mockito.Mockito#anyString()}
     */
    public String anyString()
    {
        return Mockito.anyString();
    }

    /**
     * {@link org.mockito.Mockito#anyVararg()}
     */
    public <T> T anyVararg()
    {
        return Mockito.anyVararg();
    }

    /**
     * {@link org.mockito.Mockito#argThat(org.hamcrest.Matcher)}
     */
    public <T> T argThat(org.hamcrest.Matcher<T> matcher)
    {
        return Mockito.argThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#booleanThat(org.hamcrest.Matcher)}
     */
    public boolean booleanThat(org.hamcrest.Matcher<Boolean> matcher)
    {
        return Mockito.booleanThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#byteThat(org.hamcrest.Matcher)}
     */
    public byte byteThat(org.hamcrest.Matcher<Byte> matcher)
    {
        return Mockito.byteThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#charThat(org.hamcrest.Matcher)}
     */
    public char charThat(org.hamcrest.Matcher<Character> matcher)
    {
        return Mockito.charThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#contains(String)}
     */
    public String contains(String substring)
    {
        return Mockito.contains(substring);
    }

    /**
     * {@link org.mockito.Mockito#doubleThat(org.hamcrest.Matcher)}
     */
    public double doubleThat(org.hamcrest.Matcher<Double> matcher)
    {
        return Mockito.doubleThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#endsWith(String)}
     */
    public String endsWith(String suffix)
    {
        return Mockito.endsWith(suffix);
    }

    /**
     * {@link org.mockito.Mockito#eq(boolean)}
     */
    public boolean eq(boolean value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(byte)}
     */
    public byte eq(byte value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(char)}
     */
    public char eq(char value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(double)}
     */
    public double eq(double value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(float)}
     */
    public float eq(float value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(int)}
     */
    public int eq(int value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(long)}
     */
    public long eq(long value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(short)}
     */
    public short eq(short value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#eq(Object)}
     */
    public <T> T eq(T value)
    {
        return Mockito.eq(value);
    }

    /**
     * {@link org.mockito.Mockito#floatThat(org.hamcrest.Matcher)}
     */
    public float floatThat(org.hamcrest.Matcher<Float> matcher)
    {
        return Mockito.floatThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#intThat(org.hamcrest.Matcher)}
     */
    public int intThat(org.hamcrest.Matcher<Integer> matcher)
    {
        return Mockito.intThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#isA(Class)}
     */
    public <T> T isA(Class<T> clazz)
    {
        return Mockito.isA(clazz);
    }

    /**
     * {@link org.mockito.Mockito#isNotNull()}
     */
    public Object isNotNull()
    {
        return Mockito.isNotNull();
    }

    /**
     * {@link org.mockito.Mockito#isNull()}
     */
    public Object isNull()
    {
        return Mockito.isNull();
    }

    /**
     * {@link org.mockito.Mockito#isNull(Class)}
     */
    public <T> T isNull(Class<T> clazz)
    {
        return Mockito.isNull(clazz);
    }

    /**
     * {@link org.mockito.Mockito#longThat(org.hamcrest.Matcher)}
     */
    public long longThat(org.hamcrest.Matcher<Long> matcher)
    {
        return Mockito.longThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#matches(String)}
     */
    public String matches(String regex)
    {
        return Mockito.matches(regex);
    }

    /**
     * {@link org.mockito.Mockito#notNull()}
     */
    public Object notNull()
    {
        return Mockito.notNull();
    }

    /**
     * {@link org.mockito.Mockito#refEq(Object, String...)}
     */
    public <T> T refEq(T value, String... excludeFields)
    {
        return Mockito.refEq(value, excludeFields);
    }

    /**
     * {@link org.mockito.Mockito#same(Object)}
     */
    public <T> T same(T value)
    {
        return Mockito.same(value);
    }

    /**
     * {@link org.mockito.Mockito#shortThat(org.hamcrest.Matcher)}
     */
    public short shortThat(org.hamcrest.Matcher<Short> matcher)
    {
        return Mockito.shortThat(matcher);
    }

    /**
     * {@link org.mockito.Mockito#startsWith(String)}
     */
    public String startsWith(String prefix)
    {
        return Mockito.startsWith(prefix);
    }
}
