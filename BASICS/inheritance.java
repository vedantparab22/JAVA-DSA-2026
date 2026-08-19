/*
Inheritance
1. Similar to Inheritance in Life.
2. Child inherits attributes and behaviours from Parent.
3. Inheritance is a way to create a Class from existing Class.
4. The Derived / Child / Sub class inherits some attributes and behaviours from Base / Parent /
Super Class, and may have more specialised attributes and behaviours.

they are general "is-a" relationship terms
eg- + Animal Hierarchy:
* Base Class: Animal
* Derived Classes: Mammal, Reptile, Bird
* Explanation: Mammals, reptiles, and birds are all types of animals, forming an "IS-
A" relationship.
2. Vehicle Classification:
* Base Class: Vehicle
* Derived Classes: Car, Motorcycle, Truck
* Explanation: Cars, motorcycles, and trucks are specific types of vehicles,
demonstrating an "IS-A" relationship.

 */

// Classic Example hé
// - Program to represent different types of vehicles
// - Represent entities like cars, motorcycles, etc.
// - For cars, attributes like name, model, and methods like start_engine(), stop_engien()
// - Similar attributes and methods for the Motorcycle class
// - Introduction of inheritance
// - Create a superclass "Vehicles"
// - Define general attributes and methods in the Vehicles superclass
// - Cars and Motorcycles, as subclasses, inherit from the Vehicles superclass

// ============================================================
//              INHERITANCE IN JAVA
// ============================================================
//
// Inheritance means:
// A Child/Derived class gets the properties and methods
// of a Parent/Base class.
//
// Syntax:
// class Child extends Parent
//
// IMPORTANT:
// The table shown in your image is mainly for C++.
//
// In C++, we can write:
// class Child : private Parent
// class Child : protected Parent
// class Child : public Parent
//
// These "inheritance modes" DO NOT EXIST in Java.
//
// In Java, we simply use:
// class Child extends Parent
//
// The access modifier of the Parent's members remains
// the same in the Child class.
//
// ============================================================


// class Parent {

//     // --------------------------------------------------------
//     // PRIVATE MEMBER
//     // --------------------------------------------------------
//     //
//     // private members belong only to the Parent class.
//     //
//     // Child class CANNOT directly access this variable.
//     //
//     private int privateData = 10;


//     // --------------------------------------------------------
//     // PROTECTED MEMBER
//     // --------------------------------------------------------
//     //
//     // protected members can be accessed:
//     // 1. Inside the same class
//     // 2. Inside child/derived classes
//     //
//     protected int protectedData = 20;


//     // --------------------------------------------------------
//     // PUBLIC MEMBER
//     // --------------------------------------------------------
//     //
//     // public members can be accessed from anywhere,
//     // provided the object/reference is accessible.
//     //
//     public int publicData = 30;
// }


// // ============================================================
// // CHILD / DERIVED CLASS
// // ============================================================

// class Child extends Parent {

//     void display() {

//         // ----------------------------------------------------
//         // PRIVATE MEMBER
//         // ----------------------------------------------------
//         //
//         // privateData belongs to Parent.
//         //
//         // It is NOT directly accessible inside Child.
//         //
//         // System.out.println(privateData);
//         // ❌ ERROR
//         //
//         // So, in Java:
//         // Parent's private member is NOT directly accessible
//         // inside the Child class.
//         // ----------------------------------------------------


//         // ----------------------------------------------------
//         // PROTECTED MEMBER
//         // ----------------------------------------------------
//         //
//         // protectedData CAN be accessed directly because
//         // Child extends Parent.
//         // ----------------------------------------------------

//         System.out.println("Protected Data = " + protectedData);


//         // ----------------------------------------------------
//         // PUBLIC MEMBER
//         // ----------------------------------------------------
//         //
//         // publicData can also be accessed directly because
//         // it is public.
//         // ----------------------------------------------------

//         System.out.println("Public Data = " + publicData);
//     }
// }


// ============================================================
// MAIN CLASS
// ============================================================

// public class Main {

    // public static void main(String[] args) {

        // Child obj = new Child();

        // obj.display();


        // ----------------------------------------------------
        // PUBLIC MEMBER
        // ----------------------------------------------------
        //
        // publicData is accessible from outside the class too.
        // ----------------------------------------------------

        // System.out.println("Public Data = " + obj.publicData);


        // ----------------------------------------------------
        // PROTECTED MEMBER
        // ----------------------------------------------------
        //
        // protectedData is NOT generally accessible through
        // a Child object from an unrelated class/package.
        //
        // So don't think:
        //
        // System.out.println(obj.protectedData);
        //
        // is always allowed.
        //
        // Access depends on package/subclass rules.
        // ----------------------------------------------------


        // ----------------------------------------------------
        // PRIVATE MEMBER
        // ----------------------------------------------------
        //
        // privateData cannot be accessed directly outside
        // Parent either.
        //
        // System.out.println(obj.privateData);
        // ❌ ERROR
        // ----------------------------------------------------
    // }
