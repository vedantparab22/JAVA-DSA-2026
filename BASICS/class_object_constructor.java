//lec 17
/*
now to Create an oboiect in java
1. To do so, we must define some blue print, i.e, Class.
2. Object an instance of Class.
3. Constructor
4.Parameterised Constructor
5. Obiect Life Cycle
 */


/* gpt - 
// HOW TO CREATE AN OBJECT IN JAVA

// 1. CLASS:
// A class is a blueprint/template used to create objects.
// It defines the properties (variables) and behaviors (methods)
// that the objects of that class will have.

// Example:
// class Student {
//     String name;
//     int age;
// }

// ------------------------------------------------------------

// 2. OBJECT:
// An object is an instance of a class.
// It is the actual entity created from the class blueprint.
//
// Syntax:
// ClassName objectName = new ClassName();
//
// Example:
// Student s1 = new Student();
//
// Here:
// Student  -> class/type
// s1       -> reference variable
// new      -> creates a new object in memory
// Student() -> calls the constructor
//
// So, s1 is an object (instance) of the Student class.

// ------------------------------------------------------------

// 3. CONSTRUCTOR:
// A constructor is a special member of a class that is
// automatically called when an object is created.
//
// Important points:
// - Constructor name must be the same as the class name.
// - It does NOT have a return type, not even void.
// - It is mainly used to initialize an object's data.
//
// Example:
// class Student {
//     String name;
//
//     Student() {
//         name = "Vedant";
//     }
// }
//
// Student s1 = new Student();
// The Student() constructor is automatically called.

// ------------------------------------------------------------

// 4. PARAMETERIZED CONSTRUCTOR:
// A parameterized constructor is a constructor that accepts
// parameters so that we can initialize an object with
// specific values.
//
// Example:
// class Student {
//     String name;
//     int age;
//
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }
//
// Student s1 = new Student("Vedant", 21);
//
// Here, "Vedant" and 21 are passed to the constructor,
// and the object's variables are initialized with these values.
//
// 'this' refers to the current object.

// ------------------------------------------------------------

// 5. OBJECT LIFE CYCLE:
//
// Object Creation
//      ↓
// Object Initialization
//      ↓
// Object is Used
//      ↓
// Object becomes Unreachable
//      ↓
// Garbage Collection
//
// In Java, objects are created using 'new' and stored in
// heap memory. When an object is no longer reachable by any
// reference, it becomes eligible for Garbage Collection.
//
// Java's Garbage Collector automatically removes such
// unused objects from memory.

 */

// ============================================================
// JAVA: CLASS, OBJECT AND DEFAULT CONSTRUCTOR
// ============================================================


// ------------------------------------------------------------
// STUDENT CLASS
// ------------------------------------------------------------
// A class is a blueprint/template for creating objects.
//
// Here, Student is a class.
// It contains the data that every Student object will have.

// ============================================================
// CLASS, OBJECT AND DEFAULT CONSTRUCTOR IN JAVA
// ============================================================


// ------------------------------------------------------------
// STUDENT CLASS
// ------------------------------------------------------------
// A class is a blueprint/template used to create objects.
//
// Student is our class.
// It contains the properties/data of a student.


/* 
class Student {

    // Instance variables
    // Every Student object will have its own copy of these.

    int id;
    int age;
    String name;
    int nos;


    // --------------------------------------------------------
    // DEFAULT CONSTRUCTOR
    // --------------------------------------------------------
    // A constructor is automatically called when an object
    // of the class is created using the 'new' keyword.
    //
    // This constructor has NO parameters.
    // Therefore, it is called a no-argument constructor.
    //
    // It is commonly referred to as a default constructor.

    Student() {

        System.out.println("Student Default Constructor Called");
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class class_object_constructor {

    public static void main(String[] args) {


        // ----------------------------------------------------
        // OBJECT CREATION
        // ----------------------------------------------------
        //
        // Student A = new Student();
        //
        // Student  -> Class / data type
        // A        -> Reference variable
        // new      -> Creates a new Student object
        // Student() -> Calls the Student constructor
        //
        // The constructor is automatically executed when
        // the object is created.

        Student A = new Student();


        // ----------------------------------------------------
        // ASSIGNING DATA TO THE OBJECT
        // ----------------------------------------------------
        //
        // A.id means:
        // Access the 'id' variable belonging to the
        // Student object referred to by A.

        A.id = 1;
        A.age = 14;
        A.name = "Ranu";
        A.nos = 5;


        // ----------------------------------------------------
        // PRINTING OBJECT DATA
        // ----------------------------------------------------

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
    }
}
*/

