class HotDog extends Food {
    /**
     * Constructor for HotDog class
     */
    public HotDog(String s) {
        this.foodName = "HotDog";
        this.foodSize = s;
    }

    @Override
    void foodType() {
        System.out.println("This is a " + this.foodSize + " HotDog!");
    }
}
