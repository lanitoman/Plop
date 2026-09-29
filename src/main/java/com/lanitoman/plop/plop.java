package com.lanitoman.plop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class plop {

    String PREFIX = "[] ";
    boolean session = false;
    ArrayList<Command> commands = new ArrayList<>();



    public plop () {

    }

    public void write(String text){
        System.out.println("[] " + text);
    }

    public void line(){
        String line = PREFIX + "================================================";
        System.out.println(line);
    }

    public void start() {
        session = true;
        while(session){
            Scanner query = new Scanner(System.in);
            runCommand(query.next());
        }

    }

    public void runCommand(String cmd){
        if (cmd.equals("help") || cmd.equals("HELP")) {
            write("You have reached our for help.");
        } else {
            write("Gugu gaga!");
        }
    }

    public void stop() {
        session = false;
    }


}
