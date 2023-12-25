package com.dmdev.oop.hometask.shapes.abstractions;

import com.dmdev.oop.hometask.area.Area;

public abstract class Shape implements Area {
    @Override
    public boolean isAreaEqual(Shape shape) {
        return this.area() == shape.area();
    }
}
