## Composition and Inheritance

### Step 1:
* Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars and a price category.

Implement a Restaurant **constructor** and **toString** method.

* Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
 
  `>` Implement a Review **constructor** and **toString** method.

* Add an instance method **addReview** to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.


When you associate a review with a restaurant, that restaurant’s star rating should change.

#### Testing:

`>` Test that your Restaurant constructor is behaving reasonably.

`>` Test to create an instance of Restaurant and ensure that its toString is working properly.

`>` Test to create an instance of Review and ensure that its toString is working properly.

`>` Tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

`>` Test update stars for the restaurant when you're adding new review.

----

### Step 2:

Create a class to represent a Shop. Each Shop  should have a name, description, and number of dollar signs.
Implement a Restaurant **constructor** and **toString** method.

* Create a class to represent a Theater. a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
  `>` Implement a Review **constructor**, **toString**, **addMovie** and **removeMovie** method.

* Add an instance method **addReview** to your Shop and Theater class. 