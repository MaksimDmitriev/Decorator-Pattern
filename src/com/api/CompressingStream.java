package com.api;

public class CompressingStream extends StreamDecorator {

    public CompressingStream(Stream stream) {
        super(stream);
    }

    @Override
    void handleBufferFull() {
        System.out.println("Compress data");
        super.handleBufferFull();
    }
}
