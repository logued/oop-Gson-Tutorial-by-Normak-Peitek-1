package dkit.oop;               // Feb 2023 Annotated by Dermot Logue

// Reference: Based on Tutorial by Norman Peitek
// https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization

import com.google.gson.Gson;

/**
 * Demonstrates:
 * 1. Serializing a Java Object (UserSimple) into
 *    a JSON string, using the Gson Parser.
 * 2. De-serializing a Json string into a new Java Object.
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

        // Serialize a Java Object into a Json String using the Gson parser.
        // Serialize simply means to convert from a Java object structure into a string

        // Instantiate a Gson Parser
        // The GSon parser classes have been loaded by Maven based on a dependency in the pom.xml file.
        Gson gsonParser = new Gson();

        String userJsonString = gsonParser.toJson(userObject);    // Serialize an object

        System.out.println("Serializing a Java Object into a Json String, gives:");
        System.out.println(userJsonString);

        //////////////////////////////////////////////////////////////////////////////////////
        //  De-Serialize a Json string into a new Java Object (UserSimple)

        userJsonString = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";

        UserSimple userObject2 = gsonParser.fromJson(userJsonString, UserSimple.class);

        System.out.println("De-Serializing a Json String into a new UserSimple Java Object. ");
        System.out.println("userObject2 contains: ");
        System.out.println(userObject2.toString());
    }

    //TODO
    // Create a separate class Car with make, model and year fields;
    // Instantiate a (make a new) Car object (you favourite car)
    // Serialize to JSON String and output that string.
    // Create a JSON String with your second favourite car details, and then
    // Deserialize it into a new Car object.  Output the new car object using
    // toString().
}
