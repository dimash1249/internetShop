package com.company;

public abstract class Device extends Good{
    private String cpu;
    private int ram;

    public Device() {

    }
    public Device(String model, int price, int count, int sold, String cpu, int ram) {
        super(model, price, count, sold);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public abstract double getPerformance();
}
