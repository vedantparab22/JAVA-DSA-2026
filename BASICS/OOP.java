// OOP (Object-Oriented Programming):
// OOP is a programming approach where we organize data and behavior
// into objects.
//
// Example: Suppose we have 100 students. Instead of creating separate
// variables for every student, we create a Student class.
//
// The Student class acts as a blueprint/template containing:
//   - Data (properties): name, id, age, nos
//   - Behavior (methods): study(), sleep()
//
// Each actual student is an object/instance of the Student class.
// For example, Student s1 and Student s2 are different objects,
// but both follow the same Student class structure.
//
// The main idea of OOP is to bundle related data and methods together
// inside a single class and then create multiple objects from it.

/*
 * =========================
 * WHAT IS OOP?
 * =========================
 *
 * OOP stands for Object-Oriented Programming.
 *
 * Simple language mein:
 * OOP ek programming approach hai jisme hum program ko
 * "objects" ke around design karte hain.
 *
 * Real world mein har object ke paas:
 *   1. Kuch DATA / PROPERTIES hoti hain
 *   2. Kuch BEHAVIOUR / ACTIONS hote hain
 *
 * Example:
 * Ek STUDENT ke paas:
 *
 * Data / Properties:
 *   - name
 *   - id
 *   - age
 *   - rollNo
 *
 * Behaviour / Actions:
 *   - study()
 *   - sleep()
 *
 *
 * =========================
 * CLASS vs OBJECT
 * =========================
 *
 * CLASS:
 * Class ek BLUEPRINT / TEMPLATE hoti hai.
 *
 * Jaise building banane se pehle architect ek blueprint
 * banata hai. Blueprint khud building nahi hota,
 * bas building ka structure define karta hai.
 *
 * Similarly:
 *
 * class Student {
 *     String name;
 *     int id;
 *     int age;
 *
 *     void study() { }
 *     void sleep() { }
 * }
 *
 * Yaha Student ek CLASS hai.
 *
 * Ye batati hai ki ek student object ke paas kya-kya data
 * aur kya-kya behaviour hona chahiye.
 *
 *
 * OBJECT:
 * Object class ka actual INSTANCE hota hai.
 *
 * Example:
 *
 * Student s1 = new Student();
 * Student s2 = new Student();
 *
 * Yaha s1 aur s2 do DIFFERENT OBJECTS hain,
 * lekin dono Student class ke blueprint se bane hain.
 *
 *
 * =========================
 * REAL LIFE EXAMPLE
 * =========================
 *
 * Suppose college mein 100 students hain.
 *
 * Agar OOP use nahi karenge, toh hume manually bahut saare
 * variables manage karne pad sakte hain:
 *
 * student1Name, student1Age, student1Id...
 * student2Name, student2Age, student2Id...
 * student3Name, student3Age, student3Id...
 *
 * Ye approach large program mein messy ho jayegi.
 *
 * OOP mein hum ek Student class bana dete hain.
 *
 * Phir:
 *
 * Student s1 = new Student();
 * Student s2 = new Student();
 * Student s3 = new Student();
 *
 * Har object apna alag DATA maintain karega.
 *
 * For example:
 *
 * s1 -> name = "Rahul", age = 20, id = 101
 * s2 -> name = "Aman",  age = 21, id = 102
 * s3 -> name = "Vedant", age = 21, id = 103
 *
 * Lekin teeno objects ke paas same structure hai,
 * kyunki teeno Student class se create hue hain.
 *
 *
 * =========================
 * DATA + BEHAVIOUR TOGETHER
 * =========================
 *
 * OOP ka ek important concept hai:
 *
 *     DATA + METHODS = OBJECT
 *
 * Student ka data:
 *     name, id, age
 *
 * Student ka behaviour:
 *     study(), sleep()
 *
 * Hum related data aur uske related methods ko
 * ek hi class ke andar group kar dete hain.
 *
 * Isse code zyada organized aur manageable hota hai.
 *
 *
 * =========================
 * WHY DO WE NEED OOP?
 * =========================
 *
 * Real-world applications bahut large hote hain.
 * Example:
 *
 * Banking application mein:
 *     Customer
 *     Account
 *     Transaction
 *     Bank
 *
 * E-commerce application mein:
 *     User
 *     Product
 *     Cart
 *     Order
 *
 * College application mein:
 *     Student
 *     Teacher
 *     Course
 *     Department
 *
 * Har entity ka apna data aur behaviour hota hai.
 *
 * OOP hume in real-world entities ko program ke andar
 * objects ke form mein represent karne mein help karta hai.
 *
 *
 * =========================
 * MAIN IDEA OF OOP
 * =========================
 *
 * OOP ka main idea hai:
 *
 * "Program ko real-world entities ke similar objects
 * mein organize karna."
 *
 * Instead of thinking only about:
 *     "Mujhe kaunsa function likhna hai?"
 *
 * OOP mein hum sochte hain:
 *     "Mere system mein kaun-kaun se objects hain?"
 *
 * Aur har object:
 *     - kya DATA rakhega?
 *     - kya ACTION perform karega?
 *
 *
 * =========================
 * 4 MAIN PILLARS OF OOP
 * =========================
 *
 * OOP ke 4 major pillars hain:
 *
 * 1. ENCAPSULATION
 *    Data aur methods ko ek unit/class mein bind karna
 *    aur data ko direct unwanted access se protect karna.
 *
 * 2. INHERITANCE
 *    Ek class doosri class ke properties aur methods
 *    ko inherit/reuse kar sakti hai.
 *
 * 3. POLYMORPHISM
 *    Same method/interface different situations mein
 *    different behaviour de sakta hai.
 *
 * 4. ABSTRACTION
 *    Unnecessary internal details hide karke
 *    sirf important information show karna.
 *
 *
 * Short mein yaad rakho:
 *
 * CLASS   -> Blueprint
 * OBJECT  -> Actual instance
 *
 * DATA + BEHAVIOUR -> Object
 *
 * OOP -> Real-world entities ko objects ke form mein
 *        represent karke program ko organized banana.
 */

