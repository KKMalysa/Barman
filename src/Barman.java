import java.util.Scanner;

/**
 * Zdefiniuj klasę Barman, która posiada metodę createDrink która tworzy drinka z dowolną ilością składników podanych przez użytkownika.
 * W wyniku metoda powinna zwracać obiekt typu Drink z informacjami o składnikach danego drinka.
 * Każdy składnik w klasie Drink powinien być reprezentowany przez klasę Ingredient, która przechowuje nazwę oraz ilość danego składnika.
 * Dane wczytaj od użytkownika korzystającego z aplikacji.
 *
 * Klasa Barman powinna także posiadać metodę printDrink, która przyjmuje jako parametr obiekt typu Drink i wyświetla o nim informacje.
 */
public class Barman {

    public static void main(String[] args) {
        Drink drink = createDrink();
        Barman.printDrink(drink);
    }

    private static Scanner scan = new Scanner(System.in);

    public static Drink createDrink(){
        System.out.println("podaj ilość składników");
        int ingredientsNumber = scan.nextInt();
        scan.nextLine();

        Ingredient[] ingredients = new Ingredient[ingredientsNumber];
        for(int i=0; i<ingredientsNumber; i++){
            ingredients[i] = createIngreient();
        }

        return new Drink(ingredients);
    }

    private static Ingredient createIngreient(){
        System.out.println("Podaj nazwę składnika");
        String ingredientName = scan.nextLine();
        System.out.println("podaj ilość skladnika");
        double ingredientAmount = scan.nextDouble();
        scan.nextLine();

        return new Ingredient(ingredientName, ingredientAmount);
    }

    public static void printDrink (Drink drink) {
        Ingredient[] ingredients = drink.getIngridients();
        System.out.printf("Drink składa się z %d składników:\n", ingredients.length);
        for(Ingredient ingredient:ingredients){
            System.out.printf(" -%s (%.0f ml)\n", ingredient.getIngridientName(), ingredient.getAmount());
        }
    }

}
