import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

    sort t = new sort(new comparate());

    @Test
    void bubbleSort() {
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        t.BubbleSort(disordered_array);
        assertArrayEquals(ordered_array, disordered_array);
    }

    @Test
    void quickSort() {
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        t.quickSort(disordered_array, 0, disordered_array.length-1);
        assertArrayEquals(ordered_array, disordered_array);


    }

    @Test
    void radix() {
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        disordered_array = t.radix(disordered_array);
        assertArrayEquals(ordered_array, disordered_array);

    }

    @Test
    void merge() { // En realidad evalua el método mergeSort, pero es merge.
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        //assertEquals(5, t.mergeSort(disordered_array)[4]);
        disordered_array = t.mergeSort(disordered_array);
        assertArrayEquals(ordered_array, disordered_array);
    }

    @Test
    void gnomeSort() {
        int [] disordered_array = {9,8,7,6,5,4,3,2,1,10,11,12,13,100,1000};
        int [] ordered_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,100,1000};
        t.gnomeSort(disordered_array, disordered_array.length);
        assertArrayEquals(ordered_array, disordered_array);
    }
}