// }

// ============================================================
// C++ TABLE FROM YOUR IMAGE
// ============================================================
//
//                  Inheritance Mode
//
// Parent       Private       Protected       Public
//
// private      Not inherited Not inherited  Not inherited
// protected    private       protected      protected
// public       private       protected      public
//
//
// ============================================================
// JAVA
// ============================================================
//
// Java DOES NOT have inheritance modes.
//
// We simply write:
//
// class Child extends Parent
//
// And the parent's access modifiers remain:
//
// private   -> NOT directly accessible in Child
// protected -> accessible in Child
// public    -> accessible in Child
//
// ============================================================

//🔥 One-line exam understanding
// In Java:
//
// private   → Parent class only (SIR REPRESENT PRIVATE WITH -)
// protected → Parent + Child    (SIR REPR WITH #)
// public    → Everywhere        (SIR REPR WITH +)
//
// There is NO "private inheritance", "protected inheritance",
// or "public inheritance" syntax in Java.
//
// So the table shown in the screenshot should NOT be
// directly memorized for Java.

/*
Protected Members
1. Members declared protected are accessible within class itself & to its derived class.
2. The protected access modifier serves two primary purposes:

1. Encapsulation: Like the private access modifier, protected provides a level of
encapsulation, ensuring that certain class members are not directly accessible from
outside the class. This promotes data hiding and prevents external code from modifying
or accessing sensitive data directly.

2. Inheritance: Unlike private, protected members can be inherited by derived classes. This
means that subclasses have limited access to these members, allowing them to build
upon the base class's functionality while maintaining some level of data integrity and
control. */


