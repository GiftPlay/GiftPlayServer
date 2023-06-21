package com.unibta.PMIII.models;

import java.util.Calendar;
import java.util.Date;

public class Error {
    private String description;
    private int statusCode;

    private String statusCodeDescription;
    private Calendar requestDateTime;

    public Error() {
    }

    public Error(String description, int statusCode, String statusCodeDescription) {
        this.description = description;
        this.statusCode = statusCode;
        this.statusCodeDescription = statusCodeDescription;
        this.requestDateTime = Calendar.getInstance();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCodeDescription() {
        return statusCodeDescription;
    }

    public void setStatusCodeDescription(String statusCodeDescription) {
        this.statusCodeDescription = statusCodeDescription;
    }

    public Calendar getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Calendar requestDateTime) {
        this.requestDateTime = requestDateTime;
    }
}
