package mbreza;

import mbreza.fluent.Client;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Client client = new Client.Builder()
                .FirstName("Slawomir")
                .LastName("Kowalski")
                .build();


        System.out.println("Data client: "+"\nFirstName: " +  client.FirstName+
                "\nLastName: " +client.LastName);
    }
}
