package constructer;


//@Data // lombk사용시
//@Builder(builderMethodName = "hiddenBuilder") //lombok 사용시
public class NutritionFacts {
    private final int servingSize;
    private final int servings;

    //@Builder.Default //lombok사용시
    private final int calories;
    //@Builder.Default //lombok사용시
    private final int fat;
    //@Builder.Default //lombok사용시
    private final int solium;
    //@Builder.Default //lombok사용시
    private final int carbohydrate;

    //lombok 사용시
//    public static NutritionFactsBuilder builder(int servingSize, int servings) {
//        return hiddenBuilder()
//                .servingSize(servingSize)
//                .servings(servings);
//    }

    public NutritionFacts(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.solium = builder.solium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder{
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int solium = 0;
        private int carbohydrate = 0;
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder solium(int val){
            solium = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
