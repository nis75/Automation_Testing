package Assignment_2;

public class LocalVariable {
    public static void main(String[] args) {
        //Declaring and initializing a local variable
        int customerID = 101;
        System.out.println("Customer ID: " + customerID);
        printCustomerID();
    }
    public static void printCustomerID() {
        // Declaring a local variable inside the printCustomerID method
        int customerID2 = 201;
        System.out.println("Customer ID: " + customerID2);

    }
}
