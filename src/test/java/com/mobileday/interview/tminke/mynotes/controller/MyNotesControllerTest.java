
package com.mobileday.interview.tminke.mynotes.controller;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;

import com.mobileday.interview.tminke.mynotes.database.MyNotesDatastore;
import com.mobileday.interview.tminke.mynotes.model.Note;
import com.mobileday.interview.tminke.mynotes.test.MockitoTest;

/**
 * MyNotesController Unit Test
 */
public class MyNotesControllerTest extends MockitoTest
{
    // Private Test Data
    private static final String USER = "TestUser";
    private static final long NOTE_ID = 99L;
    private static final String NOTE_CONTENT = "TestNoteContent";
    private List<Note> TEST_NOTES = null;

    @Mock
    private ModelMap mockModelMap;

    @Mock
    private MyNotesDatastore mockMyNotesDataStore;

    @InjectMocks
    private MyNotesController myNotesController;

    /**
     * Pre-Test Initialization
     */
    @Before
    public void initializeTest()
    {
        Note testNote1 = new Note("TestNote1");
        Note testNote2 = new Note("TestNote2");
        Note testNote3 = new Note("TestNote3");
        TEST_NOTES = Arrays.asList(new Note[] { testNote1, testNote2, testNote3 });
    }

    /**
     * Test The getNotes() Method
     */
    @Test
    public void testGetNotes() throws Exception
    {
        // Define Mock Behavior
        when(mockMyNotesDataStore.getUserNotes(USER)).thenReturn(TEST_NOTES);

        // Perform The Test
        String result = myNotesController.getNotes(USER, mockModelMap);

        // Verify Results
        verifyCommonJspBehavior(result, TEST_NOTES);
    }

    /**
     * Test The addNote() Method
     */
    @Test
    public void testAddNote() throws Exception
    {
        // Define Mock Behavior
        MatchesNoteContent matchesNoteContent = new MatchesNoteContent(NOTE_CONTENT);
        when(mockMyNotesDataStore.addUserNote(eq(USER), argThat(matchesNoteContent))).thenReturn(TEST_NOTES);

        // Perform The Test
        String result = myNotesController.addNote(USER, NOTE_CONTENT, mockModelMap);

        // Verify Results
        verifyCommonJspBehavior(result, TEST_NOTES);
    }

    /**
     * Test The removeNote() Method
     */
    @Test
    public void testRemoveNote() throws Exception
    {
        // Define Mock Behavior
        MatchesNoteId matchesNoteId = new MatchesNoteId(NOTE_ID);
        when(mockMyNotesDataStore.removeUserNote(eq(USER), argThat(matchesNoteId))).thenReturn(TEST_NOTES);

        // Perform The Test
        String result = myNotesController.removeNote(USER, NOTE_ID, mockModelMap);

        // Verify Results
        verifyCommonJspBehavior(result, TEST_NOTES);
    }

    //
    // Private Utility Methods
    //

    /**
     * Verify JSP Behavior Common To All Tests
     */
    private void verifyCommonJspBehavior(String result, List<Note> notes)
    {
        assertNotNull("Null Result", result);
        assertEquals("", MyNotesController.MYNOTES_JSP, result);
        verify(mockModelMap).addAttribute(MyNotesController.USER_VAR_JSP, USER);
        verify(mockModelMap).addAttribute(MyNotesController.NOTES_VAR_JSP, notes);
    }

    //
    // Custom Matcher Classes
    //

    /**
     * Note.Content ArgumentMatcher Implementation
     */
    private class MatchesNoteContent extends ArgumentMatcher<Note>
    {
        // Private Data Members
        private String content = null;

        /**
         * Default Initialization Constructor
         */
        public MatchesNoteContent(String content)
        {
            this.content = content;
        }

        /**
         * matches() Implementation - Perform The Comparison
         */
        @Override
        public boolean matches(Object argument)
        {
            return ((argument instanceof Note) && (content.equals(((Note) argument).getContent())));
        }
    }

    /**
     * Note.Id ArgumentMatcher Implementation
     */
    private class MatchesNoteId extends ArgumentMatcher<Note>
    {
        // Private Data Members
        private long id = 0L;

        /**
         * Default Initialization Constructor
         */
        public MatchesNoteId(long id)
        {
            this.id = id;
        }

        /**
         * matches() Implementation - Perform The Comparison
         */
        @Override
        public boolean matches(Object argument)
        {
            return ((argument instanceof Note) && (id == ((Note) argument).getId()));
        }
    }

}
