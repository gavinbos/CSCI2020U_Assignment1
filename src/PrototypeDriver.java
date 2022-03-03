/**
 * 03/01/2022
 * CSCI2020U
 * @author Gavin Bosman - 100781902
 * @author Mekael Wasti - 100780179
 *
 * This file demonstrates the basic implementation of the prototype design structure using an abstract Food class.
 *
 * The prototype design structure allows the user to save memory taken up by the creation of many similar objects
 * within large scale programs. Through implementing Java's provided Cloneable interface, we can take advantage of
 * Java's bitwise clone function, which allows you to make a bitwise copy of an object. Several 'Prototype' objects are
 * stored in a cache system (utilizing a map or hash table) which the user can then call upon to make copies of the
 * prototype objects, rather than creating entirely new ones each time.
*/

/**
 * Prototype acts as a driver class (contains the main method)
 */
public class PrototypeDriver {
    public static void main (String[] args) {

        // Cache class contains existing prototypes of food objects.
        // getFood method allows for the return of a clone of the specified object
        // (including the prototype objects state)

        // In the case where you need to have many similar objects with slight variation
        // (but where the majority of the values remain the same) cloning a prototype allows
        // for a new object with all of those similar values already filled in.

        // food_clone is created by cloning the Burger prototype (from the cache).
        // This means that food_clone will be initialized to the same state (same values) as the prototype
        // By modifying food_clone's foodSize we now have a new unique object.
        Food food_clone = Cache.getFood("Burger");
        food_clone.setFoodSize("big");
        food_clone.foodType();

        // Repeatedly creating new objects that are so similar would quickly become redundant
        // and waste time and memory space.
        Food food_new = new Burger("big");
        food_new.foodType();
    }
}