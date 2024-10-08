import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeBook {
    private List<Recipe>recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>(); // Initialize with an empty list
    }
    public RecipeBook(List<Recipe> recipes){
        this.recipes=new ArrayList<>(recipes);
    }
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }
    public boolean deleteRecipe(String name) {
        return recipes.removeIf(recipe -> recipe.getName().equalsIgnoreCase(name));
    }
    public Recipe searchByName(String name){
        for (Recipe recipe: recipes){
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }
        return null;
        }
        public List<Recipe> searchByCategory(String category){
            return recipes.stream()
                    .filter(recipe -> recipe.getCategory().equalsIgnoreCase(category))
                    .collect(Collectors.toList());
        }
        public void displayAllRecipes() {
            if (recipes.isEmpty()) {
                System.out.println("No recipes available.");
            } else {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
        }
    }
