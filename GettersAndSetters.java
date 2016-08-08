/**
 * Created by guest on 8/5/16.
 */

public class GettersAndSetters {
package com.theironyard.charlotte;

    /**
     * Created by guest on 8/4/16.
     */
    public class Artist {
        String genre;
        int yearOfTenure;
        boolean anyGood;

        Public Artist (String genre, int yearOfTenure, boolean anyGood) {

            public String getGenre () {
                return genre;
            }

        public void setGenre(String genre) {
            if(genre.equalsIgnoreCase("Country")) {
                System.out.println("I don't like country, try something else")
            }
            if(genre.length() < 1) {
                System.out.println("Too short!");
            } else {
                this.genre = genre;
            }
        }

        public int getYearOfTenure() {
            return yearOfTenure;
        }

        public void setYearOfTenure(int yearOfTenure) {
            this.yearOfTenure = yearOfTenure;
        }

        public boolean isAnyGood() {
            return anyGood;
        }

        public void setAnyGood(boolean anyGood) {
            this.anyGood = anyGood;
        }


    }

}
    Artist artist = new Artist();// if we do this, then line 54, it allows more user control
//no retraints on what information is used/permitte
artist.genre = "Country";
        // here, because we set that the genre which an artist can have is ?
        // the user can type country or any other type of perceived genre
        // but if we wanted to limit the acceptable fields, we would SET the limit at
        // the below string- the below parameter, which is country. If I want to accept
        // other types of genre, I could do that also. But getters and setters restrict
        // the input from the user.

        artist.setGenre("Country");
        // this is a setter, which limited input from user.
}
// return genre means that the program ACCEPTS the  given infomration and will process it.

//ORDER FOR GETTERS AND SETTERS

// goes, must get the variable, (getVariable() { )  and return it (return variable;)  then place constructor (public Classname
// (String variable) { this.variable = variable; }
//
// then set the variable (public void setVariable (String variable) { this.variable = variable;}

// or do this automatically by typing command N, and first, the get, then constructor, then set.
// if you do this, getters and setters are done and you don't have to do anything else.


//SHORTCUT FOR CONSTRUCTOR
// if you don't have the ending curly bracket for the main class, you can't generate a constructor
// using the shortcut
// if you set up a constructor, you have to work within that constructor to start out with.
// its best to put constructors at the beginning

// this is what it looks like to do a constructor without a getter and setter

//public Tree(String typeOfTree, int ageOfTree, boolean treePrunedRecently) {
//        this.typeOfTree = typeOfTree;
//        this.ageOfTree = ageOfTree;
//        this.treePrunedRecently = treePrunedRecently;
// notice how they are grouped together.

//you can do the getter and setter first, and put the constructor between each one, or you can
/// do the constructors first and put the constructors all at the top.
// code runs fine both ways.
// the this statements, are required for code to run though in a constructor.

//RANDOM POSSIBLY IRRELEVANT NOTES
//

//                        public void setGenre(String genre){
//                        if (genre.equalsIgnoreCase("Country")) {
//                                System.out.println("I don't like country, try something else");
//                        }
//
//
//                }
//}
//              if(genre.length() < 1) {
//                                System.out.println("Too short!");
//                        } else {
//                                this.genre = genre;
//                        }
//                }

//        public int getYearOfTenure() {
//                return yearOfTenure;
//        }
//
//        public void setYearOfTenure(int yearOfTenure) {
//                this.yearOfTenure = yearOfTenure;
//        }
//
//        public boolean isAnyGood() {
//                return anyGood;
//        }
//
//        public void setAnyGood(boolean anyGood) {
//                this.anyGood = anyGood;
//        }
//
//
//        }
//
//}
//Artist artist = new Artist();//
//artist.genre = "Country";
//artist.setGenre("Country");