package com.api;

public class Ascii7Stream extends StreamDecorator {

    public Ascii7Stream(Stream stream) {
        super(stream);
    }

    @Override
    void handleBufferFull() {
        System.out.println("Reduce the stream data to 7-bit ASCII characters");
        super.handleBufferFull();
    }
}
