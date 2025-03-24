class CommandLineDemo1
{
    public static void main(String args[])
    {
        // Parse the command-line arguments as integers
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        // Declare variables to store results of operations
        int r1, r2, r3, r4;

        // Perform arithmetic operations
        r1 = n1 + n2; // Addition
        r2 = n1 - n2; // Subtraction
        r3 = n1 * n2; // Multiplication
        r4 = n1 / n2; // Division (integer division)

        // Print the results
        System.out.println("Sum: " + r1);
        System.out.println("Difference: " + r2);
        System.out.println("Product: " + r3);
        System.out.println("Quotient: " + r4);
    }
}

