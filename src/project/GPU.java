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
public class GPU {
    
        private String brand;
        private int memory;
        private String model;

        public GPU(String brand, int memory, String model) {
            this.brand = brand;
            this.memory = memory;
            this.model = model;
        }

        GPU() {
            
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
