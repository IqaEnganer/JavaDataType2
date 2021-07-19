public class Main {
    public static void main(String[] args) {
         int balance = 2000;
         int Adding = 80000;
         int mel = 100;
        int basicbalance;
        int bbalance;
         if (Adding > 1000)
         {
              bbalance = Adding / mel;
              basicbalance = bbalance + Adding + balance;
         }
         else {
              basicbalance = Adding + balance;
         }

        System.out.println(basicbalance);

    }
}