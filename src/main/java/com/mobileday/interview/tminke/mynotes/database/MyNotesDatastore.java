
package com.mobileday.interview.tminke.mynotes.database;

import java.util.List;

import com.mobileday.interview.tminke.mynotes.model.Note;

/**
 * MyNotes Datastore API
 */
public interface MyNotesDatastore
{
    /**
     * Get The Specified User's Notes
     * 
     * @param user The user who's notes are being requested.
     * @param The specified user's List of Notes.
     */
    List<Note> getUserNotes(String user);

    /**
     * Add A Note To The Specified User
     * 
     * @param user The user to add the specified note to.
     * @param note The specific Note to add to the user.
     * @param The specified user's updated List of Notes.
     */
    List<Note> addUserNote(String user, Note note);

    /**
     * Update The Specified Note For User
     * 
     * @param user The user to update the specified note on.
     * @param note The specific Note to update on the user.
     * @param The specified user's updated List of Notes.
     */
    List<Note> updateUserNote(String user, Note note);

    /**
     * Remove The Specified Note From User
     * 
     * @param user The user to remove the specified note from.
     * @param note The specific Note to remove from the user.
     * @param The specified user's updated List of Notes.
     */
    List<Note> removeUserNote(String user, Note note);

}
