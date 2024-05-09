/**
 * Concrete implementation of Animal interface for Cows
 * This class provides a cloning function for Cows
 */
public class Cow implements Animal {
    /**
     * Constructor for Cow that prints out a creation message.
     */
    public Cow() {
        System.out.println("Initial cow is made, he's called Frank.");
    }

    /**
     * creates a copy of this Cow instance.
     * @return a clone of this Cow instance
     */
    @Override
    public Animal makeCopy() {
        System.out.println("Frank's DNA is being cloned.");
        Cow cowObject = null;

        try {
            // calls object clone method and casts result to Cow
            cowObject = (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cowObject;
    }

    /**
     * returns string representation of the Cow
     * @return a string representation of the Cow
     */
    @Override
    public String toString() {
        return "this is a cow";
    }
}
