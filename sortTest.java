import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

    sort t = new sort(new comparate());
    int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
    // Para referencia:
    //int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};

    @Test
    void bubbleSort() {

    }

    @Test
    void quickSort() {
    }

    @Test
    void radix() {
        assertEquals(4, t.radix(disordered_array)[3]);
    }

    @Test
    void mergeSort() {
    }

    @Test
    void merge() {
        assertEquals(5, t.mergeSort(disordered_array)[4]);
    }

    @Test
    void gnomeSort() {
    }
}