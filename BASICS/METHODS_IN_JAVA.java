public class METHODS_IN_JAVA {

    // what is a method in java?
    // A method is a block of code which only runs when it is called. You can pass
    // data, known as parameters, into a method. Methods are used to perform certain
    // actions, and they are also known as functions.

    // example - 2 kaa table likhna hai mujhe code me so maine likhdiya usinh for
    // loop but ab mujhe alag alag jaga wapas ye use karna hai so mujhe waha again
    // and again same forloop code likhna padega but agar mai usko method me likhdu
    // to mai usko kahi bhi call kar sakta hu aur code repeat nahi hoga this makes
    // the code reusable and easy to maintain and less bulky.

    // syntax of method in java
    // returnType methodName(parameters) {
    // method body
    // }

    // method call or method invocation
    // methodName(parameters); is its syntax
    // it is used to call the method and execute the code inside it.

//     public static void print2KaTable() {
//         for (int i = 1; i <= 10; i++) {
//             int ans = 2 * i;
//             System.out.println("-> " + ans);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("hi");
//         print2KaTable();
//         System.out.println("bye");
//     }
// }

// aise hum kudka method bana sakte hai aur usko kahi bhi call kar sakte hai.
// now lets see return with parameter method in java and how to use it.


//     // Method 1
//     static void print2KaTable() {
//         for (int i = 1; i <= 10; i++) {
//             int ans = 2 * i;
//             System.out.println("-> " + ans);
//         }
//     }

//     // Method 2
//     static void printSum(int x, int y) {   //these are called parameters and they are used to take input from the user
//         System.out.println("SUM: " + (x + y));
//     }

//     // Main method
//     public static void main(String[] args) {

//         printSum(5, 10); //these are called arguments and they are passed to the method parameters x and y

//         System.out.println("hi");

//         print2KaTable();

//         System.out.println("bye");
//     }
// }
    
/*
return keyword in java is used to return a value from a method. It is used to exit from the method and return a value to the caller. The return type of the method must match the type of the value being returned. If the method does not return any value, the return type should be void.

example - 
static int printMultiplication(int a, int b) {
    int ans = a * b;
    return ans;
    System.out.println("Result: " + printMultiplication(5, 10));
}

so in above example, the method printMultiplication takes two parameters a and b, multiplies them and returns the result. The return type of the method is int, which matches the type of the value being returned. The method can be called from the main method and the returned value can be printed.
but, last line system.out.println("Result: " + printMultiplication(5, 10)); will give an error because the return statement is before it and it will never be executed. so we have to remove that line or put it before the return statement.

thats called unreachable statement in java and it will give a compile time error. so we have to be careful while using return statement in java.

*/

/*
lets understand flow of execution 
public class Methods {

    // main() is where the program starts
    public static void main(String[] args) {

        System.out.println("Hi");

        // Calling the solve() method
        solve();

        System.out.println("Bye");
    }

    // solve() is a method that performs some work
    static void solve() {

        System.out.println("Hey");

        // Calling add() and storing its returned value in ans
        int ans = add(1, 2);

        // Printing the value returned by add()
        System.out.println(ans);

        System.out.println("Bye Bye");
    }

    // add() takes two integers and returns their sum
    static int add(int a, int b) {

        System.out.println("Inside add");

        int ans = a + b;

        // Sends the value of ans back to solve()
        return ans;
    }
}

it went like
main()
  ↓
solve()
  ↓
add(1, 2)
  ↓
return 3
  ↓
solve() receives 3
  ↓
prints 3
  ↓
main() continues

timestamp is 35 mins 20sec
*/

// METHODS IN JAVA CAN HAVE SAME NAME BUT DIFFERENT PARAMETERS AND THIS IS CALLED METHOD OVERLOADING IN JAVA. IT IS A WAY TO ACHIEVE POLYMORPHISM IN JAVA. IT IS USED TO INCREASE THE READABILITY OF THE PROGRAM. IT IS ALSO USED TO PERFORM DIFFERENT TASKS WITH SAME METHOD NAME BUT DIFFERENT PARAMETERS.

//public class Methods {

    // Method with 2 parameters
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    // Same method name, but 3 parameters
    static int add(int p, int q, int r) {
        int ans = p + q + r;
        return ans;
    }

    public static void main(String[] args) {

        // Calls the add() method having 2 parameters
        int ans1 = add(1, 2);

        // Calls the add() method having 3 parameters
        int ans2 = add(1, 2, 3);

        System.out.println("ans1: " + ans1);
        System.out.println("ans2: " + ans2);
    }
}
//NOW IN THIS CODE IT IS PERFECT EXAMPLE OF METHOD OVERLOADING IN JAVA. WE HAVE TWO METHODS WITH SAME NAME BUT DIFFERENT PARAMETERS. SO WHEN WE CALL THE METHOD WITH 2 PARAMETERS IT WILL CALL THE FIRST METHOD AND WHEN WE CALL THE METHOD WITH 3 PARAMETERS IT WILL CALL THE SECOND METHOD. THIS IS HOW METHOD OVERLOADING WORKS IN JAVA.

//NOTE SIRF RETURN TYPE CHANGE KARNE SE METHOD OVERLOADING NHI HOTA HAI. METHOD OVERLOADING TAB HI HOTA HAI JAB METHOD NAME SAME HO AUR PARAMETERS DIFFERENT HO.
//AGAR INT P, INT Q HOTA AND DOOSRE ME FLOAT RETURN TYPE HOKE PARAMETER INT P FLOAT Q HOTA AND ANS 2 KO BHI FLOAT KARDIYA HOTA 

