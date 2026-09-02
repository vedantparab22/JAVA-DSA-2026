//In Java, polymorphism means “one thing, many forms.” It allows the same method name or reference type to behave differently depending on the object or arguments involved.

/*
Polymorphism in Java
1. Similar to Polymorphism in Life.
2. Polymorphism = Many Forms.
3. The ability of a single function or Operator to work in different ways based on the object it is
acting upon or actual need.
4. A phenomenon that allows an object to have several different forms and behaviours.
5. Types
1. Compile Time Polymorphism. / aka static polymorphism :- method overloading & operator overloading (types)
2. Runtime Polymorphism.      / aka dynamic polymorphism :- method overriding (type)

exampe- mai hu vedant mai kisikeliye son hu agar meri wife hui to same vedant mai uska husband hu and therefore same person hoke bhi mere itne forms i.e behaviour hai 

Method Overloading -


1. Overloading occurs when a class contains multiple methods sharing a name but differing in argument count or argument type.


class Calculator (
// Method to add two integers
int add(int a, int b) (
return a + b;
}

//I Overloaded method to add three integers
int add(int a, int b, int c) C
return
a + b + c;
}
}


//     // Method 1: adds 2 integers
//     static int add(int a, int b) {
//         return a + b;
//     }

//     // Method 2: adds 3 integers
//     static int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     // Method 3: adds 3 integers + 1 double
//     static double add(int a, int b, int c, double d) {
//         return a + b + c + d;
//     }

//     public static void main(String[] args) {

//         System.out.println(add(2, 3));

//         System.out.println(add(2, 3, 4));

//         System.out.println(add(2, 3, 4, 5.6));
//     }
// }

// Output
// 5
// 9
// 14.6

//----------------------------------------------------------------

//OPERATOR OVERLOADING

// IN C++ USER DEFINED OPERATOR OVERLOADING IS ALLOWED WHEREAS JAVA DEOSNT ALLOWS. 
// EXAMPLE- PLUS OPERATOR IS USED FOR ADDITION OF NUMBERS AND CONCATENATION OF STRINGS. WO OPERATOR 2 INT KO BHI ADD KAR SAKTA HAI, EK INT EK DOUBLE KO BHI, 2 STRINGS KO BHI ETC SO YE OPERATOR IS POLYMORPHIC 

// BUT AAP KHUDSE PLUS OPERATOR KO OVERLOAD NHI KAR SAKTE (IN JAVA) C++ ME U CAN

//1. Java does not support user-defined operator overloading but internally overloads certain operators (e.g., + for String concatenation and integer addition).

/*
Runtime Polymorphism
1. Function Overriding - A Subclass can provide a specific implementation of a method that is
already defined in its superclass.
2. Dynamic Method Dispatch [Upcasting] - A superclass reference variable can refer to a
subclass object and dynamic dispatch is used to resolve the called method at runtime.
*/

// public class Main {

//     // ==============================
//     // PARENT CLASS
//     // ==============================
    
//     class Animal {

//         // Parent class ka method
//         void sound() {
//             System.out.println("Animal awaaz karta hai");
//         }
//     }


//     // ==============================
//     // CHILD CLASS - DOG
//     // ==============================

//     // Dog, Animal class ko inherit kar raha hai
//     class Dog extends Animal {

//         // @Override ka matlab:
//         // Hum parent class ke sound() method ko
//         // child class mein apne according change kar rahe hain.
        
//         @Override
//         void sound() {
//             System.out.println("Dog bhonkta hai");
//         }
//     }


//     // ==============================
//     // CHILD CLASS - CAT
//     // ==============================

//     // Cat bhi Animal class ko inherit kar raha hai
//     class Cat extends Animal {

//         // Cat apne according sound() method ko override kar raha hai
        
//         @Override
//         void sound() {
//             System.out.println("Cat meow karti hai");
//         }
//     }


//     // ==============================
//     // MAIN METHOD
//     // ==============================

//     public static void main(String[] args) {

//         // Main class ka object banaya
//         // Kyunki Animal, Dog aur Cat yahan inner classes hain.
//         Main program = new Main();


//         // ==============================
//         // NORMAL OBJECTS
//         // ==============================

//         // Dog ka object
//         Dog dog = program.new Dog();

//         // Cat ka object
//         Cat cat = program.new Cat();


//         // Dog ka sound() call hoga
//         // Dog wali sound() method execute hogi
//         dog.sound();

