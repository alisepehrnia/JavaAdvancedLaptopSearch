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
public class Disk {
    
        private String hdd;
        private String ssd;

        public Disk(String hdd, String ssd) {
            this.hdd = hdd;
            this.ssd = ssd;
        }
      

        Disk() {
            
        }

        public String getHdd() {
            return hdd;
        }

        public String getSsd() {
            return ssd;
        }

        public void setHdd(String hdd) {
            this.hdd = hdd;
        }

        public void setSsd(String ssd) {
            this.ssd = ssd;
        }

        

        @Override
        public String toString() {
            return "Drive Disks: " + hdd + " HDD & " + ssd + " SSD";
        }
}
