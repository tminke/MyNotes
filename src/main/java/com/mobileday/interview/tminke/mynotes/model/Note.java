
package com.mobileday.interview.tminke.mynotes.model;

import java.util.Date;

/**
 * The "Note" Model Object
 */
public class Note
{
    // Private Member Data
    private long id;
    private String content;
    private Date editDate;

    //
    // Constructors
    //

    /**
     * Content Initialization Constructor
     */
    public Note(String content)
    {
        this.content = content;
        this.editDate = new Date();
    }

    /**
     * ID Initialization Constructor
     */
    public Note(long id)
    {
        this.id = id;
    }

    //
    // Public Accessors
    //

    /**
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent()
    {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content)
    {
        this.content = content;
    }

    /**
     * @return the editDate
     */
    public Date getEditDate()
    {
        return editDate;
    }

    /**
     * @param editDate the editDate to set
     */
    public void setEditDate(Date editDate)
    {
        this.editDate = editDate;
    }

    //
    // Generated HashCode & Equals
    //

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Note other = (Note) obj;
        if(id != other.id)
            return false;
        return true;
    }

}
