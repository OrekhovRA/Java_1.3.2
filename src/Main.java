public class Main {
    public static void main(String[] args) {
        int check = 100;
        int translation = 1500;
        boolean registered = translation >= 1000;

        int bonus;
        if (registered) {
            bonus = translation / 100;
        } else {
            bonus = 0;
        }
        int balance = check + translation + bonus;

        System.out.println(balance);
        System.out.println(bonus);

    }
}