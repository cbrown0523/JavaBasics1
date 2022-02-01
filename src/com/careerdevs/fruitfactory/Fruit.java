package com.careerdevs.fruitfactory;

public class Fruit {
    public int idNum;
    public String fruitName;
    public boolean isRipe;


    public Fruit(int idNum, String fruitName, boolean isRipe) {
        this.idNum = idNum;
        this.fruitName = fruitName;
        this.isRipe = isRipe;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "fruit id='" + idNum + '\'' +
                ", Fruit name='" + fruitName + '\'' +
                ", is it ripe=" + isRipe +
                '}';
    }
}
