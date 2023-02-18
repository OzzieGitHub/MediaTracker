/******
 *     License information: GNU General Public License v3.0
 *     What the piece of code does.
 *     Author: Chris Oswald
 *     Related code:
 *          UserInterface.java
 *          Food.java
 *          Pizza.java (implements Food.java)
 *     Sample wire representations of data structures.
 *     TODOs.
 ******/


public interface Media {
    public void setTitle();
    public void setYear();
    public void setOwned();
    public void setPhysicalOrDigital();
    public void getTitle();
    public void getYear();
    public void getOwned();
    public void getPhysicalOrDigital();
    public void getRandom();
    public void lookupTitle();
    public void lookupByMediaType();
    public void save();

}
