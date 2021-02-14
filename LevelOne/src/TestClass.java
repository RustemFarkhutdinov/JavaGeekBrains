public class TestClass {
    public static void main(String[] args){


        System.out.println(SumDouble());
        System.out.println(SumBoolean());
        System.out.println(PositiveNumber(-3));
        System.out.println(HelloName("Lenin"));
        System.out.println(LeapYear(81));
    }
    public static double SumDouble(){
        int a = 1;
        int b = 3;
        int c = 3;
        int d = 4;

        double sum = a * (b + (c / d));
        return sum;
    }

    public static boolean SumBoolean() {
        int a = 19;
        int b = 2;
        int sum = a + b;

        if (9 < sum && sum <= 20) {

            return true;
        }
          return  false;
    }

    public static String PositiveNumber(int a) {

        if (0 <= a ) {

            return "Positive Number";
        }
        return  "Negative Number";
    }
    public static String HelloName(String Name) {

        return  "Hello " + Name + "!";
    }
     //TestGithub
    public static String LeapYear(int year) {
        int a = year % 400;
        int b = year % 4;
        if (year < 400 && b == 0 && year != 100) {
            return year + " it is Leap Year";
        }
            if (a == 0) {
                return year + " it is Leap Year";
        } return year + " it is NO leap Year";
    }
}
