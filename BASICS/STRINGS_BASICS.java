/*
what is string ??
a string is ds which repr set of char and is used to store text 
char ch = 'A';       // single character
String str = "ABC";  // sequence of characters

creation of string ??
1. using string literal - String name = "Vedant";
Here "Vedant" is a String literal.
This is the most commonly used method.

2. Using new Keyword
String name = new String("Vedant");
Here, a new String object is explicitly created.

new creates separate String objects.

STRING POOL -
WE HAVE 2 TYPES OF MEMORY STACK AND HEAP 
HEAP MEMORY HAS STRING POOL 

AB LETS UNDERSTAND DIFFERNCE CREATED BY CREATION OF STRING METHODS
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");
STACK                            HEAP
┌─────────────┐
│ s1 ─────────┼──────────────▶ "Hello"
│             │                 String Pool
│ s2 ─────────┼──────────────▶
└─────────────┘

BOTH STRING S1 AND S2 WILL POINT TO SAME OBJECT HELLO 

String s1 = new String("Hello");
String s2 = new String("Hello");
STACK                         HEAP
┌─────────────┐              ┌────────────────────┐
│ s1 ─────────┼─────────────▶│ "Hello"            │
│             │              │ String Pool        │
│ s2 ─────────┼─────────────▶└────────────────────┘
│             │
│ s3 ─────────┼─────────────▶┌────────────────────┐
└─────────────┘              │ "Hello"            │
                             │ Normal Heap Object  │
                             └────────────────────┘
ISME 2 HELLO BANEGE AND DONO KO ALAG ALAG STRING POINT KAREGE

*/
public class STRINGS_BASICS {

