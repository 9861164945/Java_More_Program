package com.sambitpraticewithnotes.oops;

public class BoxWidth extends Box {
    double width;

    // Default constructor
    public BoxWidth() {
        this.width = -1;
    }

    // Parameterized constructor
    public BoxWidth(double l, double h, double w, double Width) {
        super(l, h, w);  // Call the constructor of the superclass (Box)
        this.width = Width;  // Assign the parameter Width to the instance variable width
    }
    
    
}
