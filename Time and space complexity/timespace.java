// SIR USED THIS WEBSITE (HIS OWN ARTICLE) https://www.codehelp.in/articles/time-and-space-complexity-for-dsa

//https://www.codehelp.in/articles/time-and-space-complexity-for-dsa


// same code can be solved by longer and shorter time as well as space consumed

// what is t.c - it tell us the time taken by code to execute depending on the input size
// understanding tc is imp as it helps in writing efficient code

// what is s.c - it tell us the space consumed by code to execute depending on the input size

// units to measure complexity - time complexity is measured in seconds and space complexity is measured in bytes
//Big-0 → worst case → Upper bound
// Theta - 0 -> Avg case
// Omega  → best case → Lower bound


/* ai ka gyaan
/*
 * ========================= TIME COMPLEXITY =========================
 *
 * Time Complexity tells us how the number of operations of an algorithm
 * grows as the input size (n) grows.
 *
 *
 * 1. BIG-O (O)
 * -------------------------------------------------------------------
 * Big-O represents the UPPER BOUND of an algorithm.
 *
 * It is commonly used to describe the WORST-CASE growth.
 *
 * Example:
 * Searching for an element in an array using Linear Search:
 *
 * int[] arr = {3, 4, 7, 5, 9};
 *
 * If the target is at the last position:
 * We may have to check all n elements.
 *
 * Therefore:
 *              O(n)
 *
 *
 * 2. OMEGA (Ω)
 * -------------------------------------------------------------------
 * Omega represents the LOWER BOUND of an algorithm.
 *
 * It is commonly used to describe the BEST-CASE growth.
 *
 * Example:
 * If the target is the first element:
 *
 * int[] arr = {9, 3, 4, 5, 7};
 *
 * We find it in just 1 comparison.
 *
 * Therefore:
 *              Ω(1)
 *
 *
 * 3. THETA (Θ)
 * -------------------------------------------------------------------
 * Theta represents the TIGHT BOUND.
 *
 * It describes the growth rate when the upper and lower bounds
 * are the same.
 *
 * Example:
 * An algorithm that always performs approximately n operations:
 *
 *              Θ(n)
 *
 * IMPORTANT:
 * Theta does NOT technically mean "average case".
 * It means a tight asymptotic bound.
 *
 *
 * ========================= LINEAR SEARCH ============================
 *
 * Suppose:
 *
 * int[] arr = {3, 4, 7, 5, 9};
 * target = 9;
 *
 * We check elements one by one:
 *
 *     3  |  4  |  7  |  5  |  9
 *     ↑     ↑     ↑     ↑     ↑
 *     1     2     3     4     5 comparisons
 *
 *
 * BEST CASE:
 * -------------------------------------------------------------------
 * Target is at the FIRST position.
 *
 * Example:
 *     {9, 3, 4, 7, 5}
 *
 * Only 1 comparison is needed.
 *
 * Time Complexity = Ω(1)
 *
 *
 * WORST CASE:
 * -------------------------------------------------------------------
 * Target is at the LAST position
 * OR the target does not exist in the array.
 *
 * We may need to check all n elements.
 *
 * Time Complexity = O(n)
 *
 *
 * AVERAGE CASE:
 * -------------------------------------------------------------------
 * If the target is equally likely to be anywhere in the array,
 * on average we check approximately n/2 elements.
 *
 * Example:
 *     n = 5
 *
 * Average comparisons ≈ 5/2
 *
 * But constants are ignored in asymptotic analysis:
 *
 *     n/2  ->  Θ(n)
 *
 *
 * ======================== QUICK SUMMARY =============================
 *
 * BEST CASE   ->  Ω(1)    -> target found immediately
 *
 * AVERAGE     ->  Θ(n)    -> approximately n/2 comparisons
 *
 * WORST CASE  ->  O(n)    -> target found at end / not found
 *
 *
 * Remember:
 *
 * O      -> Upper Bound
 * Ω      -> Lower Bound
 * Θ      -> Tight Bound
 *
 *
 * Also:
 *
 * n/2, 2n, 5n, etc. are still considered linear.
 *
 * Therefore:
 *
 *     O(n/2) = O(n)
 *     Θ(n/2) = Θ(n)
 *
 * Constants are ignored when calculating asymptotic complexity.
 *
 *
 * ====================== SPACE COMPLEXITY ============================
 *
 * Space complexity tells us how much EXTRA MEMORY an algorithm uses
 * as the input size increases.
 *
 * Example:
 *
 *     int x = 10;
 *
 * Only a constant amount of extra memory is used.
 *
 * Space Complexity = O(1)
 *
 *
 * If we create another array of size n:
 *
 *     int[] copy = new int[n];
 *
 * Extra memory grows with n.
 *
 * Space Complexity = O(n)
 */

