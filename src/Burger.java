class Burger extends Food {
    /**
     * Constructor for Burger class
     */
    public Burger(String s) {
        this.foodName = "Burger";
        this.foodSize = s;
    }

    @Override
    void foodType() {
        System.out.println("This is a " + this.foodSize + " Burger!");
    }
}
