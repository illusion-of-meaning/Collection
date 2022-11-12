package com.asherbakov.hwRacing.drivers;

import com.asherbakov.hwRacing.category.CategoryB;
import com.asherbakov.hwRacing.category.CategoryC;
import com.asherbakov.hwRacing.transport.Car;

public class DriverCategoryB extends Driver<CategoryB>{
    public DriverCategoryB(String fullName, int experience) {
        super(fullName, experience, new CategoryB());
    }
}
