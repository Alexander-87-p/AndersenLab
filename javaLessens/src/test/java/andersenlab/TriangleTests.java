package andersenlab;

import andersenlab.lesson12.AreaOfTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTests {
    @Test
    void areaOfTriangleIsNaN() {
        assertEquals(Double.NaN, AreaOfTriangle.findAreaOfTriangle());
    }
}