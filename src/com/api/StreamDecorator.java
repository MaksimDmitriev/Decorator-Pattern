package com.api;

public class StreamDecorator extends Stream {

    private Stream stream;

    StreamDecorator(Stream stream) {
        this.stream = stream;
    }

    @Override
    void handleBufferFull() {
        stream.handleBufferFull();
    }
}
