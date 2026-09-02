//abstraction is the only pillar in oops (log 4 bolte hai but main ek hi hai i.e abstraction baaki saare chizo ki superclass hai) which is used to hide the implememtnation detaails and show only the functionality part to user 

/*Abstraction in Java
1. Delivering only essential information to the outer world while masking the background
details.
2. It is a design and programming method that separates the interface from the implementation.
3. Real life e.g., various functionalities of AirPods but don't know the actual implementation/
working
1. To drive a car, one only needs to know the driving process and not the mechanics of the
car engine */

/*
example -
Abstraction in Collections
1. E.g., Sort, for example, is used to sort an array, a list, or a collection of items, and we know
that if we give a container to sort, it will sort it, but we don't know which sorting algorithm it
uses to sort that container. jaise merge sort, bubble sort, quick sort etc
 
Abstraction using Classes
1. Grouping data members and member functions into classes using access specifiers.
2. A class can choose which data members are visible to the outside world and which are
hidden.

What is Abstract Class?
1. An abstract class in Java is a class that cannot be instantiated on its own and is designed to
be subclassed. It can serve as a superclass for other classes that share a common structure
or behaviour.
2. An abstract class in Java delivers abstraction by serving as a template for its subclasses,
allowing for the definition of a common interface without specifying the complete
implementation details.
3. It has come from the idea of Abstraction.
*/

/*
🔥 Abstraction in Java — Simple Explanation

Abstraction means:

Hide the implementation details and show only the essential features to the user.

Real-life example: ATM 🏧

When you withdraw money:

You press Withdraw
Enter amount
ATM gives you money

You don't need to know how the ATM internally checks your account, communicates with the bank, updates the balance, etc.

That's abstraction — what to do is visible, how it is done is hidden.


1️⃣ How do we achieve Abstraction in Java?

Mainly in two ways:

Abstract class → abstract class
Interface → interface

Let's first understand abstract class, which is what your screenshot is demonstrating.

🧠 Abstract Class

An abstract class is a class that can contain:

✅ Normal/concrete methods — methods with a body
✅ Abstract methods — methods without a body
✅ Variables
✅ Constructors

Example:
abstract class Bird {

    // Abstract method
    // We are saying: every Bird must have a fly() method.
    // But we don't tell HOW it will fly.
    abstract void fly();

    // Normal/concrete method
    // This method already has implementation.
    void eat() {
        System.out.println("Bird is eating");
    }
}
Notice:

abstract void fly();

There is no { } body.

We're basically saying:

"Every Bird should know how to fly, but I'll let the child class decide HOW."

*/

//------------------------------------------------------------------------
// Abstract class
// We cannot directly create an object of an abstract class.
// Abstract class
// It contains the common/essential features of a Bird.
// Abstract class
abstract class Bird {

    // Abstract method
    // Child classes MUST provide its implementation.
    abstract void fly();

    // Normal method
    void eat() {
        System.out.println("Bird is eating");
    }
}


// Child class
class Sparrow extends Bird {

    // Implementing the abstract method
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    // Overriding the normal method
    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }
}


// Main class
// Class name MUST match the file name: Abstraction.java
public class Abstraction {

    public static void main(String[] args) {

        // ❌ Cannot create object of an abstract class
        // Bird b = new Bird();

        // ✅ Parent reference pointing to child object
        Bird b = new Sparrow();

        // Calls Sparrow's eat()
        b.eat();

        // Calls Sparrow's fly()
        b.fly();
    }
}

/*
Output:

Sparrow is eating
Sparrow is flying
🧩 Remember it like this
              ABSTRACT CLASS
                    Bird
                     |
              ----------------
              |              |
           Sparrow          Eagle
              |              |
          fly()           fly()
              |              |
       "Sparrow flies"  "Eagle flies"

Abstraction = WHAT + hide HOW

Bird:
    "You must fly."       ← WHAT

Sparrow:
    "This is HOW I fly."  ← HOW
 */


