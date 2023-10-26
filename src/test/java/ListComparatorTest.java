import org.example.ListComparator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListComparatorTest {

    @Test
    public void testCompareLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        ListComparator comparator = new ListComparator();
        assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsWithEmptyList() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();
        ListComparator comparator = new ListComparator();
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsWithNull() {
        List<Integer> list1 = null;
        List<Integer> list2 = null;
        ListComparator comparator = new ListComparator();
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsWithSameAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        ListComparator comparator = new ListComparator();
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }
}
