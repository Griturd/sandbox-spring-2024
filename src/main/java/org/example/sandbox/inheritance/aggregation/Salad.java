package org.example.sandbox.inheritance.aggregation;

public class Salad {

    private String lettuce;
    private String tomatoes;
    private String peppers;
    private String croutons;

    public Salad() {
        lettuce = "lots of";
        tomatoes = "tons of";
        peppers = "lots of";
        croutons = "a few";
    }

    public Salad(String lettuce, String tomatoes, String peppers, String croutons) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.peppers = peppers;
        this.croutons = croutons;
    }

}
