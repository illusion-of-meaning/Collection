package com.asherbakov.hwRacing.drivers;

import com.asherbakov.hwRacing.category.CategoryC;
import com.asherbakov.hwRacing.category.CategoryD;
import com.asherbakov.hwRacing.transport.Bus;

public class DriverCategoryD extends Driver<CategoryD> {

    public DriverCategoryD(String fullName, int experience) {
        super(fullName, experience, new CategoryD());
    }


}
