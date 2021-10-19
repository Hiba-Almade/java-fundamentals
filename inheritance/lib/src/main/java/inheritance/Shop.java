package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewsInterface {
    private String name;
    private String price;
    private String description;
    private ArrayList<Review> reviewslist= new ArrayList<Review>();

    public Shop(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public void addReview(String body, String author, int stars) {
        Review newReview = new Review(body,author,stars);
        if(!this.reviewslist.contains(newReview)){
            reviewslist.add(newReview);
        }else {
            System.out.println("this review already added");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", reviewslist=" + reviewslist +
                '}';
    }
}
