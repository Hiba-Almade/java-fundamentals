package inheritance;

import java.util.ArrayList;

public class Restaurant implements ReviewsInterface{
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<Review> getReviewslist() {
        return reviewslist;
    }

    public void setReviewslist(ArrayList<Review> reviewslist) {
        this.reviewslist = reviewslist;
    }

    public int getAllStars() {
        return allStars;
    }

    public void setAllStars(int allStars) {
        this.allStars = allStars;
    }


    @Override
    public void addReview(String body, String author, int stars) {
        Review newReview = new Review(body,author,stars);
        if(!this.reviewslist.contains(newReview)){
            reviewslist.add(newReview);
            this.allStars+=newReview.getStars();
            this.numOfStars=allStars/reviewslist.size();
        }else {
            System.out.println("this review already added");
        }
    }

    public void addReview(Review review) {
        if(!this.reviewslist.contains(review)){
            reviewslist.add(review);
            this.allStars+=review.getStars();
            this.numOfStars=allStars/reviewslist.size();
        }else {
            System.out.println("this review already added");
        }
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
