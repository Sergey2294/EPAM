public class Part4 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        while (y != 0) {
            int number = x % y;
            x = y;
            y = number;
        }
        System.out.print(x);
    }

}