/*
TYPES OF INHERITENCE 

// ============================================================
//                 TYPES OF INHERITANCE IN JAVA
// ============================================================
//
// Inheritance means:
// A child class can acquire the properties and methods
// of an existing parent class.
//
// Syntax:
// class Child extends Parent
//
// Java supports:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
//
// Java does NOT support Multiple Inheritance using classes.
// Hybrid inheritance using classes is also not directly supported.
//
// ============================================================


// ============================================================
// 1. SINGLE INHERITANCE
// ============================================================
//
// Diagram:
//
//       ClassA
//          ↑
//       ClassB
//
// One Parent  →  One Child
//
// ClassB inherits from ClassA.
//
// ============================================================

class ClassA {

    void methodA() {
        System.out.println("Method of Class A");
    }
}

class ClassB extends ClassA {

    void methodB() {
        System.out.println("Method of Class B");
    }
}


// ============================================================
// 2. MULTILEVEL INHERITANCE
// ============================================================
//
// Diagram:
//
//       ClassA
//          ↑
//       ClassB
//          ↑
//       ClassC
//
// Here inheritance happens in multiple levels.
//
// ClassC inherits from ClassB.
// ClassB already inherits from ClassA.
//
// Therefore ClassC can also access ClassA's members.
//
// A → B → C
//
// ============================================================

class Parent {

    void parentMethod() {
        System.out.println("Method of Parent");
    }
}

class Child extends Parent {

    void childMethod() {
        System.out.println("Method of Child");
    }
}

class GrandChild extends Child {

    void grandChildMethod() {
        System.out.println("Method of GrandChild");
    }
}


// ============================================================
// 3. HIERARCHICAL INHERITANCE
// ============================================================
//
// Diagram:
//
//             ClassA
//            ↙     ↘
//       ClassB     ClassC
//
// Here ONE parent has MULTIPLE child classes.
//
// Both ClassB and ClassC inherit from ClassA.
//
// ============================================================

class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat can meow");
    }
}


// ============================================================
// 4. MULTIPLE INHERITANCE
// ============================================================
//
// Diagram:
//
//      ClassA       ClassB
//          ↘       ↙
//            ClassC
//
// Here ONE child tries to inherit from TWO parents.
//
// In Java, this is NOT allowed using classes.
//
// ❌ NOT ALLOWED:
//
// class ClassC extends ClassA, ClassB
//
// Why?
//
// Suppose ClassA and ClassB both have:
//
// void display()
//
// Then ClassC inherits two display() methods.
//
// Java would have ambiguity:
// "Which display() should ClassC use?"
//
// Therefore Java does NOT support multiple inheritance
// through classes.
//
// ============================================================


// ❌ This code will give a compilation error:
//
// class A {
//     void display() {
//         System.out.println("A");
//     }
// }
//
// class B {
//     void display() {
//         System.out.println("B");
//     }
// }
//
// class C extends A, B {   // ❌ ERROR
// }
//
// Java avoids this ambiguity by not allowing multiple
// inheritance with classes.


// ============================================================
// 5. HYBRID INHERITANCE
// ============================================================
//
// Hybrid = Combination of two or more types of inheritance.
//
// Example diagram:
//
//             ClassA
//            ↙     ↘
//       ClassB     ClassC
//            ↘     ↙
//             ClassD
//
// This combines:
// Hierarchical + Multiple inheritance.
//
// Java does NOT support this structure using classes
// because it would require multiple inheritance.
//
// ============================================================


// ============================================================
// BUT JAVA CAN ACHIEVE MULTIPLE/HYBRID INHERITANCE
// USING INTERFACES
// ============================================================
//
// Java allows a class to implement multiple interfaces.
//
// Example:
//
// InterfaceA      InterfaceB
//      ↘             ↙
//          ClassC
//
// This is allowed because interfaces provide a safer way
// to achieve multiple inheritance.
//
// ============================================================

interface A {

    void methodA();
}

interface B {

    void methodB();
}


// Class C implements TWO interfaces.
//
// This is Java's way of achieving multiple inheritance
// without extending multiple classes.

class C implements A, B {

    public void methodA() {
        System.out.println("Method from Interface A");
    }

    public void methodB() {
        System.out.println("Method from Interface B");
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class Main {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // SINGLE INHERITANCE
        // ----------------------------------------------------

        ClassB obj1 = new ClassB();

        obj1.methodA();  // Inherited from ClassA
        obj1.methodB();  // Own method of ClassB


        // ----------------------------------------------------
        // MULTILEVEL INHERITANCE
        // ----------------------------------------------------

        GrandChild obj2 = new GrandChild();

        obj2.parentMethod();       // From Parent
        obj2.childMethod();        // From Child
        obj2.grandChildMethod();   // From GrandChild


        // ----------------------------------------------------
        // HIERARCHICAL INHERITANCE
        // ----------------------------------------------------

        Dog dog = new Dog();

        dog.eat();   // Inherited from Animal
        dog.bark();  // Dog's own method


        Cat cat = new Cat();

        cat.eat();   // Inherited from Animal
        cat.meow();  // Cat's own method


        // ----------------------------------------------------
        // MULTIPLE INHERITANCE USING INTERFACES
        // ----------------------------------------------------

        C obj3 = new C();

        obj3.methodA();  // Implemented from Interface A
        obj3.methodB();  // Implemented from Interface B
    }
}

 */

/*
Quick memory trick

// ============================================================
//                 EASY WAY TO REMEMBER
// ============================================================
//
// 1. SINGLE
//
//       A
//       ↑
//       B
//
// One Parent → One Child
//
//
// 2. MULTILEVEL
//
//       A
//       ↑
//       B
//       ↑
//       C
//
// Grandparent → Parent → Child
//
//
// 3. HIERARCHICAL
//
//          A
//        ↙   ↘
//       B     C
//
// One Parent → Multiple Children
//
//
// 4. MULTIPLE
//
//       A     B
//        ↘   ↙
//          C
//
// Multiple Parents → One Child
//
// ❌ NOT supported with Java classes
// ✅ Can be achieved using interfaces
//
//
// 5. HYBRID
//
// Combination of multiple inheritance types.
//
// ❌ Not directly supported using Java classes
// ✅ Can be designed using interfaces
//
// ============================================================
*/

/*Advantages

1. Reusability: Avoids duplicating methods in child classes that already exist in parent classes.
2. Code modification: Localises changes, preventing inconsistencies throughout the program.
3. Extensibility: Allows easy enhancement or upgrade of specific parts of a product without
altering core attributes.
4. Data hiding: Supports encapsulation by keeping some data private in the base cl

preventing alteration by derived classes. a on */


//AB INN SABKO CODE ME DEKHTE HAI KAISE HAI

 // IMPLEMENTING INHERITENCE IN JAVA
// 1. Unlike C++, Java doesn't provide an inheritance specifier like public, protected, or
// private, i.e., you can not specify mode of inheritance.
// 2. Java does not support multiple inheritance.

// class SuperClass {
// // SuperClass fields and methods
// }
// class SubClass extends SuperClass (
// // SubClass fields and methods, it includes those inherited from S
// }

//THIS IS USED FOR CURRENT INSTANCE 
//this.object name 








