public class Part7 {

    public static void main(String[] args) {

        System.out.println(int2str(1) + "==>" + str2int("A") + "==>" + rightColumn("A"));
        System.out.println(int2str(2) + "==>" + str2int("B") + "==>" + rightColumn("B"));
        System.out.println(int2str(26) + "==>" + str2int("Z") + "==>" + rightColumn("Z"));
        System.out.println(int2str(27) + "==>" + str2int("AA") + "==>" + rightColumn("AA"));
        System.out.println(int2str(52) + "==>" + str2int("AZ") + "==>" + rightColumn("AZ"));
        System.out.println(int2str(53) + "==>" + str2int("BA") + "==>" + rightColumn("BA"));
        System.out.println(int2str(702) + "==>" + str2int("ZZ") + "==>" + rightColumn("ZZ"));
        System.out.println(int2str(703) + "==>" + str2int("AAA") + "==>" + rightColumn("AAA"));
        }

    public static int str2int(String name){
        int number = 0;
        for(int i = 0; i < name.length(); i++){
            number = number * 26 + (name.charAt(i) - ('A' - 1));
        }
        return  number;
    }

    public static String int2str(int number){
        StringBuilder sb = new StringBuilder();
        while (number --> 0){
            sb.append((char) ('A' + (number % 26)));
            number /= 26;
        }
        return sb.reverse().toString();
    }

    public static String rightColumn(String number){
        int columnNumber = str2int(number);

        return int2str(columnNumber);
    }
}


