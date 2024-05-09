/**
 * The prototype for all animals that can be cloned.
 * This interface requires implementing objects to support cloning with the makeCopy function
 */

public interface Animal extends Cloneable {
    /**
     * Creates copy of this Animal instance
     * @return a clone of this Animal instance
     */
    Animal makeCopy();
}