    // WE HAVE MANY METHODS FOR STRINGS EG - LENGTH, CHARAT
     public static void main(String[] args) {

//         String str = "Vedant";

//         // length()
//         System.out.println(str.length());

//         // charAt()
//         System.out.println(str.charAt(2));
//     }
// }

// Immutable means that once a String object is created, its value cannot be changed.               String is immutable in Java, which means once a String object is created, its value cannot be changed. Any operation that appears to modify a String creates a new String object instead.              
// public class Main {
//     public static void main(String[] args) {

//         String str = "Hello";

//         str.concat(" World");

//         System.out.println(str);
//     }
// }


//NOTEEEEEEEEEEEEE
/*
== String ke andar ki value/content compare nahi karta.
Ye check karta hai ki dono reference variables same object ko refer kar rahe hain ya nahi.

Tumhare code mein:

String name1 = "Love";
String name2 = "Love";

if(name1 == name2)

Java String Pool mein "Love" already hai, toh dono references same String object ko point karte hain.

STACK                    STRING POOL (HEAP)

name1 ────────────────┐
                      ├──────> "Love"
name2 ────────────────┘

Therefore:

name1 == name2

👉 true

✍️ Comment ke liye ye code likho:
String name1 = "Love";
String name2 = "Love";

// == compares the references, not the actual String values.
// It checks whether both reference variables point to the same object.
// Since both strings are literals with the same value,
// Java stores them in the String Pool and both refer to the same object.

if(name1 == name2) {
    System.out.println("Both references point to the same object");
}
else {
    System.out.println("Both references point to different objects");
}
Aur actual value/content compare karna ho:
if(name1.equals(name2)) {
    System.out.println("Both strings have the same value");
}

Short note yaad rakh:

== → Reference/Object compare
.equals() → Content/Value compare ✅ YE CASE SENSITIVE HAI

ISLIYE .equalsIgnoreCase EXIST KARTA HAI
*/

// STRING INPUT
//DIFFERENCE BETWEEN NEXT AND NEXTLINE
// nextLine()
// → Reads the complete line
// → Can read spaces

// next()
// → Reads only one word
// → Stops reading when it encounters a space

//   Scanner sc = new Scanner(System.in);

//         // nextLine() takes the complete line as input,
//         // including spaces.
//         System.out.println("Enter your full name:");
//         String str = sc.nextLine();

//         System.out.println("Value of nextLine(): " + str);


//         // next() takes input only until the first space.
//         System.out.println("Enter your full name again:");
//         String str2 = sc.next();

//         System.out.println("Value of next(): " + str2);

// }
// }

/*
        COMMON STRING METHODS IN JAVA

1. length()
   → Returns the number of characters in the String.
   → str.length()

2. charAt(index)
   → Returns the character at the given index.
   → str.charAt(2)

3. concat(str)
   → Joins two Strings.
   → str.concat("Hello")

4. equals(str)
   → Compares the content of two Strings.
   → str.equals(str2)

5. equalsIgnoreCase(str)
   → Compares Strings ignoring uppercase/lowercase.
   → str.equalsIgnoreCase(str2)

6. compareTo(str)
   → Compares two Strings lexicographically.
   → str.compareTo(str2)

7. toUpperCase()
   → Converts String to uppercase.
   → str.toUpperCase()

8. toLowerCase()
   → Converts String to lowercase.
   → str.toLowerCase()

9. trim()
   → Removes leading and trailing spaces.
   → str.trim()

10. substring(beginIndex)
    → Returns part of String from given index.
    → str.substring(2)

11. substring(beginIndex, endIndex)
    → Returns part of String between given indexes.
    → str.substring(1, 4)

12. indexOf(char/String)
    → Returns the index of the first occurrence.
    → str.indexOf('a')

13. lastIndexOf(char/String)
    → Returns the index of the last occurrence.
    → str.lastIndexOf('a')

14. contains(sequence)
    → Checks whether String contains a given sequence.
    → str.contains("Java")

15. startsWith(prefix)
    → Checks whether String starts with given prefix.
    → str.startsWith("Ja")

16. endsWith(suffix)
    → Checks whether String ends with given suffix.
    → str.endsWith("va")

17. replace(old, new)
    → Replaces characters/sequence in the String.
    → str.replace('a', 'b')

18. isEmpty()
    → Checks whether String length is 0.
    → str.isEmpty()

19. split(regex)
    → Splits String into an array based on a delimiter.
    → str.split(" ")

20. toCharArray()
    → Converts String into a character array.
    → str.toCharArray()
*/

//LETS DO THESE EXAMPLES NOW 

// String str = "Babbar";

// System.out.println(str.length());
// // → 6

// System.out.println(str.charAt(0));
// // → B

// String name = "BABBAR";

// System.out.println(str.equals(name));
// // → false

// System.out.println(str.equalsIgnoreCase(name));
// // → true

//      }
//     }

/*
    EMPTY vs BLANK

    Empty String:
    → Contains 0 characters.
    → Example: ""

    Blank String:
    → Contains only whitespace (spaces, tabs, etc.)
    → Example: "   "

    isEmpty()
    → Returns true only if length is 0.

    isBlank()
    → Returns true if String is empty OR contains only whitespace.

    trim()
    → Removes leading and trailing spaces.
    → Does NOT change the original String because String is immutable.
*/

// String str = "   ";

// System.out.println(str.length());
// // → 3

// System.out.println(str.isEmpty());
// // → false

// System.out.println(str.isBlank());
// // → true


// String name = "   Love   ";

// System.out.println(name.length());
// // → 10

// name.trim();  // Creates a new String, but we don't store it.

// System.out.println(name.length());
// // → 10


// // To actually remove the spaces:
// name = name.trim();

// System.out.println(name);
// // → Love

//      }
//     }

/*
    toUpperCase()
    → Converts all characters of a String to uppercase.

    toLowerCase()
    → Converts all characters of a String to lowercase.

    IMPORTANT:
    → Both methods return a NEW String.
    → Original String is not changed because Strings are immutable.
*/

// String name = "Love";

// System.out.println(name.toUpperCase());
// // → LOVE

// System.out.println(name.toLowerCase());
// // → love

//      }
//     }




// String str = "My Name is Love Babbar";

// /*
//     substring(beginIndex, endIndex)

//     → Extracts a part of the String.
    
//     beginIndex → Inclusive
//     endIndex   → Exclusive

//     Example:
//     substring(3, 7)

//     Index:
//     0 → M
//     1 → y
//     2 → space
//     3 → N
//     4 → a
//     5 → m
//     6 → e
//     7 → space

//     So substring(3, 7) gives:
//     "Name"
// */

// System.out.println(str.substring(3, 7));
// // → Name


// String str = "My Name is Love Babbar";

// /*
//     contains()

//     → Checks whether a String contains a given
//       character or sequence of characters.

//     → Returns true if found.
//     → Returns false if not found.
// */

// System.out.println(str.contains("Love"));
// // → true

// System.out.println(str.contains("Java"));
// // → false

/*
    String.valueOf()

    → Converts a primitive value into a String.

    Example:
    int num = 5123;
    String str = String.valueOf(num);

    num + 1 → 5124  (numeric addition)
    str + 1 → "51231" (String concatenation)
*/

// int num = 5123;

// // Converting int into String
// String str = String.valueOf(num);

// System.out.println(num + 1);
// // → 5124

// System.out.println(str + 1);
// // → 51231

//      }
//     }

// String name = "Rana Love Babbar";

// /*
//     startsWith()
//     → Checks whether the String starts with a
//       specified prefix.
//     → Returns true or false.

//     endsWith()
//     → Checks whether the String ends with a
//       specified suffix.
//     → Returns true or false.
// */

// System.out.println(name.startsWith("Rana"));
// // → true

// System.out.println(name.endsWith("ove Babbar"));
// // → true

// String name = "Babbar";

// /*
//     toCharArray()

//     → Converts a String into a character array.
//     → Each character gets a separate index.

//     "Babbar"
//      0 1 2 3 4 5
//      B a b b a r
// */

// char[] arr = name.toCharArray();

// // Print the character array
// for(char ch : arr) {
//     System.out.println("Value of ch: " + ch);
// }

//toCharArray() bahut useful hai jab tumhe String ke characters par loop chalana ho:
//toCharArray() → Converts a String into a char[] array, allowing us to access/process each character individually.

/*
    split()

    → Splits a String into multiple parts.
    → Returns a String[] array.
    → The argument passed to split() is called a delimiter/regex.

    Example:
    "My,name,is,Love,Babbar"

    Using "," as delimiter:

    My
    name
    is
    Love
    Babbar
*/

// String input = "My,name,is,Love,Babbar";

// String[] words = input.split(",");

// // Print each word
// for(String str : words) {
//     System.out.println(str);
//     }
//    }
// }

/*
    replace()

    → Replaces old character/sequence with a new character/sequence.
    → Returns a new String.
    → Original String is not changed because Strings are immutable.

    Syntax:
    str.replace(old, new)
*/

// String name = "Babbar";

// name = name.replace('b', 'l');

// System.out.println(name);
// // → Ballar

//PPPPPPPRRRRRRRRRAAAAAAAAAAAAACCCCCCCCCCCCTTTTTTTTTIIIIIIIIISSSSSSSSEEEEEEEE

// PRINT EACH AND EVERY CHARACTER
/*
    Traversing a String:

    → First find the length of the String.
    → Use a loop from index 0 to n-1.
    → charAt(i) gives the character at index i.
*/

// int n = str.length();

// for(int i = 0; i < n; i++) {

//     char ch = str.charAt(i);

//     System.out.println(ch);
// }
//      }
//     } THIS CODE NOT WORKING (CHECK LATER)

// TASK 2- COUNT LENGTH WITHOUT USING LENGTH()

//         // Main method ka code yaha likho

//         String str = "Babbar";

//         int len = getLengthOfString(str);

//         System.out.println(len);
//     }


//     // This method is OUTSIDE main()
//     // but INSIDE the class

//     static int getLengthOfString(String str) {

//         // Convert String into a character array
//         char[] arr = str.toCharArray();

//         // Find the length of character array
//         int len = arr.length;

//         return len;
//     }
// }

//COUNT VOWELS OF STRING

// //THIS IS MAIN METHOD ISLIYE UPAR LIKHA HAI
//     String str = "Babbar";

//     int vowels = countVowels(str);

//     System.out.println("Number of vowels: " + vowels);
// }


// static int countVowels(String str) {

//     // Convert String into a character array
//     char[] arr = str.toCharArray();

//     int count = 0;

//     // Traverse through every character
//     for(char ch : arr) {

//         // Check whether character is a vowel
//         if(ch == 'a' || ch == 'e' || ch == 'i' ||
//            ch == 'o' || ch == 'u') {

//             count++;
//         }
//     }

//     return count;
// }
// }

//REVERSE A STRING


//MAIN METHOD
//  String str = "Babbar";

//     String reversed = reverseString(str);

//     System.out.println(reversed);
// }

// /*
//     REVERSE A STRING

//     → Traverse the String from the last index to the first index.
//     → Add each character to the reversed String.
// */

// static String reverseString(String str) {

//     String rev = "";

//     // Start from last index and move towards index 0
//     for(int i = str.length() - 1; i >= 0; i--) {

//         rev = rev + str.charAt(i);
//     }

//     return rev;
// }
// }

//CHECK STRING PALINDROME

// EXAMPLE - NOON (GO LEFT TO RIGHT -> NOON)(GO R-> L = NOON)
// NOON IS A PALINDROME AND RACECAR TOO

//THIS IS MAIN METHOD
    String str = "madam";

    if(isPalindrome(str)) {
        System.out.println("Palindrome");
    }
    else {
        System.out.println("Not a Palindrome");
    }
}


/*
    CHECK STRING PALINDROME

    → A palindrome is a String that reads the same
      from left to right and right to left.

    Examples:
    "madam" → Palindrome
    "level" → Palindrome
    "hello" → Not a palindrome
*/

static boolean isPalindrome(String str) {

    String rev = "";

    // Reverse the String
    for(int i = str.length() - 1; i >= 0; i--) {
        rev = rev + str.charAt(i);
    }

    // Compare original String with reversed String
    return str.equals(rev);
}
     }
    

     // FOR REFERENCE SIR USED THIS IN YT LECTURE https://www.codehelp.in/articles/strings-in-java

     