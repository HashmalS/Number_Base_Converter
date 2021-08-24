import java.util.*;
import java.nio.charset.StandardCharsets;

class AsciiCharSequence implements CharSequence /* extends/implements */ {
    // implementation
    private final byte[] sequence;

    public AsciiCharSequence(byte[] array) {
        this.sequence = array;
    }

    @Override
    public String toString() {
        return new String(sequence, StandardCharsets.US_ASCII);
    }

    public char charAt(int index) {
        return (char) sequence[index];
    }

    public int length() {
        return this.sequence.length;
    }

    public AsciiCharSequence subSequence(int start, int end) {
        byte[] newSequence = new byte[end - start];
        for (int i = 0; i < newSequence.length; i++) {
            newSequence[i] = this.sequence[start + i];
        }
        return new AsciiCharSequence(newSequence);
    }
}
