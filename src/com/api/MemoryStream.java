package com.api;

public class MemoryStream extends Stream {

    @Override
    void handleBufferFull() {
        System.out.println("Write to memory");
    }
}
