import java.lang.Cloneable;

abstract class Food implements Cloneable {
    // Having our Food class implement the Cloneable interface ensures that all Food
    // objects can be cloned

    protected String foodName;
    protected String foodSize;

    abstract void foodType();

    public void setFoodSize(String f){this.foodSize = f;}

    /**
     * Clone is overridden from the Object class (the hierarchical superclass of all objects in Java).
     * The method throws an exception if an object cannot be cloned for any reason.
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
