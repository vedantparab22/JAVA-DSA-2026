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
     
        int n = 4;
        for(int row=1; row<=n; row++) {      //this is outer loop i.e for rows
            for(int col=1; col<=n; col++) {  //ab uss row me har column ke humaara kaam hai naa isliye har column access karna hoga in inner loop
                System.out.print("*"); //ab kaam kya hai ?? yahi ki star print karna hai so har ek row ke (outer loop) liye har column (inner loop) me star print 
            }
            System.out.println();
    }
}
}