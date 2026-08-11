/*
 LEC 13
 WHY WE NEED ARRAYS WITH EXAMPLE-
 SAMJHO MERE PASS 5 STUDENTS KI MARKS HAI WO TOH MAI INT MARKS1, MARKS2, MARKS3, MARKS4, MARKS5 MEIN STORE KAR SAKTA HOON. BUT AGAR 100 STUDENTS HAIN TOH MAI 100 VARIABLES BANANA PAREGA. ISLIYE HUM ARRAY KA USE KARTE HAIN.

 SO ARRAY IS A CONTAINER CONTAINING SIMILAR TYPE OF DATA. IT IS A COLLECTION OF VARIABLES OF SAME TYPE.

 ARRAY IS A DS WHICH WORKS ON CONTINUOUS MEMORY LOCATIONS. MEANS AGAR 10 MB KA DATA HAI TOH USKO 10 MB KI CONTINUOUS MEMORY LOCATION MEIN STORE KARNA PAREGA EK 1MB YAHA FIR BEECHME ALAG STORAGE AND THEN DOOSRA 9 MB KAHI AUR AISA NHI HOTA.

 ARRAY CREATION SYNTAX-
 INT ARR [] OR INT [] ARR

 ARRAY ALLOCATION SYNTAX-
 ARR[INDEX] = VALUE;

 ARRAY INITILAIZATION SYNTAX-
 DATA_TYPE ARR[] = {VALUE1, VALUE2, VALUE3, VALUE4, VALUE5};

 ACCESSING ELEMENTS OF ARRAY- STARTS FROM 0
 ARR[INDEX] = VALUE;

 
 
 */

public class ARRAY_BASICS {

    // public static void main(String[] args) {

    //     int arr[];
    //     arr = new int[5];

    //     int[] arr2 = {10, 20, 30};

    //     System.out.println("Value at index 0: " + arr2[0]);
    // }

/*
we have another way of doing with for loop
*/



//         // Declaration
//         int arr[];

//         // Allocation
//         arr = new int[5];

//         // Initialization
//         int brr[] = {10, 20, 30};

//         // Finding length of array
//         int n = brr.length;

//         // Accessing elements using loop
//         for (int index = 0; index <= n - 1; index++) {
// // isme humne index ko 0 se start kiya hai aur n-1 tak chala rahe hai kyuki array ka last index n-1 hota hai. this is used to avoid ArrayIndexOutOfBoundsException.
//             System.out.println(brr[index]);

//         }
//     }


// }

//for each value - is used to iterate through the array without using index. It is a simpler way to access elements of an array. instead of traditional for loop, we can use for each loop. It is also called enhanced for loop. It is used to iterate through the array without using index. It is a simpler way to access elements of an array. instead of traditional for loop, we can use for each loop. It is also called enhanced for loop.

//syntax- for (data_type variable_name : array_name) { // code to be executed }
// so isme ham ye bolte hai ki iss loop ke andar mujhe jo bhi integer value milega usko variable_name mein store kar do aur fir usko use kar do. isme hume index ka use nhi karna padta example-
//  for (int value : brr) { System.out.println(value); }

//same code using for each loop-

    // public static void main(String[] args) {

    //     // Declaration
    //     int arr[];

    //     // Allocation
    //     arr = new int[5];

    //     // Initialization
    //     int brr[] = {10, 20, 30};

    //     int n = brr.length;

    //     // For-each loop
    //     for (int val : brr) {

    //         System.out.println(val);

    //     }
    // }


