# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.

### User stories
As a user, I want to be able to write notes for each contact, so I can know how I know them.
As a user, I can sort the contacts by when I first met them, so I can know who I've been friends with the longest.
As a user, I can add their social media handles so I can find them online.

### Use cases
System: Address Book
Use Case: UC1 - Rename Existing Tag
Actor: User
MSS:
1. User requests to rename tag
2. Address Book asks which tag user would like to rename
3. User enters tag he would like to rename
4. Address Book shows a list of users with those tags and asks what user would like to rename tag to
5. User enters his desired tag
6. Address Book requests for confirmation, to change from <old tag> to <new tag>
7. User confirms rename.
8. Address Book renames all contacts with the old tag to new tag, and displays to user a list of contacts with their tags changed.
	Use case ends.
Extensions: 
3a. Address Book detects no such tag exists.
3a1. Address Book shows a list of existing tags and requests for tag to be renamed
3a2. User enters new tag to be renamed.
Steps 3a1-3a2 repeated until user enters a tag that exists
Use Case resumes from Step 4.

*a. At any time, user chooses to cancel rename
*a1. Address Book requests to confirm cancellation
*a2. User confirms cancellation
Use Case ends.

### Non-functional requirements
Technical requirements: Address Book should work on both 32-bit & 64-bit environments
Performance requirements: Address Book should be ready to use within two seconds.
Quality requirements: Address Book should be intuitive and usable by a novice
