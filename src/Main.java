public class Main {
    public static void main(String[] args) {
         int amount = 2000;
         int adding = 50;
         int mel = 100;
         int bonusbalance;
         if (adding > 1000)
         {
             bonusbalance = adding / mel;
             System.out.println(bonusbalance);
         }
         else {
             bonusbalance = 0 ;

         }
        int balance = bonusbalance + amount + adding ;
        System.out.println(balance);


    }
}