    /*
    taking input in array using scanner class-
    synatx- Scanner sc = new Scanner(System.in);
    array is a collection of variables of same type. so we can take input in array using scanner class. we can use for loop to take input in array

    syntax - for (int index = 0; index < n; index++) { 
             arr[index] = sc.nextInt(); 
             }


    */
    public static void main(String[] args) {

        //chatgpt explaination ke wjah se yaha public static void main kiya hai he said - Tumhare file mein agar multiple main() methods hain, toh sirf ek hi public static void main(String[] args) rakho.

      // Create an array of size 5
//       

// TASK 1 - COUNT SUM OF ALL VALUES IN ARRAY (INT) 
// AB ISKELIYE MUJHE POORE ARRAY KO TRAVERSE KARNA HOGA AND UNKE ELEMENTS KO SUM 

//  int arr[] = {10, 20, 30, 40, 50};

//         int sum = 0;

//         int n = arr.length;

//         for (int i = 0; i < n; i++) {

//             int value = arr[i];

//             sum = sum + value;
//         }

//         // Sum is ready to print
//         System.out.println(sum);


//         // CORRECT ITS 150 ANSWER

// }

// }

//TASK 2 - MUTIPLY KARKE DO 

//  int arr[] = {2, 3, 10, 20};

//         int ans = 1;

//         int n = arr.length;

//         for (int i = 0; i < n; i++) {

//             int value = arr[i];

//             ans = ans * value;
//         }

//         System.out.println(ans);

//     }
// }

// ANSWER IS 1200 PERFECT

// TASK 3 - FIND THE MAX VALUE IN THE ARRAY
/*
/*
Find the maximum value in an array.

Approach:
1. Assume the first element is the maximum:
   int max = arr[0];

2. Traverse the array from index 1 onwards.

3. For each element, compare arr[i] with max.

4. If arr[i] > max, update max:
   max = arr[i];

5. After the loop, max contains the largest value.

Example:
arr = {4, 2, 5, 21, 15}

Initially:
max = 4

i = 1 → 2 > 4? No
i = 2 → 5 > 4? Yes → max = 5
i = 3 → 21 > 5? Yes → max = 21
i = 4 → 15 > 21? No

Final maximum = 21
*/

//  int arr[] = {3, 2, 5, 21, 10};

//         int n = arr.length;

//         int maxValue = arr[0];

//         // Compare maxValue with every element of the array
//         for (int i = 1; i < n; i++) {

//             if (arr[i] > maxValue) {

//                 // Update maxValue
//                 maxValue = arr[i];
//             }
//         }

//         System.out.println(maxValue);

//     }
// }

// FIND MINIMUM VALUE OF ARRAY
/*
Find the minimum value in an array.

1. Assume the first element is the minimum:
   minValue = arr[0];

2. Start the loop from index 1 because index 0 is
   already considered as the initial minimum.

3. Compare each element with minValue.

4. If arr[i] < minValue, update minValue:
   minValue = arr[i];

5. After the loop, minValue contains the smallest
   element in the array.

Example:
arr = {3, 2, -5, 21, 10}

Initially:
minValue = 3

2 < 3   → Yes → minValue = 2
-5 < 2  → Yes → minValue = -5
21 < -5 → No
10 < -5 → No

Final minimum value = -5

Time Complexity: O(n)
Space Complexity: O(1)
*/


//         int arr[] = {3, 2, -5, 21, 10};

//         int minValue = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] < minValue) {

//                 // Update minimum value
//                 minValue = arr[i];
//             }
//         }

//         System.out.println("Minimum value: " + minValue);
//     }
// }








/*
NOW LETS MOVE TO 2D ARRAYS

IT CONTAINS ROW AND COLUMN ADDRESS AND ITS SYNTAX IS 
1. Declaration
int arr[][];

or

int[][] arr;
2. Allocation
arr = new int[3][4];

➡️ Creates 3 rows × 4 columns.

3. Declaration + Allocation
int[][] arr = new int[3][4];
4. Initialization
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
5. Accessing elements
System.out.println(arr[0][0]);  // 1
System.out.println(arr[1][2]);  // 6

Syntax:

arr[row][column]
6. Updating an element
arr[1][2] = 10;

Now arr[1][2] is 10.

7. Getting rows and columns
int rows = arr.length;
int columns = arr[0].length;
8. Traversing using nested loops
for (int i = 0; i < arr.length; i++) {

    for (int j = 0; j < arr[i].length; j++) {

        System.out.print(arr[i][j] + " ");
    }

    System.out.println();
}
9. For-each loop
for (int[] row : arr) {

    for (int value : row) {

        System.out.print(value + " ");
    }

    System.out.println();
}
*/

//   // Declaration
//         int[][] arr;

//         // Allocation: 3 rows and 4 columns
//         arr = new int[3][4];

//         // Initialization
//         int[][] brr = {
//             {1, 2},
//             {2, 3},
//             {3, 4},
//             {4, 5}
//         };

//         // Number of rows
//         int rowLength = brr.length;

//         // Number of columns
//         int colLength = brr[0].length;

//         // Traverse through every row
//         for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {

//             // Traverse through every column of current row
//             for (int colIndex = 0; colIndex < colLength; colIndex++) {

//                 System.out.print(brr[rowIndex][colIndex] + " ");
//             }

//             // Move to next line after each row
//             System.out.println();
//         }
//     }

//     }

//Why two loops? Because a 2D array has rows AND columns. OUTER HANDLES ROWS AND INNER HANDLES COLUMNS 

//INPUT AND OUTPUT OF 2D ARRAY

/*
Take input from the user to create a 2D array.

A 3x4 array is created, meaning 3 rows and 4 columns.
Nested loops are used because we need to visit every
row and every column.

The outer loop controls the row and the inner loop
controls the column. Scanner takes the value from the
user and stores it at arr[i][j].

After taking all inputs, another nested loop traverses
the array and prints all its elements in matrix form.
*/

//  int[][] arr = new int[3][4];

//         Scanner sc = new Scanner(System.in);

//         // Input
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 System.out.println("Provide value for row=" + i + " and column=" + j);

//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Print
//         for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {

//             for (int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++) {

//                 System.out.print(arr[rowIndex][colIndex] + " ");
//             }

//             System.out.println();
//         }


//     }
// }

//PPPPRRRRRRRRRRAAAAAAAAAAAACCCCCCCTTTTTTTIIIIIIIISSSSSSSSSSEEEEEEEEEE

//TASK 1 - 2D ARRAY SUM
//   int[][] arr = {
//             {1, 2, 3},
//             {1, 2, 3}
//         };

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 int value = arr[i][j];

//                 sum = sum + value;
//             }
//         }

//         System.out.println(sum);
//     }
// }

//
/*
Find the sum of all elements in a 2D array.

A nested loop is used to visit every element.
The outer loop traverses the rows and the inner loop
traverses the columns. Each element is added to sum.

For arr = {{1,2,3}, {1,2,3}}:
sum = 1 + 2 + 3 + 1 + 2 + 3 = 12.

Time Complexity: O(rows * columns)
Space Complexity: O(1)
*/


//         int[][] arr = {
//             {1, 2, 3},
//             {1, 2, 3}
//         };

//         int ans = 1;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 int value = arr[i][j];

//                 ans = ans * value;
//             }
//         }

//         System.out.println(ans);

//     }
// }

/*
Find the product of all elements in a 2D array.

A nested loop is used to visit every element of the array.
The outer loop traverses rows and the inner loop traverses
columns. Each element is multiplied with ans.

ans starts from 1 because 1 is the multiplicative identity.

For arr = {{1,2,3}, {1,2,3}}:
ans = 1 × 2 × 3 × 1 × 2 × 3 = 36.

Time Complexity: O(rows * columns)
Space Complexity: O(1)
*/


/*
Find the maximum value in a 2D array.

The first element arr[0][0] is assumed to be the maximum.
Nested loops are used to traverse every row and column.
Each element is compared with maxValue. If the current
element is greater, maxValue is updated.

Important:
arr[i][j] means row i and column j.

ArrayIndexOutOfBoundsException occurs when we try to access
an index that does not exist in the array.

For example, if a row has 3 elements, valid indexes are:
0, 1, 2

Trying to access index 3 causes:
ArrayIndexOutOfBoundsException.

In this example, use arr[i][j], not arr[1][j].
Using arr[1][j] always accesses row 1 and can cause an
exception when the loop reaches a column that does not
exist in that row.

Time Complexity: O(rows * columns)
Space Complexity: O(1)
*/

 int[][] arr = {
            {1, 2, 3},
            {21, 20, 19}
        };

        int maxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxValue) {

                    // Update max
                    maxValue = arr[i][j];
                }
            }
        }

        System.out.println(maxValue);
    }
}

/*
SIR GOT ARRAY EXCEPTION EXPLAINED BY GPT

You have:

if (arr[1][j] > maxValue)

and:

maxValue = arr[1][j];

You should use:

arr[i][j]

because i represents the current row.

For this array:

       j=0  j=1  j=2
i=0     1    2    3
i=1    21   20   19

arr[i][j] correctly visits:

arr[0][0] → 1
arr[0][1] → 2
arr[0][2] → 3
arr[1][0] → 21
arr[1][1] → 20
arr[1][2] → 19
🧠 ArrayIndexOutOfBoundsException

It means:

You tried to access an array index that doesn't exist.

Example:

int[] arr = {10, 20, 30};

Valid indexes:

0 → 10
1 → 20
2 → 30

This is invalid:

arr[3]; // ❌

because there is no index 3.

Remember: if array length is n, valid indexes are always:

0 to n - 1

For 2D arrays, check both row and column indexes.
*/
