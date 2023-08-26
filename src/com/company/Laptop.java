package com.company;

public class Laptop extends Device{
    private boolean ssd;

    public Laptop(){

    }
    public Laptop(String model, int price, int count, int sold, String cpu, int ram, boolean ssd) {
        super(model, price, count, sold, cpu, ram);
        this.ssd = ssd;
    }

    public boolean isSsd() {
        return ssd;
    }
    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int CPU(String cpu){
        int q = 0;
        if(cpu.equals("corei3")) q = 3000;
        else if(cpu.equals("corei5")) q = 5000;
        else if(cpu.equals("corei7")) q = 7000;
        else if(cpu.equals("corei9")) q = 9000;
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

    public int SSD(boolean ssd){
        int q = 0;
        if(ssd == true) q = 1000;
        else q = 0;
        return  q;
    }
    @Override
    public double getPerformance() {
        double performance = 0;
        performance = CPU(getCpu()) + RAM(getRam()) + SSD(ssd);
        return performance;
    }

    @Override
    public void showDetails() {
        System.out.println("Laptop: " + getModel() + " " + getPrice() + " " + getCpu() + " " + getRam() + " SSD: " + ssd + " Performance: " + getPerformance());
    }
}
