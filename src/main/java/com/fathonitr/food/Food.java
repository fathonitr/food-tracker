package com.fathonitr.food;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Food {
    @Id
    @SequenceGenerator(
            name = "food-id_sequence",
            sequenceName = "food_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "food_id_sequence"
    )
    private Long id;
    private String name;
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fat;

    public Food() {
    }

    public Food(Long id, String name, Double calories, Double protein, Double carbs, Double fat) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Food food = (Food) o;
        return Objects.equals(id, food.id) && Objects.equals(name, food.name) && Objects.equals(calories, food.calories) && Objects.equals(protein, food.protein) && Objects.equals(carbs, food.carbs) && Objects.equals(fat, food.fat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, calories, protein, carbs, fat);
    }

    @Override
    public String toString() {
        return "food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fat=" + fat +
                '}';
    }
}
