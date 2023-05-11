public class main {
    public static void main(String[] args) {

        int onAccount = 100;
        int deposit = 1600;

        int bonus = deposit / 100;
        int withBonus = bonus + onAccount + deposit;
        int noBonus = onAccount + deposit;

        if (deposit >= 1000) {
            System.out.println("На счету: " + withBonus );
        } else {
            System.out.println("На счету: " + noBonus);
        }
    }
}
