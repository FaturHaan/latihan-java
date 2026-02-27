public class Shape {
    private String color;
    private boolean filled;

    // Nilai default ditetapkan agar objek selalu dalam kondisi valid
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Getter untuk boolean
    public boolean isFilled() {   // Konvensi boolean
        return filled;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Setter untuk filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Override method toString() dari kelas Object
    @Override
    public String toString() {
        return "A Shape with color of " + color +
               " and " + (filled ? "filled" : "Not filled");
    }
}