/*
Drawbacks of Functional / Procedural Programming
1Does not model real world problem very well.
2.If a new data is added, all the functions needs to be modified to access the Data.
Global data is accessible to all the functions.
4No clear boundaries and well definition of code.
5.No Modularity: Functional programs can become monolithic and difficult to maintain as they
grow in complexity.

What is OOP?
1.Programming is used to solve real-world problems, how can we model real-world systems
with programming languages.
2.A Programming Style, involves dividing a program into pieces of objects that can
communicate with each other.
3.( Objects based coding style, in which each object (aka, real-world entity) has its own
attributes and behaviour.
4.Fundamental Idea is to combine into single unit, both data and behaviour, that will promote
Modularity.
5.OoP promotes modularity by encapsulating data and behavior within objects. This modular
approach enhances code reusability and maintainability, as objects can be reused in different
parts of the program.
6.OOP is LIFE (We'll understand this on-the-go)

Objects and Classes.

1. Real world entities like cars, person, students, building etc., they all have some state and
behaviour.

2. For e.g., a Student named Rahul, is an real world entity, in programming, he is an object.

3. What defines, how would an object look like?, there must be a Blueprint i.e., Class.

4. Hence, Object is an instance of a Class.

 */

//OBJECT IS AN INSTANCE OF CLASS

/*
 * =========================
 * OBJECT IS AN INSTANCE OF CLASS
 * =========================
 *
 * Let's understand this with a real-life example:
 *
 * CLASS = Blueprint
 * OBJECT = Actual thing created from that blueprint
 *
 * Suppose an architect creates a blueprint for a HOUSE.
 *
 * The blueprint defines:
 *   - Number of rooms
 *   - Doors
 *   - Windows
 *   - Kitchen
 *
 * But the blueprint itself is NOT an actual house.
 * It only defines the structure of a house.
 *
 * Similarly, in Java:
 *
 * class Student {
 *     String name;
 *     int age;
 *
 *     void study() {
 *         System.out.println("Student is studying");
 *     }
 * }
 *
 * Here, Student is a CLASS.
 *
 * Student class tells us:
 *   - A Student will have a name
 *   - A Student will have an age
 *   - A Student can study()
 *
 * But Student itself is NOT an actual student.
 * It is only a blueprint/template.
 *
 *
 * Now we create an object:
 *
 * Student s1 = new Student();
 *
 * Here:
 *
 * Student       -> Class / Data type
 * s1            -> Reference variable
 * new Student() -> Creates an actual object in memory
 *
 * The object created using "new Student()" is an
 * INSTANCE of the Student class.
 *
 *
 * =========================
 * WHAT DOES "INSTANCE" MEAN?
 * =========================
 *
 * Instance simply means:
 *
 * "An actual individual object created from a class."
 *
 * So:
 *
 * Student = Class
 * s1      = Object / Instance of Student
 *
 *
 * We can create multiple objects from the same class:
 *
 * Student s1 = new Student();
 * Student s2 = new Student();
 * Student s3 = new Student();
 *
 * Now we have 3 different objects/instances of Student.
 *
 * All three objects follow the same structure defined
 * by the Student class, but they can contain different
 * values.
 *
 * Example:
 *
 * s1.name = "Rahul";
 * s1.age = 20;
 *
 * s2.name = "Aman";
 * s2.age = 21;
 *
 * s3.name = "Vedant";
 * s3.age = 21;
 *
 *
 * So remember:
 *
 * CLASS  -> Blueprint / Template
 * OBJECT -> Actual entity created from the blueprint
 * INSTANCE -> Another word for that actual object
 *
 *
 * Therefore:
 *
 * "An object is an instance of a class"
 *
 * simply means:
 *
 * "An object is an actual entity created using the
 * structure defined by a class."
 *
 * Example:
 *
 * Student rahul = new Student();
 *
 * Rahul's Student object is an INSTANCE of the
 * Student CLASS.
 */


