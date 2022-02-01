package com.careerdevs.moviefactory;

public class Movie {
    String title;
    String director;
    int runTime;
    boolean isFav;

    public Movie(String title , String director, int runTime , boolean isFav){
        this.title = title;
        this.director = director;
        this.runTime = runTime;
        this.isFav = isFav;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", runTime=" + runTime +
                ", isFav=" + isFav +
                '}';
    }
}


