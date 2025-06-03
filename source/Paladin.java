public class Paladin extends Knight {
    public Paladin(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isFibonacci(super.getBaseHp())) {
            return 1000 + Utility.getFibonacciIndex(super.getBaseHp());
        };
        return super.getBaseHp() * 3.0;
    }
}