/*
 * =========================
 * ATTRIBUTES AND BEHAVIOUR
 * =========================
 *
 * Every OBJECT has two important things:
 *
 * 1. ATTRIBUTES  -> What an object HAS / its current state
 * 2. BEHAVIOUR   -> What an object CAN DO
 *
 *
 * =========================
 * 1. ATTRIBUTES
 * =========================
 *
 * Attributes are the DATA / PROPERTIES of an object.
 *
 * Simple Hinglish:
 *
 * "Object ke andar jo information ya values store hoti hain,
 * unhe attributes kehte hain."
 *
 * Example:
 *
 * class Person {
 *     String name;
 *     int age;
 *     double height;
 * }
 *
 * Here:
 *     name   -> Attribute
 *     age    -> Attribute
 *     height -> Attribute
 *
 * Suppose we create different Person objects:
 *
 * Person rahul = new Person();
 * Person ram = new Person();
 * Person kumal = new Person();
 *
 * Each object can have DIFFERENT attribute values.
 *
 * Rahul:
 *     name = "Rahul"
 *     age = 18
 *     height = 5.8
 *
 * Ram:
 *     name = "Ram"
 *     age = 24
 *     height = 5.6
 *
 * Kunal:
 *     name = "Kunal"
 *     age = 23
 *     height = 5.9
 *
 * Notice:
 *
 * All objects have the SAME attributes:
 *     name, age, height
 *
 * But their VALUES can be different.
 *
 * Therefore, attributes represent the CURRENT STATE
 * or properties of an object.
 *
 *
 * =========================
 * 2. BEHAVIOUR
 * =========================
 *
 * Behaviour means the ACTIONS that an object can perform.
 *
 * Simple Hinglish:
 *
 * "Object kya-kya kaam kar sakta hai,
 * woh uska behaviour hai."
 *
 * In Java, behaviour is generally represented using
 * METHODS / FUNCTIONS.
 *
 * Example:
 *
 * class Person {
 *
 *     String name;
 *     int age;
 *
 *     void speak() {
 *         System.out.println("Person is speaking");
 *     }
 *
 *     void eat() {
 *         System.out.println("Person is eating");
 *     }
 * }
 *
 * Here:
 *
 *     speak() -> Behaviour
 *     eat()   -> Behaviour
 *
 * Because these are ACTIONS that a Person object can perform.
 *
 *
 * =========================
 * EASY WAY TO REMEMBER
 * =========================
 *
 * ATTRIBUTES = What the object HAS
 *
 * BEHAVIOUR  = What the object DOES
 *
 *
 * Example of a Person:
 *
 * Person HAS:
 *     name
 *     age
 *     height
 *
 * Person DOES:
 *     speak()
 *     eat()
 *
 *
 * =========================
 * IMPORTANT POINT
 * =========================
 *
 * Attributes + Behaviour together describe an OBJECT.
 *
 * For example:
 *
 * Person
 * ├── Attributes
 * │     ├── name
 * │     ├── age
 * │     └── height
 * │
 * └── Behaviour
 *       ├── speak()
 *       └── eat()
 *
 *
 * So in OOP:
 *
 *     ATTRIBUTES -> represent the STATE of an object
 *     BEHAVIOUR  -> represents the ACTIONS of an object
 *
 * And both are defined inside the CLASS and belong
 * to the objects created from that class.
 */

/*
So. ..

1. Object Oriented Programming (OOP) is a programming paradigm focused on implementing
real-world objects.

2. The identification of code objects similar to real-life objects and structuring code using
classes and objects signifies the use of OOP principles.

3. Classes and objects serve as the fundamental building blocks of the OOP concept.

4. Major Object Oriented languages include C++, Java, and Javascript. —

*/

