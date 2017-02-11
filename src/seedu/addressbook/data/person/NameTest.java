package seedu.addressbook.data.person;

import static org.junit.Assert.*;
import org.junit.*;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    private Name tester;
    
    @Before
    public void setup() throws IllegalValueException {
        tester = new Name("John K Smith");
    }
    
    @Test
    public void testIsSimilar() throws IllegalValueException {
        assertFalse(tester.isSimilar(null)); // test for null
        assertTrue(tester.isSimilar(new Name("John K Smith"))); // test equal strings
        assertFalse(tester.isSimilar(new Name("John K Smiths"))); // test not equal strings
        assertTrue(tester.isSimilar(new Name("john k smith"))); // test equal strings (ignore case)
        assertFalse(tester.isSimilar(new Name("John Smith"))); // test subset/superset
        assertTrue(tester.isSimilar(new Name("Smith John K"))); // test same but in different order
        assertTrue(tester.isSimilar(new Name("smith john k"))); // test same in different order (ignoring case)
    }

}
