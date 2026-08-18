
    //oops ke 4 pillars hote hai and encapsulation is one of it 

    /*
    Encapsulation OR DATA HIDING
1. Definition:
1. Encapsulation binds data (matlab attrib) and methods (yaaneke func) in a class.
2. Like a capsule, it combines and binds them together.
i.e alag alag rakhu to koi significance nhi hai but saathme kardu to hai 

2. Function of Encapsulation:
1. Provides a secure layer.
2. Hides internal implementation of code and data in a class.
3. Exposes only necessary information to the external world.
// THATS WHY ITS SECURED LAYER AND THIS IS VERY IMP PROPERTY OF ENCAPSULATION (HIGHLIGHT)

3. As we are hiding data from outer classes or the world, Encapsulation is also known as Data hiding. 

/*
===========================================================
                    ENCAPSULATION IN JAVA
===========================================================

Encapsulation ka simple meaning hai:

    "Data + related methods ko ek single unit (class) ke andar
     bind karna aur data ko direct outside access se protect karna."

Easy Hinglish:

    Encapsulation = DATA KO WRAP KARNA + DATA KO PROTECT KARNA

-----------------------------------------------------------
REAL-LIFE EXAMPLE:
-----------------------------------------------------------

Socho hamare paas ek Student hai.

Student ke paas kuch information hai:

    id
    name
    age
    mobile number

Aur student kuch kaam bhi karta hai:

    study()
    sleep()
    chat()
    bunk()

Ab question:

Kya koi bhi outside person student ki saari information
directly change kar sakta hai?

Obviously nahi.

Example:

    Student ki age = 21

Koi outside person directly:

    age = -100

nahi kar sakta.

Isliye important/internal data ko PRIVATE rakha jaata hai.

-----------------------------------------------------------
PUBLIC vs PRIVATE
-----------------------------------------------------------

PUBLIC:

    public members ko class ke bahar se bhi access kiya ja sakta hai.

    Example:

        student.id
        student.name

    Agar id aur name public hain, toh outside code unko
    directly access kar sakta hai.

PRIVATE:

    private members ko class ke bahar se DIRECTLY access
    nahi kiya ja sakta.

    Example:

        student.age
        student.gf

    Agar age aur gf private hain, toh outside code directly
    unko access nahi kar sakta.

-----------------------------------------------------------
SIR KE DIAGRAM KA MEANING
-----------------------------------------------------------

Student ke andar:

    id       -> public
    name     -> public
    nos      -> public

    age      -> private
    gf       -> private

Matlab:

    Student A:

        A.id       -> allowed
        A.name     -> allowed
        A.nos      -> allowed

        A.age      -> NOT allowed directly
        A.gf       -> NOT allowed directly


Yaani private data ko bahar se directly access nahi
kar sakte.

-----------------------------------------------------------
WHY PRIVATE?
-----------------------------------------------------------

Private use karne ka main reason hai:

    DATA HIDING

Data hiding ka matlab:

    "Class ke internal/important data ko outside world se
     hide karna."

Example:

    Student ki age ko private rakha.

Ab outside code directly age ko modify nahi kar sakta.

Isse object ke data par control milta hai.

-----------------------------------------------------------
ENCAPSULATION KA MAIN BENEFIT
-----------------------------------------------------------

Agar saara data public kar diya:

    koi bhi directly data ko access/change kar sakta hai.

Example:

    age = -50
    marks = -100
    salary = -50000

Ye logically wrong values ho sakti hain.

Private rakhne se hum decide kar sakte hain ki:

    kaun data ko access karega
    kaise access karega
    kaise data modify hoga

Isliye encapsulation data ko CONTROLLED ACCESS provide
karta hai.

-----------------------------------------------------------
IMPORTANT:
-----------------------------------------------------------

Encapsulation ka matlab sirf "private keyword" nahi hai.

Private keyword encapsulation achieve karne ka ek
important mechanism hai.

Complete idea:

    Encapsulation
          |
          +---- Data ko class ke andar bind karna
          |
          +---- Direct access ko restrict karna
          |
          +---- Controlled access provide karna

-----------------------------------------------------------
STUDENT EXAMPLE
-----------------------------------------------------------

Student object ke andar:

    PUBLIC:
        id
        name
        nos

    PRIVATE:
        age
        gf

    INTERNAL BEHAVIOUR:
        study
        bunk
        sleep
        chatting

Public cheezein outside world ko available ho sakti hain.

Private cheezein object/class ke internal control mein
rakhi jaati hain.

-----------------------------------------------------------
DATA HIDING vs ENCAPSULATION
-----------------------------------------------------------

DATA HIDING:

    Important data ko direct outside access se hide karna.

    Example:

        age -> private

ENCAPSULATION:

    Data aur uske related behaviour ko ek class mein
    combine karna + access ko control karna.

Simple way:

    Data Hiding = "Data ko hide/protect karna"

    Encapsulation = "Data ko wrap karna + access control karna"

-----------------------------------------------------------
WHY DO WE USE ENCAPSULATION?
-----------------------------------------------------------

1. DATA SECURITY

   Important data ko directly modify nahi karne dete.

2. DATA HIDING

   Internal implementation details hide kar sakte hain.

3. CONTROLLED ACCESS

   Decide kar sakte hain ki data ko kaise access/change
   kiya jaayega.

4. MAINTAINABILITY

   Class ke internal implementation ko change karne par
   outside code ko minimum impact hota hai.

5. VALIDATION

   Data ko modify karne se pehle rules/checks laga sakte hain.

-----------------------------------------------------------
REAL-LIFE EXAMPLE
-----------------------------------------------------------

ATM ko example lo.

ATM ke andar bahut saara internal data aur logic hota hai:

    bank account information
    transaction processing
    security logic
    PIN verification
    balance processing

User ko ye internal implementation directly nahi dikhti.

User sirf controlled operations karta hai:

    withdraw
    deposit
    check balance

Yahi concept encapsulation ko samajhne mein help karta hai.

User ko internal implementation nahi pata,
but user ko required functionality controlled way mein
milti hai.

-----------------------------------------------------------
ONE-LINE DEFINITION FOR EXAM
-----------------------------------------------------------

Encapsulation is the process of wrapping data and methods
into a single unit called a class and restricting direct
access to the internal data using access control mechanisms.

-----------------------------------------------------------
HINGLISH DEFINITION
-----------------------------------------------------------

Encapsulation ka matlab hai data aur uske related methods
ko ek class ke andar wrap karna aur important/internal data
ko direct outside access se protect karna.

-----------------------------------------------------------
MOST IMPORTANT POINT
-----------------------------------------------------------

PUBLIC:

    Outside world se directly accessible.

PRIVATE:

    Outside world se directly accessible nahi.

PRIVATE DATA:

    Class ke andar controlled way mein access kiya jaata hai.

-----------------------------------------------------------
REMEMBER THIS:
-----------------------------------------------------------

            ENCAPSULATION
                  |
                  v
       +----------------------+
       |       STUDENT        |
       |                      |
       |  public:             |
       |      id              |
       |      name            |
       |      nos             |
       |                      |
       |  private:            |
       |      age             |
       |      gf              |
       |                      |
       |  internal:           |
       |      study           |
       |      sleep           |
       |      bunk            |
       |      chatting        |
       +----------------------+

Outside world:

    PUBLIC  -> Direct access possible
    PRIVATE -> Direct access NOT possible

-----------------------------------------------------------
SHORT TRICK TO REMEMBER
-----------------------------------------------------------

Encapsulation =

    "WRAP + HIDE + CONTROL"

    WRAP  -> Data and methods inside class
    HIDE  -> Important data hidden using private
    CONTROL -> Access ko control karna

===========================================================
*/

