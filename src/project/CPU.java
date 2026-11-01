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
public class CPU {
    
        private String brand;
        private int cores;
        private String model;

        public CPU(String brand, int cores, String model) {
            this.brand = brand;
            this.cores = cores;
            this.model = model;
        }

        CPU() {
            
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