// so ye bohot lamba nhi lagra ?? so isse acha we will use parametrized constructor instead of default

//PARAMETRIZED CONSTRUCTOR

// ============================================================
// PARAMETERIZED CONSTRUCTOR IN JAVA
// ============================================================
//
// A constructor is a special method that is automatically called
// when we create an object using the "new" keyword.
//
// A PARAMETERIZED CONSTRUCTOR is a constructor that accepts
// parameters/values while creating the object.
//
// Example:
// Student A = new Student(1, 21, "Rahul", 3);
//
// Here:
// 1      -> id
// 21     -> age
// "Rahul"-> name
// 3      -> nos (number of subjects)
//
//
// WHY DO WE USE A PARAMETERIZED CONSTRUCTOR?
// ------------------------------------------------------------
// Without a parameterized constructor, we would have to:
//
// Student A = new Student();  // Create object first
//
// A.id = 1;                  // Assign values separately
// A.age = 21;
// A.name = "Rahul";
// A.nos = 3;
//
// This takes many lines.
//
// With a parameterized constructor, we can do everything in ONE line:
//
// Student A = new Student(1, 21, "Rahul", 3);
//
// So parameterized constructors make object creation and
// initialization shorter, cleaner and easier.
//
// ============================================================


// class Student {

//     // --------------------------------------------------------
//     // INSTANCE VARIABLES
//     // --------------------------------------------------------
//     // These variables belong to each Student object.
//     //
//     // Every Student object will have its own:
//     // id
//     // age
//     // name
//     // nos
//     // --------------------------------------------------------

//     int id;
//     int age;
//     String name;
//     int nos;


//     // ========================================================
//     // PARAMETERIZED CONSTRUCTOR
//     // ========================================================
//     //
//     // This constructor accepts 4 parameters:
//     //
//     // int id
//     // int age
//     // String name
//     // int nos
//     //
//     // Whenever we create a Student object like:
//     //
//     // Student A = new Student(1, 21, "Rahul", 3);
//     //
//     // Java automatically calls this constructor.
//     //
//     // ========================================================

//     Student(int id, int age, String name, int nos) {

//         // ----------------------------------------------------
//         // WHAT IS "this"?
//         // ----------------------------------------------------
//         //
//         // "this" refers to the CURRENT OBJECT.
//         //
//         // Suppose we write:
//         //
//         // Student A = new Student(1, 21, "Rahul", 3);
//         //
//         // While this constructor is executing,
//         // "this" refers to object A.
//         //
//         // Therefore:
//         //
//         // this.id
//         //
//         // means:
//         // "id variable belonging to the current Student object."
//         //
//         // ----------------------------------------------------


//         // ----------------------------------------------------
//         // this.id = id;
//         // ----------------------------------------------------
//         //
//         // There are TWO "id"s here.
//         //
//         // LEFT SIDE:
//         // this.id
//         // = id variable belonging to the object
//         //
//         // RIGHT SIDE:
//         // id
//         // = parameter received by the constructor
//         //
//         // So:
//         //
//         // this.id = id;
//         //
//         // means:
//         //
//         // object's id = constructor's id
//         //
//         // If we created:
//         //
//         // Student A = new Student(1, 21, "Rahul", 3);
//         //
//         // then:
//         //
//         // this.id = id;
//         // becomes:
//         // A.id = 1;
//         // ----------------------------------------------------

//         this.id = id;


//         // ----------------------------------------------------
//         // Same concept for age:
//         //
//         // this.age = age;
//         //
//         // this.age -> object's age
//         // age      -> constructor parameter
//         //
//         // So:
//         //
//         // object's age = parameter age
//         //
//         // For object A:
//         //
//         // A.age = 21;
//         // ----------------------------------------------------

//         this.age = age;


//         // ----------------------------------------------------
//         // Same concept for name:
//         //
//         // this.name -> object's name
//         // name      -> constructor parameter
//         //
//         // So:
//         //
//         // A.name = "Rahul";
//         // ----------------------------------------------------