//complexity direction- 

/*
 *          TIME COMPLEXITY
 *                ↑
 *                |
 *     O(1)       |  Fastest
 *     O(log n)   |
 *     O(√n)      |
 *     O(n)       |
 *     O(n log n) |
 *     O(n²)      |
 *     O(n³)      |
 *     O(2ⁿ)      |
 *     O(n!)      |  Slowest
 *                ↓
 *
 * As we move DOWN:
 *     Time Complexity increases
 *     Algorithm becomes slower
 *
 *
 * BEST → WORST (roughly):
 *
 * O(1)
 *   ↓
 * O(log n)
 *   ↓
 * O(√n)
 *   ↓
 * O(n)
 *   ↓
 * O(n log n)
 *   ↓
 * O(n²)
 *   ↓
 * O(n³)
 *   ↓
 * O(2ⁿ)
 *   ↓
 * O(n!)
 *
 *
 * IMPORTANT:
 * This ordering is based on how fast the function grows
 * when n becomes very large.
 *
 * Example:
 *
 * O(1)   → Constant     → Very Fast
 * O(n)   → Linear       → Depends directly on n
 * O(n²)  → Quadratic    → Much slower for large n
 * O(2ⁿ)  → Exponential  → Extremely slow for large n
 * O(n!)  → Factorial    → Extremely expensive
 *
 *
 * So remember:
 *
 *        ↑ Faster
 *        |
 *     O(1)       
 *     O(log n)
 *     O(√n)
 *     O(n)
 *     O(n log n)
 *     O(n²)
 *     O(n³)
 *     O(2ⁿ)
 *     O(n!)
 *        |
 *        ↓ Slower
 */

/*
 * ================================================================
 * 1) O(1) — CONSTANT TIME
 * ================================================================
 *
 * O(1) means the amount of work remains CONSTANT.
 *
 * The input size (n) does NOT affect the number of operations.
 *
 * Example:
 *
 * int x = 10;
 * System.out.println(x);
 *
 * These statements execute a fixed number of operations.
 *
 * Whether n is:
 *     10
 *     100
 *     1,000
 *     1,000,000
 *
 * the work remains approximately the same.
 *
 * Therefore:
 *              Time Complexity = O(1)
 *
 *
 * Remember:
 * O(1) -> CONSTANT work -> VERY FAST
 */


/*
 * ================================================================
 * 2) O(n) — LINEAR TIME
 * ================================================================
 *
 * O(n) means the number of operations grows LINEARLY
 * with the input size n.
 *
 * Example:
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.println(i);
 * }
 *
 * The loop runs n times.
 *
 * If:
 *     n = 100   -> 100 iterations
 *     n = 1000  -> 1000 iterations
 *
 * So, if n increases 10 times,
 * the work also increases approximately 10 times.
 *
 * Therefore:
 *              Time Complexity = O(n)
 *
 *
 * Remember:
 * One loop running n times -> usually O(n)
 */


/*
 * ================================================================
 * 3) O(n²) — QUADRATIC TIME
 * ================================================================
 *
 * O(n²) means the number of operations grows as n × n.
 *
 * Example:
 *
 * for (int i = 0; i < n; i++) {
 *
 *     for (int j = 0; j < n; j++) {
 *         System.out.println(i + " " + j);
 *     }
 * }
 *
 * Outer loop  -> runs n times
 * Inner loop  -> runs n times FOR EACH outer-loop iteration
 *
 * Total operations:
 *
 *              n × n = n²
 *
 * Example:
 *
 * If n = 10:
 *     10 × 10 = 100 operations
 *
 * If n = 100:
 *     100 × 100 = 10,000 operations
 *
 * Therefore:
 *              Time Complexity = O(n²)
 *
 *
 * IMPORTANT:
 * Two nested loops are often O(n²),
 * but always analyze what each loop actually does.
 *
 *
 * Remember:
 * n loop inside n loop -> O(n²)
 */


