package com.example.demoprojectphase22.Model;

import java.util.ArrayList;


import com.example.demoprojectphase22.Model.Opinion;

import java.util.ArrayList;



    public class Product implements Comparable {
        private int opinionNumber = 0;
        private long productId;
        private int capacity;
        private double productPrice;
        private String productName;
        private double averageScore;
        private String comment;
        final private ArrayList<Opinion> opinions = new ArrayList<>();
        public category product;

        public ArrayList<Opinion> getOpinions() {
            return opinions;
        }

        public Product(String productName, double productPrice, double averageScore, int capacity, category product, String comment) {
            this.productPrice = productPrice;
            this.averageScore = averageScore;
            this.capacity = capacity;
            this.productName = productName;
            this.product = product;
            this.comment = comment;
        }

        private int percent;

        public String getProductName() {
            return this.productName;
        }

        public double getProductPrice() {
            return this.productPrice;
        }

        public category getCategory() {
            return this.product;
        }

        public int getCapacity() {
            return this.capacity;
        }

        @Override
        public int compareTo(Object o) {
            Product product100 = (Product) o;
            if (product100.product == category.DIGITAL && this.getCategory() != category.DIGITAL) {
                return 1;
            } else if (product100.product != category.DIGITAL && this.getCategory() == category.DIGITAL) {
                return -1;
            } else {
                if (product100.product == category.STATIONARY && this.getCategory() != category.STATIONARY) {
                    return 1;
                } else if (product100.product == category.FOOD && this.getCategory() == category.STATIONARY) {
                    return -1;
                } else {
                    if (product100.product == category.VEHICLES && this.getCategory() != category.VEHICLES) {
                        return 1;
                    } else if (product100.product == category.VEHICLES && this.getCategory() == category.VEHICLES) {
                        return -1;
                    } else {
                        if (product100.product == category.VEHICLES && this.getCategory() != category.FOOD) {
                            return 1;
                        } else if (product100.product == category.VEHICLES && this.getCategory() == category.FOOD) {
                            return 1;
                        } else {
                            if (this.productName.compareTo(product100.productName) < 0) {
                                return -1;

                            } else if (this.productName.compareTo(product100.productName) == 0) {
                                if (this.averageScore < product100.averageScore) {
                                    return -1;
                                } else if (this.averageScore > product100.averageScore) {
                                    return 1;
                                } else if (this.averageScore == product100.averageScore) {
                                    if (this.productPrice < product100.productPrice) {
                                        return -1;
                                    } else if (this.productPrice > product100.productPrice) {
                                        return 1;
                                    } else if (this.productPrice == product100.productPrice) {
                                        if (this.capacity < product100.capacity) {
                                            return -1;
                                        } else if (this.capacity > product100.capacity) {
                                            return 1;
                                        }
                                    }
                                }
                            } else if (this.productName.compareTo(product100.productName) > 0) {
                                return 1;
                            }
                            return 0;
                        }
                    }
                }
            }
        }

        public enum category {
            DIGITAL, STATIONARY, VEHICLES, FOOD
        }

        public String setProductName(String name) {
            return this.productName = name;
        }

        public int setProductCapacity(int capacity) {
            return this.capacity = capacity;
        }

        public double setProductPrice(double price) {
            return this.productPrice = price;
        }

        public int setProductCapacitymines() {
            return this.capacity = this.capacity - 1;
        }

        public String setProductComment(String comment1) {
            return this.comment = comment1;
        }

        public double setProductScore(double sum) {
            this.averageScore = averageScore + sum;
            return this.averageScore /= opinionNumber;
        }

        public int getOpinionNumber() {
            return opinionNumber;
        }

        public void setOpinionNumber(int opinionNumber) {
            this.opinionNumber += opinionNumber;
        }

        @Override
        public String toString() {
            return "product name : " + productName + ", product price : " + productPrice + ", product category : " + product + ", product capacity : " + capacity + ",product average score : " + averageScore + " , comment : " + comment;
        }
    }


