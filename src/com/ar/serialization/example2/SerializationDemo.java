package com.ar.serialization.example2;

import java.io.*;

public class SerializationDemo {
    // Avoid try-catch using throws
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        User user = new User("Alice", 30);

        String filename = "user_data.ser";

        // Serialization

        FileOutputStream fileOut =
                new FileOutputStream(filename);

        ObjectOutputStream out =
                new ObjectOutputStream(fileOut);

        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("Object Serialized.");

        // Deserialization

        FileInputStream fileIn =
                new FileInputStream(filename);

        ObjectInputStream in =
                new ObjectInputStream(fileIn);

        User deserializedUser =
                (User) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(
                "Deserialized User: "
                        + deserializedUser.name
                        + ", "
                        + deserializedUser.age
        );
    }
}