/*
 * ================================================================
 * 4) O(log n) — LOGARITHMIC TIME
 * ================================================================
 *
 * O(log n) occurs when the input size is REDUCED
 * by some constant factor in every iteration.
 *
 * Example:
 *
 * int n = 16;
 *
 * while (n > 1) {
 *     n = n / 2;
 * }
 *
 * Let's see what happens:
 *
 *     16 -> 8 -> 4 -> 2 -> 1
 *
 * We are dividing n by 2 in every step.
 *
 * Number of steps:
 *
 *     log₂(n)
 *
 * For n = 16:
 *
 *     log₂(16) = 4
 *
 * Therefore:
 *              Time Complexity = O(log n)
 *
 *
 * Why is O(log n) fast?
 *
 * Because we don't process every element.
 * We keep reducing the problem size.
 *
 *
 * Common example:
 *     Binary Search -> O(log n)
 *
 *
 * Remember:
 * If n becomes n/2, n/4, n/8, ...
 * -> O(log n)
 */


/*
 * ================================================================
 * QUICK COMPARISON
 * ================================================================
 *
 * O(1)       -> Constant
 * O(log n)   -> Logarithmic
 * O(n)       -> Linear
 * O(n²)      -> Quadratic
 *
 *
 * From FASTER to SLOWER (for large n):
 *
 *     O(1)
 *       ↓
 *     O(log n)
 *       ↓
 *     O(n)
 *       ↓
 *     O(n²)
 *
 *
 * As we move DOWN this list,
 * the time complexity generally increases.
 */

// how to calculate complexity -
//1. ignore constants
//2. ignore lower order terms
//3. nested loops multiply 
//4. seperate loops add
//5. condition based loops

//EXAMPLEEEEEEEEEEEEEEEE

/*
 * ================================================================
 * HOW TO CALCULATE TIME COMPLEXITY
 * ================================================================
 *
 * There are 5 important rules:
 *
 * 1. IGNORE CONSTANTS
 * 2. IGNORE LOWER ORDER TERMS
 * 3. NESTED LOOPS -> MULTIPLY
 * 4. SEPARATE LOOPS -> ADD
 * 5. CONDITION-BASED LOOPS -> ANALYZE HOW MANY TIMES THEY RUN
 */


/*
 * ================================================================
 * 1. IGNORE CONSTANTS
 * ================================================================
 *
 * Example:
 *
 * for (int i = 0; i < 5 * n; i++) {
 *     System.out.println(i);
 * }
 *
 * Loop runs 5n times.
 *
 * Complexity = O(5n)
 *
 * We IGNORE the constant 5:
 *
 *             O(5n) -> O(n)
 *
 * Therefore:
 *             Time Complexity = O(n)
 *
 *
 * Another example:
 *
 * for (int i = 0; i < 100; i++) {
 *     System.out.println(i);
 * }
 *
 * 100 is a constant.
 *
 * It does NOT depend on n.
 *
 * Therefore:
 *             O(100) -> O(1)
 */


/*
 * ================================================================
 * 2. IGNORE LOWER ORDER TERMS
 * ================================================================
 *
 * Example:
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.println(i);
 * }
 *
 * for (int i = 0; i < n * n; i++) {
 *     System.out.println(i);
 * }
 *
 * First loop  -> O(n)
 * Second loop -> O(n²)
 *
 * Total:
 *
 *             O(n + n²)
 *
 * We keep the HIGHEST ORDER term and ignore lower orders:
 *
 *             O(n + n²) -> O(n²)
 *
 * Therefore:
 *             Time Complexity = O(n²)
 *
 *
 * General rule:
 *
 * O(n³ + n² + n + 10)
 *
 * Highest order term = n³
 *
 * Therefore:
 *             O(n³)
 */


