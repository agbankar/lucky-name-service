package com.ashish.model;

import java.io.Serializable;

public class LuckyResponse implements Serializable {
    private static final long serialVersionUID = 5L;
   private String output;
    private String suggestions;

    public LuckyResponse ( String output, String suggestions ) {
        this.output = output;
        this.suggestions = suggestions;
    }

    public String getOutput () {
        return output;
    }

    public void setOutput ( String output ) {
        this.output = output;
    }

    public String getSuggestions () {
        return suggestions;
    }

    public void setSuggestions ( String suggestions ) {
        this.suggestions = suggestions;
    }


}
