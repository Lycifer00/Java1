package Point;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint() {
    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float valueX, float valueY, float xSpeed, float ySpeed) {
        super(valueX,valueY);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private float getvalueXSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    private float getValueYSpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] xySpeedArray = new float[2];
        xySpeedArray[0] = getvalueXSpeed();
        xySpeedArray[1] = getValueYSpeed();
        return xySpeedArray;
    }

    @Override
    public String toString() {
        return String.format("%s, speed=(%.3f, %.3f)", super.toString(), getvalueXSpeed(), getValueYSpeed());
    }

    MoveablePoint move() {
        setValueX(getValueX()+getvalueXSpeed());
        setValueY(getValueY()+getValueYSpeed());
        return this;
    }
}
