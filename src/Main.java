import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        byte age = 30;
        byte newAge = age; // here create a new variable name newAge and assign the value ofage to it
        // but that is a compleately a new variable

        int slary = 234_637_872; // in this format all the numbers defalt considers as integers so add L
        long yearSalary = 283_384893_23893L;

        double price = 10.99; // bhy default with decimal point considers as double so add F for float
        float newPrice = 10.99F;

        // for char (single character use single quouts
        char letter = 'A';
        boolean isGood = false;

        // reference type

        // for these need to define memory but unlike c++ java automatically removes it

        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        System.out.println(now);

        // this type not like other create one object and variable name will be refereed to same for other instances

        Point point1 = new Point(1,1);
        Point point2 = point1;
        // point1 and point 2 are referenig to same objects


        String stringAge = "30"; // this is reference type variable
        String mess = new String("I am Ishara dilshan");
        // this is the shorter way
        String message = " I am ishara again";
        System.out.println(message.endsWith("n"));
        System.out.println(message.indexOf('n'));

        // strings are imutable eventhoug it is reference based object
        String editedString = message;
        editedString = editedString.toUpperCase();
        System.out.println("this is edited string"+message);
        System.out.println("this is the edited \" string latter"+ editedString);

        // arrays
        int [] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 2;
        // see the memory location
        System.out.println(numbers);

        // actual values
        System.out.println(Arrays.toString(numbers));
        // here the method toString was implemented for all premitive types of arrays
        // this is called method over loading
        // this aloves same methods to act differentely based on the inputs

        // easy way of assign arrays
        int[] numbers01 = {2,3,4,5};
        System.out.println(numbers01.length);
        // fixed length, for variable use colection class
        Arrays.sort(numbers);

        // multi dimentional arrays
        int [][] ndarray = new int[2][2]; // 2 by 2 array
        ndarray[0][0] = 1;
        // vusualize the multidim array
        System.out.println((Arrays.deepToString(ndarray)));
        // easy way
        int [][] ndnumbers = {{1,3},{3,4}};
        System.out.println((Arrays.deepToString(ndnumbers)));

        // fixed constant
        float pi = 3.78F;
        final float constant_pi = 3.14F; // this value cannotbe chaange latter

        // arithmatic
        // same as python
        double result = (double)10/(double)5;
        System.out.println(result);

        //post fix and prefix
        int x = 1;
        int y = ++x; // increment x first copy ro y
        int z = y++; // first copy to z and increment x
        // +=,-= augmented assignemnt same as python

        // casting
        // 2 different type of data
        // need tp convert one type to other with no data loss
        short x1 = 1; // 2 byte
        int y1 = x+2; // 4 byte
        // the the smaller value will be stored at larger one
        //here store x1 in a different locatopn with 4 byte and add to y1
        //******** IMPLICIT CASTING (automatic casting)*****************//

        // explicit casting (only with compatible types
        double x2 = 1.1;
        int y2 = (int)x2 +3;
        // result is 4, loss data of 0.1
        // passInt() takes string and returen a number
        // user input almost always are string data types

        // Math.round(float or double)
        // Math.celi(number) grater or ewual int to the value
        // there are other types aswell

        // abstract classes cannot be instanciated
        //Abstract classes in Java serve as blueprints for other classes, establishing a common structure and behavior that subclasses can inherit and implement. They are declared using the abstract keyword and cannot be instantiated directly, meaning you can't create objects from them
        // like half bake cake

        // factory method
        // create a instance from abstract classes and return
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String finalCurrency = currencyInstance.format(123456.879);
        System.out.println("format value:"+ finalCurrency);

        //method chaining
        String format_val = NumberFormat.getCurrencyInstance().format(345334.9077);
        //String finalCurrency = format.format(123456.879);
        System.out.println("format value:"+ format_val);

        // taking user input as strings most of the times
        Scanner scanner = new Scanner(System.in); // system.in uses command line to take input
        // similarly system.out will be use terminla block to give outputs
        System.out.print("Enter the age of user: ");
        byte input_age = scanner.nextByte();
        System.out.println("the inputed user age "+input_age);


        System.out.println(y);

        System.out.println("x:"+x+" y:"+y+" z:"+z);




        System.out.printf("Hello and welcome!");
        System.out.println(age + stringAge + message);
        System.out.println("I am ishara dilshan");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}