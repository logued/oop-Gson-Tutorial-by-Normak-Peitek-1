package dkit.oop;               // Mar 2024

// Reference: Based on Tutorial by Norman Peitek
// https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization

import com.google.gson.Gson;

/**
 * Demonstrates:
 * 1. Serializing a Java Object (User) into
 *    a JSON string, using the Gson Parser.
 * 2. De-serializing a Json string into a new Java Object.
 */
public class MainApp {
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.start();
    }

    public void start() {
        System.out.println("Gson Tutorials - by Norman Peitek");

        User user = new User("Norman","norman@futurestud.io",26,true);

        // Serialize a Java object into a Json String using the Gson parser.
        // 'Serialize' simply means to convert from a Java object structure into a string

        // Instantiate a Gson Parser
        // The Gson parser classes have been loaded by Maven based on a dependency in the pom.xml file.
        Gson gsonParser = new Gson();

        String userJsonString = gsonParser.toJson(user);    // Serialize an object

        System.out.println("Serializing a Java Object into a Json String, gives:");
        System.out.println(userJsonString);

        //////////////////////////////////////////////////////////////////////////////////////
        //  De-Serialize a Json string into a new Java Object (User)

        //userJsonString = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";
        userJsonString = "{\"age\":26,\"email\":\"norman@futurestud.io\",\"isDeveloper\":true,\"name\":\"Norman\"}";

        User user2 = gsonParser.fromJson(userJsonString, User.class);

        System.out.println("De-Serializing a Json String into a new User Java Object.");
        System.out.println("userObject2 contains: ");
        System.out.println(user2.toString());
    }

    //TODO
    // Create a separate class Car with make, model and year fields.
    // Instantiate (construct) a new Car object.
    // Serialize to JSON String and output that string.
    // Create a JSON String with your second favourite car details, and then
    // Deserialize it into a new Car object.  Output the new car object using
    // toString().
}
