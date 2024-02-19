/*
 ********************************   Datatype    ********************************
 ->Datatype specifie the different type of value that are stored on the variables.
 -> it is of two type 
        -> Primitive
            ->Numeric
                ->Byte(1 Bytes)
                ->Short(2 Bytes)
                ->Int(4 Bytes)
                ->Long(8 Bytes)
                ->Double(8 Bytes)
                ->Float(4 bytes)
            ->Non-Numeric
                ->char(2 bytes)
                ->Boolean(1 bits)
        -> Non-Primitive
            ->Class
            ->Array
            ->String
            ->etc...
 */

/*
 ******************************************Variable*******************************************
 -> Variable is the name of memory location where we stored different types of values.
 int a =10;
 char ch = 'A';
 
 -> Type of variable in java 
        -> Local = the variable whicch is in a block (of method, if-else , etc)
        -> Static = the variable which have static keyword 
        -> Instance = a variable which is out of the body of all method but under the body of class
            -> we can't access instance variable with out object
        -> Final = variable which value cant be changed
 */

public class third {
    int a =10; //instance variable
    static double b = 20.5; // Static variable
    public static void main(String[] args) {
        boolean c = true; //local variable

        // Now we have to create a object to access a which is an instance variable
        third ram = new third();
        System.out.println(ram.a);
        System.out.println(b);
        System.out.println(c);

        // lets prints all value in one line
        System.out.println(ram.a+" "+b+" "+c);
    }
}