//         // Cat ka sound() call hoga
//         // Cat wali sound() method execute hogi
//         cat.sound();


//         // ==============================
//         // RUNTIME POLYMORPHISM
//         // ==============================

//         // Animal parent class ka reference
//         // Dog child class ke object ko point kar raha hai
//         Animal animal1 = program.new Dog();

//         // Animal parent class ka reference
//         // Cat child class ke object ko point kar raha hai
//         Animal animal2 = program.new Cat();


//         // Yahan Java RUNTIME par decide karega
//         // ki actual object Dog hai ya Cat.

//         animal1.sound();   // Dog ka sound() chalega
//         animal2.sound();   // Cat ka sound() chalega
//     }
// }

//----------------------------------------------------------------

// public class Main {

//     // ==========================================
//     // PARENT CLASS
//     // ==========================================

//     class Animal {

//         // Parent class ka method
//         void sound() {
//             System.out.println("Animal awaaz karta hai");
//         }
//     }


//     // ==========================================
//     // CHILD CLASS - DOG
//     // ==========================================

//     class Dog extends Animal {

//         // Parent ke sound() method ko override kiya
//         @Override
//         void sound() {
//             System.out.println("Dog bhonkta hai");
//         }

//         // Ye method sirf Dog class mein hai
//         void run() {
//             System.out.println("Dog daud raha hai");
//         }
//     }


//     // ==========================================
//     // CHILD CLASS - CAT
//     // ==========================================

//     class Cat extends Animal {

//         // Parent ke sound() method ko override kiya
//         @Override
//         void sound() {
//             System.out.println("Cat meow karti hai");
//         }
//     }


//     // ==========================================
//     // MAIN METHOD
//     // ==========================================

//     public static void main(String[] args) {

//         // Main class ka object
//         Main program = new Main();


//         // ==========================================
//         // UPCASTING
//         // ==========================================

//         // Dog ek Animal hai.
//         //
//         // Isliye Dog object ko Animal reference mein
//         // store kar sakte hain.
//         //
//         // Child object → Parent reference
//         //
//         // Isi ko UPCASTING kehte hain.

//         Animal animal1 = program.new Dog();


//         // Cat bhi ek Animal hai.
//         //
//         // Cat object → Animal reference
//         // Ye bhi UPCASTING hai.

//         Animal animal2 = program.new Cat();


//         // ==========================================
//         // DYNAMIC METHOD DISPATCH
//         // ==========================================

//         // Reference Animal ka hai,
//         // lekin actual object Dog ka hai.
//         //
//         // Isliye runtime par Java dekhega ki
//         // actual object Dog hai.
//         //
//         // Aur Dog ka overridden sound() chalega.

//         animal1.sound();


//         // Reference Animal ka hai,
//         // lekin actual object Cat ka hai.
//         //
//         // Runtime par Java dekhega ki
//         // actual object Cat hai.
//         //
//         // Isliye Cat ka sound() chalega.

//         animal2.sound();


//         // ==========================================
//         // IMPORTANT
//         // ==========================================

//         // Animal reference se hum sirf Animal ke
//         // available methods directly access kar sakte hain.
//         //
//         // Dog ka run() method Animal mein nahi hai.
//         //
//         // Isliye ye line ERROR degi:
//         //
//         // animal1.run();  // ❌ ERROR
//     }
// }


/*Output
Dog bhonkta hai
Cat meow karti hai
Ab actual concept samajh 👇
1. Normal inheritance
class Dog extends Animal

Matlab:

Animal
   ↑
   |
  Dog

Dog, Animal ka child hai.

2. Upcasting
Animal animal1 = new Dog();

Yahan:

Reference → Animal
Object    → Dog

Matlab child object ko parent reference mein store karna.

Dog object
    ↓
Animal reference

Ye Upcasting hai.

3. Dynamic Method Dispatch

Ab:

animal1.sound();

Tumhara reference hai:

Animal

Lekin actual object hai:

Dog

Java runtime par actual object check karta hai:

animal1
  ↓
actual object = Dog
  ↓
Dog ka sound()
  ↓
"Dog bhonkta hai"

Isi ko Dynamic Method Dispatch kehte hain.

Ekdum exam/interview wali definition:

Upcasting: Child class ke object ko Parent class ke reference mein store karna.

Animal a = new Dog();

Dynamic Method Dispatch: Jab overridden method ka execution runtime par actual object ke basis par decide hota hai.

Animal a = new Dog();
a.sound();       // Dog ka sound()
🔥 Connection yaad rakh
Inheritance
    ↓
Method Overriding
    ↓
Upcasting
    ↓
Dynamic Method Dispatch
    ↓
Runtime Polymorphism

Animal a = new Dog(); → Upcasting

a.sound(); → Dynamic Method Dispatch

Ye dono concepts Runtime Polymorphism ko samajhne ke liye bahut important hain */

