package com.clarion.exception;

import java.io.Serializable;
import java.util.List;

public class AppExceptionResponse implements Serializable {

    private String message;
    private List<String> details;

    public AppExceptionResponse ( String message, List<String> details ) {
        this.message = message;
        this.details = details;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }

    public List<String> getDetails () {
        return details;
    }

    public void setDetails ( List<String> details ) {
        this.details = details;
    }
}


