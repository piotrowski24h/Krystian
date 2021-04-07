package com.exercise.method.shape;

class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }


    public void process() {
        System.out.println("Start Shape draw");

        this.shape.draw();
        System.out.println("finish draw shape");

    }
}


