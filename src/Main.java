public class Main {
    public static void main(String[] args) {
         int amount = 2000;
         int adding = 555220;
         int mel = 100;
         int bonusBalance;
         if (adding > 1000)
         {
             bonusBalance = adding / mel;
             System.out.println(bonusBalance);
         }
         else {
             bonusBalance = 0 ;

         }
        int balance = bonusBalance + amount + adding ;
        System.out.println(balance);


    }
}
