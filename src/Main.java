// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java home: " + System.getProperty("java.home"));

        String myString = "StringLiteral";  // String literal
        int myInt = 100500;                 // Integer literal
        Integer myInteger = myInt;          // int -> Integer automagically
//        Long myLong = 12345;
        Long myLong = 12345L;
//        Float myFloat = myInteger;        // Integer -> Float does not happen

//        System.out.printf("My string is %d, my int is %d, and my integer is %d\n\r",
//                myString, myInt, myInteger);
//        System.out.printf("My string is %d, my int is %f, and my integer is %f\n\r",
//                myString, myInt, myInteger);
        System.out.printf("My string is %s, my int is %d, and my integer is %d%s",
                myString, myInt, myInteger, System.lineSeparator());
        System.out.println("Length of my string is " + myString.length());
//        myLong.
//        myInteger.floatValue()
//        myInt = 2147483623; // Integer.MAX_VALUE - 25;
//        var myNextInt = myInt;
//        for (int c = 0; c < 50; c++) {
//            System.out.println(++myInt + " :: " + myNextInt++);
//        }

//// 		System.out.println(true > false);
//// 		System.out.println(true + 8);
//        System.out.println(true + "8");
//        System.out.println("8" + true);

////        var myFloat = 123456789;
////        var myFloat = 123456789f;
//        float myFloat = 123456789;
//        float anotherFloat = 1;
//        System.out.printf("%9f :: %.9f\n\r",
//                myFloat, myFloat - anotherFloat, System.lineSeparator());
//        for (int c = 0; c < 100; c++) {
//            myFloat -= 1;
//        }
//        System.out.printf("%9f :: %.9f\n\r",
//                myFloat, myFloat - anotherFloat, System.lineSeparator());
    }
}