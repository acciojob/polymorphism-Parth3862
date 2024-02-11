package com.driver;

public class Main {

    public static void main(String args[]) {
        Product p = new Product();
        int ans = p.Product(2,5);
        int ans1 = p.Product(2,5,6);
        double ans2 = p.Product(2.0,7.0);
        System.out.println(ans+" "+ans1+" "+ans2);
    }
    public static class Product {
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}