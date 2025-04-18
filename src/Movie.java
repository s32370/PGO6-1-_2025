public class Movie {

    String director;
    int duration;


//The constructor should accept four parameters: title , publicationYear , director ,
//duration
    public Movie(String title, int publication_year, String director, int duration) {
        super(title, publication_year);
        this.director = director;
        this.duration = duration;
    }

//Call the superclass constructor using
//Initialize the movie-specific fields: this.director = director and this.duration =
//duration

@Override public void displayInformation(){
        super.displayInformation();
        System.out.println(director);
        System.out.println(duration);

}

    //Override the  method using the @Override annotation
    //First, call the superclass version of this method using super.displayInformation()
    //Then, add the display of movie-specific information: director and duration

    public void checkDuration(){
        if (duration > 120){
            System.out.println("The movie is long, " + duration + " minutes long");
        }else{
            System.out.println("The movie is not long, " + duration + " minutes long");
        }
    }
    //imp
    //Create a method ) that evaluates whether the movie is long
    //Inside the method, check whether  (2 hours). If so, display a message
    //that itʼs a long movie. Otherwise, say itʼs a standard movie. In both cases, include the
    //duration in minutes
}