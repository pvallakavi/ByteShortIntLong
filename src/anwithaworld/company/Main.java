//total 8 primitive types: byte, short,int,long,float,double,char and boolean. Rarely used byte,short and float
// long is 64 bits, width of 64..int occupies 32 bits & has width of 32, short needs 16 bits & has width of 16 and byte needs 8 bits & width of 8
//float, double, char and boolean

package anwithaworld.company; //package is like a folder with subfolders

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	// int - integer is a WHOLE number always. 3/2 will give 1 and not 1.5
        int myValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE; //int is primitive type. Integer is Wrapper class for int
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Min Value = " + myIntMinValue);
        System.out.println("Max Value = " + myIntMaxValue);
        // If you add 1 to the MAX value it will OVERFLOW to a -ve number
        System.out.println("BUSTED MAX VALUE OVERFLOW!! "+ (myIntMaxValue+1));
        //-ve numbers become UNDERFLOW
        System.out.println("BUSTED MIN VALUE UNDERFLOW !"+(myIntMinValue-1));

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myByteMinValue);
        System.out.println("Byte Max Value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myShortMinValue);
        System.out.println("Short Max Value = " + myShortMaxValue);

        long myLongValue = 100L;
        //without L after 100 java will treat that as integer

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myLongMinValue);
        System.out.println("Long Max Value = " + myLongMaxValue);

        //float decimal precision is 7 5f/23f = 1.6666666
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myFloatMinValue);
        System.out.println("Float Max Value = " + myFloatMaxValue);

        // double gives more precision than float. for double dont have to specify d. faster to process double.
        // can handle lot more bigger numbers. Java uses double as the default floating number if you dont specify f or d
        // for precise calculations dont use float or double. Use a class called BigDecimal
        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myDoubleMinValue);
        System.out.println("Double Max Value = " + myDoubleMaxValue);

        char myChar = 'D'; //similar to a string but can only store 1 character. it occupies 2 bytes of memory because it stores as unicode
        // check in unicode-table.com. D - unicode is 0044
        char myUnicodeChar = '\u0044';
        System.out.println("my char = "+myChar);
        System.out.println("my UnicodeChar = "+myUnicodeChar);

        //boolean - can be true or false
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOver21 = true;

        int myTotal = myIntMaxValue/2;
        int myIntValue = 5/2;
        byte myNewByteValue = (byte) (myTotal/2); ///this is casting
        short myNewShortValue = (short) (myShortMaxValue/20);
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5d/2d;
        double anotherNumber = 3_200_320.4_512_982d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("anothernumber = " + anotherNumber);

        //string data type - this is not a primitive data type. Its actually a class. Can have a sequence of characters.
        String myFirstName = "pavan";
        String myLastName = "kumar "+ " \u00A9 2019 ";
        System.out.println("my name is = " + myFirstName+myLastName);


    }
}