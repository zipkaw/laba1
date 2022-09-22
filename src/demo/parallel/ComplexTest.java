package demo.parallel;

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
}