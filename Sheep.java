/**
 * Concrete implementation of Animal interface for Sheep.
 * This class provides cloning function for Sheep
 */
public class Sheep implements Animal {
    /**
     * constructor for Sheep that prints out creation message
     */
    public Sheep() {
        System.out.println("Initial sheep is made, she's called sally.");
    }

    /**
     * Creates copy of this Sheep instance
     * @return a clone of this Sheep instance
     */
    @Override
    public Animal makeCopy() {
        System.out.println("Sally's DNA is being cloned.");
        Sheep sheepObject = null;

        try {
            // Calls object clone method + cast result to Sheep
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }
    
    /**
     * returns string representation of the Sheep
     * @return a string rep. of the Sheep
     */
    @Override
    public String toString() {
        return "this is a sheep";
    }
}