// ACCESS MODIFIERS 

// Access Modifiers
// 1. Way to define access to the data and methods of a class.
// 2. Public
// 1. Members declared as public are accessible from any part of the program.
// 2. They can be accessed by objects of the class and external code.
// 3. Private
// 1. Members declared as private are accessible only within the same class.
// 2. They are not accessible from outside the class, including derived classes.
// 4.
// 1. Members declared as protected are accessible within the same class and by derived
// Classes. 一
// 2. They are not directly accessible from external code. y


//Perfect Encapsulation
// 1. If all data members / variables are private.
// 2. Handling Access to Encapsulated Data
// * Despite encapsulation, external interaction is necessary.
// * Implementation of public methods, such as getters and setters, allows external
// communication.
// * These methods enable controlled access to the encapsulated data.

/*
===========================================================
             PERFECT ENCAPSULATION
===========================================================

Perfect Encapsulation ka simple meaning:

    "Class ke saare DATA MEMBERS / VARIABLES ko PRIVATE
     rakhna."

Example:

                PERSON CLASS
        +---------------------------+
        | private                   |
        |                           |
        | name                      |
        | age                       |
        |                           |
        |---------------------------|
        | public                    |
        |                           |
        | getName()                 |
        | setName()                 |
        +---------------------------+
                  |
                  | getName()
                  v
             Person P1
             P1.getName()


IMPORTANT:

    name aur age -> PRIVATE
    ↓
    Outside class directly access nahi kar sakti.

    Lekin outside world ko data ki zarurat ho sakti hai.
    Isliye public GETTER aur SETTER methods provide karte hain.

-----------------------------------------------------------
SIR KE DIAGRAM KA FLOW
-----------------------------------------------------------

    Person class
    +------------------+
    | private          |
    | name             |
    | age              |
    |                  |
    |------------------|
    | getName()        |  <-- public
    | setName()        |  <-- public
    +------------------+
             |
             | getName()
             | setName()
             v
        Person P1

Matlab:

    P1 --> getName() --> private name

    P1 --> setName() --> private name


Direct:

    P1.name

    ❌ NOT ALLOWED

Controlled:

    P1.getName()

    ✅ ALLOWED

    P1.setName(...)

    ✅ ALLOWED


-----------------------------------------------------------
WHY GETTER AND SETTER?
-----------------------------------------------------------

Agar data private hai, toh outside world directly data
access nahi kar sakti.

But kabhi-kabhi outside world ko data READ ya MODIFY karna
necessary hota hai.

Isliye:

    GETTER -> private data ko READ karne ke liye

    SETTER -> private data ko MODIFY/UPDATE karne ke liye


-----------------------------------------------------------
VERY SHORT EXAMPLE
-----------------------------------------------------------

private name;

getName()
    -> name ko return karega

setName()
    -> name ko update karega


Yaani:

    PRIVATE DATA
         ↓
    GETTER / SETTER
         ↓
    OUTSIDE WORLD


-----------------------------------------------------------
PERFECT ENCAPSULATION = 3 POINTS
-----------------------------------------------------------

1. ALL DATA MEMBERS ARE PRIVATE

       private name;
       private age;

2. PUBLIC GETTERS AND SETTERS PROVIDE KARTE HAIN

       getName()
       setName()

3. DATA KA ACCESS CONTROLLED HOTA HAI

       Direct access ❌
       Through methods ✅


-----------------------------------------------------------
EXAM DEFINITION
-----------------------------------------------------------

Perfect Encapsulation occurs when all data members of a
class are declared private and access to them is provided
through public methods such as getters and setters.

HINGLISH:

    Jab class ke saare data members private hote hain aur
    unko access/update karne ke liye public getters aur
    setters use kiye jaate hain, toh usse Perfect
    Encapsulation kehte hain.


-----------------------------------------------------------
REMEMBER:
-----------------------------------------------------------

    PRIVATE DATA
         ↓
    GETTER / SETTER
         ↓
    CONTROLLED ACCESS

    Direct access ❌
    Controlled access ✅

===========================================================
*/


