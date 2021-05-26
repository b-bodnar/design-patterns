package com.github.bbodnar.abstract_factory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS button!");
    }
}