/* EXAMPLE

    // add() with int and int
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    // add() with int and float
    static float add(int p, float q) {
        float ans = p + q;
        return ans;
    }

    public static void main(String[] args) {

        // Calls add(int, int)
        int ans1 = add(1, 2);

        // Calls add(int, float)
        float ans2 = add(1, 2.0f);

        System.out.println("ans1: " + ans1);
        System.out.println("ans2: " + ans2);
    }
}

TOH ISS CASE ME METHOD OVERLOADING HOGA KYUNKI METHOD NAME SAME HAI AUR PARAMETERS DIFFERENT HAI. FIRST METHOD ME INT P, INT Q HAI AUR SECOND METHOD ME INT P, FLOAT Q HAI. ISSE HUM SAME METHOD NAME KE SAATH DIFFERENT PARAMETERS KE SAATH USE KAR SAKTE HAI. YE POLYMORPHISM KA EK EXAMPLE HAI JAVA ME.

*/

/*
CALL BY VALUE- 

CALL BYE VALUE ME HUM METHOD KO ARGUMENTS PASS KARTE HAI AUR METHOD KE ANDAR HUM USKO CHANGE KAR SAKTE HAI LEKIN ORIGINAL VALUE CHANGE NHI HOGI. JAVA ME PRIMITIVE DATA TYPES (INT, FLOAT, DOUBLE, CHAR, BOOLEAN) CALL BY VALUE KE THROUGH PASS HOTE HAI. ISKA MATLAB YE HAI KI HUM METHOD KO ORIGINAL VALUE NHI BHEJ RAHE HAI BALKE USKA COPY BHEJ RAHE HAI. TOH METHOD KE ANDAR HUM USKO CHANGE KAR SAKTE HAI LEKIN ORIGINAL VALUE CHANGE NHI HOGI.

EXAMPLE -
public class Methods {

    static void solve(int num) {

        // num is a COPY of the value from main()
        System.out.println("Inside solve before change: " + num);

        // Changing the copy
        num = num * 10;

        System.out.println("Inside solve after change: " + num);
    }

    public static void main(String[] args) {

        int num = 5;

        // Original value
        System.out.println("Before calling solve: " + num);

        // Passing a COPY of num
        solve(num);

        // Original num is still 5
        System.out.println("After calling solve: " + num);
    }
}

OUTPUT - 
Before calling solve: 5
Inside solve before change: 5
Inside solve after change: 50
After calling solve: 5

YAHA HUA YE KI HUMNE METHOD KO ORIGINAL VALUE NHI BHEJI BALKE USKA COPY BHEJA. TOH METHOD KE ANDAR HUM USKO CHANGE KAR SAKTE HAI LEKIN ORIGINAL VALUE CHANGE NHI HOGI. ISSE HUM CALL BY VALUE KEHTE HAI JAVA ME.
ISLIYE ANSWER HAMESHA 5 HI AAYEGA AFTER CALLING SOLVE.
50 PRINT HOGA INSIDE SOLVE AFTER CHANGE MEIN KYUNKI HUMNE USKO CHANGE KIYA HAI LEKIN ORIGINAL VALUE NHI HAI.

*/

/*
METHODS AND VARIABLE SCOPING -

IT IS IMPORTANT TO UNDERSTAND THE SCOPE OF VARIABLES IN JAVA. VARIABLES DECLARED INSIDE A METHOD ARE LOCAL TO THAT METHOD AND CANNOT BE ACCESSED OUTSIDE OF IT. ON THE OTHER HAND, VARIABLES DECLARED OUTSIDE OF METHODS (CLASS LEVEL VARIABLES) CAN BE ACCESSED BY ALL METHODS IN THE CLASS.

public class Methods {

    static void solve() {

        // num is created inside solve()
        int num = 5;

        System.out.println("Inside solve: " + num);
    }

    public static void main(String[] args) {

        // Calling solve()
        solve();

        // ❌ This would give an error:
        // System.out.println(num);
    }
}

HERE , the variable num is declared inside the solve() method, making it local to that method. Trying to access num in the main() method will result in a compile-time error because num is out of scope. This demonstrates the concept of variable scoping in Java, where variables have a limited lifetime and visibility based on where they are declared.

 */

//MAIN METHOD-

/*
ABTAK HUM MAIN METHOD KO STATIC VOID KARKE LIKH RAHE THE. LEKIN JAVA ME MAIN METHOD KO STATIC VOID KARNA ZARURI HAI KYUNKI JAVA PROGRAM START HONE SE PEHLE JVM (JAVA VIRTUAL MACHINE) KO YE PATA HONA CHAHIYE KI PROGRAM KA ENTRY POINT KAHAN HAI. ISLIYE HUM MAIN METHOD KO STATIC KARTE HAI TAKI JVM USKO DIRECTLY CALL KAR SKE BINA KISI OBJECT KE. STATIC VOID KA MATLAB HAI KI YE METHOD KISI OBJECT KE SAATH LINK NHI HAI. ISSE HUM DIRECTLY CLASS NAME KE THROUGH CALL KAR SAKTE HAI.
PEHLE STATIC VOID SE HUMNE METHOD KO CALL KIYA THA LEKIN AB HUM OBJECT KE THROUGH BHI METHOD KO CALL KAR SAKTE HAI. ISSE HUM OBJECT ORIENTED PROGRAMMING ME AAGE BADH SAKTE HAI.
BASIC KELIYE STATIC VOID KA USE KIYA JATA HAI TAKI HUM METHOD KO DIRECTLY CALL KAR SKE. LEKIN OBJECT ORIENTED PROGRAMMING ME HUM OBJECT KE THROUGH METHOD KO CALL KARTE HAI TAKI HUM CLASS KE OBJECT KE SAATH LINK HO SKE. 
*/
