class NullPointerDemo {
    public static void generateException() {
        String text = null;
        // This will throw a NullPointerException
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot invoke a method on a null string reference.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating handled exception:");
        handleException();
        
        // Uncomment the line below to see the unhandled runtime exception crash the program
        // generateException(); 
    }
}
