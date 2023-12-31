package com.myblog.Payload;


import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}

//
//import java.util.Date;
//
//public class ErrorDetails {
//    private Date timeStamp;
//    private String message;
//    private String details;
//
//    public ErrorDetails(Date timeStamp, String message, String details) {
//        this.timeStamp = timeStamp;
//        this.message = message;
//        this.details = details;
//    }
//
//    public Date getTimeStamp() {
//        return timeStamp;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public String getDetails() {
//        return details;
//    }
//}
