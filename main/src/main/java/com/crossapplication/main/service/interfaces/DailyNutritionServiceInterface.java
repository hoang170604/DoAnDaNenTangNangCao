package com.crossapplication.main.service.interfaces;

import com.crossapplication.main.entity.DailyNutrition;

public interface DailyNutritionServiceInterface {
    
    public DailyNutrition getTodayNutrition(int userId);

    public DailyNutrition saveOrUpdate(DailyNutrition nutrition);
}
