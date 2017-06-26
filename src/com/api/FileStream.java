package com.api;

public class FileStream extends Stream {

    public FileStream(String name) {}

    @Override
    void handleBufferFull() {
        System.out.println("Write to a file");
    }
}