/*
 * ================================================================
 * 3. NESTED LOOPS -> MULTIPLY
 * ================================================================
 *
 * Example:
 *
 * for (int i = 0; i < n; i++) {          // n times
 *
 *     for (int j = 0; j < n; j++) {      // n times
 *         System.out.println(i + " " + j);
 *     }
 * }
 *
 * Outer loop  -> n
 * Inner loop  -> n
 *
 * Since the loops are NESTED:
 *
 *             n × n = n²
 *
 * Therefore:
 *             Time Complexity = O(n²)
 *
 *
 * Another example:
 *
 * for (int i = 0; i < n; i++) {
 *
 *     for (int j = 0; j < n; j++) {
 *
 *         for (int k = 0; k < n; k++) {
 *             System.out.println(i + j + k);
 *         }
 *     }
 * }
 *
 * Three nested loops:
 *
 *             n × n × n = n³
 *
 * Therefore:
 *             O(n³)
 */


/*
 * ================================================================
 * 4. SEPARATE LOOPS -> ADD
 * ================================================================
 *
 * Example:
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.println(i);
 * }
 *
 * for (int j = 0; j < n; j++) {
 *     System.out.println(j);
 * }
 *
 * These loops are SEPARATE, not nested.
 *
 * First loop  -> O(n)
 * Second loop -> O(n)
 *
 * Add them:
 *
 *             O(n) + O(n)
 *             = O(2n)
 *
 * Ignore constant 2:
 *
 *             O(2n) -> O(n)
 *
 * Therefore:
 *             Time Complexity = O(n)
 *
 *
 * Example with different sizes:
 *
 * for (int i = 0; i < n; i++) {
 *     // O(n)
 * }
 *
 * for (int j = 0; j < n * n; j++) {
 *     // O(n²)
 * }
 *
 * Total:
 *
 *             O(n) + O(n²)
 *
 * Ignore lower-order n:
 *
 *             O(n²)
 *
 * Therefore:
 *             Time Complexity = O(n²)
 */


/*
 * ================================================================
 * 5. CONDITION-BASED LOOPS
 * ================================================================
 *
 * Don't just look at "while" and assume O(n).
 *
 * Check HOW the value changes in every iteration.
 *
 *
 * Example 1:
 *
 * int i = 1;
 *
 * while (i < n) {
 *     i++;
 * }
 *
 * i increases by 1:
 *
 *     1 -> 2 -> 3 -> 4 -> ... -> n
 *
 * Approximately n iterations.
 *
 * Therefore:
 *             O(n)
 *
 *
 * ---------------------------------------------------------------
 * Example 2:
 *
 * int i = 1;
 *
 * while (i < n) {
 *     i = i * 2;
 * }
 *
 * i doubles every time:
 *
 *     1 -> 2 -> 4 -> 8 -> 16 -> ...
 *
 * Number of iterations = log₂(n)
 *
 * Therefore:
 *             O(log n)
 *
 *
 * ---------------------------------------------------------------
 * Example 3:
 *
 * int i = n;
 *
 * while (i > 1) {
 *     i = i / 2;
 * }
 *
 * i is divided by 2 every time:
 *
 *     n -> n/2 -> n/4 -> n/8 -> ...
 *
 * Therefore:
 *             O(log n)
 */


/*
 * ================================================================
 * FINAL EXAMPLE — APPLY ALL RULES
 * ================================================================
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.println(i);
 * }
 *
 * for (int i = 0; i < n; i++) {
 *     for (int j = 0; j < n; j++) {
 *         System.out.println(i + j);
 *     }
 * }
 *
 *
 * FIRST PART:
 *     One loop -> O(n)
 *
 * SECOND PART:
 *     Nested loops -> O(n × n) -> O(n²)
 *
 * They are separate:
 *
 *     O(n) + O(n²)
 *
 * Ignore lower-order term O(n):
 *
 *     O(n²)
 *
 * Therefore:
 *
 *             FINAL COMPLEXITY = O(n²)
 *
 *
 * ================================================================
 * QUICK MEMORY TRICK
 * ================================================================
 *
 * Constants       -> IGNORE
 * Lower terms     -> IGNORE
 * Nested loops    -> MULTIPLY
 * Separate loops  -> ADD
 * Divide by 2     -> LOGARITHMIC
 * Increase by 1   -> LINEAR
 */