// IMPLEMENTING ENCAPSULATION

/*
===========================================================
             ENCAPSULATION IN JAVA
===========================================================

Encapsulation ka main idea:

    1. Data ko class ke andar wrap karna.
    2. Important data members ko PRIVATE rakhna.
    3. Private data ko direct outside class se access nahi
       karne dena.
    4. Data ko access/update karne ke liye PUBLIC METHODS
       provide karna.

Simple formula:

    Encapsulation
          =
    PRIVATE DATA
          +
    CONTROLLED ACCESS


===========================================================
             STUDENT CLASS
===========================================================


/*
===========================================================
              ENCAPSULATION IN JAVA
===========================================================

Encapsulation ka matlab:

    Data ko class ke andar wrap karna
    +
    Data ko direct outside access se protect karna.

Perfect Encapsulation ke liye:

    1. Data members PRIVATE hone chahiye.
    2. Data ko access karne ke liye PUBLIC getters/setters
       use karne chahiye.

===========================================================
*/


// ---------------------------------------------------------
// STUDENT CLASS
// ---------------------------------------------------------
// CODE BEGINS HERE BELOWWWWWWWWWWWW
// class Student {

//     /*
//     -------------------------------------------------------
//     PRIVATE DATA MEMBERS
//     -------------------------------------------------------

//     Ye variables private hain.

//     Isliye Student class ke bahar directly:

//         A.age
//         A.gf

//     access nahi kar sakte.

