import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        StringChecker minLen5Checker = new StringChecker() {
            public boolean checkString(String s){return s.length()>=5;}
        };
        List<String> input1 = new ArrayList<>();
        input1.add("Hi");
        input1.add("Hello");
        input1.add("Good Day");
        assertArrayEquals(new String[] {"Hello","Good Day"}, ListExamples.filter(input1,minLen5Checker).toArray());
    }

    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");

        assertArrayEquals(new String[] {"a","b","c","d"}, ListExamples.merge(list1,list2).toArray());
    }
}
