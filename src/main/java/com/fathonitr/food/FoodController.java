package com.fathonitr.food;

import com.fathonitr.helper.FoodReq;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/food")
public class FoodController {
    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    @GetMapping
    public List<Food> getFoods(){
        return foodRepository.findAll();
    }
    @PostMapping
    public void addFood(@RequestBody FoodReq request){
        Food food = new Food();
        food.setName(request.getName());
        food.setCalories(request.getCalories());
        food.setProtein(request.getProtein());
        food.setFat(request.getFat());
        food.setCarbs(request.getCarbs());
        foodRepository.save(food);
    }
    @DeleteMapping("{foodId}")
    public void deleteFood(@PathVariable("foodId") Integer id){
        foodRepository.deleteById(id);
    }
    @PutMapping("{foodId}")
    public void updateFood(
            @PathVariable("foodId") Integer id,
            @RequestBody FoodReq request){
        foodRepository.deleteById(id);
        Food food = new Food();
        food.setName(request.getName());
        food.setCalories(request.getCalories());
        food.setProtein(request.getProtein());
        food.setFat(request.getFat());
        food.setCarbs(request.getCarbs());
        foodRepository.save(food);
    }
}
