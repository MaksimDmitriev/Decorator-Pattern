package com.api;

public abstract class Stream {

    public void putInt(int a) {
        handleBufferFull();
    }

    public void putString(String string) {
        // In a real app we would store the data to buffer and call handleBufferFull() when the buffer is full
        handleBufferFull();
    }

    abstract void handleBufferFull();
}
