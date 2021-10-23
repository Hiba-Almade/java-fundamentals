package inheritance;

import java.util.*;

public class Theater implements ReviewsInterface {
    private String name;
    private List<String >movies = new ArrayList<>();
    private Map<String , Review> reviewList=new HashMap<>();
    private int numOfStars ;
    private int sum; // to find the avg of stars <Rate>

    public Theater(String name) {
        this.name = name;
        this.numOfStars =0;
    }

    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
        this.numOfStars =0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Map<String, Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(Map<String, Review> reviewList) {
        this.reviewList = reviewList;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        movies.remove(movie);
    }
    @Override
    public void addReview(String body, String author, int stars) {
        Review newReview = new Review(body,author,stars);
        reviewList.put("",newReview);
        this.sum+=newReview.getStars();
        this.numOfStars=sum/reviewList.size();
    }

    public void addReview(String body, String author, int stars,String movie) {
        Review newReview = new Review(body,author,stars);
        reviewList.put(movie,newReview);
        this.sum+=newReview.getStars();
        this.numOfStars=sum/reviewList.size();
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name: '" + name + '\'' +
                ", movies: " + movies +
                ", review list: " + reviewList +
                ", Rate: " + numOfStars +" stars"+
                '}';
    }
}