//                         Vehicle
//                       /         \
//                      /           \
//                   Car          MotorCycle
//
// Vehicle = Parent / Superclass
// Car = Child / Subclass
// MotorCycle = Child / Subclass
//
// Common properties/methods Vehicle mein hain.
// Car aur MotorCycle unhe INHERIT karte hain.
// Saath mein dono apni-specific properties/methods bhi rakhte hain.

//Sir ne isko 4 files + package mein banaya hai: (in video as he is using intellij idea)
// Transport/  (i.e package)
//    |
//    |-- Vehicle.java  (i.e uss package ka class)
//    |-- Car.java       (i.e transport package ka class)
//    |-- MotorCycle.java (i.e transport package ka class)
//    |-- Main.java       (i.e transport package ka class)
//
// Har file ke top par:
// package Transport;
//
// Lekin aapke paas sirf:
// Inheritence.java
//
// Isliye hum same concept ko ek hi file mein rakhenge.
// Java mein multiple classes ek file mein ho sakti hain,
// bas sirf ek class public hogi.
// Public class ka naam file ke naam ke same hona chahiye.
//
// File name:
// Inheritence.java
//
// Public class:
// Inheritence

// SIR KE CODE KA CONCEPT
// Vehicle
//   |
//   |-- name
//   |-- model
//   |-- noOfTyres
//   |
//   |-- startEngine()
//   |-- stopEngine()
//
//          ↓ extends
//
//     /-------------\
//    /               \
//   Car          MotorCycle
//    |                |
//    |-- noOfDoors    |-- handleBarStyle
//    |-- transmission |-- suspensionType
//    |                |
//    |-- startAC()    |-- wheelie()
//
// Car aur MotorCycle ko Vehicle ke:
// name
// model
// noOfTyres
// startEngine()
// stopEngine()
//
// automatically mil jaate hain.


/*
super ka main role

Sir ke Car constructor mein:

super(name, model, noOfTyres);

iska matlab:

// "Parent class Vehicle ka constructor call karo
//  aur name, model aur noOfTyres ki values
//  Vehicle ko de do." */

/*
============================================================
              INHERITANCE IN JAVA
          VEHICLE - CAR - MOTORCYCLE
============================================================

Sir ne example multiple files mein banaya:

    Transport/
        Vehicle.java
        Car.java
        MotorCycle.java
        Main.java

Aur har file mein:

    package Transport;

Lekin mere paas sirf ek file hai:

    Inheritence.java

Isliye hum same concept ko ONE FILE mein implement
kar rahe hain.

============================================================
                 CLASS DIAGRAM
============================================================

                         Vehicle
                   -------------------
                   | name             |
                   | model            |
                   | noOfTyres        |
                   -------------------
                   | startEngine()    |
                   | stopEngine()     |
                   -------------------
                      /          \
                     /            \
                    /              \
                   ↓                ↓
                 Car           MotorCycle
            -------------      ----------------
            | noOfDoors |      | handleBarStyle|
            | transType |      | suspensionType|
            -------------      ----------------
            | startAC() |      | wheelie()     |
            -------------      ----------------

Vehicle = Parent / Superclass
Car = Child / Subclass
MotorCycle = Child / Subclass

This is called:

        HIERARCHICAL INHERITANCE

because ONE parent (Vehicle) has MULTIPLE children
(Car and MotorCycle).

============================================================
*/


// ============================================================
//                 PARENT CLASS
//                    Vehicle
// ============================================================

class Vehicle {

    /*
    --------------------------------------------------------
    COMMON ATTRIBUTES
    --------------------------------------------------------

    Ye properties Car aur MotorCycle dono mein common hain.

    Isliye hum inhe separately Car aur MotorCycle mein
    repeat nahi karenge.

    Inheritance ka main benefit hi CODE REUSABILITY hai.
    --------------------------------------------------------
    */

    String name;
    String model;
    int noOfTyres;


