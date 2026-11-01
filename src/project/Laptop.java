/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Ali
 */
public class Laptop {
    
        private String brand;
        private String model;
        private Screen screen;
        private CPU cpu;
        private GPU gpu;
        private RAM ram;
        private Disk disk;
        private Peripherals periphs;

        public Laptop(String brand, String model, Screen screen, CPU cpu, GPU gpu, RAM ram, Disk disk, Peripherals periphs) {
            this.brand = brand;
            this.model = model;
            this.screen = screen;
            this.cpu = cpu;
            this.gpu = gpu;
            this.ram = ram;
            this.disk = disk;
            this.periphs = periphs;
        }

        Laptop() {
            
        }

        public String getModel() {
            return model;
        }

        public String getBrand() {
            return brand;
        }

        public CPU getCpu() {
            return cpu;
        }

        public Disk getDisk() {
            return disk;
        }

        public GPU getGpu() {
            return gpu;
        }

        public Peripherals getPeriphs() {
            return periphs;
        }

        public RAM getRam() {
            return ram;
        }

        public Screen getScreen() {
            return screen;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setCpu(CPU cpu) {
            this.cpu = cpu;
        }

        public void setDisk(Disk disk) {
            this.disk = disk;
        }

        public void setGpu(GPU gpu) {
            this.gpu = gpu;
        }

        public void setPeriphs(Peripherals periphs) {
            this.periphs = periphs;
        }

        public void setRam(RAM ram) {
            this.ram = ram;
        }

        public void setScreen(Screen screen) {
            this.screen = screen;
        }

        @Override
        public String toString() {
            return String.format("%s %s\n%s\n%s\n%s\n%s\n%s\n%s\n", brand, model, screen.toString(), cpu.toString(), gpu.toString(), ram.toString(), disk.toString(), periphs.toString());
        }
}