//---------------------------------------------------------------------------------

/*
Design Strategy
1. Abstraction divides code into two categories: interface and implementation. So, when
creating your component, keep the interface separate from the implementation so that if the
underlying implementation changes, the interface stays the same.
2. In this instance, any program that uses these interfaces would remain unaffected and would
require recompilation with the most recent implementation.
3. Makes code modular and maintainable.
*/

//Interface ko implementation se alag rakho. Matlab jo methods/classes doosre code ko use karni hain, unka "contract" same rakho, chahe andar ka implementation badal jaaye.

/*
// ============================================================
// ABSTRACTION - DESIGN STRATEGY
// ============================================================

// INTERFACE = "WHAT"
// Implementation = "HOW"
//
// Interface batata hai ki Payment system kya-kya kar sakta hai.
// Lekin ye nahi batata ki payment internally KAISE hogi.

interface Payment {

    // Ye ek contract hai.
    // Jo bhi class Payment interface implement karegi,
    // usko pay() method banana hi padega.
    void pay(double amount);
}


// ============================================================
// IMPLEMENTATION 1
// ============================================================

// Ye class Payment interface ka implementation hai.
// Yahan hum decide kar rahe hain ki UPI payment kaise hogi.

class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Payment of ₹" + amount + " done using UPI");

        // Actual application mein yahan:
        // UPI API call
        // transaction verification
        // database update
        // etc. ho sakta hai.
    }
}


// ============================================================
// IMPLEMENTATION 2
// ============================================================

// Ye bhi Payment interface ko implement kar rahi hai.
// Lekin iska implementation UPI se completely different hai.

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Payment of ₹" + amount + " done using Card");

        // Actual application mein yahan:
        // card verification
        // bank communication
        // transaction processing
        // etc. ho sakta hai.
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class Abstraction {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // INTERFACE REFERENCE
        // --------------------------------------------------------

        // Hum Payment type ka reference bana rahe hain.
        //
        // Important:
        // Humein ye pata hai ki payment object ke paas
        // pay() method hoga.
        //
        // Lekin humein ye jaanne ki zarurat nahi hai ki
        // payment internally kaise process ho rahi hai.

        Payment payment = new UPIPayment();

        payment.pay(500);


        // --------------------------------------------------------
        // IMPLEMENTATION CHANGE
        // --------------------------------------------------------

        // Ab hum implementation change kar dete hain.
        //
        // Pehle:
        // Payment payment = new UPIPayment();
        //
        // Ab:
        // Payment payment = new CardPayment();
        //
        // Main code ko pay() method ke baare mein kuch
        // change karne ki zarurat nahi hai.

        payment = new CardPayment();

        payment.pay(1000);
    }
}
 */
//-----------------------------------------------------------------------
/*
Output
Payment of ₹500.0 done using UPI
Payment of ₹1000.0 done using Card
🧠 Ab screenshot wali 3 points ko code se connect karo
1. Interface aur implementation separate
interface Payment {
    void pay(double amount);
}

Ye interface hai.

Ye sirf batata hai:

Payment ke paas pay() method hona chahiye.

Implementation alag hai:

class UPIPayment implements Payment {
    
    public void pay(double amount) {
        // UPI ka actual logic
    }
}

Aur:

class CardPayment implements Payment {

    public void pay(double amount) {
        // Card ka actual logic
    }
}

So:

             Payment
            (Interface)
                 |
        -------------------
        |                 |
   UPIPayment        CardPayment
   (HOW)                (HOW)
2. Implementation change hone par interface same rehta hai

Suppose initially:

Payment payment = new UPIPayment();

payment.pay(500);

Baad mein tum decide karte ho ki UPI ki jagah Card use karna hai:

Payment payment = new CardPayment();

payment.pay(500);

payment.pay() ka interface same hai.

Bas andar ka implementation change hua.

That's exactly what your notes mean:

"If the underlying implementation changes, the interface stays the same."

3. Code modular aur maintainable hota hai

Kal ko tum:

class PayPalPayment implements Payment

add kar sakte ho.

Ya:

class CashPayment implements Payment

add kar sakte ho.

Existing Payment interface ko change karne ki zarurat nahi.

interface Payment {
    void pay(double amount);
}

Same rahega.

Bas naya implementation:

class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done using PayPal");
    }
}

And:

Payment payment = new PayPalPayment();

payment.pay(2000);
🔥 Ek line mein yaad rakh:

Abstraction = WHAT ko expose karo, HOW ko hide karo.

INTERFACE
   ↓
WHAT should happen?
   ↓
pay()

IMPLEMENTATION
   ↓
HOW will it happen?
   ↓
UPI / Card / PayPal / etc.

Isi wajah se interface + implementation separation code ko flexible, modular aur maintainable banata hai.
 */