//-------------------------------------------------------------

//RUNTIME POLYMORPHISM

public class Polymorphism  {

    // ==========================================
    // PARENT CLASS
    // ==========================================

    class Animal {

        // Parent class ka method
        void sound() {
            System.out.println("Animal awaaz karta hai");
        }
    }


    // ==========================================
    // CHILD CLASS - DOG
    // ==========================================

    class Dog extends Animal {

        // Parent ke sound() method ko override kiya
        @Override
        void sound() {
            System.out.println("Dog bhonkta hai");
        }
    }


    // ==========================================
    // CHILD CLASS - CAT
    // ==========================================

    class Cat extends Animal {

        // Parent ke sound() method ko override kiya
        @Override
        void sound() {
            System.out.println("Cat meow karti hai");
        }
    }


    // ==========================================
    // CHILD CLASS - COW
    // ==========================================

    class Cow extends Animal {

        // Parent ke sound() method ko override kiya
        @Override
        void sound() {
            System.out.println("Cow moo karti hai");
        }
    }


    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(String[] args) {

        // polymorphism class ka object banaya
        Polymorphism program = new Polymorphism();


        // ==========================================
        // RUNTIME POLYMORPHISM
        // ==========================================

        // Parent class ka reference
        // Child class ke object ko point kar raha hai.

        Animal animal1 = program.new Dog();
        Animal animal2 = program.new Cat();
        Animal animal3 = program.new Cow();


        // Same sound() method call ho raha hai,
        // lekin har object apna alag sound() de raha hai.

        animal1.sound();    // Dog ka sound()
        animal2.sound();    // Cat ka sound()
        animal3.sound();    // Cow ka sound()


        // ==========================================
        // YE RUNTIME POLYMORPHISM HAI
        // ==========================================

        // Reference sabka Animal hai,
        // lekin actual object alag-alag hai:
        //
        // animal1 → Dog
        // animal2 → Cat
        // animal3 → Cow
        //
        // Java RUNTIME par decide karta hai
        // ki kaunsa sound() execute karna hai.
    }
}

// Output
// Dog bhonkta hai
// Cat meow karti hai
// Cow moo karti hai
// 🧠 Isko simple language mein samajh

// Sabse important lines:

// Animal animal1 = program.new Dog();
// Animal animal2 = program.new Cat();
// Animal animal3 = program.new Cow();

// Yahan reference same hai:

// Animal
// Animal
// Animal

// Lekin actual objects different hain:

// Dog
// Cat
// Cow

// Phir hum same method call karte hain:

// animal1.sound();
// animal2.sound();
// animal3.sound();

// Lekin output different:

// Dog → Dog bhonkta hai
// Cat → Cat meow karti hai
// Cow → Cow moo karti hai

// Java runtime par actual object dekhta hai aur uske according overridden method chalata hai.

// 🔥 Runtime Polymorphism ka formula
// Parent Reference
//        +
// Child Object
//        +
// Method Overriding
//        ↓
// Runtime Polymorphism

// Example:

// Animal a = new Dog();
// a.sound();

// Animal a → Parent reference

// new Dog() → Child object

// sound() overridden hai → Dog ka version chalega

// Runtime par decision → Runtime Polymorphism

// Ek line mein exam/interview definition:

// Runtime Polymorphism is achieved when a parent class reference refers to a child class object, and the overridden method is decided at runtime based on the actual object.

// Animal a = new Dog();
// a.sound();    // Dog ka sound()

// Important: Runtime polymorphism ko practically samajhne ke liye Method Overriding + Upcasting + Dynamic Method Dispatch teenon ek doosre se connected hain.

// SIR ALSO EXPLAINED DOWN CASTING IN VIDEO 
// NOTES HERE EXCEPT FIRST CODE ARE OF ai as sir ne jo bola wo code karne packages use karne padte which i cant do as i want same file coding.

