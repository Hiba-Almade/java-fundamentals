/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Restaurant restaurant = new Restaurant("res 1", 3);
    Shop shop=new Shop("shop 1","3","some description");
    Theater theater = new Theater("theater 1");

    @Test void createRestaurantTest() {
        Library classUnderTest = new Library();
        assertEquals("Restaurant{name: 'res 1', Rate: 0 stars, price: '3 $', reviews list: []}",restaurant.toString());
    }
    @Test void addReviewTest() {

        restaurant.addReview("nice ", "Hiba" , 5);
        assertEquals("Restaurant{name: 'res 1', Rate: 5 stars, price: '3 $', reviews list: [{body: 'nice ', author: 'Hiba', stars: 5}]}",restaurant.toString());
    }

    @Test void updateStarsTest() {

        restaurant.addReview("cute", "Rama" , 2);
        restaurant.addReview("not good", "Suzan" , 1);
        assertEquals("Restaurant{name: 'res 1', Rate: 1 stars, price: '3 $', reviews list: [{body: 'cute', author: 'Rama', stars: 2}, {body: 'not good', author: 'Suzan', stars: 1}]}",restaurant.toString());
    }

    //----------------------------------------shop------------------------------------------

    @Test void createShopTest() {
        Library classUnderTest = new Library();
        assertEquals("Shop{name: 'shop 1', price: '3', description: 'some description', review list: [], Rate: 0 stars}",shop.toString());
    }
    @Test void addReviewShopTest() {

        shop.addReview("nice ", "Hiba" , 5);
        assertEquals("Shop{name: 'shop 1', price: '3', description: 'some description', review list: [{body: 'nice ', author: 'Hiba', stars: 5}], Rate: 5 stars}",shop.toString());
    }

    @Test void updateStarsShopTest() {

        shop.addReview("cute", "Rama" , 2);
        shop.addReview("not good", "Suzan" , 1);
        assertEquals("Shop{name: 'shop 1', price: '3', description: 'some description', review list: [{body: 'cute', author: 'Rama', stars: 2}, {body: 'not good', author: 'Suzan', stars: 1}], Rate: 1 stars}",shop.toString());
    }


    // --------------------------------------theater-----------------------------

    @Test void createTheaterTest() {
        Library classUnderTest = new Library();
        assertEquals("Theater{name: 'theater 1', movies: [], review list: {}, Rate: 0 stars}",theater.toString());
    }
    @Test void addReviewTheaterTest() {

        theater.addReview("nice ", "Hiba" , 5);
        assertEquals("Theater{name: 'theater 1', movies: [], review list: {={body: 'nice ', author: 'Hiba', stars: 5}}, Rate: 5 stars}",theater.toString());
    }

    @Test void updateStarsTheaterTest() {

        theater.addReview("cute", "Rama" , 2);
        theater.addReview("not good", "Suzan" , 1);
        assertEquals("Theater{name: 'theater 1', movies: [], review list: {={body: 'not good', author: 'Suzan', stars: 1}}, Rate: 3 stars}",theater.toString());
    }


}
