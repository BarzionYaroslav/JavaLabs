public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d ( double x, double y, double z ) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    public boolean compare(Point3d other) {
        return (xCoord == other.getX()) && (yCoord == other.getY()) && (zCoord == other.getZ());
    }
    public double distanceTo(Point3d other) {
        double dx = xCoord - other.getX();
        double dy = yCoord - other.getY();
        double dz = zCoord - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
