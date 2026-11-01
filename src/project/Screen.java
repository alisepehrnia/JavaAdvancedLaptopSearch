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
public class Screen {
    
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