//     Ye DATA HIDING hai.
//     */

//     private int age;
//     private String gf;


//     /*
//     -------------------------------------------------------
//     PUBLIC DATA MEMBERS
//     -------------------------------------------------------

//     Ye sirf concept samjhane ke liye public rakhe hain.

//     Perfect Encapsulation mein normally inhe bhi private
//     rakhenge.
//     */

//     public int id;
//     public String name;
//     public int nos;


//     /*
//     -------------------------------------------------------
//     CONSTRUCTOR
//     -------------------------------------------------------

//     Object create karte waqt values initialize hongi.

//     IMPORTANT:

//     Java mein named arguments nahi hote.

//     WRONG:

//         new Student(
//             id: 1,
//             age: 21
//         );

//     CORRECT:

//         new Student(
//             1,
//             21
//         );
//     */

//     Student(int id, int age, String name, int nos, String gf) {

//         this.id = id;
//         this.age = age;
//         this.name = name;
//         this.nos = nos;
//         this.gf = gf;
//     }


//     /*
//     -------------------------------------------------------
//                     GETTER
//     -------------------------------------------------------

//     Getter ka use private variable ki value READ karne
//     ke liye hota hai.

//         getAge() -> age return karega
//         getGf()  -> gf return karega
//     */

//     public int getAge() {
//         return age;
//     }

//     public String getGf() {
//         return gf;
//     }


//     /*
//     -------------------------------------------------------
//                     SETTER
//     -------------------------------------------------------

//     Setter ka use private variable ki value UPDATE karne
//     ke liye hota hai.

//         setAge() -> age change karega
//         setGf()  -> gf change karega
//     */

//     public void setAge(int age) {

//         /*
//         Validation bhi laga sakte hain.

//         Age negative nahi honi chahiye.
//         */

//         if (age >= 0) {
//             this.age = age;
//         } 
//         else {
//             System.out.println("Age cannot be negative!");
//         }
//     }

//     public void setGf(String gf) {
//         this.gf = gf;
//     }
// }


// // ---------------------------------------------------------
// // MAIN CLASS
// // ---------------------------------------------------------

// public class encapsulation {

//     public static void main(String[] args) {

//         /*
//         ===================================================
//                     OBJECT CREATION
//         ===================================================

//         Student ka object A create kar rahe hain.

//         IMPORTANT:

//         Java mein constructor arguments ko naam nahi dete.

//         WRONG:

//             id: 1
//             age: 21
//             name: "Rahul"

//         CORRECT:

//             1
//             21
//             "Rahul"
//         */

//         Student A = new Student(
//             1,
//             21,
//             "Rahul",
//             3,
//             "Tina"
//         );


//         /*
//         ===================================================
//                     PUBLIC DATA ACCESS
//         ===================================================

//         id, name aur nos public hain.

//         Isliye directly access kar sakte hain.
//         */

//         System.out.println("ID   : " + A.id);
//         System.out.println("Name : " + A.name);
//         System.out.println("NOS  : " + A.nos);


//         /*
//         ===================================================
//                     PRIVATE DATA ACCESS
//         ===================================================

//         Ye directly nahi kar sakte:

//             A.age;
//             A.gf;

//         Kyunki age aur gf PRIVATE hain.

//         Isliye compiler error dega.
//         */


//         /*
//         ===================================================
//                     GETTER
//         ===================================================

//         Private age ko getter ke through access kar rahe hain.

//             A.getAge()

//         Getter public hai, isliye outside class se call
//         kar sakte hain.
//         */

//         System.out.println("Age  : " + A.getAge());

//         System.out.println("GF   : " + A.getGf());


//         /*
//         ===================================================
//                     SETTER
//         ===================================================

//         Private age ko directly change nahi kar sakte:

//             A.age = 25;       // ERROR

//         Isliye setter use karte hain:

//             A.setAge(25);
//         */

//         A.setAge(25);

//         System.out.println("New Age : " + A.getAge());


//         /*
//         ===================================================
//                     VALIDATION
//         ===================================================

//         Setter ke andar validation hai.

//         Isliye negative age accept nahi hogi.
//         */

//         A.setAge(-10);

//     }
// }

// CODE ENDS HEREEEEEE




