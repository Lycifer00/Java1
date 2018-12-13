import java.util.Arrays;

public class Point2D {
    private float valueX = 0.0f;
    private float valueY = 0.0f;

    Point2D(float valueX, float valueY){
        this.valueX = valueX;
        this.valueY = valueY;

    }

    Point2D() {
    }

    void setValueX(float valueX){
        this.valueX = valueX;
    }

    void setValueY(float valueY){
        this.valueY = valueY;
    }

    private void setValueXY(float valueX, float valueY){
        this.valueX = valueX;
        this.valueY = valueY;
    }

    protected float getValueX(){
        return valueX;
    }

    protected float getValueY(){
        return valueY;
    }


    private float[] getValueXY() {
        float[] XY = new float[2];
        XY[0] = getValueX();
        XY[1] = getValueY();
        return XY;
    }

    @Override
    public String toString() {
        return Arrays.toString(getValueXY());
    }

}