//         this.name = name;


//         // ----------------------------------------------------
//         // Same concept for nos:
//         //
//         // this.nos -> object's nos
//         // nos      -> constructor parameter
//         //
//         // So:
//         //
//         // A.nos = 3;
//         // ----------------------------------------------------

//         this.nos = nos;
//     }


//     // ========================================================
//     // METHODS / BEHAVIOURS
//     // ========================================================
//     //
//     // These methods describe what a Student can DO.
//     //
//     // A Student can:
//     // - bunk()
//     // - study()
//     // - sleep()
//     //
//     // ========================================================

//     void bunk() {
//         System.out.println(name + " is bunking the lecture.");
//     }

//     void study() {
//         System.out.println(name + " is studying.");
//     }

//     void sleep() {
//         System.out.println(name + " is sleeping.");
//     }
// }


// // ============================================================
// // MAIN CLASS
// // ============================================================

// public class class_object_constructor {

//     public static void main(String[] args) {


//         // ====================================================
//         // CREATING AN OBJECT USING PARAMETERIZED CONSTRUCTOR
//         // ====================================================
//         //
//         // Student A = new Student(1, 21, "Rahul", 3);
//         //
//         // "Student"
//         // -> Data type / class name
//         //
//         // "A"
//         // -> Reference variable
//         //
//         // "new"
//         // -> Creates a new Student object in memory
//         //
//         // "Student(...)"
//         // -> Calls the Student constructor
//         //
//         // The values:
//         //
//         // 1          -> id
//         // 21         -> age
//         // "Rahul"    -> name
//         // 3          -> nos
//         //
//         // are passed to the parameterized constructor.
//         //
//         // ====================================================

//         Student A = new Student(1, 21, "Rahul", 3);


//         // ====================================================
//         // WHAT HAPPENS INSIDE THE CONSTRUCTOR?
//         // ====================================================
//         //
//         // The constructor receives:
//         //
//         // id   = 1
//         // age  = 21
//         // name = "Rahul"
//         // nos  = 3
//         //
//         // Then:
//         //
//         // this.id = id;
//         // this.age = age;
//         // this.name = name;
//         // this.nos = nos;
//         //
//         // stores those values inside object A.
//         //
//         // So object A becomes:
//         //
//         // A
//         // ----------------
//         // id   = 1
//         // age  = 21
//         // name = Rahul
//         // nos  = 3
//         // ----------------


//         // ====================================================
//         // ACCESSING OBJECT VARIABLES
//         // ====================================================
//         //
//         // A.name means:
//         // "name variable belonging to object A"
//         //
//         // A.age means:
//         // "age variable belonging to object A"
//         //
//         // A.id means:
//         // "id variable belonging to object A"
//         //
//         // A.nos means:
//         // "nos variable belonging to object A"
//         // ====================================================

//         System.out.println("Name: " + A.name);
//         System.out.println("Age: " + A.age);
//         System.out.println("ID: " + A.id);
//         System.out.println("Number of Subjects: " + A.nos);


//         // ====================================================
//         // CALLING METHODS USING OBJECT A
//         // ====================================================
//         //
//         // A.bunk()
//         // -> Calls bunk() method of object A
//         //
//         // A.study()
//         // -> Calls study() method of object A
//         //
//         // A.sleep()
//         // -> Calls sleep() method of object A
//         // ====================================================

//         A.bunk();
//         A.study();
//         A.sleep();


//         // ====================================================
//         // WHY PARAMETERIZED CONSTRUCTOR IS SHORTER
//         // ====================================================
//         //
//         // WITHOUT PARAMETERIZED CONSTRUCTOR:
//         //
//         // Student A = new Student();
//         //
//         // A.id = 1;
//         // A.age = 21;
//         // A.name = "Rahul";
//         // A.nos = 3;
//         //
//         // We need to create the object first and then
//         // initialize each variable separately.
//         //
//         //
//         // WITH PARAMETERIZED CONSTRUCTOR:
//         //
//         // Student A = new Student(1, 21, "Rahul", 3);
//         //
//         // Object creation AND initialization happen together.
//         //
//         // This makes the code:
//         //
//         // 1. Shorter
//         // 2. Cleaner
//         // 3. Easier to read
//         // 4. Easier to create multiple objects
//         //
//         // ====================================================


