public class TestClass {
    public static void main(String[] args){


        //System.out.println(SumDouble(1, 2, 3, 4)); test
        //System.out.println(SumBoolean(5, 5));
        System.out.println(PositiveNumber(0));
        System.out.println(HelloName("Lenin"));
        System.out.println(LeapYear(104));
    }
    public static double SumDouble(int a, int b, int c, int d){

        double sum = a * (b + (c / d));
        return sum;
    }

    public static boolean SumBoolean(int a, int b) {

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
