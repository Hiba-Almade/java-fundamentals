

# java-fundamentals

## Repo for Labs of Java 401
### **Java primitives and control flow** _ 10/10/2021

***Basics / Main.java***

> it contain 3 methods

* **pluralize:**  that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
* **flipNHeads:** that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
* **clock:** that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

-------

### **Arrays, for loops, testing**_11/10/2021


***Basuclibrary / Library.java & LibraryTest.java***

> it's contain 4 methods

* **roll:**  function accepts an integer n and rolls a six-sided dice n times.
  The method should return an array containing the values of the rolls.
* **containsDuplicates:** function returns true or false
  depending on whether the array contains duplicate values.
* **calcAvg:** function that accepts an array of integers
  and calculates and returns the average of all the values in the array.
* **lowAvg:** function take an array of arrays calculates the average value for each
  array and return the array with the lowest average.

----------

### **Maps, File I/O, and Testing**_12/10/2021


***Basiclibrary / Library.java & LibraryTest.java***

> it's contain 2 methods

* **weatherTemplate:**  Using the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature 
not seen during the month. Return that String.
* **tally:** function that accepts a List of Strings representing votes and returns one string to show what got the most votes.

***linter / App.java & AppTest.java***

> it's contain 1 method 

* **findError:**
A method that reads a file with a given an error message whenever it finds a line that doesn't end in a semi-colon.
----------

### **Composition and Inheritance**_17/10/2021

***inheritance / Restaurant.java & Review.java & LibraryTest.java***
> it's contain 4 classes 

* **Restaurant** class: Each Restaurant have a name, a number of stars and a price category.
and it's include an **addReview** method.

* **Review** class: Each Review have a body, an author, and a number of stars.

* **Shop** class: Each Shop have a name, description, and number of dollar signs. 
and it's include an **addReview** method.

* **Theater** class: Each Theater  should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
  and it's include an **addReview**, **addMovie** and **removeMovie**method.


