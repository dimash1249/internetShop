package com.company;

public class Tablet extends Device{
    private double resolution;

    public Tablet(){

    }
    public Tablet(String model, int price, int count, int sold, String cpu, int ram, double resolution) {
        super(model, price, count, sold, cpu, ram);
        this.resolution = resolution;
    }

    public double getResolution() {
        return resolution;
    }
    public void setResolution(double resolution) {
        this.resolution = resolution;
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

    @Override
    public double getPerformance() {
        double performance = 0;
        performance = CPU(getCpu()) + RAM(getRam());
        return performance;
    }

    @Override
    public void showDetails() {
        System.out.println("Tablet: " + getModel() + " " + getPrice() + " " + getCpu() + " " + getRam() + " " + resolution + " Performance: " + getPerformance());
    }
}
