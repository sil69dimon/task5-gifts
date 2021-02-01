package com.mason.app;

import java.io.IOException;
import java.util.ArrayList;

//import static com.mason.app.Package.BOX;

public class Client {
    private String name;
    SweetBase sweetBase = new SweetBase();
//Gift gift = new Gift(new GiftBuilder());

    public Client(String name) throws IOException {
        this.name = name;

        {
            System.out.println("Hi Mr." + name);
        }
        //  Gift gift = new Gift();
    }

}
