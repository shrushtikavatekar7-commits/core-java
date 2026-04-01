class NutritionTable {

    private int foodId;
    private String foodName;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;
    private String category;

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getFoodId() {
        return this.foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProtein() {
        return this.protein;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFat() {
        return this.fat;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getCarbs() {
        return this.carbs;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}