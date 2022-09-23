package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        assertNotEquals(new Complex(3, 3), a.plus(b));
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        assertNotEquals(new Complex(3, 3), a.minus(b));
    }

    @Test
    void multiple() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(-1, 1);
        assertNotEquals(new Complex(-5, -1), a.multiple(b));
    }
}