    /*
    --------------------------------------------------------
    DEFAULT CONSTRUCTOR
    --------------------------------------------------------

    Sir ne Vehicle ka default constructor bhi dikhaya tha:

        Vehicle() {
            this.name = "";
            this.model = "";
            this.noOfTyres = -1;
        }

    Default constructor ka matlab:

        Constructor with NO parameters.

    Agar hum:

        new Vehicle();

    likhenge, to ye constructor call hoga.

    - name = ""
    - model = ""
    - noOfTyres = -1
    --------------------------------------------------------
    */

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }


    /*
    --------------------------------------------------------
    PARAMETERIZED CONSTRUCTOR
    --------------------------------------------------------

    Sir ke main Vehicle code mein ye constructor tha:

        Vehicle(String name,
                String model,
                int noOfTyres)

    Iska use object create karte time values directly
    initialize karne ke liye hota hai.

    Example:

        new Vehicle("Maruti", "800", 4);

    --------------------------------------------------------
    */

    Vehicle(String name, String model, int noOfTyres) {

        /*
        this.name

        'this' current object ko refer karta hai.

        LEFT SIDE:
            this.name
            = current object ka instance variable

        RIGHT SIDE:
            name
            = constructor ka parameter

        Therefore:

            this.name = name;

        ka meaning hai:

            "current object's name mein parameter name
             ki value store karo."
        */

        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }


    /*
    --------------------------------------------------------
                    startEngine()
    --------------------------------------------------------

    Ye Vehicle ka common method hai.

    Car aur MotorCycle dono vehicles hain.

    Isliye dono ko engine start karna aana chahiye.

    Hum ye method Car aur MotorCycle mein dobara nahi
    likhenge.

    They will INHERIT this method.
    --------------------------------------------------------
    */

    void startEngine() {

        System.out.println(
                "Engine is starting of " + name + " : " + model
        );
    }


    /*
    --------------------------------------------------------
                    stopEngine()
    --------------------------------------------------------

    Ye bhi Vehicle ka common behaviour hai.

    Car aur MotorCycle dono ise inherit karenge.
    --------------------------------------------------------
    */

    void stopEngine() {

        System.out.println(
                "Engine is stopping of " + name + " : " + model
        );
    }
}


// ============================================================
//                     CHILD CLASS
//                        Car
// ============================================================

/*
    extends Vehicle

    iska matlab:

        Car IS-A Vehicle

    Car Vehicle ki properties aur methods inherit karegi.

    Therefore Car ko automatically milta hai:

        name
        model
        noOfTyres
        startEngine()
        stopEngine()

    Car ke apne additional members:

        noOfDoors
        transmissionType
        startAC()
*/

class Car extends Vehicle {

    // --------------------------------------------------------
    // Car-specific properties
    // --------------------------------------------------------

    int noOfDoors;

    String transmissionType;


    /*
    --------------------------------------------------------
                    CAR CONSTRUCTOR
    --------------------------------------------------------

    Sir ke code mein:

    Car(
        String name,
        String model,
        int noOfTyres,
        int noOfDoors,
        String transmissionType
    )

    tha.

    Notice:

    First 3 values Vehicle ki properties hain.

        name
        model
        noOfTyres

    Last 2 values Car ki own properties hain.

        noOfDoors
        transmissionType
    --------------------------------------------------------
    */

    Car(
            String name,
            String model,
            int noOfTyres,
            int noOfDoors,
            String transmissionType
    ) {


        /*
        ====================================================
                    SUPER KEYWORD
        ====================================================

        Sir ne yahan likha:

            super(name, model, noOfTyres);

        'super' ka matlab:

            IMMEDIATE PARENT CLASS

        Yahan Car ka immediate parent:

            Vehicle

        Therefore:

            super(...)

        Vehicle ke constructor ko call karega.

        Specifically ye constructor call hoga:

            Vehicle(
                String name,
                String model,
                int noOfTyres
            )

        ====================================================

        IMPORTANT:

        super(...) ko constructor ki FIRST statement
        hona chahiye.
        ====================================================
        */

        super(name, model, noOfTyres);


        /*
        Ab parent ka constructor execute ho chuka hai.

        Vehicle ne initialize kar diya:

            this.name
            this.model
            this.noOfTyres

        Ab Car apni properties initialize karegi.
        */

        this.noOfDoors = noOfDoors;

        this.transmissionType = transmissionType;
    }


    /*
    --------------------------------------------------------
                    CAR-SPECIFIC METHOD
    --------------------------------------------------------

    AC sirf example ke liye Car ka specific behaviour hai.

    Ye Vehicle mein nahi hai.

    Therefore:

        Car object -> startAC()

    call kar sakta hai.
    --------------------------------------------------------
    */

    void startAC() {

        System.out.println(
                "AC started of " + name + " " + model
        );
    }
}


// ============================================================
//                  CHILD CLASS
//                  MotorCycle
// ============================================================

/*
    MotorCycle bhi Vehicle ko extend karti hai.

    So:

                    Vehicle
                   /       \
                  /         \
                Car       MotorCycle

    MotorCycle ko Vehicle ke common members milenge:

        name
        model
        noOfTyres
        startEngine()
        stopEngine()

    MotorCycle ke apne members:

        handleBarStyle
        suspensionType
        wheelie()
*/

