package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numOfStars ;
    private String price;
    private ArrayList<Review> reviewslist= new ArrayList<Review>();
    private int allStars;

    public Restaurant(String name, int price) {
        this.name = name;
        this.numOfStars =0;
        this.price = price+" $";
    }

    public void addReview (String body, String author, int stars){
        Review newReview = new Review(body,author,stars);
        reviewslist.add(newReview);
        this.allStars+=newReview.getStars();
        this.numOfStars=allStars/reviewslist.size();
    }

    @Override
    public String toString() {
        String result ="Restaurant name: "+this.name+
                       "\nRestaurant price: "+this.price+
                       "\nRestaurant Stars: "+this.numOfStars+
                       "\nRestaurant List: ";
        for(Review review:reviewslist){
            result+="\n"+review.toString();
        }
        return result;
    }
}
