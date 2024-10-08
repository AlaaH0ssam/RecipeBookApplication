import java.util.List;
import java.util.ArrayList;
public class Recipe {
    private String name ;
    private String instructions;
    private String category;
    private int cookingTime;
    private List<Ingredient> ingredients;

    public Recipe(String Name,String Instructions,String Category,int Cookingtime) {

        this.category = Category;
        this.cookingTime = Cookingtime;
        this.name = Name;
        this.instructions = Instructions;
        this.ingredients = new ArrayList<>(ingredients);
    }
    //getters methods
    public String getName(){
        return name;
    }
    public String getInstructions(){
        return instructions;
    }
    public String getCategory(){
        return category;
    }
    public int getCookingTime(){
        return cookingTime;
    }
    public List<Ingredient> getingredients()
    {
        return ingredients;
    }
    //setter methods

    public void setName(String n){
        this.name=n;
    }
    public void setingredients(List<Ingredient> ing){
        this.ingredients=ing;
    }
    public void setInstructions(String instruction){
        this.instructions=instruction;
    }
    public void setCategory(String categ){
        this.category=categ;
    }
    public void setCookingTime(int Time){
        this.cookingTime=Time;
    }

    //Display method
    public void displayRecipe() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Category: %s\n", category);
        System.out.printf("Cooking Time: %d minutes\n", cookingTime);

        System.out.print("Ingredients: ");
        for (Ingredient ingredient : ingredients) {
            System.out.print(ingredient.toString() + ", ");
        }
        // Remove the last comma and space if there are any ingredients
        if (!ingredients.isEmpty()) {
            System.out.println("\b\b "); // Backspace to remove last comma and space
        } else {
            System.out.println();
        }

        System.out.printf("Instructions: %s\n", instructions);
    }

    public void Addingredients(Ingredient ing){
        ingredients.add(ing);
    }
    public void removeingredients(Ingredient ing){
        ingredients.remove(ing);
    }
    public List<Ingredient> listingredient()
    {
        return new ArrayList<>(ingredients);
    }

}

