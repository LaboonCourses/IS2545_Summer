# IS2545 Deliverable 4
Summer Semester 2016

DUE 13 Jul 2016

## Deliverable 4

For this assignment, you will write the code for a modified map function (described below), and then use your own property-based testing tests to ensure that you have handled all edge cases.

For the JUnit-based property-based tests, generate a minimum of 100 different random arrays of different sizes, and test different properties (many examples were discussed in the lecture on property-based testing) of "billifying" them.  You should test at least three properties of each resulting array.  You should use traditional JUnit test procedures (e.g., use assertions, don't use System.out.println during normal execution, etc.)  

There should be one property tested with each JUnit method.  Therefore, there should be three different @Test-annotated methods.  You should not use junit-quickcheck or any other property-based testing framework - you are creating your own.

Additionally, I expect an approximately one-page (3 or 4 paragraphs) description of why you chose this project, how you went about doing it, any issues you faced, and failures discovered (if any).  

Finally, I will require a screenshot of the results of the executed unit tests (not the test code itself).  Please put this on its own page.

## Function To Test

The map function is very commonly used in functional programming.  The idea is that given a list of items, perform some function on every item in the list, and return the modified list which should be full of the results of applying the function to that item.  For example, let us assume that we have a three-element array, containing the int values 1, 2, and 3:

```java
int[] foo = {1, 2, 3};
```

and a function which doubles any number given to it:

```java
public int doubleIt(int x) {
   return x * 2;
}
```

Mapping the doubleIt function over the array foo will return the result:

```java
[2, 4, 6]
```

For this program, you will make a modified map function which also adds a result to the end of the list.  You will write a Java method named `billify` which will accept an array of ints (of any length greater than or equal to one), map the square (i.e. taking a number and returning its square) function over the results, and then add one element to the array with the sum of all other elements in the array.  If you are familiar with functional programming, this is the same as _folding_ or _reducing_ the array, except we are including the value in the array instead of returning it.

Examples:

```
[1, 2, 3] -> [1, 4, 9, 14]
[4] -> [16, 16]
[10, 10, 10] -> [100, 100, 100, 300]
[1, 1, 2, 2, 3, 3] -> [1, 1, 4, 4, 9, 9, 28]
[5, 3, 9] -> [25, 9, 81, 115]
```

The signature of the method should be:

```java
public int[] billify(int[] x)
```

## Testing

You should assume that all arrays passed in to your method will contain one or more elements (there will be no nulls or zero-length arrays), and a maximum of one hundred elements.  You should assume that all values passed in the array are positive integers between the values of 1 and 100 (inclusive).

Think of three properties that should always hold.  Write these (in natural language, i.e. English) in the comments above each test that tests that property.  Write tests that pseudo-randomly generate possible arrays, pass them to the `billify` method, then check to see if they meet the invariants (properties) that you specify.  If they do not meet the invariant, then the test should immediately fail (via `fail()` or some particular assertion you use).

## Format
Every assignment should have a title page with:
* The name of the student
* The title "IS2545 - DELIVERABLE 4 - PROPERTY-BASED TESTING"

## Grading (Property-Based Testing)
* Summary - 10%
* Screenshot of completed test - 20%
* `billify` method works properly - 20%
* Test Code - 50%

Please feel free to email me or come to office hours to discuss any problems you have. 
 
