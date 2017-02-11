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
        assertFalse(tester.isSimilar(null));
        assertTrue(tester.isSimilar(new Name("John K Smith")));
        assertFalse(tester.isSimilar(new Name("John K Smiths")));
        assertTrue(tester.isSimilar(new Name("john k smith")));
    }

}
