package com.terrapay.demoproject.LibraryManagementSystem.error;

public class TextBookNotFoundException  extends Exception

{

    public TextBookNotFoundException()

    {

        super();
    }

    public TextBookNotFoundException(String message)

    {

        super(message);
    }

    public TextBookNotFoundException(String message, Throwable cause)

    {

        super(message,cause);
    }

    public TextBookNotFoundException(Throwable cause)

    {

        super(cause);
    }

    protected TextBookNotFoundException(String message, Throwable cause,boolean enableSuppression, boolean writableStackTrace)

    {

        super(message,cause,enableSuppression,writableStackTrace);
    }






}
