/**
 * Created by guest on 8/4/16.
 */
public class Person {
    //here is a new class called Person

    String name;
    //string is a new type (Ben: No. String exists in the Java language, not a new type.)

    // this name is the field of the string in the main class on line 20- they are connected. (Ben: I don't think so.)

    String hairColor;
    //here, I create another field called hairColor - color is capitalized because of camel syntax tradition (Ben: Yes.)

    int age;
    //and again, I use another common type of field called int. the field is called age here, and is an integer, hence int


    public Person() {
        //here, I create another method. I do this with the word public and curly bracket.
        //the person here though is a constructor.

        // Ben: ^ the METHOD here though is a constructor. If a method has no return type
        // and is the same name as the containing class, it is a constructor.
    }

    public Person(String name) {
        //the "String name" allows person in line 18 and line 23 to connect to line 4. These essentially refer to line 4,
        //because they are classes. so, public person line 18 and public person line 23 are instance methods
        //within the class, person. (Ben: This is confusing to me so I cannot verify).

        this.name = name;
        //this name is connected to the name defined above. they are all the same data fields. (Ben: The terms you're
        // using here are a little strange but I think are correct. `this.name` is a field, `name` is a parameter)
    }

    public void walk() {
        System.out.println(name + " is walking!");

        //  here, I declare another method. that method is walk.
        //walk is also a constructor (Ben: No. Big no.) , which means I can fill it with other data elsewhere. (Ben: no.)
        // here, I use name, which has been defined above, in line 7. (Ben: Correct. Name is a field. It is on line 7.)
        //
    }
}


// so to create a main class, I just create a new project. That new project will automatically label public class NAME
//name being the name of the new class.

// to start conventional code, I type public static void and then the name of the class, like...

