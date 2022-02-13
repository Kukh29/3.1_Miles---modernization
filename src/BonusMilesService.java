public class BonusMilesService {
    public int calculate(int cost) {

        int price = 10_000; // сколько стоит 1 билет
        int spend = 20; // 1 миля начисляется за 20 рублей
        return price / spend;
    }
}
