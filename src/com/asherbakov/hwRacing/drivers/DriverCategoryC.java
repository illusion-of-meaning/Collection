package com.asherbakov.hwRacing.drivers;

import com.asherbakov.hwRacing.category.CategoryC;
import com.asherbakov.hwRacing.category.CategoryD;
import com.asherbakov.hwRacing.transport.Train;

public class DriverCategoryC extends Driver<CategoryC> {

    public DriverCategoryC(String fullName, int experience) {
        super(fullName, experience, new CategoryC());
    }

}