/*
             Student
        +------------------+
        |                  |
        | private age      |
        | private gf       |
        |                  |
        | public id        |
        | public name      |
        | public nos       |
        |                  |
        | getAge()         |
        | setAge()         |
        | getGf()          |
        | setGf()          |
        +------------------+
                 |
                 |
        ---------------------
        |                   |
     Getter              Setter
        |                   |
     READ                UPDATE
        |                   |
        +------- DATA ------+

        Short mein:

private → data ko hide karta hai.
getter → private data ko read karta hai.
setter → private data ko modify karta hai.
Setter mein validation bhi laga sakte hain.
Isi tarah outside world ko controlled access milta hai.
Agar saare data members private hain aur getters/setters se access diya gaya hai, toh ye Perfect Encapsulation ka example hai.
 */

// output 
// PS C:\Users\Vedant\Desktop\DSA 2026\BASICS> java encapsulation.java 
// ID   : 1
// Name : Rahul
// NOS  : 3
// Age  : 21
// GF   : Tina
// New Age : 25
// Age cannot be negative!

// if all attributes are private its pure encapsulation but aise to kuch dikhega hi kaise ??
//so we keep a public attributed linking to those private ones 

/*
===========================================================
                PERFECT ENCAPSULATION
===========================================================

Yahan Student class ke SAARE ATTRIBUTES private hain.

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

Iska matlab:

    Outside class directly inhe access NAHI kar sakti.

    s.id       ❌
    s.age      ❌
    s.name     ❌
    s.nos      ❌
    s.gf       ❌

Isliye ye PURE / PERFECT ENCAPSULATION ka example hai.

-----------------------------------------------------------
PROBLEM:
-----------------------------------------------------------

Agar saare attributes private hain, toh outside class
inhe access kaise karegi?

SOLUTION:

Hum ek PUBLIC METHOD create karte hain.

Example:

    public String getName()

Ye public method outside world aur private data ke
beech ek LINK / BRIDGE ki tarah kaam karta hai.

          OUTSIDE WORLD
                |
                | getName()
                ↓
        +---------------+
        |   Student     |
        |---------------|
        | private name  |
        +---------------+

Outside world private name ko DIRECTLY access nahi kar rahi.

Wo public method ke through controlled access kar rahi hai.
*/


class Student {

    // =====================================================
    // ALL ATTRIBUTES ARE PRIVATE
    // =====================================================

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;


    /*
    ========================================================
                    PUBLIC GETTER
    ========================================================

    Ye public method private 'name' ke liye ek LINK hai.

    Outside class:

        s.getName()

    call kar sakti hai.

    Lekin:

        s.name

    nahi kar sakti because name PRIVATE hai.
    */

    public String getName() {

        // Current object ka private name return hoga.
        return this.name;
    }


    /*
    ========================================================
                    CONSTRUCTOR
    ========================================================

    Constructor private attributes ko initial value
    dene ke liye use ho raha hai.
    */

    public Student(int id, int age, String name, int nos, String gf) {

        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
}


/*
============================================================
                        MAIN
============================================================
*/

public class encapsulation {

    public static void main(String[] args) {

        // Student object create kiya
        Student s = new Student(
            1,
            21,
            "Rahul",
            3,
            "Tina"
        );


        /*
        ====================================================
        DIRECT ACCESS
        ====================================================

        Ye sab ERROR denge because ALL attributes are private.

            s.id;
            s.age;
            s.name;
            s.nos;
            s.gf;

        ❌ DIRECT ACCESS NOT ALLOWED
        */


        /*
        ====================================================
                    CONTROLLED ACCESS
        ====================================================

        Private 'name' ko directly access nahi kiya.

        Instead public getName() method ko call kiya.

            s.getName()
                 |
                 ↓
            private name
                 |
                 ↓
              "Rahul"

        Ye public method private data ke liye
        LINK / BRIDGE ki tarah kaam kar raha hai.
        */

        System.out.println(s.getName());
    }
}

/*
Sir ke concept ko diagram se yaad rakho
             OUTSIDE CLASS
                  |
                  |
             s.getName()
                  |
                  ↓
        +-------------------+
        |      Student      |
        |                   |
        |  private id       |
        |  private age      |
        |  private name     |
        |  private nos      |
        |  private gf       |
        |                   |
        |-------------------|
        |  public getName() |  ← LINK / BRIDGE
        +-------------------+
                  |
                  ↓
          private name

Core idea:

All attributes private → direct access impossible → public getter/setter methods provide controlled access → this is Perfect Encapsulation.

And getName() attribute nahi hai — it's a public method that acts as the controlled access point to the private name attribute. */