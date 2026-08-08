// THIS IS PRACTISE PLAYLIST OF
// https://www.youtube.com/playlist?list=PLDzeHZWIZsTqNW1gvXXAicBgku9uPZeOC

// LECTURE 11 - PATTERNS

//WHENEVER YOU ARE ON PATTERN BASED QUESTIONS, DIVIDE IT INTO ROWS AND COLUMS (grid pattern)

/*
TRICK - 
1. FIND OUT NO. OF ROWS (OUTER LOOP)
2. FIND OUT FOR EACH ROWS NO. OF COLUMNS COUNT (INNER LOOP)
3. ANALYZE EACH ROW TO DECIDE FORMULA OR ANY RELATION

JAB PRINT HOTA HAI TAB PEHEL ROWS PRINT HOTE HAI, USKE BAAD COLUMNS PRINT HOTE HAI
---------- ROWS 
FIR ||||||| columns 
to make a grid like structure
*/

//1. solid star pattern

/*

********
********
********
********

*/

public class PATTERN_BASED {
    public static void main(String[] args) {

        // int n = 4;
        // for (int row = 1; row <= n; row++) { // this is outer loop i.e for rows
        // for (int col = 1; col <= n; col++) { // ab uss row me har column ke humaara
        // kaam hai naa isliye har column
        // // access karna hoga in inner loop
        // System.out.print("*"); // ab kaam kya hai ?? yahi ki star print karna hai so
        // har ek row ke (outer loop)
        // // liye har column (inner loop) me star print
        // }
        // System.out.println();
        // } CONTROL + / TO FORMAT CODE MULTIPLE LINES THIS MANNER
        // }}

        // SOLID RECTANGULAR PATTERN

        /*
         * BY TRICK N IS NUMNBER OF ROWS SO ITS 3 EXAMPLE
         ******
         ******
         ******
         * 
         * SO ROW 1 SE LEKE N TAK CHALEGA (OUTER LOOP)
         * AND FOR EACH ROW WE NEED 5 COLUMNS
         * I.E 1 SE LEKE 5 TAK FOR THIS (INNER LOOP)
         * 
         * ANALYZE EACH ROW TO DECIDE FORMULA OR ANY RELATION -
         * ROW 1 ME 5 STAR PRINT HONE HAI
         * ROW 2 ME 5 STAR PRINT HONE HAI
         * ROW 3 ME 5 STAR PRINT HONE HAI
         * 
         * SO LOGIC IS KI HAR ROW ME 5 STAR PRINT HONE HAI
         */

        // public class PATTERN_BASED {
        // public static void main(String[] args) {

        // int n = 3;

        // for (int rows = 1; rows <= n; rows++) { // this is outer loop i.e for rows
        // for (int col = 1; col <= 5; col++) { // ab uss row me har column ke humaara
        // kaam hai naa isliye har column
        // // access karna hoga in inner loop
        // System.out.print("*"); // ab kaam kya hai ?? yahi ki star print karna hai so
        // har ek row ke (outer loop)
        // // liye har column (inner loop) me star print
        // }
        // System.out.println();
        // }

        // }
        // }

        /*
         * pattern 3 right angled triangle pattern
         * 
         * for n=5
         *
         **
         ***
         ****
         *****
         * 
         * for 5 rows means n=5 means 1 se n jaayega first outer forloop
         * for every row we need a variable number of columns to print star
         * analyze each row to decide formula or any relation for printing stars
         * 
         * r1 has n=5 and 1 star
         * r2 has n=5 and 2 star
         * r3 has n=5 and 3 star
         * r4 has n=5 and 4 star
         * r5 has n=5 and 5 star
         * 
         * so relation is for every row we need to print stars equal to row number
         * rn = n star
         * 
         */

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // // for each row -> xacieable columns
        // // formula -> col -> 1-> value of row
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // // move to next line
        // System.out.println();
        // }
        // }
        // }

        /*
         * pattern 4 - SOLID RHOMBUS PATTERN
         * 
         * FOR N=5
         *****
         *****
         *****
         *****
         *****
         * 
         * 
         * ROW KI VALUE IS 5 SO ROW OUTERLOOP WILL GO TILL 5 I.E TILL N (1 SE n)
         * FOR EACH ROW WE NEED VARIABLE COLUMNS JISKE LIYE WE NEED FORMULA
         * ANALYZE EACH ROW TO DECIDE FORMULA OR ANY RELATION
         * 
         * N=5, FOR ROW 1 -> 4 SPACES + 5 STARS
         * N=5, FOR ROW 2 -> 3 SPACES + 5 STARS
         * N=5, FOR ROW 3 -> 2 SPACES + 5 STARS
         * N=5, FOR ROW 4 -> 1 SPACES + 5 STARS
         * N=5, FOR ROW 5 -> 0 SPACES + 5 STARS
         * 
         * SO WE CAN DO IT IN PARTS WHERE PART 1 WILL CONTAIN SPACES AND PART 2 WILL
         * CONTAIN STARS
         * PART 1 KA LOGIC HOGA KI - SPCES = N - ROW
         * PART 2 KA LOGIC HOGA KI - STARS = N I.E NO. OF ROWS I.E 5
         */

//         int n = 5;
//         for (int row = 1; row <= n; row++) {
//             // for each row -> spaces, stars

//             // spaces
//             for (int col = 1; col <= n - row; col++) {
//                 System.out.print(" ");

//                 // stars
//                 for (col = 1; col <= n; col++) {
//                     System.out.print("* ");
//                 }
//                 // moe to next row
//                 System.out.println();
//             }
//         }
//     }
// }

//27:32 TAK HUA HAI 
