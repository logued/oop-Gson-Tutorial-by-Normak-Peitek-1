package dkit.oop;               // Feb 2022 Annotated by Dermot Logue

// Reference: Tutorial by Norman Peitek
// https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization

import com.google.gson.Gson;

/**
 * Demonstrates:
 * 1. Serializing a Java Object (UserSimple) into
 * a JSON string, using the Gson Parser.
 * 2. De-serializing a Json string and populating
 * a new Java Object with that data.
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("Gson Tutorials - by Norman Peitek");

        UserSimple userObject = new UserSimple(
                "Norman",
                "norman@futurestud.io",
                26,
                true
        );

        //// Serialize a Java Object into a Json String using the Gson parser

        Gson gsonParser = new Gson();   // instantiate a Gson Parser

        String userJson = gsonParser.toJson(userObject);    // Serialize an object

        System.out.println("Serializing a Java Object into a Json String, gives:");
        System.out.println(userJson);

        //////////////////////////////////////////////////////////////////////////////////////

        //  De-Serialize a Json string into a new Java Object (UserSimple)

        userJson = "{\"age\":26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";

        UserSimple userObject2 = gsonParser.fromJson(userJson, UserSimple.class);

        System.out.println("De-Serializing a Json String into a new UserSimple Java Object. ");
        System.out.println("userObject2 contains: ");
        System.out.println(userObject2.toString());
    }

    //TODO
    // Create a class Car with make, model, year fields;
    // Instantiate a Car object (you favourite car)
    // Serialize to JSON and output
    // Create a JSON String, then Deserialize it and output

}
