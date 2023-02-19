/******
 *     License information: GNU General Public License v3.0
 *     What the piece of code does.
 *     Author: Chris Oswald
 *     Related code:
 *          UserInterface.java
 *          Media.java
 *          CD.java (extends Media.java)
 *          Movie.java (extends Media.java)
 *          Book.java (extends Media.java)
 *     Sample wire representations of data structures.
 *     TODOs.
 ******/

public class Main {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        UI.menu();
    }
}