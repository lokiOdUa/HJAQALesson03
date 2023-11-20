// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
//        System.out.println("Java version: " + System.getProperty("java.version"));
//        System.out.println("Java home: " + System.getProperty("java.home"));

//        String myString = "StringLiteral";  // String literal
//        int myInt = 100500;                 // Integer literal
//        Integer myInteger = myInt;          // int -> Integer automagically
////        Long myLong = 12345;
//        Long myLong = 12345L;
////        Float myFloat = myInteger;        // Integer -> Float does not happen
//
////        System.out.printf("My string is %d, my int is %d, and my integer is %d\n\r",
////                myString, myInt, myInteger);
////        System.out.printf("My string is %d, my int is %f, and my integer is %f\n\r",
////                myString, myInt, myInteger);
//        System.out.printf("My string is %s, my int is %d, and my integer is %d%s",
//                myString, myInt, myInteger, System.lineSeparator());
//        System.out.println("Length of my string is " + myString.length());
////        myLong.
////        myInteger.floatValue()

//        System.out.println("----------");
//        myInt = Integer.MAX_VALUE - 25; // 2147483623;
//        var myNextInt = myInt;
//        for (int c = 0; c < 50; c++) {
//            System.out.println(++myInt + " :: " + myNextInt++);
//        }
//        System.out.println("----------");

//        myInt = Integer.MIN_VALUE + 25; // -2147483622;
//        var myNextInt = myInt;
//        for (int c = 0; c < 50; c++) {
//            System.out.println(--myInt + " :: " + myNextInt--);
//        }
//        System.out.println("----------");

// 		System.out.println(true > false);
// 		System.out.println(true + 8);
//        System.out.println(true + "8");
//        System.out.println("8" + true);

//        double myFloat = 123456789;
////        var myFloat = 123456789f;
////        float myFloat = 123456789;
//        float anotherFloat = 1;
//        System.out.printf("%.9f :: %.9f%s",
//                myFloat, myFloat - anotherFloat, System.lineSeparator());
//        for (int c = 0; c < 100; c++) {
//            myFloat -= anotherFloat;
//        }
//        System.out.printf("%.9f :: %.9f :: %e\n\r",
//                myFloat, myFloat - anotherFloat, myFloat);
//
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        System.out.println(a + d != c + b && a++ == 10);
//        System.out.println(a);
//
        String dogName = "May";
        int birthYear = 2018;
        int nowYear = 2023;
        float weight = 6.5f;
//
        System.out.println("Name of my dog is " + dogName + ", she weights " + weight + " kgs and she is " + ( nowYear - birthYear ) +" years old");
        System.out.printf("Name of my dog is %s, she weights %.1f kgs and she is %d years old",
                dogName, weight, nowYear - birthYear);

    }
}