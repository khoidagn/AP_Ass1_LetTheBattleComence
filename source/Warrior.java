public class Warrior extends Fighter {
    public Warrior(int baseHP, int WP) {
        super(baseHP, WP);
    }

    @Override
    public double getCombatScore() {
        int ground = Battle.GROUND;
        double score;

        if (Utility.isPrime(ground)) {
            score = super.getBaseHp() * 2.0;
        } else if (super.getWp() == 1) {
            score = super.getBaseHp();
        } else {
            score = super.getBaseHp() / 10.0;
        }

        return Math.min(score, 999); 
    }
}