class MotorCycle extends Vehicle {

    // --------------------------------------------------------
    // Motorcycle-specific properties
    // --------------------------------------------------------

    String handleBarStyle;

    String suspensionType;


    /*
    --------------------------------------------------------
              MOTORCYCLE CONSTRUCTOR
    --------------------------------------------------------
    */

    MotorCycle(
            String name,
            String model,
            int noOfTyres,
            String handleBarStyle,
            String suspensionType
    ) {


        /*
        ----------------------------------------------------
        SUPER()

        Parent = Vehicle

        Therefore:

            super(name, model, noOfTyres);

        Vehicle constructor call hoga.

        Vehicle initialize karega:

            name
            model
            noOfTyres
        ----------------------------------------------------
        */

        super(name, model, noOfTyres);


        /*
        Ab MotorCycle apne specific attributes initialize
        karegi.
        */

        this.handleBarStyle = handleBarStyle;

        this.suspensionType = suspensionType;
    }


    /*
    --------------------------------------------------------
                        wheelie()
    --------------------------------------------------------

    Ye MotorCycle ka specific method hai.

    Vehicle mein wheelie() ka koi meaning nahi hai,
    because every vehicle wheelie nahi karta.

    Therefore ye sirf MotorCycle class mein hai.
    --------------------------------------------------------
    */

    void wheelie() {

        System.out.println(
                "MotorCycle is doing a wheelie! " + name
        );
    }
}


// ============================================================
//                        MAIN CLASS
// ============================================================

/*
    IMPORTANT:

    File name:

        Inheritence.java

    Therefore public class ka naam:

        Inheritence

    hona chahiye.

    Sir ne Main.java alag banaya tha.

    Hum us Main class ka kaam yahan Inheritence class
    ke andar kar rahe hain.
*/

public class inheritance {

    public static void main(String[] args) {


        // ====================================================
        //                  CAR OBJECT
        // ====================================================

        /*
        Sir ke code mein roughly:

            Car c = new Car(
                "Maruti",
                "800",
                4,
                5,
                "Auto"
            );

        Hum same concept use kar rahe hain.
        */

        Car c = new Car(
                "Maruti",
                "800",
                4,
                5,
                "Auto"
        );


        /*
        ----------------------------------------------------
        startEngine()

        startEngine() Car class ke andar directly define
        nahi hai.

        Phir bhi hum call kar sakte hain:

            c.startEngine();

        Why?

        Because:

            Car extends Vehicle

        Therefore Car inherited Vehicle's methods.

        So:

            c.startEngine()

        Vehicle ka startEngine() execute karega.
        ----------------------------------------------------
        */

        c.startEngine();


        /*
        startAC() Car ka OWN method hai.

        Ye Vehicle mein nahi hai.
        */

        c.startAC();


        /*
        stopEngine() bhi Vehicle se inherited hai.
        */

        c.stopEngine();


        // ====================================================
        //               MOTORCYCLE OBJECT
        // ====================================================

        /*
        Sir ke code mein:

            MotorCycle m = new MotorCycle(
                "Splendor",
                "Xline",
                2,
                ...
            );

        Hum same concept use kar rahe hain.
        */

        MotorCycle m = new MotorCycle(
                "Splendor",
                "Xline",
                2,
                "Straight",
                "Hydraulic"
        );


        /*
        startEngine()

        Ye MotorCycle mein nahi likha hai.

        But MotorCycle extends Vehicle.

        Therefore MotorCycle inherits it.
        */

        m.startEngine();


        /*
        wheelie()

        Ye MotorCycle ka own method hai.
        */

        m.wheelie();


        /*
        stopEngine()

        Ye bhi Vehicle se inherited hai.
        */

        m.stopEngine();
    }
}