//         // ====================================================
//         // CREATING MORE STUDENTS
//         // ====================================================
//         //
//         // We can easily create different objects with
//         // different values.
//         // ====================================================

//         Student B = new Student(2, 22, "Amit", 5);
//         Student C = new Student(3, 20, "Priya", 4);


//         // B and C have their own separate data.
//         //
//         // B:
//         // id = 2
//         // age = 22
//         // name = Amit
//         // nos = 5
//         //
//         // C:
//         // id = 3
//         // age = 20
//         // name = Priya
//         // nos = 4


//         System.out.println("\nSecond Student:");
//         System.out.println(B.name);
//         System.out.println(B.age);

//         System.out.println("\nThird Student:");
//         System.out.println(C.name);
//         System.out.println(C.age);
//     }
// }


// ek aur type ka constructor hoat hai called copy constructor
// eg Student B = new Student(A) so this is copy constructor // copying an object (uske attrib)
// agar Student B = new student () toh ye default ctor
// agar Student B = new student (152664) i.e value daalta hu toh ye param ctor

// ============================================================
// COPY CONSTRUCTOR IN JAVA
// ============================================================
//
// A COPY CONSTRUCTOR is a constructor that creates a NEW object
// by copying the values/data from an EXISTING object.
//
// Example:
//
// Student B = new Student(A);
//
// Here:
// A = existing Student object
// B = new Student object
//
// The values stored inside A are copied into B.
//
// ============================================================


// class Student {

//     // --------------------------------------------------------
//     // INSTANCE VARIABLES
//     // --------------------------------------------------------
//     // Every Student object will have these variables.
//     // --------------------------------------------------------

//     int id;
//     int age;
//     String name;
//     int nos;


//     // ========================================================
//     // PARAMETERIZED CONSTRUCTOR
//     // ========================================================
//     //
//     // This constructor is used when we want to create a Student
//     // object by directly providing values.
//     //
//     // Example:
//     //
//     // Student A = new Student(1, 12, "Rahul", 3);
//     //
//     // The values are:
//     //
//     // id   = 1
//     // age  = 12
//     // name = Rahul
//     // nos  = 3
//     //
//     // ========================================================

//     Student(int id, int age, String name, int nos) {

//         // "this.id" means the id belonging to the CURRENT object.
//         //
//         // "id" on the right side is the parameter.
//         //
//         // So:
//         //
//         // this.id = id;
//         //
//         // means:
//         //
//         // object's id = parameter id

//         this.id = id;

//         // object's age = parameter age
//         this.age = age;

//         // object's name = parameter name
//         this.name = name;

//         // object's nos = parameter nos
//         this.nos = nos;

//         System.out.println("Student Parameterised Constructor Called");
//     }


//     // ========================================================
//     // COPY CONSTRUCTOR
//     // ========================================================
//     //
//     // This is a COPY CONSTRUCTOR.
//     //
//     // It accepts another Student object as a parameter.
//     //
//     // Student(Student A)
//     //
//     // Here:
//     //
//     // "A" is an existing Student object.
//     //
//     // We copy the values from A into the NEW object.
//     //
//     // ========================================================

//     Student(Student A) {

//         // ----------------------------------------------------
//         // COPY THE ID
//         // ----------------------------------------------------
//         //
//         // this.id
//         // -> id of the NEW object
//         //
//         // A.id
//         // -> id of the EXISTING object A
//         //
//         // So:
//         //
//         // this.id = A.id;
//         //
//         // means:
//         //
//         // NEW object's id = A's id
//         // ----------------------------------------------------

//         this.id = A.id;


//         // ----------------------------------------------------
//         // COPY THE AGE
//         // ----------------------------------------------------
//         //
//         // NEW object's age = A's age
//         // ----------------------------------------------------

//         this.age = A.age;


//         // ----------------------------------------------------
//         // COPY THE NAME
//         // ----------------------------------------------------
//         //
//         // NEW object's name = A's name
//         // ----------------------------------------------------

//         this.name = A.name;


//         // ----------------------------------------------------
//         // COPY THE NUMBER OF SUBJECTS
//         // ----------------------------------------------------
//         //
//         // NEW object's nos = A's nos
//         // ----------------------------------------------------

//         this.nos = A.nos;


