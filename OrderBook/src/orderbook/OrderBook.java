/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderbook;

/**
 *
 * @author admin
 */

class OrderBookSample {

    static String authorname = "Greedy";
    final static int price = 5000;
    final static int due = 10;
    public static int month;
    static int paidamt;
    static int balanceamt;

    static class InstallmentPayment {

        public static void payment(int n) {
            System.out.println("Price of book is:" + price);
            System.out.println("due month:" + due);
            int eachmonthdue = price / due;
            if (due <= 10) {
                for (month = 1; month < n; month++) {
                    paidamt = eachmonthdue * month;
                    balanceamt = price - paidamt;
                }
                System.out.println("Paid amt till" + n + "month is" + paidamt + "balance amt to be paid is" + balanceamt);
            }
        }

        void display() {
            System.out.println("Auther name of book" + authorname);
            System.out.println("Price of the book" + price);
        }

    }

}
public class OrderBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         OrderBookSample.InstallmentPayment customer1 = new OrderBookSample.InstallmentPayment();
        customer1.display();

        OrderBookSample.InstallmentPayment.payment(5);
    }
    
}
