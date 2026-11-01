/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author asus
 */
public class Core {
    
    public static class Screen
    {
        
        private float size;
        private String tech;
        private String res;
        private boolean isTouch;

        public Screen() {
        }
        
        
        public Screen(float size, String tech, String res, boolean isTouch)
        {
            this.size = size;
            this.tech = tech;
            this.res = res;
            this.isTouch = isTouch;
        }

        public String getRes() {
            return res;
        }

        public float getSize() {
            return size;
        }

        public String getTech() {
            return tech;
        }

        public boolean isIsTouch() {
            return isTouch;
        }

        public void setIsTouch(boolean isTouch) {
            this.isTouch = isTouch;
        }

        public void setRes(String res) {
            this.res = res;
        }

        public void setSize(float size) {
            this.size = size;
        }

        public void setTech(String tech) {
            this.tech = tech;
        }

        @Override
        public String toString() {
            String out = "Screen: " + size + " Inch - " + tech + " - " + res;
            if(isTouch)
                out += " - Touch";
            return out;
        }
        
        
    }
    
    public static class CPU
    {
        private String brand;
        private int cores;
        private String model;

        public CPU(String brand, int cores, String model) {
            this.brand = brand;
            this.cores = cores;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public int getCores() {
            return cores;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "CPU: " + brand + " - " + model + " - " + cores + " Core";
        }
        
        
    }
    
    public static class GPU
    {
        private String brand;
        private int memory;
        private String model;

        public GPU(String brand, int memory, String model) {
            this.brand = brand;
            this.memory = memory;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public int getMemory() {
            return memory;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Graphic Card: " + brand + " - " + model + " - " + memory + " GB";
        }
        
        
    }
    
    public static class RAM
    {
        private int memory;
        private int gen;
        private int freq;

        public RAM(int memory, int gen, int freq) {
            this.memory = memory;
            this.gen = gen;
            this.freq = freq;
        }

        RAM() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public int getFreq() {
            return freq;
        }

        public int getGen() {
            return gen;
        }

        public int getMemory() {
            return memory;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

        public void setGen(int gen) {
            this.gen = gen;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        @Override
        public String toString() {
            return "RAM: " + memory + " GB - DDR" + gen + " - " + freq + " MHz";
        }
        
        
    }
    
    public static class Disk
    {
        private int hdd;
        private int ssd;

        public Disk(int hdd, int ssd) {
            this.hdd = hdd;
            this.ssd = ssd;
        }        

        public int getHdd() {
            return hdd;
        }

        public int getSsd() {
            return ssd;
        }

        public void setHdd(int hdd) {
            this.hdd = hdd;
        }

        public void setSsd(int ssd) {
            this.ssd = ssd;
        }

        @Override
        public String toString() {
            return "Drive Disks: " + hdd + " GB HDD & " + ssd + " GB SSD";
        }
        
    }
    
    public static class Peripherals
    {
        private int usb2;
        private int usb3;
        private boolean haveWireless;
        private boolean haveBluetooth;
        private boolean haveLan;
        private boolean haveVga;
        private boolean haveHdmi;

        public Peripherals(int usb2, int usb3, boolean haveWireless, boolean haveBluetooth, boolean haveLan, boolean haveVga, boolean haveHdmi) {
            this.usb2 = usb2;
            this.usb3 = usb3;
            this.haveWireless = haveWireless;
            this.haveBluetooth = haveBluetooth;
            this.haveLan = haveLan;
            this.haveVga = haveVga;
            this.haveHdmi = haveHdmi;
        }

        Peripherals() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public int getUsb2() {
            return usb2;
        }

        public int getUsb3() {
            return usb3;
        }

        public boolean isHaveBluetooth() {
            return haveBluetooth;
        }

        public boolean isHaveHdmi() {
            return haveHdmi;
        }

        public boolean isHaveLan() {
            return haveLan;
        }

        public boolean isHaveVga() {
            return haveVga;
        }

        public boolean isHaveWireless() {
            return haveWireless;
        }

        public void setHaveBluetooth(boolean haveBluetooth) {
            this.haveBluetooth = haveBluetooth;
        }

        public void setHaveHdmi(boolean haveHdmi) {
            this.haveHdmi = haveHdmi;
        }

        public void setHaveLan(boolean haveLan) {
            this.haveLan = haveLan;
        }

        public void setHaveVga(boolean haveVga) {
            this.haveVga = haveVga;
        }

        public void setHaveWireless(boolean haveWireless) {
            this.haveWireless = haveWireless;
        }

        public void setUsb2(int usb2) {
            this.usb2 = usb2;
        }

        public void setUsb3(int usb3) {
            this.usb3 = usb3;
        }
        
    }
    
    public static class Laptop
    {
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
    
    public static class Ad
    {
        private String title;
        private String phone;
        private String region;
        private Laptop laptop;

        public Ad(String title, String phone, String region, Laptop laptop) {
            this.title = title;
            this.phone = phone;
            this.region = region;
            this.laptop = laptop;
        }

        public Laptop getLaptop() {
            return laptop;
        }

        public String getPhone() {
            return phone;
        }

        public String getRegion() {
            return region;
        }

        public String getTitle() {
            return title;
        }

        public void setLaptop(Laptop laptop) {
            this.laptop = laptop;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return String.format("%s\n%s\n%s\n%s\n", title, phone, region, laptop.toString());
        }
        
        
    }
}
