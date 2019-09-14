public class Drink {

       private Ingredient[] ingridients;

        public Drink(Ingredient[] ingredients){
            this.ingridients=ingredients;
        }

        public Ingredient[] getIngridients() {
            return ingridients;
        }

        public void setIngridients(Ingredient[] ingridients) {
            this.ingridients = ingridients;
        }
}