/*
 * =========================
 * SO... WHAT IS OOP?
 * =========================
 *
 * OOP stands for Object-Oriented Programming.
 *
 * Simple Hinglish mein:
 *
 * OOP ek programming PARADIGM / APPROACH hai jisme hum
 * program ko real-world objects ke according design karte hain.
 *
 * Example:
 *
 * Real world mein hamare paas:
 *     Student
 *     Teacher
 *     Car
 *     Bank Account
 *
 * In sab ko hum programming mein classes aur objects
 * ke through represent kar sakte hain.
 *
 *
 * =========================
 * 1. OOP FOCUSES ON REAL-WORLD OBJECTS
 * =========================
 *
 * OOP ka main focus hota hai real-world entities ko
 * programming objects ke form mein represent karna.
 *
 * Example:
 *
 * Real world:
 *     Student
 *
 * Programming:
 *     class Student { ... }
 *
 * Then:
 *
 *     Student s1 = new Student();
 *     Student s2 = new Student();
 *
 * Yaha s1 aur s2 actual Student objects hain.
 *
 *
 * =========================
 * 2. IDENTIFY OBJECTS
 * =========================
 *
 * OOP mein hum pehle identify karte hain ki hamare
 * real-world problem mein kaun-kaun si entities hain.
 *
 * Example: College Management System
 *
 * Real-world entities:
 *     Student
 *     Teacher
 *     Course
 *     Department
 *
 * In entities ko hum programming mein classes bana sakte hain.
 *
 *     class Student { }
 *     class Teacher { }
 *     class Course { }
 *
 * Phir in classes ke objects create kar sakte hain.
 *
 *     Student s1 = new Student();
 *     Student s2 = new Student();
 *
 *
 * =========================
 * 3. CLASS AND OBJECT
 * =========================
 *
 * Class = Blueprint / Template
 *
 * Object = Actual instance created from that class
 *
 * Example:
 *
 *     class Student {
 *         String name;
 *         int id;
 *     }
 *
 * Student class ek blueprint hai.
 *
 *     Student s1 = new Student();
 *     Student s2 = new Student();
 *
 * s1 aur s2 Student class ke objects / instances hain.
 *
 * Dono same class se bane hain, lekin dono ke andar
 * different values ho sakti hain.
 *
 *
 * =========================
 * 4. WHY CLASS AND OBJECT?
 * =========================
 *
 * Suppose college mein 1000 students hain.
 *
 * Har student ke liye alag-alag variables banane ke bajay,
 * hum ek Student class bana sakte hain.
 *
 * Phir us class se 1000 different objects create kar sakte hain.
 *
 *     Student s1 = new Student();
 *     Student s2 = new Student();
 *     Student s3 = new Student();
 *     ...
 *     Student s1000 = new Student();
 *
 * Isse code organized, reusable aur manageable ban jata hai.
 *
 *
 * =========================
 * 5. INTEGER vs STUDENT EXAMPLE
 * =========================
 *
 * Jaise:
 *
 *     int a = 10;
 *     int b = 20;
 *
 * Yaha "int" ek DATA TYPE hai.
 * a aur b variables hain jo integer values store karte hain.
 *
 *
 * Similarly:
 *
 *     Student s1 = new Student();
 *     Student s2 = new Student();
 *
 * Yaha "Student" ek CLASS hai jo objects ka type define
 * karti hai.
 *
 * s1 aur s2 Student objects ko refer karte hain.
 *
 *
 * Easy way to remember:
 *
 *     int      -> Data type
 *     Student  -> Class / Reference type
 *
 *
 * =========================
 * 6. FUNDAMENTAL BUILDING BLOCKS
 * =========================
 *
 * Classes aur Objects OOP ke fundamental building blocks hain.
 *
 * CLASS:
 *     Structure / blueprint define karti hai.
 *
 * OBJECT:
 *     Us class ka actual instance hota hai.
 *
 * OOP mein hum classes define karte hain aur unke objects
 * create karke actual program build karte hain.
 *
 *
 * =========================
 * EXAM / INTERVIEW LINE
 * =========================
 *
 * OOP is a programming paradigm that organizes software
 * around objects, where objects represent real-world
 * entities and contain data (attributes) and behaviour
 * (methods).
 *
 *
 * SHORTLY:
 *
 * Real World Entity
 *        ↓
 *      CLASS
 *        ↓
 *     OBJECTS
 *
 * Example:
 *
 * Student → Student class → s1, s2, s3...
 *
 * So remember:
 *
 * CLASS  = Blueprint
 * OBJECT = Actual instance
 *
 */


// LEC ENDS TBH THIS LECTURE WAS VERY THEORIC AND BORING SO FEW SLIDE TEXT EXTRACTION ALONG WITH HEAVY SCREEN SHOT AIDED FROM LECTURE ARE USED WITH AI TEXTS FOR THESE NOTES HERE 

class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class OOP {   // MAIN CLASS OF OUR FILE (ENTRY POINT TOO I.E MAIN)

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Vedant";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();
    }
}
   