/*
============================================================
                  SUPER KEYWORD - 3 USES
============================================================

Sir ke slide mein 3 points hain:

1. Refer to the instance if immediate parent.
2. Invokes constructor of immediate parent.
3. Invokes a method of immediate parent.


============================================================
1. PARENT CLASS VARIABLE KO REFER KARNA
============================================================

Example:

    super.name

Meaning:

    Parent class Vehicle ka name variable.

============================================================
2. PARENT CLASS CONSTRUCTOR CALL KARNA
============================================================

Sir ke code mein:

    super(name, model, noOfTyres);

Meaning:

    Vehicle constructor ko call karo.

Ye hamare example mein sabse important use hai.

============================================================
3. PARENT CLASS METHOD CALL KARNA
============================================================

Agar parent mein:

    void startEngine() {
        System.out.println("Vehicle engine");
    }

aur child mein bhi same method ho:

    void startEngine() {
        System.out.println("Car engine");
    }

to child se:

    super.startEngine();

likhne par Parent/Vehicle ka method execute hoga.

============================================================
              THIS vs SUPER
============================================================

this
----
Current object/current class ko refer karta hai.

Example:

    this.name

Meaning:

    Current object ka name.


super
-----
Immediate parent class ko refer karta hai.

Example:

    super(name, model, noOfTyres)

Meaning:

    Parent Vehicle ka constructor call karo.


============================================================
WHY DID SIR USE MULTIPLE FILES?
============================================================

Sir ka structure:

    Transport
       |
       |--- Vehicle.java
       |--- Car.java
       |--- MotorCycle.java
       |--- Main.java


Ye PROFESSIONAL/ORGANIZED approach hai.

Har class ka separate responsibility hai.

Vehicle.java
    -> Vehicle class

Car.java
    -> Car class

MotorCycle.java
    -> MotorCycle class

Main.java
    -> program execution


Package:

    package Transport;

sab classes ko Transport package ke andar organize karta hai.


============================================================
WHY ARE WE USING ONE FILE?
============================================================

Learning/practice ke liye one file bilkul fine hai.

Hamare structure mein:

    Inheritence.java
        |
        |-- Vehicle
        |-- Car
        |-- MotorCycle
        |-- Inheritence (main)


Concept EXACTLY SAME hai.

Sir ne files alag rakhi hain,
humne sirf classes ko ek file mein rakha hai.


============================================================
IMPORTANT INHERITANCE CONCEPT
============================================================

Car IS-A Vehicle

MotorCycle IS-A Vehicle

Isliye:

    Car extends Vehicle
    MotorCycle extends Vehicle


Car gets:

    name
    model
    noOfTyres
    startEngine()
    stopEngine()

PLUS its own:

    noOfDoors
    transmissionType
    startAC()


MotorCycle gets:

    name
    model
    noOfTyres
    startEngine()
    stopEngine()

PLUS its own:

    handleBarStyle
    suspensionType
    wheelie()


============================================================
FINAL EASY HINGLISH SUMMARY
============================================================

Socho Vehicle ek GENERAL class hai.

Vehicle ke andar jo cheezein har vehicle mein common hain,
woh humne rakhi:

    name
    model
    noOfTyres
    startEngine()
    stopEngine()


Ab Car ek Vehicle hai.

Car ko already pata hai:

    engine start kaise karna hai
    engine stop kaise karna hai
    name kya hai
    model kya hai
    tyres kitne hain

Isliye same code dobara likhne ki zarurat nahi.

Car simply:

    extends Vehicle

karke parent ka code reuse kar leti hai.

Same MotorCycle ke saath.

Yahi hai:

    INHERITANCE = CODE REUSABILITY


Aur kyunki ek parent:

                Vehicle

ke multiple children:

             Car       MotorCycle

hain, isliye ye:

    HIERARCHICAL INHERITANCE

hai.

============================================================
ONE-LINE EXAM ANSWER
============================================================

Inheritance is an OOP mechanism in which a child class
acquires the properties and behaviours of its parent class
using the 'extends' keyword.

In this example, Car and MotorCycle inherit common
properties and methods from Vehicle.

============================================================
*/

// STEP 1:
//
// Vehicle mein common cheezein:
//
// name
// model
// noOfTyres
// startEngine()
// stopEngine()


// STEP 2:
//
// Car:
//
// class Car extends Vehicle
//
// Matlab Car ko Vehicle ka code mil jayega.
//
// Car additionally:
//
// noOfDoors
// transmissionType
// startAC()


// STEP 3:
//
// MotorCycle:
//
// class MotorCycle extends Vehicle
//
// MotorCycle ko bhi Vehicle ka code mil jayega.
//
// MotorCycle additionally:
//
// handleBarStyle
// suspensionType
// wheelie()


// STEP 4:
//
// Car constructor:
//
// super(name, model, noOfTyres);
//
// Parent Vehicle constructor ko call karta hai.
//
// STEP 5:
//
// Main mein:
//
// Car c = new Car(...);
//
// c.startEngine();
//
// startEngine() Car mein nahi hai,
// lekin Vehicle se inherited hai.
//
// c.startAC();
//
// Ye Car ka own method hai.
//
//
// MotorCycle m = new MotorCycle(...);
//
// m.startEngine();
//
// inherited from Vehicle.
//
// m.wheelie();
//
// own MotorCycle method.
//
// m.stopEngine();
//
// inherited from Vehicle.


