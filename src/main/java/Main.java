public class Main {
    public static void main(String[] args) {

        int price = 1020;//стоимостиь билета
        int amount = 20; // количество
        int m = 1; //мили

        int bonus = (price / amount) * m;

        System.out.println(bonus);
    }
}