//         // This is only to show that the copy constructor
//         // has been called.
//         System.out.println("Student Copy Constructor Called");
//     }


//     // ========================================================
//     // METHODS / BEHAVIOURS
//     // ========================================================

//     void bunk() {

//         System.out.println(name + " is bunking.");
//     }


//     void study() {

//         System.out.println(name + " is studying.");
//     }


//     void sleep() {

//         System.out.println(name + " sleeping");
//     }
// }


// // ============================================================
// // MAIN CLASS
// // ============================================================

// public class class_object_constructor {

//     public static void main(String[] args) {


//         // ====================================================
//         // STEP 1: CREATE OBJECT A
//         // ====================================================
//         //
//         // We use the parameterized constructor here.
//         //
//         // Student A = new Student(1, 12, "Rahul", 3);
//         //
//         // This creates the FIRST Student object.
//         //
//         // Object A contains:
//         //
//         // id   = 1
//         // age  = 12
//         // name = Rahul
//         // nos  = 3
//         //
//         // ====================================================

//         Student A = new Student(1, 12, "Rahul", 3);


//         // ====================================================
//         // STEP 2: CREATE OBJECT B USING COPY CONSTRUCTOR
//         // ====================================================
//         //
//         // This is the most important line:
//         //
//         // Student B = new Student(A);
//         //
//         // We are creating a NEW Student object called B.
//         //
//         // We pass the EXISTING object A to the constructor.
//         //
//         // Therefore Java calls:
//         //
//         // Student(Student A)
//         //
//         // which is our copy constructor.
//         //
//         // ====================================================

//         Student B = new Student(A);


//         // ====================================================
//         // WHAT HAPPENS INSIDE THE COPY CONSTRUCTOR?
//         // ====================================================
//         //
//         // Suppose A contains:
//         //
//         // A.id   = 1
//         // A.age  = 12
//         // A.name = "Rahul"
//         // A.nos  = 3
//         //
//         // The copy constructor does:
//         //
//         // this.id = A.id;
//         // this.age = A.age;
//         // this.name = A.name;
//         // this.nos = A.nos;
//         //
//         // Since "this" represents the NEW object B,
//         // this becomes:
//         //
//         // B.id   = A.id;
//         // B.age  = A.age;
//         // B.name = A.name;
//         // B.nos  = A.nos;
//         //
//         // Therefore:
//         //
//         // B.id   = 1
//         // B.age  = 12
//         // B.name = Rahul
//         // B.nos  = 3
//         //
//         // ====================================================


//         // ====================================================
//         // PRINTING DATA OF OBJECT B
//         // ====================================================
//         //
//         // Even though we never manually wrote:
//         //
//         // B.id = 1;
//         // B.age = 12;
//         // B.name = "Rahul";
//         // B.nos = 3;
//         //
//         // B already contains these values because the
//         // copy constructor copied them from A.
//         // ====================================================

//         System.out.println("Name: " + B.name);
//         System.out.println("Age: " + B.age);
//         System.out.println("ID: " + B.id);
//         System.out.println("Number of Subjects: " + B.nos);


//         // ====================================================
//         // CALLING METHOD USING B
//         // ====================================================
//         //
//         // B.sleep() calls the sleep() method of object B.
//         //
//         // Since B.name is "Rahul", the output will be:
//         //
//         // Rahul sleeping
//         //
//         // ====================================================

//         B.sleep();
//     }
// }



/*
Understand the flow
STEP 1


Student A = new Student(1, 12, "Rahul", 3);


              A
        ┌─────────────┐
        │ id = 1      │
        │ age = 12    │
        │ name= Rahul │
        │ nos = 3     │
        └─────────────┘




STEP 2


Student B = new Student(A);


        A                     B
   ┌─────────────┐       ┌─────────────┐
   │ id = 1      │ ────► │ id = 1      │
   │ age = 12    │ ────► │ age = 12    │
   │ name= Rahul │ ────► │ name= Rahul │
   │ nos = 3     │ ────► │ nos = 3     │
   └─────────────┘       └─────────────┘
      OLD OBJECT             NEW OBJECT
The key difference
Parameterized constructor:

Student A = new Student(1, 12, "Rahul", 3);

You provide new values.

Copy constructor:

Student B = new Student(A);

You provide an existing object, and its values are copied into the new object.

Also remember: Java does not provide a special built-in copy constructor syntax. We create one ourselves by defining a constructor that accepts an object of the same class:

Student(Student A)

And the most important line inside it is:

this.id = A.id;

Here this = the new/current object, while A = the old/existing object being copied.
*/

