package com.junewool.springservice.pojo.response;

public class ResponseGreeting {
    private final long id;
    private final String content;

    public ResponseGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