// PROBLEM BASED UNDERSTANDING

/*
 * PROBLEM 1: COUNT OPERATIONS
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.println(i);
 * }
 *
 * Loop runs n times.
 * Each operation = O(1)
 *
 * => n × O(1) = O(n)
 *
 * FINAL: O(n)
 */


/*
 * PROBLEM 2: NESTED LOOP
 *
 * for (int i = 0; i < n; i++) {
 *     for (int j = 0; j < n; j++) {
 *         System.out.println(i + j);
 *     }
 * }
 *
 * Outer loop = n
 * Inner loop = n
 *
 * Nested loops → MULTIPLY:
 * n × n = n²
 *
 * FINAL: O(n²)
 */

/*
 * PROBLEM 3: HALF LOOP
 *
 * for (int i = 0; i < n/2; i++) {
 *     System.out.println(i);
 * }
 *
 * Loop runs n/2 times.
 * Ignore constant 1/2:
 *
 * n/2 -> O(n)
 *
 * FINAL: O(n)
 */


/*
 * PROBLEM 4: INCREMENT BY 2
 *
 * for (int i = 0; i < n; i += 2) {
 *     // work
 * }
 *
 * Loop runs n/2 times.
 * Ignore constant 1/2:
 *
 * n/2 -> O(n)
 *
 * FINAL: O(n)
 */


/*
 * PROBLEM 5: LOGARITHMIC LOOP
 *
 * for (int i = 1; i < n; i *= 2) {
 *     // work
 * }
 *
 * Values:
 * 1 -> 2 -> 4 -> 8 -> 16 -> ...
 *
 * i doubles every time.
 * Number of iterations = log₂(n)
 *
 * FINAL: O(log n)
 *
 *
 * KEY POINT:
 * i += 2  -> O(n)       // addition
 * i *= 2  -> O(log n)   // multiplication
 */

/*
 * BEST CASE vs WORST CASE
 *
 * Example: Linear Search
 *
 * for (int i = 0; i < n; i++) {
 *     if (arr[i] == target)
 *         return i;
 * }
 *
 *
 * BEST CASE:
 * Target is at the FIRST position.
 *
 * Only 1 comparison is needed.
 *
 * => O(1)
 *
 *
 * WORST CASE:
 * Target is at the LAST position
 * OR target is not present.
 *
 * We check all n elements.
 *
 * => O(n)
 *
 *
 * FINAL:
 * Best Case  -> O(1)
 * Worst Case -> O(n)
 */

/*
 * SPACE COMPLEXITY
 *
 * Space Complexity = Extra memory used by the program.
 *
 *
 * Example 1:
 *
 * int x = 10;
 *
 * Only one variable is created.
 * Memory used remains constant.
 *
 * => O(1)
 *
 *
 * Example 2:
 *
 * int[] arr = new int[n];
 *
 * Array size depends on n.
 * As n increases, memory also increases.
 *
 * => O(n)
 *
 *
 * FINAL:
 *
 * Constant memory  -> O(1)
 * Memory depends on n -> O(n)
 */

/*
 * Example 3: 2D Array / Matrix
 *
 * int[][] matrix = new int[n][n];
 *
 * Matrix has:
 *     n rows × n columns
 *
 * Total elements:
 *     n × n = n²
 *
 * Therefore, extra memory used = O(n²)
 *
 * FINAL SPACE COMPLEXITY: O(n²)
 */

/*
 * AUXILIARY SPACE
 *
 * Extra memory used by the algorithm,
 * apart from the input.
 *
 * Example:
 *
 * int sum = 0;
 *
 * Only one variable is used.
 * => Auxiliary Space = O(1)
 */


/*
 * COMBINED EXAMPLE
 *
 * int[] arr = new int[n];
 *
 * Input space:
 *     Array stores n elements
 *     => O(n)
 *
 * Extra/Auxiliary space:
 *     No extra data structure is created
 *     => O(1)
 *
 * FINAL:
 * Input Space      -> O(n)
 * Auxiliary Space  -> O(1)
 */

