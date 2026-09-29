package com.lanitoman;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;
import com.lanitoman.plop.plop;

import javax.swing.*;

public class Main {
    public static void main (String [] args) {

        plop tui = new plop();

        tui.line();
        tui.write("Welcome to plop file manager, run a command to get started, or run help if you are new here.");
        tui.start();



    }
}