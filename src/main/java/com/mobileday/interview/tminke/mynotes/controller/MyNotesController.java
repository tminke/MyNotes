
package com.mobileday.interview.tminke.mynotes.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mobileday.interview.tminke.mynotes.database.MyNotesDatastore;
import com.mobileday.interview.tminke.mynotes.model.Note;

@Controller
public class MyNotesController
{
    // Constants
    protected static final String MYNOTES_JSP = "mynotes";
    protected static final String USER_VAR_JSP = "user";
    protected static final String NOTES_VAR_JSP = "notes";

    // Private Logger Instance
    private static final Log log = LogFactory.getLog(MyNotesController.class);

    @Autowired
    private MyNotesDatastore myNotesDatastore;

    //
    // Public REST Endpoints
    //

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public String getNotes(@PathVariable String user, ModelMap modelMap)
    {
        log.debug("getNotes(" + user + ") Called");

        List<Note> notes = myNotesDatastore.getUserNotes(user);

        updateModelMap(user, notes, modelMap);

        return MYNOTES_JSP;
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.PUT)
    public String addNote(@PathVariable String user, @RequestParam("content") String content, ModelMap modelMap)
    {
        log.debug("addNote(" + user + ") Called With Content \"" + content + "\"");

        List<Note> notes = myNotesDatastore.addUserNote(user, new Note(content));

        updateModelMap(user, notes, modelMap);

        return MYNOTES_JSP;
    }

    // TODO - In Progress...
    // @RequestMapping(value = "/{user}/{id}", method = RequestMethod.POST)
    // public String updateNote(@PathVariable String user, @PathVariable long id, ModelMap modelMap)
    // {
    //
    // log.debug("updateNote(" + user + ", " + id + ") Called");
    //
    // List<Note> notes = myNotesDatastore.updateUserNote(user, note);
    //
    // List<Note> notes = myNotesDatastore.getUserNotes(user);
    //
    // modelMap.addAttribute(USER_VAR_JSP, user);
    // modelMap.addAttribute(NOTES_VAR_JSP, notes);
    //
    // return MYNOTES_JSP;
    // }

    @RequestMapping(value = "/{user}/{id}", method = RequestMethod.DELETE)
    public String removeNote(@PathVariable String user, @PathVariable long id, ModelMap modelMap)
    {
        log.debug("removeNote(" + user + ", " + id + ") Called");

        List<Note> notes = myNotesDatastore.removeUserNote(user, new Note(id));

        updateModelMap(user, notes, modelMap);

        return MYNOTES_JSP;
    }

    //
    // Private Utility Methods
    //

    /**
     * Initialize A Sample User "Bob" With Some Dummy Notes
     */
    @PostConstruct
    private void init()
    {
        final String DEFAULT_USER = "Bob";
        myNotesDatastore.addUserNote(DEFAULT_USER, new Note("Pick up groceries from store (use bag)."));
        myNotesDatastore.addUserNote(DEFAULT_USER, new Note("Pick up car from dealer (use forklift)."));
        myNotesDatastore.addUserNote(DEFAULT_USER, new Note("Pick up kids from daycare (use hands)."));
        myNotesDatastore.addUserNote(DEFAULT_USER, new Note("Pick up sticks from floor (use caution)."));
    }

    /**
     * Update The ModelMap With Specified Data
     */
    private void updateModelMap(String user, List<Note> notes, ModelMap modelMap)
    {
        modelMap.addAttribute(USER_VAR_JSP, user);
        modelMap.addAttribute(NOTES_VAR_JSP, notes);
    }

}
