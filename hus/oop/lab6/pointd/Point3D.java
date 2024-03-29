package hus.oop.lab6.pointd;

import java.util.Arrays;
import java.util.List;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public List<Float> getXYZ() {
        return Arrays.asList(getXY().get(0), getXY().get(1), z);
    }

    @Override
    public String toString() {
        return "(" + super.toString() + z + ')';
    }
}
