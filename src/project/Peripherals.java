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
public class Peripherals {
    
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

        @Override
        public String toString() {
            String x = String.format("%d USB2 | %d USB3", usb2, usb3);
            if(haveWireless)
                x += " | Wireless";
            if(haveBluetooth)
                x += " | Bluetooth";
            if(haveLan)
                x += " | Lan";
            if(haveHdmi)
                x += " | HDMI";
            if(haveVga)
                x += " | VGA";
            return x;
        }
}
