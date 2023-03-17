public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = service.calculate(amount:5_000, registered:true);
        System.out.println(bonus);
    }
}
