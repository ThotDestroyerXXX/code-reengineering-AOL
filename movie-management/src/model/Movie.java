package model;

public class Movie {
    public int id;
    public String name;
    public String description;
    public String releaseDate; // CODE SMELL: Using String instead of Date
    public String genre;
    public int duration; // in minutes
    public double rating;
    public String director;
    public long budget;
    public long boxOffice;
    public boolean isAvailable;
    
    // CODE SMELL: Empty constructor
    public Movie() {
    }
    
    // CODE SMELL: Method that does too little
    public void toggleAvailability() {
        isAvailable = !isAvailable;
    }
    
    // CODE SMELL: Primitive Obsession - using primitives for complex data
    public String getMovieInfo() {
        return name + " (" + releaseDate + ") - " + genre;
    }
}