public class Part3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(' ');
        }
        System.out.print((sb.toString().trim()));
    }
}
