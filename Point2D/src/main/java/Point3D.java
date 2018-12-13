public class Point3D extends Point2D {
    private float valueZ = 0.0f;

    Point3D(){}

    Point3D(float valueZ){
        this.valueZ = valueZ;
    }

    Point3D(float valueZ,float valueX, float valueY){
        super(valueX,valueY);
        this.valueZ = valueZ;
    }

    private void setValueZ(float valueZ){
        this.valueZ = valueZ;
    }

    private float getValueZ(){
        return valueZ;
    }

    private void setValueXY(float valueX,float valueY,float valueZ) {
        this.setValueX(valueX);
        this.setValueY(valueY);
        this.valueZ = valueZ;
    }

    private float[] getValueXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = this.getValueX();
        XYZ[1] = this.getValueY();
        XYZ[2] = this.getValueZ();
        return XYZ;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s,%s)",this.getValueX(),this.getValueY(),this.getValueZ());
    }
}
