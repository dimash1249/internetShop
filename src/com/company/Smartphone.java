package com.company;

public class Smartphone extends Device{
    private String generation;

    public Smartphone(){

    }
    public Smartphone(String model, int price, int count, int sold, String cpu, int ram, String generation) {
        super(model, price, count, sold, cpu, ram);
        this.generation = generation;
    }

    public String getGeneration() {
        return generation;
    }
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int CPU(String cpu){
        int q = 0;
        if(cpu.equals("qualcom600")) q = 600;
        else if(cpu.equals("qualcom700")) q = 700;
        else if(cpu.equals("qualcom800")) q = 800;
        else q = 0;
        return q;
    }
    public int RAM(int ram){
        int q = 0;
        if(ram > 4) q = 1000;
        else if(ram <= 4) q = 500;
        else q = 0;
        return q;
    }
    public int GEN(String gen){
        int q = 0;
        if(gen.equals("g1")) q = 100;
        else if(gen.equals("g2")) q = 200;
        else if(gen.equals("g3")) q = 300;
        else if(gen.equals("g4")) q = 400;
        else q = 0;
        return q;
    }
    @Override
    public double getPerformance() {
        double power = 0;
        power = CPU(getCpu()) + RAM(getRam()) + GEN(generation);
        return power;
    }

    @Override
    public void showDetails() {
        System.out.println("Smartphone: " + getModel() + " " + getPrice() + " " + getCpu() + " " + getRam() + " " + generation + " Performance: " + getPerformance());
    }
}
