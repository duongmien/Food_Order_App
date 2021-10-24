package com.myfistapp.login_form;


    public class Food {
        private String name1, name2;
        private int Image1, Image2;

        public Food(String name1, String name2, int image1, int image2) {
            this.name1 = name1;
            this.name2 = name2;
            Image1 = image1;
            Image2 = image2;
        }

        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        public int getImage1() {
            return Image1;
        }

        public void setImage1(int image1) {
            Image1 = image1;
        }

        public int getImage2() {
            return Image2;
        }

        public void setImage2(int image2) {
            Image2 = image2;
        }
    }












