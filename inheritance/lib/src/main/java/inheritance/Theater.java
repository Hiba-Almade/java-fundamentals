package inheritance;

import java.util.*;

public class Theater implements ReviewsInterface {
    private String name;
    private List<String >movies = new ArrayList<>();
    private Map<String , Review> reviewList=new HashMap<>();

    public Theater(String name) {
        this.name = name;
    }

    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
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
    }

    public void addReview(String body, String author, int stars,String movie) {
        Review newReview = new Review(body,author,stars);
        reviewList.put(movie,newReview);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviewList=" + reviewList +
                '}';
    }
}
