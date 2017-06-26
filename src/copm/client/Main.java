package copm.client;

import com.api.Ascii7Stream;
import com.api.CompressingStream;
import com.api.FileStream;
import com.api.Stream;

class Main {

    public static void main(String[] args) {
        Stream stream = new CompressingStream(new Ascii7Stream(new FileStream("test.txt")));
        stream.putInt(1);
    }
}