// 5. OBJECT LIFE CYCLE

/*
BASIC LIFECYCLE- 
1. Declaration
      ↓
2. Object Creation
      ↓
3. Constructor Execution
      ↓
4. Object Initialization
      ↓
5. Object Usage
      ↓
6. Object Becomes Unreachable
      ↓
7. Eligible for Garbage Collection
      ↓
8. Garbage Collector may remove it
*/

// ============================================================
//              OBJECT LIFE CYCLE IN JAVA
// ============================================================
//
// An OBJECT LIFE CYCLE describes the different stages through
// which an object goes during its lifetime.
//
// In simple words:
//
// DECLARE → CREATE → INITIALIZE → USE → UNREACHABLE →
// GARBAGE COLLECTION
//
// ============================================================
//
// IMPORTANT STAGES:
//
// 1. Object Declaration
// 2. Object Creation
// 3. Constructor Execution
// 4. Object Initialization
// 5. Object Usage
// 6. Object Becomes Unreachable
// 7. Object Becomes Eligible for Garbage Collection
// 8. Garbage Collector eventually removes the object
//
// ============================================================


class Student {

    // --------------------------------------------------------
    // INSTANCE VARIABLES
    // --------------------------------------------------------
    //
    // These variables belong to every Student object.
    //
    // Every Student object gets its own copy of these variables.
    // --------------------------------------------------------

    int id;
    int age;
    String name;


    // ========================================================
    // PARAMETERIZED CONSTRUCTOR
    // ========================================================
    //
    // A constructor is automatically called when an object
    // is created using the "new" keyword.
    //
    // Example:
    //
    // Student A = new Student(1, 21, "Rahul");
    //
    // Java creates the object and then calls this constructor
    // to initialize the object's data.
    //
    // ========================================================

    Student(int id, int age, String name) {

        // "this" refers to the CURRENT OBJECT.
        //
        // this.id = id means:
        //
        // object's id = constructor parameter id

        this.id = id;

        // object's age = constructor parameter age
        this.age = age;

        // object's name = constructor parameter name
        this.name = name;

        System.out.println("Constructor called for " + this.name);
    }


    // ========================================================
    // METHOD
    // ========================================================
    //
    // This method represents the object being USED.
    // ========================================================

    void study() {

        System.out.println(name + " is studying.");
    }


    // ========================================================
    // METHOD TO DISPLAY OBJECT DATA
    // ========================================================

