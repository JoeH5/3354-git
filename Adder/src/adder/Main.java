package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            if(args.length == 0)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException ex)
        {
            System.err.println("Not enough arguments were given.");
        } catch (NumberFormatException nfe)
        {
            System.err.println("Invalid characters were entered.");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        return sum;
    }
}
