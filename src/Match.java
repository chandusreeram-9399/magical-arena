public class Match {
    private Player playerA;
    private Player playerB;

    public Match(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
        System.out.println("\n--- Match Begins ---");
        while (playerA.isAlive() && playerB.isAlive()) {
            playTurn();
        }
        declareWinner();
    }

    private void playTurn() {
        Player attacker = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        int attackRoll = Dice.roll();
        int defendRoll = Dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;
        int netDamage = Math.max(0, attackDamage - defendStrength);

        defender.reduceHealth(netDamage);

        // Status for the current turn
        System.out.println(attacker.getName() + " attacks " + defender.getName());
        System.out.println("Attack Roll: " + attackRoll + ", Defend Roll: " + defendRoll);
        System.out.println("Damage Dealt: " + netDamage);
        System.out.println(defender.getName() + "'s health: " + defender.getHealth());
        System.out.println("--------------------");
    }

    private void declareWinner() {
        if (playerA.isAlive()) {
            System.out.println(playerA.getName() + " wins the match!");
        } else {
            System.out.println(playerB.getName() + " wins the match!");
        }
    }
}
