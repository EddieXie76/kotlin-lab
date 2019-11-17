package com.derbysoft.java;

    public enum Color {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF);
        private int rgb;
        Color(int rgb) {
            this.rgb = rgb;
        }
        public int getRgb() {
            return rgb;
        }
        public static void main(String[] args) {
            System.out.println(Color.RED.getRgb());
            System.out.println(Color.GREEN.getRgb());
            System.out.println(Color.BLUE.getRgb());
        }
    }

