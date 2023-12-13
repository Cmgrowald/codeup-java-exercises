public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

         int myFavoriteNumber = 64;
        System.out.println(myFavoriteNumber);
         String myString = "This is a string value";
        System.out.println(myString);
         myString =  "C";
        System.out.println(myString);
         myString = "3.14159";
        System.out.println(myString);
         long myNumber = (long) 3.14;
        System.out.println(myNumber);
         myNumber = 123L;
        System.out.println(myNumber);
         myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        cant create variables using Javas reserved words

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//         x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int bigInt = Integer.MAX_VALUE + 1;
        System.out.println(bigInt);
    }
}
