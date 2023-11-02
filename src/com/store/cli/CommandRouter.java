package com.store.cli;

public class CommandRouter {
    public  void route(String input, String... args) {
        Command command = null;

        try {
            command = Command.valueOf(input.toUpperCase());

            switch(command) {
                case LIST -> System.out.println("listing...");
                case FILTER -> System.out.println("filtering...");
                case ADD -> System.out.println("adding...");
                case ORDER -> System.out.println("ordering...");
            };
        } catch (IllegalArgumentException e) {
            System.out.println("Oops, wrong command entered!");
        }
    }
}
