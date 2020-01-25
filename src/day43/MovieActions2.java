package day43;
import day42.Movie;
import java.util.*;

public class MovieActions2 {

    public static void main(String[] args) {

        Movie m1 = new Movie("Fast and Furious", 3,"Action");
        Movie m2 = new Movie("Dracula", 3.2,"Fiction");
        Movie m3 = new Movie("Godfather", 2.5,"Drama");
        Movie m4 = new Movie("Mission Impossible", 2.4,"Action");

        printMovieNameCharacters(m1);

        printShorterMovieName(m2,m3);

        System.out.println(isFamilyMovie(m3));
        printMovieInformation(m1);
    }

    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and it's genre is <type>
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        System.out.println("the movie name is: "+ movieObj.getName());
        System.out.println(", the length is : "+ movieObj.getLength()+" hours long");
        System.out.println(" and the genre is : "+ movieObj.getType());

    }
    /**
     * A void method that accept any movie object
     * and print out it's name in below format
     * If the movie name is Joker then print J-O-K-E-R (all uppercase)
     * @param movieObj the movie object to get information from
     */
    public static void printMovieNameCharacters(Movie movieObj) {
        //TODO YOUR CODE HERE
       String result = movieObj.getName().toUpperCase();
        for (int i = 0; i <result.length() ; i++) {
            if(i != result.length()-1){
                System.out.print(result.charAt(i)+"-");
            }else{
                System.out.println(result.charAt(i));
            }
        }
    }

    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     * @param movieObj1 first movie object
     * @param movieObj2 second movie object
     */
    public static void printShorterMovieName(Movie movieObj1, Movie movieObj2) {
        //TODO YOUR CODE HERE
        if(movieObj1.getName().length()>movieObj2.getName().length()){
            System.out.println(movieObj2.getName());
        }else{
            System.out.println(movieObj1.getName());
        }
    }

    /**
     * A method that check whether the length of movie is more than 2 hours
     * @param movieObj the movie object to check
     * @return true if movieObj length is more than 2 hours
     */
    public static boolean isMovieLengthMoreThan2Hours(Movie movieObj) {
        //TODO YOUR CODE HERE
        if(movieObj.getLength()>2){
            return true;
        }
        return false;
    }
    /**
     * A method that check the type of movie is Family or not
     * @param movieObj the movie object to check
     * @return true if movieObj type is Family (regardless of uppercase lowercase)
     */
    public static boolean isFamilyMovie(Movie movieObj) {
        //TODO YOUR CODE HERE
        if(movieObj.getType().equalsIgnoreCase("family")){
            return true;
        }
        return false;
    }

    /**
     * A method to return combined movie info as String in below format"
     * for example if the movie is {"Joker", 2.2, "Drama"}
     *      It should return Joker-2.2-Drama
     * @param movieObj the movie object to check
     * @return the combined movie info as String
     */
    public static String getCombinedMovieInfo(Movie movieObj) {

        String combinedResult = "";
        //TODO YOUR CODE HERE


        return combinedResult;
    }

    /**
     * A method to return newly created Movie object with provided arguments
     * @param aName the movie name you want the object to have
     * @param aLength  the movie length you want the object to have
     * @param aType the movie type you want the object to have
     * @return Movie object with above information
     */
    public static Movie createMovie(String aName, double aLength, String aType) {
        // an spoiler as example , ALREADY DONE FOR YOU
        Movie m = new Movie(aName,aLength,aType);
        return m;
    }

    /**
     * A method to return newly created Movie object with provided arguments
     * This is a bit more specialized version of create method for only Family movie
     * so the type is already known
     * @param name the movie name you want the object to have
     * @param len the movie type you want the object to have
     * @return Family Movie object with above information
     */
    public static Movie createFamilyMovie(String name, double len) {
        //TODO YOUR CODE HERE
        return null;
    }

    /**
     * A method to return your own Favorite Movie Objects as a list
     * @return List of Movie Object
     */
    public static List<Movie> getMyFavoriteMovies() {

        List<Movie> movieLst = new ArrayList<>();
        //TODO YOUR CODE HERE

        return movieLst;
    }

    /**
     * A method to get the total hours to finish all the movies
     * @param lst List of Movie Object to calculate length for
     * @return sum of all movie length
     */
    public static double getTotalHoursOfAllMovies( List<Movie> lst) {

        double sum = 0 ;
        //TODO YOUR CODE HERE

        return sum;
    }
    public static Movie returnJoker(){
        return new Movie("Joker",12,"Drama");

    }

}
