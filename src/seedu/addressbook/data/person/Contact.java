package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * 
 * Represents contact information of a person
 *
 */
public class Contact {

    private final String value;
    private boolean isPrivate;

    public Contact(String value, boolean isPrivate, String messageConstraints, String validationRegex)
	           throws IllegalValueException {
	String trimmedValue = value.trim();
	this.isPrivate = isPrivate;
	if (!isValidValue(trimmedValue, validationRegex)) {
	    throw new IllegalValueException(messageConstraints);
	}
	this.value = trimmedValue;
    }
    
    /**
     * Returns true if a given string is valid contact information.
     */
    private static boolean isValidValue(String test, String validationRegex) {
	return test.matches(validationRegex);
    }
    
    public String toString() {
        return value;
    }
    
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
