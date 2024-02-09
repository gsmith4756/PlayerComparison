package com.example.PlayerComparison.Player;

public class Stats {
    private Integer id;
    private int passingTouchdowns;
    private int receivingTouchdowns;
    private int rushingTouchdowns;
    private int passingYards;
    private int rushingYards;
    private int receivingYards;

    public Stats(Integer id, int passingTouchdowns, int receivingTouchdowns, int rushingTouchdowns, int passingYards, int rushingYards, int receivingYards) {
        this.id = id;
        this.passingTouchdowns = passingTouchdowns;
        this.receivingTouchdowns = receivingTouchdowns;
        this.rushingTouchdowns = rushingTouchdowns;
        this.passingYards = passingYards;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
    }

    public Stats(int passingTouchdowns, int receivingTouchdowns, int rushingTouchdowns, int passingYards, int rushingYards, int receivingYards) {
        this.passingTouchdowns = passingTouchdowns;
        this.receivingTouchdowns = receivingTouchdowns;
        this.rushingTouchdowns = rushingTouchdowns;
        this.passingYards = passingYards;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPassingTouchdowns() {
        return passingTouchdowns;
    }

    public void setPassingTouchdowns(int passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns;
    }

    public int getReceivingTouchdowns() {
        return receivingTouchdowns;
    }

    public void setReceivingTouchdowns(int receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns;
    }

    public int getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public void setRushingTouchdowns(int rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(int receivingYards) {
        this.receivingYards = receivingYards;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", passingTouchdowns=" + passingTouchdowns +
                ", receivingTouchdowns=" + receivingTouchdowns +
                ", rushingTouchdowns=" + rushingTouchdowns +
                ", passingYards=" + passingYards +
                ", rushingYards=" + rushingYards +
                ", receivingYards=" + receivingYards +
                '}';
    }
}
