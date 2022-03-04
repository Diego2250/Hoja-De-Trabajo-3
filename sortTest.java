import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

    @Test
    void bubbleSort() {
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        sort t = new sort(new comparate());
        assertEquals(ordered_array, t.BubbleSort(disordered_array));
    }

    @Test
    void quickSort() {
    }

    @Test
    void radix() {
    }

    @Test
    void mergeSort() {
    }

    @Test
    void merge() {
    }

    @Test
    void gnomeSort() {
    }
}