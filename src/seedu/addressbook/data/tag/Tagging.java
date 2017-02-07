package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Association class (person and tag) that represents an edit-tag operation that will be printed after a session
 *
 */
public class Tagging {
    private Person person;
    private Tag tag;
    private String edit;
    
    public Tagging(Person person, Tag tag, String edit) {
	this.person = person;
	this.tag = tag;
	this.edit = edit;
    }
    
    public String toString() {
	return edit + person.toString() + tag.toString();
    }
    
}
