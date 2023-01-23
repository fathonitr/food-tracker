package com.fathonitr.helper;

import java.util.Objects;

public class FoodReq {
    private String name;
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fat;

    public FoodReq() {
    }

    public FoodReq(String name, Double calories, Double protein, Double carbs, Double fat) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodReq foodReq = (FoodReq) o;
        return Objects.equals(name, foodReq.name) && Objects.equals(calories, foodReq.calories) && Objects.equals(protein, foodReq.protein) && Objects.equals(carbs, foodReq.carbs) && Objects.equals(fat, foodReq.fat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories, protein, carbs, fat);
    }

    @Override
    public String toString() {
        return "FoodReq{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fat=" + fat +
                '}';
    }
}
