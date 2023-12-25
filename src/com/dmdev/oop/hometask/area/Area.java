package com.dmdev.oop.hometask.area;

import com.dmdev.oop.hometask.shapes.abstractions.Shape;

public interface Area {
    double area();

    boolean isAreaEqual(Shape shape);
}