//ACCESS MODIFIERS/SPECIFIERS IN JAVA 
//WE HAVE 4 TYPES I.E PUBLIC PRIVATE PROTECTED AND DEFAULT

/*
===========================================================
        ACCESS SPECIFIERS IN JAVA
===========================================================

Access Specifiers decide:
"KAUN kisi variable, method ya class ko access kar sakta hai?"

Java mein mainly 4 access specifiers hote hain:

1. public
2. private
3. protected
4. default (jab koi keyword nahi likhte)

-----------------------------------------------------------
1. PUBLIC
-----------------------------------------------------------

public member ko almost kahin se bhi access kar sakte hain.

                    SAME PACKAGE     DIFFERENT PACKAGE
Class                   YES                  YES
Sub-class               YES                  YES
Non-sub-class           YES                  YES

Example:

public int age;

Kahin bhi:
object.age;       // Access allowed


-----------------------------------------------------------
2. PRIVATE
-----------------------------------------------------------

private member ko SIRF SAME CLASS ke andar access kar
sakte hain.

                    SAME PACKAGE     DIFFERENT PACKAGE
Class                   YES                  YES
Sub-class               NO                   NO
Non-sub-class           NO                   NO

IMPORTANT:
Private ka package se koi lena-dena nahi hai.
Private = ONLY SAME CLASS.

Example:

private int age;

Same class:
age = 20;          // YES

Child class:
System.out.println(age);  // NO ❌

Dusri class:
object.age;       // NO ❌


-----------------------------------------------------------
3. PROTECTED
-----------------------------------------------------------

protected ka behaviour thoda special hai.

SAME PACKAGE:
--------------------------------
Class          -> YES
Sub-class      -> YES
Non-subclass   -> YES

DIFFERENT PACKAGE:
--------------------------------
Sub-class      -> YES
Non-subclass   -> NO

Matlab:

protected member ko SAME PACKAGE mein sab access kar
sakte hain.

Different package mein sirf CHILD/SUBCLASS access kar
sakti hai (inheritance ke through).


-----------------------------------------------------------
4. DEFAULT
-----------------------------------------------------------

Agar hum koi access modifier nahi likhte,
toh woh DEFAULT access modifier hota hai.

Example:

int age;

Isko "package-private" bhi bolte hain.

SAME PACKAGE:
--------------------------------
Class          -> YES
Sub-class      -> YES
Non-subclass   -> YES

DIFFERENT PACKAGE:
--------------------------------
Sub-class      -> NO
Non-subclass   -> NO

IMPORTANT:
Default sirf SAME PACKAGE tak accessible hai.

Different package mein even child class bhi access nahi
kar sakti.


===========================================================
                EASY MEMORY TRICK
===========================================================

public     -> EVERYWHERE 🌍

private    -> SAME CLASS ONLY 🔒

protected  -> SAME PACKAGE + CHILD CLASS 👨‍👦

default    -> SAME PACKAGE ONLY 📦


===========================================================
              ACCESS TABLE
===========================================================

                    PUBLIC   PRIVATE   PROTECTED   DEFAULT

Same Class            YES      YES        YES         YES

Same Package
  Sub-class           YES      NO         YES         YES
  Non-subclass        YES      NO         YES         YES

Different Package
  Sub-class           YES      NO         YES         NO
  Non-subclass        YES      NO         NO          NO


===========================================================
IMPORTANT DIFFERENCE: PROTECTED vs DEFAULT
===========================================================

Ye exam/interview mein bahut important hai.

DEFAULT:
    Same package mein accessible.
    Different package mein NOT accessible.

PROTECTED:
    Same package mein accessible.
    Different package mein CHILD CLASS ke through
    accessible.

Example:

package A;

class Parent {
    protected int x = 10;
}

package B;

class Child extends Parent {
    void show() {
        System.out.println(x);   // YES
    }
}

Yahan Child, Parent ki protected property ko access
kar sakti hai because Child is a SUBCLASS of Parent.


===========================================================
WHY DO WE USE ACCESS SPECIFIERS?
===========================================================

Access specifiers ka main purpose hai:

        DATA / METHODS KI VISIBILITY CONTROL KARNA

For example:

private int balance;

Hum nahi chahte ki koi bhi directly balance change kare.

Isliye private use karenge aur getter/setter ke through
controlled access denge.

Ye OOP ke IMPORTANT concept:

        ENCAPSULATION

se directly related hai.
===========================================================
*/

// NOTE - LAST 15 MINS OF VIDEO ME DIFFERENT PACKAGE WAGERA KA CODE KARKE BATAYA HAI WHICH I AM NOT INCLUDING IN THIS FILE 
//REWATCH THE VIDEO IF U WANT 