    void display() {

        System.out.println("ID   : " + id);
        System.out.println("Age  : " + age);
        System.out.println("Name : " + name);
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class class_object_constructor {
//ONJECT LIFE CYCLE 
    public static void main(String[] args) {


        // ====================================================
        // STAGE 1: OBJECT DECLARATION
        // ====================================================
        //
        // Here we declare a reference variable.
        //
        // Student A;
        //
        // IMPORTANT:
        //
        // At this point, NO Student object has been created.
        //
        // "A" is only a reference variable.
        //
        // It can potentially refer to a Student object.
        //
        // Think of it like:
        //
        // A
        // ↓
        // nothing
        //
        // So declaration does NOT create the object.
        // ====================================================

        Student A;


        // ====================================================
        // STAGE 2: OBJECT CREATION
        // ====================================================
        //
        // Now we create the actual Student object using "new".
        //
        // Student A = new Student(1, 21, "Rahul");
        //
        // "new" tells Java to create an object in memory.
        //
        // A reference to that object is stored in variable A.
        //
        // Conceptually:
        //
        // A ───────────────► Student Object
        //                    ┌──────────────┐
        //                    │ id = 1       │
        //                    │ age = 21     │
        //                    │ name = Rahul │
        //                    └──────────────┘
        //
        // ====================================================

        A = new Student(1, 21, "Rahul");


        // ====================================================
        // STAGE 3: CONSTRUCTOR EXECUTION
        // ====================================================
        //
        // When we write:
        //
        // new Student(1, 21, "Rahul")
        //
        // Java automatically calls:
        //
        // Student(int id, int age, String name)
        //
        // The constructor initializes the object.
        //
        // The values:
        //
        // id   = 1
        // age  = 21
        // name = Rahul
        //
        // are stored inside the newly created object.
        //
        // Constructor is NOT called manually.
        //
        // Java calls it automatically during object creation.
        //
        // ====================================================


        // ====================================================
        // STAGE 4: OBJECT INITIALIZATION
        // ====================================================
        //
        // After the constructor executes, the object contains
        // its initialized data.
        //
        // Object A:
        //
        // ┌─────────────────────┐
        // │ id   = 1            │
        // │ age  = 21           │
        // │ name = Rahul        │
        // └─────────────────────┘
        //
        // The reference A points to this object.
        //
        // ====================================================


        // ====================================================
        // STAGE 5: OBJECT USAGE
        // ====================================================
        //
        // Now we can use the object.
        //
        // We can:
        // - Access its variables
        // - Call its methods
        // - Modify its data
        //
        // ====================================================

        System.out.println("\nStudent Details:");

        A.display();

        A.study();


        // We can also modify the object's data.

        A.age = 22;

        System.out.println("\nAfter changing age:");

        A.display();


        // ====================================================
        // ANOTHER OBJECT
        // ====================================================
        //
        // We can create another Student object.
        //
        // B is a different object from A.
        //
        // ====================================================

        Student B = new Student(2, 20, "Amit");

        B.display();

        B.study();


        // ====================================================
        // STAGE 6: OBJECT BECOMES UNREACHABLE
        // ====================================================
        //
        // Consider:
        //
        // B = null;
        //
        // This removes the reference from B to the Student
        // object that B was pointing to.
        //
        // Before:
        //
        // B ───────────────► Student Object
        //
        // After:
        //
        // B ───────────────► null
        //
        // If NO other reference points to that Student object,
        // the object becomes UNREACHABLE.
        //
        // An unreachable object is no longer accessible by the
        // Java program.
        //
        // ====================================================

        B = null;


        // ====================================================
        // STAGE 7: ELIGIBLE FOR GARBAGE COLLECTION
        // ====================================================
        //
        // The Student object that B was pointing to is now
        // unreachable.
        //
        // Therefore, it becomes ELIGIBLE FOR GARBAGE COLLECTION.
        //
        // IMPORTANT:
        //
        // "Eligible for Garbage Collection" does NOT mean that
        // the object is immediately deleted.
        //
        // It only means that the JVM is allowed to remove it
        // when the Garbage Collector decides to do so.
        //
        // ====================================================


        // ====================================================
        // STAGE 8: GARBAGE COLLECTION
        // ====================================================
        //
        // Java has an automatic Garbage Collector (GC).
        //
        // The Garbage Collector finds objects that are no longer
        // reachable and can reclaim their memory.
        //
        // We do NOT manually delete objects in Java.
        //
        // There is no "delete object" keyword in Java.
        //
        // ====================================================
        //
        // We can request the JVM to run Garbage Collection using:
        //
        // System.gc();
        //
        // BUT:
        //
        // System.gc() is only a REQUEST.
        //
        // It does NOT guarantee that Garbage Collection will
        // happen immediately.
        //
        // ====================================================

        System.gc();


        // ====================================================
        // IMPORTANT:
        // ====================================================
        //
        // After:
        //
        // B = null;
        //
        // the object previously referenced by B may become
        // eligible for garbage collection.
        //
        // However, the object A is STILL reachable:
        //
        // A ───────────────► Student Object
        //
        // Therefore A's object is NOT eligible for GC yet.
        //
        // ====================================================


        // ====================================================
        // FINAL STAGE:
        // OBJECT A ALSO BECOMES UNREACHABLE
        // ====================================================
        //
        // At the end of main(), local reference variable A goes
        // out of scope.
        //
        // Therefore, after main() finishes, the object that A
        // was referring to may also become unreachable.
        //
        // It can then become eligible for Garbage Collection.
        //
        // ====================================================
    }
}

//THIS EXAMPLE WAS GPT GENERATED

//LEC 17 ENDS - https://www.youtube.com/watch?v=S3MX5AU2hw4&list=PLDzeHZWIZsTqNW1gvXXAicBgku9uPZeOC&index=19