// Program 5 - Calculate total purchase price

class Problem5 {
    public static void main(String[] args) {

        int unitPrice = 50;   // INR
        int quantity  = 4;    // items

        int totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);
    }
}