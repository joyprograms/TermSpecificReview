/**
 * Created by guest on 8/4/16.
 */
public class Main {
    //Main is the class - there can be multiple classes. inside
    //this main class there are methods. the { indicates that what remains
    //is the method, or code which is part of the main class.


    // BEN: The { symbol indicates the beginning of a code block. That code
    // block can come after a method declaration or an "if" statement or a "for" loop
    // or a class declaration or many other ways.
    //
    // |---method signature---|
    //        |----| return type
    //               |---------| method name
    // |----| access modifier (public/private)
     public String helloWorld(String one, int two, AnyOtherField three);
    //                         |----------------- parameter list -------|
    // {  }
    // |----| method body
    // |----| access modifier
    //              |--------| class name
       public class TestClass {
    //      // zero or many fields ** a constructor can have zero or many parameters as long as it
            //is the same name as the class and returns nothing, correct?
    //      |----| field type
    //             |---| field name
            String name;
            int two
            AnyOtherField three

    //      // zero or many constructors
    //      |--------| same name as class
    //               |-------------parameter list--------------|
            public TestClass(String name, int two, AnyOtherField three) {
    //          // Things that happen when you create an object
                      TestClass test = new TestClass("Ben", 2, aVariableOfTypeAnyOtherClass);
    //      }

    //      // zero or many methods
    // }
                    this.genre = genre;
                //  |-----------------| is required with a constructor. not sure why.
                // maybe because within the constructor, it defines the genre in
                // this class

    public static void main (String[] args) { // by saying this is public
        //it allows the code to be run publicly, not behind the scenes, unaware
        //of the user.

        // BEN: The access modifier specifies the visibility of a class, field, or
        // method with respect to other classes.
        // eg a private field in "TestClass" is not visible to the "Main" class and is
        // private because it's designed to be only used inside that class.


        //STATIC is what allows the current method, primary to be run in the class
        //Main. if static were not here, it could be Dynamic. Not sure what distinguishes
        //between Dynamic and static...

        // BEN: There is no dynamic keyword in Java. Static means that the field or method
        // exists on the class and not the instance of the class.

        //      |----| class name
        //             |--static method--|    |-| object of type person
        //                                       |------------| instance method
        // e.g. Person.shakeHands(p1, p2); vs p1.shakeHands(p2);

        // BEN: You can make any field or method static if that method doesn't rely
        // on the current object.




        //VOID indicates that this will not return anything. Which also means that the
        //software will not do anything significant as a result of this code being run.

        // BEN: A lot of impactful things happen inside methods that return void.

        // Animal a = new Animal();
        // a.speak();

        Person p = new Person();// here I create new type. (Person) is the type.
        // I declare here a new person type. the new person type is p (BEN: NO). this is done with
                // the current type, the new type side by side, the initializer (=) the word new, and
                 //the current type again. (Ben: No. See syntax above)

//        p.name = "Ben";
        //p is the type. name is now a field of the type, p. (Ben: No. name is a string.
        // You can tell it's a string because you set name equal to String literal.)

        // I refer to name as "ben" here, as a person I want to mention in code.
        //there can be more than one person, but this one is only ben.
        //in order to add more, I have to do this (in this code) :
        // p.name = "Joy" in order to define or list other possible names
        // (Ben: Kind of. Each person that you create with the new keyword has one name.)

        Person p2 = new Person("Ben");
        // here, Person is still a type. I am creating a new instance/object of the Person type.
        //now, the person type has an instance called p2 (Ben: Yes, in the current method.)

        //this is the other way of doing the above. except without connecting the name
        //or using the name field. I would use the name field if I wanted to add more than one
        //person's name
        p.walk();

        // p.walk();
        // (Ben: Periods are used to reference members of a object or class. E.G.
        // in p.walk, p is the object, walk is a method that exists on p, which is
        // an instance of Person.

        // In the math class, you have many methods like Math.pow. The . in this case
        // indicates that the method pow is a member of the "Math" class instead of an
        // instance of the "Math" class. Methods like this, that are members of classes
        // and _not_ instances of classes, are called static.)

        //here, I use my instance/object, p, and....
        //I don't know what the period does in code.
    }
}
