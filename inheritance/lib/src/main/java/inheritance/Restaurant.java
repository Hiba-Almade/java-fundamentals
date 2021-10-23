package inheritance;

import java.util.ArrayList;

public class Restaurant implements ReviewsInterface{
    private String name;
    private int numOfStars ;
    private String price;
    private ArrayList<Review> reviewslist= new ArrayList<Review>();
    private int sum; // to find the avg of stars <Rate>

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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void addReview(String body, String author, int stars) {
        Review newReview = new Review(body,author,stars);
        if(!this.reviewslist.contains(newReview)){
            reviewslist.add(newReview);
            this.sum+=newReview.getStars();
            this.numOfStars=sum/reviewslist.size();
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
