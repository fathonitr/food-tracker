package com.fathonitr.food;

import org.springframework.data.jpa.repository.JpaRepository;
//THIS INTERFACE ALLOW DEV TO PERFOrM CRUD WITHOUT WRITING ANY SQL
//THE DAO
public interface FoodRepository
        extends JpaRepository<Food, Integer> {
}
