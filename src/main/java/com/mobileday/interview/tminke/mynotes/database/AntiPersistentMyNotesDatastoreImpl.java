
package com.mobileday.interview.tminke.mynotes.database;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.mobileday.interview.tminke.mynotes.model.Note;

/**
 * A Non-Persistent MyNotesDatastore Implementation
 * 
 * Quick and dirty in-memory only implementation
 */
@Component
public class AntiPersistentMyNotesDatastoreImpl implements MyNotesDatastore
{
    // The Datastore (HashMap of Users --> Notes)
    private Map<String, List<Note>> datastore = new HashMap<String, List<Note>>();

    // The NextId
    private long nextId = 0;

    //
    // Public Implementations
    //

    @Override
    public List<Note> getUserNotes(String user)
    {
        List<Note> notes = null;

        if(StringUtils.isNotBlank(user))
        {
            notes = datastore.get(user.toUpperCase());
        }

        if(notes == null)
        {
            notes = new LinkedList<Note>();
        }

        return notes;
    }

    @Override
    public List<Note> addUserNote(String user, Note note)
    {
        List<Note> notes = getUserNotes(user);

        if(StringUtils.isNotBlank(user) && note != null && StringUtils.isNotBlank(note.getContent()))
        {
            note.setId(getNextId());
            notes.add(note);

            datastore.put(user.toUpperCase(), notes);
        }

        return notes;
    }

    @Override
    public List<Note> updateUserNote(String user, Note note)
    {
        List<Note> notes = getUserNotes(user);

        if(StringUtils.isNotBlank(user) && note != null && StringUtils.isNotBlank(note.getContent()))
        {
            notes.remove(note);
            notes.add(note);

            datastore.put(user.toUpperCase(), notes);
        }

        return notes;
    }

    @Override
    public List<Note> removeUserNote(String user, Note note)
    {
        List<Note> notes = getUserNotes(user);

        if(note != null)
        {
            notes.remove(note);
        }

        return notes;
    }

    //
    // Private Utility Methods
    //

    /**
     * Get Next Id And Increment Value
     */
    private synchronized long getNextId()
    {
        return ++nextId;
    }

}
