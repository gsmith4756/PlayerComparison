package com.example.PlayerComparison.Player;

public class Player {
    private Integer id;
    private String name;
    private int heightInInches;
    private double weightInPounds;

    public Player(Integer id, String name, int heightInInches, double weightInPounds) {
        this.id = id;
        this.name = name;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public Player(String name, int heightInInches, double weightInPounds) {
        this.name = name;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heightInInches=" + heightInInches +
                ", weightInPounds=" + weightInPounds +
                '}';
    }
}
