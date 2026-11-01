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
public class Ad {
    
        private String title;
        private String phone;
        private String region;
        private long price;
        private Laptop laptop;

        public Ad() {
        }

        public Ad(String title, String phone, String region, long price, Laptop laptop) {
            this.title = title;
            this.phone = phone;
            this.region = region;
            this.price = price;
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

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
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
