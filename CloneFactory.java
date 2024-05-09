/**
 * CloneFactory is used to create clones with a prototype pattern
 * Can clone any type of animal without describing its concrete class.
 */
public class CloneFactory {
    /**
     * clones instance of Animal using makeCopy function
     * @param animalSample the Animal instance to clone
     * @return new instance of Animal that is a clone of animalSample
     */
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
