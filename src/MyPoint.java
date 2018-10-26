public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(){
        return Math.abs(this.x - this.y);
    }
}