/*/*
===============================================================
          ABSTRACT CLASS vs INTERFACE
===============================================================

| Feature            | Abstract Class             | Interface                  |
|--------------------|----------------------------|----------------------------|
| Instantiation      | Cannot be instantiated     | Cannot be instantiated     |
|                    | directly.                  | directly.                  |
|--------------------|----------------------------|----------------------------|
| Methods            | Can have both abstract     | Can have abstract methods  |
|                    | and concrete methods.      | and default/static methods |
|                    |                            | with implementation.       |
|--------------------|----------------------------|----------------------------|
| Constructor        | Can have constructors.     | Cannot have constructors.  |
|--------------------|----------------------------|----------------------------|
| Method Access      | Can use public, protected, | Methods are generally      |
| Modifiers          | and private.               | public. Private methods    |
|                    |                            | are allowed from Java 9.   |
|--------------------|----------------------------|----------------------------|
| Inheritance        | Class can extend only      | Class can implement        |
|                    | ONE abstract class.        | MULTIPLE interfaces.       |
|--------------------|----------------------------|----------------------------|
| Fields             | Can have normal variables  | Fields are automatically   |
|                    | and constants.             | public static final.       |
|--------------------|----------------------------|----------------------------|
| State               | Can have instance          | Cannot have instance       |
|                    | variables/state.           | variables/state.           |
|--------------------|----------------------------|----------------------------|
| Keyword            | abstract class             | interface                  |
|--------------------|----------------------------|----------------------------|
| Usage               | Used when classes share    | Used to define a contract  |
|                    | common properties and     | or capability.             |
|                    | behavior.                  |
===============================================================


                    EASY WAY TO REMEMBER
---------------------------------------------------------------

ABSTRACT CLASS
    ↓
"IS-A" relationship
    ↓
Dog IS-A Animal

INTERFACE
    ↓
"CAN-DO" relationship
    ↓
Bird CAN Fly
Airplane CAN Fly


---------------------------------------------------------------
IMPORTANT DIFFERENCE
---------------------------------------------------------------

Abstract Class:

abstract class Animal {

    String name;              // Instance variable

    abstract void sound();    // Abstract method

    void eat() {              // Concrete method
        System.out.println("Eating");
    }
}


Interface:

interface Flyable {

    void fly();               // Abstract method

    // Automatically public static final
    int MAX_SPEED = 100;
}


---------------------------------------------------------------
MULTIPLE INHERITANCE
---------------------------------------------------------------

Abstract Class:

class Dog extends Animal {
    // Java allows only ONE parent class
}


Interface:

class Duck implements Flyable, Swimmable, Walkable {
    // A class can implement MULTIPLE interfaces
}


---------------------------------------------------------------
ONE-LINE DIFFERENCE
---------------------------------------------------------------

Abstract Class:
"Classes share a common base + properties + behavior."

Interface:
"Classes follow a common contract/capability."

===============================================================
*/ 

// rewatch this video i would suggest https://www.youtube.com/watch?v=KR6s0uWRllw&list=PLDzeHZWIZsTqNW1gvXXAicBgku9uPZeOC&index=27
