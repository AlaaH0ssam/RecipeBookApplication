public class Ingredient {
    private String name;
    private float quantity;
    private String unit;

    public Ingredient(String name, float quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
    //getter methods
    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }
    public float getquantity() {
        return quantity;
    }
    //setter methods
    public void setName(String name) {
        this.name =name;
    }
    public void setUnit(String UNIT) {
        this.unit = UNIT;
    }
    public void setquantity(float quantity) {
        this.quantity = quantity;
    }
    public String toString() {
    return quantity+" "+unit+" of "+name;
    }

}
