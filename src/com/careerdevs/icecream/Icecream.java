package com.careerdevs.icecream;

public class Icecream {
    public int scoops;
    public String flavour;
    public boolean isSoft;
    public String sprinkle;

    public Icecream(int scoops, String flavour, boolean isSoft, String sprinkle) {
        this.scoops = scoops;
        this.flavour = flavour;
        this.isSoft = isSoft;
        this.sprinkle = sprinkle;
    }
    @Override
    public String toString() {
        return "Icecream{" +
                "Number of scoops='" + scoops + '\'' +
                ", Flavor='" + flavour + '\'' +
                ", Is it soft serve =" + isSoft +
                ", What color sprinkles=" + sprinkle +
                '}';
    }
}
