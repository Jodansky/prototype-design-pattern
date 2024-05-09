/**
 * demonstrates use of the prototype pattern in cloning objects.
 * This class tests cloning functionality using CloneFactory and Sheep.
 */
public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println("Even though Sally and her clone look the same, they are different sheep.");
        System.out.println("Here are their hash codes so you can see for yourself:");
        System.out.println(System.identityHashCode(System.identityHashCode(sally)));
        System.out.println(System.identityHashCode(System.identityHashCode(clonedSheep)));

        // Testing cloning for Cow
        Cow frank = new Cow();
        Cow clonedCow = (Cow) animalMaker.getClone(frank);
        
        System.out.println("Even though Frank and his clone look the same, they are different cows.");
        System.out.println("Here are their hash codes so you can see for yourself:");
        System.out.println(System.identityHashCode(frank));
        System.out.println(System.identityHashCode(clonedCow));

        System.out.println("\nDespite having 2 different types of animals, I didn't have to specify which I was cloning, " +
                           " the cloning process works for any animal type given to the CloneFactory.");
    }
}
