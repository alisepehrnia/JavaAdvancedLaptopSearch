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
public class RAM {
    
        private int memory;
        private String gen;

        public RAM(int memory, String gen) {
            this.memory = memory;
            this.gen = gen;
        }


        RAM() {
            
        }

        public String getGen() {
            return gen;
        }


        public int getMemory() {
            return memory;
        }

        public void setGen(String gen) {
            this.gen = gen;
        }


        public void setMemory(int memory) {
            this.memory = memory;
        }

        @Override
        public String toString() {
            return "RAM: " + memory + " GB - " + gen;
        }
}
