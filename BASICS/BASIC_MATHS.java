//lec no. 15
//article - https://www.codehelp.in/articles/basic-maths-for-dsa

public class BASIC_MATHS {
    // print digits of number 
    // 5 % 2 -> i.e 5 modulo 2 is 1 i.e remainder

    //NOTE - VVIMP AB%10 - GIVES B (NUMBER IS AB SO GIVES LAST DIGIT I.E B)
    // NOTE - AB/10 - REMOVES LAST NUMBER 

    //LOGIC - AS 10 IS INT SO WHEN WE DIVIDE ANY NO.BY 10 EG:- 53127/10 WE WOULD GET 5312.7 AND AS ITS AN INT NUMBER IT WOULD REMOVED AND WILL GET 5312

    // LOGIC - AS 10 IS INT SO WHEN WE MODULO % ANY NO. BY 10 I.E 53127%10 WE DIVIDE REST OF WHOLE NUMBER AND ONLY LAST NUMBER REMAINS UNSOLVED AND AS WE CANT BORROW BY ADDING A DECIMAL DUE TO INT VALUE THE LAST REMAINDER STAYS THE ANSWER OF MODULO 

    // agar mere num=0, toh main cukiaunga
//agar mere num!=0, toh main processing kata hu


//  static void printDigits(int num ) { 
// // agar mere num=0, toh main cukieunga
// //agar mere num!=0, toh main processing kata hu
// while(num != 0) {
// int digit = num % 10;
// System.out.println(digit);
// //last digit remove
// num = num/10;
// }
// }
// public static void main(String[] args) {
    
// int num = 53127;
// printDigits(num);
// }

// }

/*
num = 317

1st iteration:
digit = 317 % 10 = 7
print 7
num = 317 / 10 = 31

2nd iteration:
digit = 31 % 10 = 1
print 1
num = 31 / 10 = 3

3rd iteration:
digit = 3 % 10 = 3
print 3
num = 3 / 10 = 0

Now num == 0, so loop stops.
 */

//COUNT DIGITS IN NUMBER 

//
// static int countDigits(int num) {

//     // count variable digits ko count karne ke liye
//     int count = 0;

//     // Jab tak num 0 nahi hota, loop chalega
//     while (num != 0) {

//         // % 10 se number ka last digit milta hai
//         // Example: 531271 % 10 = 1
//         int digit = num % 10;

//         // Har iteration mein ek digit mil raha hai
//         // Isliye count ko 1 se increase kar rahe hain
//         count++;

//         // / 10 se number ka last digit remove ho jaata hai
//         // Example: 531271 / 10 = 53127
//         num = num / 10;
//     }

//     // Total digits ka count return karenge
//     return count;
// }

// public static void main(String[] args) {
    

//     // Jis number ke digits count karne hain
//     int num = 531271;

//     // countDigits method ko call karke answer ans mein store karenge
//     int ans = countDigits(num);

//     // Total number of digits print karenge
//     System.out.println(ans);
// }
// }

//sum of digits

// static int sumOfDigits(int num) {

//     // sum variable mein saare digits ka total store karenge
//     int sum = 0;

//     // Jab tak num 0 nahi hota, loop chalega
//     while (num != 0) {

//         // % 10 se number ka last digit nikalenge
//         // Example: 53127 % 10 = 7
//         int digit = num % 10;

//         // Last digit ko sum mein add karenge
//         // Example: sum = 0 + 7 = 7
//         sum = sum + digit;

//         // / 10 se number ka last digit remove ho jaata hai
//         // Example: 53127 / 10 = 5312
//         num = num / 10;
//     }

//     // Saare digits ka total return karenge
//     return sum;
// }

// public static void main(String[] args) {

//     // Jis number ke digits ka sum nikalna hai
//     int num = 53127;

//     // sumOfDigits method ko call karke result sum mein store karenge
//     int sum = sumOfDigits(num);

//     // Digits ka total print karenge
//     System.out.println(sum);
// }
// }

// REVERSE A NUMBER 

// static int reverseNumber(int num) {

//     // reversed number ko store karne ke liye
//     int rev = 0;

//     // Jab tak num 0 nahi hota, loop chalega
//     while (num != 0) {

//         // % 10 se number ka last digit nikalenge
//         // Example: 1498 % 10 = 8
//         int digit = num % 10;

//         // Pehle se existing rev ko 10 se multiply karke
//         // uske end mein current digit add karenge
//         // Example: rev = 0 -> 0 * 10 + 8 = 8
//         rev = rev * 10 + digit;

//         // / 10 se original number ka last digit remove karenge
//         // Example: 1498 / 10 = 149
//         num = num / 10;
//     }

//     // Reversed number return karenge
//     return rev;
// }

// public static void main(String[] args) {
    

//     // Jis number ko reverse karna hai
//     int num = 1498;

//     // reverseNumber method ko call karke
//     // reversed number ko rev mein store karenge
//     int rev = reverseNumber(num);

//     // Reversed number print karenge
//     System.out.println(rev);
// }

/*
num = 1498

digit = 8
rev = 0 × 10 + 8
rev = 8

digit = 9
rev = 8 × 10 + 9
rev = 89

digit = 4
rev = 89 × 10 + 4
rev = 894

digit = 1
rev = 894 × 10 + 1
rev = 8941
 */

//CHECK PALINDROME NUMBERRRRRRRRRRR
// EG - 1221 -> L-R -> 1221 R-L -> 1221

// I.E BASICALLY IS NUMBER AND REVERSE OF NUMBER ARE SAME THEN ITS A PALINDROME
// static boolean isPalindrome(int num) {

//     // Original number ko store karenge
//     // Kyunki loop ke andar num change hone wala hai
//     int original = num;

//     // Reversed number ko store karne ke liye
//     int rev = 0;

//     // Jab tak num 0 nahi hota, loop chalega
//     while (num != 0) {

//         // % 10 se number ka last digit nikalenge
//         // Example: 121 % 10 = 1
//         int digit = num % 10;

//         // Reversed number banayenge
//         // Example: rev = 0 * 10 + 1 = 1
//         rev = rev * 10 + digit;

//         // / 10 se original number ka last digit remove karenge
//         // Example: 121 / 10 = 12
//         num = num / 10;
//     }

//     // Original number aur reversed number ko compare karenge
//     // Agar dono same hain, number palindrome hai
//     return original == rev;
// }

// public static void main(String[] args) {
    

//     // Jis number ko check karna hai
//     int num = 121;

//     // isPalindrome method ko call karke result store karenge
//     boolean ans = isPalindrome(num);

//     // Result print karenge
//     System.out.println(ans);
// }


//CHECK PRIME NUMBER - IS >1 AND DIVISIBLE BY ITSELF

// static boolean isPrime(int num) {

//     // 1 se chhote numbers prime nahi hote
//     if (num <= 1) {
//         return false;
//     }

//     // 2 se num - 1 tak check karenge
//     // Agar kisi bhi number se completely divide ho gaya,
//     // toh num prime nahi hai
//     for (int i = 2; i < num; i++) {

//         // Agar remainder 0 hai,
//         // matlab num completely divide ho raha hai
//         if (num % i == 0) {

//             // Number prime nahi hai
//             return false;
//         }
//     }

//     // Agar kisi bhi number se divide nahi hua,
//     // toh number prime hai
//     return true;
// }

// public static void main(String[] args) {
    
//     // Jis number ko check karna hai
//     int num = 17;

//     // isPrime method ko call karke result store karenge
//     boolean ans = isPrime(num);

//     // Result print karenge
//     System.out.println(ans);
// }

//GCD OF A NUMBER 
// WHAT IS GCD -> A=18, B= 12 : A=2*3*3 B=2*3*2 => 2*3 = 6 I.E GREATEST COMMON DIVISISOR

// FOR THIS WE WILL USE EUCLIDEAN ALGO GCD(A,B) = GCD(B,A%B)

/*
This image is explaining the **Euclidean Algorithm** to find the **GCD (Greatest Common Divisor)** of two numbers.

The example is:

**GCD(18, 12)**

### Step 1

We start with:

```text
gcd(18, 12)
```

The formula being used is:

```text
gcd(a, b) = gcd(b, a % b)
```

So:

```text
gcd(18, 12)
= gcd(12, 18 % 12)
```

Now calculate:

```text
18 % 12 = 6
```

Therefore:

```text
gcd(18, 12)
= gcd(12, 6)
```

---

### Step 2

Again apply the same formula:

```text
gcd(12, 6)
= gcd(6, 12 % 6)
```

Calculate:

```text
12 % 6 = 0
```

So:

```text
gcd(12, 6)
= gcd(6, 0)
```

---

### Step 3 — The stopping condition

Now we have:

```text
gcd(6, 0)
```

When the **second number becomes 0**, we stop.

The answer is the **first number**:

```text
GCD = 6
```

That's why the teacher has written at the bottom:

```text
0 → 0 × 6
6 → 1 × 6
```

Basically, `6` is the greatest number that divides both `18` and `12`.

### 🧠 The important pattern

Remember this:

```text
gcd(a, b)
    ↓
gcd(b, a % b)
```

For this example:

```text
gcd(18,12)
      ↓
gcd(12,6)
      ↓
gcd(6,0)
      ↓
     6
```

So the whole idea is simply:

> **Keep replacing `(a, b)` with `(b, a % b)` until `b` becomes 0. Then `a` is the GCD.**

*/

// WE KNOW THAT DIVIDEND = DIVISOR * Q + R
// WKT R CAN BE OBTAINED BY % I.E A%B
//A = GCD * X

// SO THEREFORE, A = B * Q + A%B (I.E R)

//GCD*[X-YQ]=A%B

//52:00 PLZZZZZZZZZZZ RE WATCHHHHHHHHHH

// static int gcd(int a, int b) {

//     // Jab tak b 0 nahi hota, loop chalega
//     while (b != 0) {

//         // a % b se remainder nikalenge
//         // Example: 18 % 12 = 6
//         int remainder = a % b;

//         // b ko a bana denge
//         a = b;

//         // Remainder ko b bana denge
//         b = remainder;
//     }

//     // Jab b = 0 ho jaayega,
//     // tab a GCD hoga
//     return a;
// }

// public static void main(String[] args) {
    

//     // Jin do numbers ka GCD nikalna hai
//     int a = 18;
//     int b = 12;

//     // gcd method ko call karke answer store karenge
//     int ans = gcd(a, b);

//     // GCD print karenge
//     System.out.println(ans);
// }




// lcm of number 

// static int gcd(int a, int b) {

//     // Jab tak b 0 nahi hota, loop chalega
//     while (b != 0) {

//         // Remainder find karenge
//         int remainder = a % b;

//         // b ko a bana denge
//         a = b;

//         // Remainder ko b bana denge
//         b = remainder;
//     }

//     // Jab b = 0 ho jaaye,
//     // a GCD hoga
//     return a;
// }

// static int lcm(int a, int b) {

//     // Pehle dono numbers ka GCD find karenge
//     int gcdValue = gcd(a, b);

//     // LCM formula:
//     // LCM = (a * b) / GCD
//     int lcmValue = (a * b) / gcdValue;

//     // LCM return karenge
//     return lcmValue;
// }

// public static void main(String[] args) {
    


//     // Jin do numbers ka LCM nikalna hai
//     int a = 18;
//     int b = 12;

//     // lcm method ko call karke answer store karenge
//     int ans = lcm(a, b);

//     // LCM print karenge
//     System.out.println(ans);
// }


// ARMSTRONG NUMBERRRRRR
// i/p 153 - 1^3 + 5^3 + 3^3 = 153 (sum of all cubes)

// static boolean isArmstrong(int num) {

//     // Original number ko store karenge
//     // Kyunki loop ke andar num change hone wala hai
//     int original = num;

//     // Digits ka sum store karne ke liye
//     int sum = 0;

//     // Number mein kitne digits hain, wo count karenge
//     int digits = 0;
//     int temp = num;

//     // Digits count karne ke liye loop
//     while (temp != 0) {

//         // Last digit remove karenge
//         temp = temp / 10;

//         // Har iteration mein ek digit count hoga
//         digits++;
//     }

//     // Original number ko dobara num mein store karenge
//     temp = num;

//     // Har digit par operation karenge
//     while (temp != 0) {

//         // Last digit nikalenge
//         int digit = temp % 10;

//         // Digit ko 'digits' times power karenge
//         int power = 1;

//         for (int i = 1; i <= digits; i++) {
//             power = power * digit;
//         }

//         // Powered value ko sum mein add karenge
//         sum = sum + power;

//         // Last digit remove karenge
//         temp = temp / 10;
//     }

//     // Agar calculated sum original number ke equal hai,
//     // toh number Armstrong hai
//     return original == sum;
// }

// public static void main(String[] args) {
    

//     // Jis number ko check karna hai
//     int num = 153;

//     // isArmstrong method ko call karke result store karenge
//     boolean ans = isArmstrong(num);

//     // Result print karenge
//     System.out.println(ans);
// }


// find all divisor or perfect number 

// static void findDivisors(int num) {

//     // 1 se num tak har number ko check karenge
//     for (int i = 1; i <= num; i++) {

//         // Agar num completely divide ho raha hai,
//         // toh i, num ka divisor hai
//         if (num % i == 0) {

//             // Divisor print karenge
//             System.out.println(i);
//         }
//     }
// }

// public static void main(String[] args) {
    

//     // Jis number ke divisors find karne hain
//     int num = 12;

//     // findDivisors method ko call karenge
//     findDivisors(num);
// }

//Perfect Number
//A Perfect Number woh number hota hai jiske proper divisors ka sum original number ke equal ho.


// static boolean isPerfect(int num) {

//     // Divisors ka sum store karne ke liye
//     int sum = 0;

//     // 1 se num/2 tak check karenge
//     // num khud ko include nahi karna hai
//     for (int i = 1; i <= num / 2; i++) {

//         // Agar num completely divide ho raha hai,
//         // toh i, num ka proper divisor hai
//         if (num % i == 0) {

//             // Divisor ko sum mein add karenge
//             sum = sum + i;
//         }
//     }

//     // Agar divisors ka sum original number ke equal hai,
//     // toh number perfect hai
//     return sum == num;
// }

// public static void main(String[] args) {
    

//     // Jis number ko check karna hai
//     int num = 6;

//     // isPerfect method ko call karke result store karenge
//     boolean ans = isPerfect(num);

//     // Result print karenge
//     System.out.println(ans);
// }




//PRINT ALL PRIME NUMBERS FROM 1 TO N

static boolean isPrime(int num) {

    // 1 se chhote numbers prime nahi hote
    if (num <= 1) {
        return false;
    }

    // 2 se num - 1 tak check karenge
    for (int i = 2; i < num; i++) {

        // Agar num completely divide ho gaya,
        // toh num prime nahi hai
        if (num % i == 0) {
            return false;
        }
    }

    // Agar kisi bhi number se completely divide nahi hua,
    // toh num prime hai
    return true;
}
public static void main(String[] args) {
    

    // 1 se N tak prime numbers print karne hain
    int n = 20;

    // 2 se n tak har number ko check karenge
    // 1 prime number nahi hai
    for (int i = 2; i <= n; i++) {

        // Check karenge ki current number prime hai ya nahi
        if (isPrime(i)) {

            // Agar prime hai toh print karenge
            System.out.println(i);
        }
    }
}

/*
🧠 Logic simple hai

Suppose:

int n = 20;

Program 2 se 20 tak har number ko ek-ek karke isPrime() method mein bhejega.

2 → Prime ✅
3 → Prime ✅
4 → Not Prime ❌
5 → Prime ✅
6 → Not Prime ❌
...
19 → Prime ✅
20 → Not Prime ❌

Output:

2
3
5
7
11
13
17
19
*/
}

