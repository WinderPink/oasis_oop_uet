import org.junit.Test;
import static org.junit.Assert.*;

public class Week4Test {

    // --- Test max2Int ---
    @Test
    public void testMax2Int1() {
        assertEquals(9, Week4.max2Int(5, 9));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(10, Week4.max2Int(10, 3));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(7, Week4.max2Int(7, 7));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(-1, Week4.max2Int(-5, -1));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(100, Week4.max2Int(100, 50));
    }

    // --- Test minArray ---
    @Test
    public void testMinArray1() {
        assertEquals(-1, Week4.minArray(new int[]{3, -1, 5, 7}));
    }

    @Test
    public void testMinArray2() {
        assertEquals(0, Week4.minArray(new int[]{0, 2, 4, 6}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(-10, Week4.minArray(new int[]{-10, -5, 0, 5}));
    }

    @Test
    public void testMinArray4() {
        assertEquals(1, Week4.minArray(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testMinArray5() {
        assertEquals(2, Week4.minArray(new int[]{9, 2, 7, 3}));
    }

    // --- Test calculateBMI ---
    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.65));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.65));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(68, 1.68));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", Week4.calculateBMI(90, 1.65));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(50, 1.55));
    }
}
