package org.apache.velocity.app.event.implement;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Escape all HTML entities.
 * @see <a href="http://jakarta.apache.org/commons/lang/api/org/apache/commons/lang/StringEscapeUtils.html#escapeHtml(java.lang.String)">StringEscapeUtils</a>
 * @author wglass
 */
public class EscapeHtmlReference extends EscapeReference
{

    /**
     * Escape all HTML entities.  
     * @param text 
     * @return An escaped String.
     * @see <a href="http://jakarta.apache.org/commons/lang/api/org/apache/commons/lang/StringEscapeUtils.html#escapeHtml(java.lang.String)">StringEscapeUtils</a>
     */
    protected String escape(Object text)
    {
        return StringEscapeUtils.escapeHtml(text.toString());
    }

    /**
     * @return attribute "eventhandler.escape.html.match"
     */
    protected String getMatchAttribute()
    {
        return "eventhandler.escape.html.match";
    }

}
