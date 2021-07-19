public class Main {
    public static void main(String[] args) {
         int amount = 2000;
         int adding = 10000;
         int mel = 100;
        int bonusbalance;
         if (adding > 1000)
         {
             bonusbalance = adding / mel;
             System.out.println(bonusbalance);
         }
         else {
            bonusbalance = adding + amount ;
        }
    int balance = bonusbalance + amount;
         System.out.println(balance);


    }
}