/*
 * TIME vs SPACE TRADEOFF
 *
 * Sometimes:
 * -> Faster code uses MORE memory.
 * -> Less memory uses MORE time.
 *
 * Example:
 *
 * Brute Force  -> Slow + Less Memory
 * Optimized    -> Fast + More Memory
 *
 * So, we can trade SPACE for TIME (or vice versa).
 */


/*
 * COMMON MISTAKES
 *
 * 1. Thinking Time Complexity = seconds
 *
 * WRONG ❌
 * Time complexity does NOT mean actual seconds.
 *
 * Execution time depends on:
 * -> Machine
 * -> Processor
 * -> Programming language, etc.
 *
 * We measure how the work GROWS with input size.
 *
 *
 * 2. Counting Exact Operations
 *
 * WRONG ❌
 * We don't usually count every single operation.
 *
 * We focus on the GROWTH RATE:
 *
 * O(2n)  -> O(n)
 * O(n² + n) -> O(n²)

3.  NOT REMOVING CONSTANTS

4. CONFUSING NESTED VS SEQUENTIAL LOOPS


Interview Importance
Time & Space Complexity is:
• asked in every coding round
• required in optimization
• used to compare solutions



IMPORTANT QUESTIONNNNNNNNNN-
for (int i = 0; i < n; i++) {
 *     for (int j = 0; j < i; j++) {
 *         // work
 *     }
 * }

YAHA FIRST LOOP WILL RUN N TIMES AND SECOND LOOP WILL NOT RUN AT I=0, WILL RUN 1 TIME AT I=1, WILL RUN 2 TIMES AT I=2 AND SO ON
SO TOTAL NUMBER OF TIMES SECOND LOOP WILL RUN = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = n(n-1)/2 = O(n^2)

*/

/*
 * for (int i = n; i > 0; i /= 2) {
 *     // work
 * }
 *
 * Values:
 * n -> n/2 -> n/4 -> n/8 -> ... -> 1
 *
 * Suppose n = 16:
 * 16 -> 8 -> 4 -> 2 -> 1
 *
 * Let number of iterations = k
 *
 * After k iterations:
 *     n / 2^k = 1
 *
 * Therefore:
 *     n = 2^k
 *
 * Taking log:
 *     k = log₂(n)
 *
 * FINAL TIME COMPLEXITY = O(log n)
 */

/*
 * for (int i = 0; i < n; i++)
 *     for (int j = 0; j < n; j++)
 *
 * Outer loop  -> n times
 * Inner loop  -> n times
 *
 * Nested loops -> MULTIPLY
 *
 * n × n = n²
 *
 * FINAL: O(n²)
 */

/*
 * 5. ARRAY
 *
 * int[] arr = new int[n];
 *
 * Array contains n elements.
 *
 * Memory grows with n:
 *     n elements -> O(n) space
 *
 * FINAL SPACE COMPLEXITY: O(n)
 */

//---------------------------------------------------------------------------------------------------------------------------------
//INTERMEDIATE LEVELLLLLLL

/*
 * 6. NESTED LOOP
 *
 * for (int i = 0; i < n; i++)
 *     for (int j = 0; j < n; j += 2)
 *
 * Outer loop  -> n times
 * Inner loop  -> n/2 times
 *
 * Nested loops -> MULTIPLY
 *
 * n × n/2 = n²/2
 * Ignore constant 1/2
 *
 * FINAL: O(n²)
 */


/*
 * 7. INCREMENT BY 3
 *
 * for (int i = 1; i < n; i *= 3)
 *
 * Values:
 * 1 -> 3 -> 9 -> 27 -> ...
 *
 * i becomes 3 times every iteration.
 *
 * Number of iterations = log₃(n)
 *
 * FINAL: O(log n)
 */

/*
 * 8. SEPARATE LOOPS
 *
 * for (int i = 0; i < n; i++)
 *     System.out.println(i);
 *
 * for (int j = 0; j < n; j++)
 *     System.out.println(j);
 *
 * Separate loops -> ADD
 *
 * O(n) + O(n) = O(2n)
 * Ignore constant 2
 *
 * FINAL: O(n)
 */


/*
 * 9. NESTED LOOP
 *
 * for (int i = 0; i < n; i++)
 *     for (int j = i; j < n; j++)
 *
 * Inner loop runs:
 *     n + (n-1) + (n-2) + ... + 1
 *
 * = n(n+1)/2
 * -> O(n²)
 *
 * FINAL: O(n²)
 */


