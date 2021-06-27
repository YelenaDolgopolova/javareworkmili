public class Main {
    public static void main(String[] args) {

        float price = 1020f;//стоимостиь билета
        float amount = 20f; // количество
        int m = 1; //мили

        float bonus = (price / amount) * m;

        System.out.println(bonus);
    }
}
