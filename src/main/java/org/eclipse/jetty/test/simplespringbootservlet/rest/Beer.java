package org.eclipse.jetty.test.simplespringbootservlet.rest;

public class Beer
{
    private final String content;

    public Beer(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
}