/*
 * 10. THREE NESTED LOOPS
 *
 * for (int i = 0; i < n; i++)
 *     for (int j = 0; j < i; j++)
 *         for (int k = 0; k < j; k++)
 *
 * Roughly:
 *     n × n × n = n³
 *
 * Lower terms/constants are ignored.
 *
 * FINAL: O(n³)
 */

//ADVANCED LEVEL OF THINKINGGGGGGGGGGGGGGGGGG

/*
 * 11. WHILE LOOP
 *
 * int i = 0;
 * while (i < n) {
 *     i += 2;
 * }
 *
 * i: 0 -> 2 -> 4 -> 6 -> ... -> n
 *
 * Runs approximately n/2 times.
 * Ignore constant 1/2:
 *
 * FINAL: O(n)
 */


/*
 * 12. MULTIPLY BY 2
 *
 * int i = 1;
 * while (i < n) {
 *     i *= 2;
 * }
 *
 * i: 1 -> 2 -> 4 -> 8 -> 16 -> ... -> n
 *
 * i doubles every time.
 * Number of iterations = log₂(n)
 *
 * FINAL: O(log n)
 */


/*
 * 13. TWO INCREMENTS
 *
 * for (int i = 0; i < n; i++) {
 *     i++;
 * }
 *
 * i increases by 2 in every iteration:
 * 0 -> 2 -> 4 -> 6 -> ...
 *
 * Runs approximately n/2 times.
 * Ignore constant 1/2:
 *
 * FINAL: O(n)
 */

/*
 * 14. NESTED LOOP WITH SQRT(n)
 *
 * for (int i = 0; i < n; i++) {
 *     for (int j = 0; j < Math.sqrt(n); j++) {
 *         System.out.println(i + j);
 *     }
 * }
 *
 * Outer loop      -> n
 * Inner loop      -> √n
 *
 * Nested loops -> MULTIPLY
 *
 * n × √n = n√n = n^(3/2)
 *
 * FINAL: O(n√n)
 */


/*
 * 15. CONDITION INSIDE LOOP
 *
 * for (int i = 0; i < n; i++) {
 *     if (i % 2 == 0) {
 *         System.out.println(i);
 *     }
 * }
 *
 * Loop runs n times.
 * if-condition -> O(1)
 *
 * n × O(1) = O(n)
 *
 * Even though print runs only ~n/2 times,
 * we still check the condition n times.
 *
 * FINAL: O(n)
 */

// SPACE COMPLEXITY PRACTISE
/*
 * SPACE COMPLEXITY PRACTICE
 *
 * 16.
 *
 * int x = 10;
 *
 * Only one variable -> constant space
 *
 * FINAL: O(1)
 */


/*
 * 17.
 *
 * int[] arr = new int[n];
 *
 * n elements are stored.
 *
 * FINAL: O(n)
 */


/*
 * 18.
 *
 * int[][] matrix = new int[n][n];
 *
 * n × n elements = n²
 *
 * FINAL: O(n²)
 */


/*
 * 19.
 *
 * int[] a = new int[n];
 * int[] b = new int[n];
 *
 * n + n = 2n
 * Ignore constant 2.
 *
 * FINAL: O(n)
 */


/*
 * 20.
 *
 * int[][] grid = new int[n][m];
 *
 * n × m elements are stored.
 *
 * FINAL: O(n × m)
 */


/*Final Takeaway
If loops and arrays taught you how to solve problems.
• Time Complexity teaches you how efficiently you solve them
• Space Complexity teaches you how smartly you use memory
Most Important Insight
Writing a working solution is step 1
Writing an efficient solution is step 2 */

public class timespace {
    
}


// IF SPACES HAI IN YOUR FOLDER LIKE "TIME AND SPACE COMPLEXITY" THEN IT WILL GIVE ERROR SO CHANGE THE FOLDER NAME TO "TIMEANDSPACECOMPLEXITY" OR "TIME_AND_SPACE_COMPLEXITY" SO U CAN USE 
// cd "Time and space complexity"

//