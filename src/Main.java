public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;                     // Цена билета
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}