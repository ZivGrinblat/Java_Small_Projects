package BoxAndPoint;

/**
 * This class represents a three-dimensional point the x,y and z coordinate.
 * values can get either negative, positive or zero double values.
 *
 * @author Ziv Grinblat
 * @version 15-04-2021
 */
public class Point3Deminsion{

    //declarations
    private double _x;
    private double _y;
    private double _z;
    private final double DEFAULT_VAL = 0.0;

    //constructors and method definitions
    /**
     * Constructs and initializes a Point3D to (0,0,0).
     */
    public Point3Deminsion(){
        _x = DEFAULT_VAL;
        _y = DEFAULT_VAL;
        _z = DEFAULT_VAL;
    }

    /**
     * Constructs and initializes a Point3D from the specified x,y,z coordinates.
     * @param x The x coordinate
     * @param y The y coordinate
     * @param z The z coordinate
     */
    public Point3Deminsion (double x, double y, double z){
        _x = x;
        _y = y;
        _z = z;
    }

    /**
     * Copy constructor for Point3D.
     * Construct a 3D point with the same coordinates as other 3D point.
     * @param other The 3D point object from which to construct the new 3D point. 
     */
    public Point3Deminsion (Point3Deminsion other){
        if (other != null){ //check that the given object is initialized
            _x = other._x;
            _y = other._y;
            _z = other._z;
        }
    }

    /**
     * Returns the x coordinate of the 3D point.
     * @return The x coordinate of the 3D point.
     */
    public double getX(){
        return (_x);
    }

    /**
     * Returns the y coordinate of the 3D point.
     * @return The y coordinate of the 3D point.
     */
    public double getY(){
        return (_y);
    }

    /**
     * Returns the z coordinate of the 3D point.
     * @return the z coordinate of the 3D point.
     */
    public double getZ(){
        return (_z);
    }

    /**
     * Sets the x coordinate of the 3D point.
     * @param num The new x coordinate.
     */
    public void setX (double num){
        _x = num;
    }

    /**
     * Sets the y coordinate of the 3D point.
     * @param num new y coordinate.
     */
    public void setY (double num){
        _y = num;
    }

    /**
     * Sets the z coordinate of the 3D point.
     * @param num new z coordinate.
     */
    public void setZ (double num){
        _z = num;
    }

    /**
     * Returns a string representation of this 3D point.
     * @return String representation of this 3D point.
     */
    public String toString(){
        return "(" + _x + "," + _y + "," + _z + ")";
    }

    /**
     * Check if this 3D point equals other 3D point.
     * @param other The 3D point to be compared with this 3D point.
     * @return true if this 3D point equals other 3D point.
     */
    public boolean equals (Point3Deminsion other){
        return ((_x == other._x) && (_y == other._y) && (_z == other._z));
    }

    /**
     * Check if this 3D point is above other 3D point.
     * @param other The 3D point to be compared with this 3D point.
     * @return true if this 3D point is above other 3D point.
     */
    public boolean isAbove (Point3Deminsion other){
        return (_z > other._z);
    }

    /**
     * Check if this 3D point is under other 3D point.
     * @param other The 3D point to check if this 3D point is under.
     * @return true if this 3D point is under other 3D point.
     */
    public boolean isUnder (Point3Deminsion other){
        return (other.isAbove (this)); //if you are above me, i`m under you
    }

    /**
     * Check if this 3D point is to the left of other 3D point.
     * @param other The 3D point to check if this 3D point is left of.
     * @return true if this 3D point is to the left of other 3D point.
     */
    public boolean isLeft (Point3Deminsion other){
        return (_y < other._y);
    }

    /**
     * Check if this 3D point is to the right of other 3D point.
     * @param other The 3D point to check if this 3D point is right of.
     * @return true if this 3D point is to the right of other 3D point.
     */
    public boolean isRight (Point3Deminsion other){
        return (other.isLeft (this)); //if you are in my left, im your right
    }

    /**
     * Check if this 3D point is behind of the other 3D point.
     * @param other The 3D point to check if this 3D point is behind of.
     * @return true if this 3D point is behind of other 3D point.
     */
    public boolean isBehind (Point3Deminsion other){
        return (_x < other._x);
    }

    /**
     * Check if this 3D point is infront of the other 3D point.
     * @param other The 3D point to check if this 3D point is infront of.
     * @return true if this 3D point is infront of other 3D point.
     */
    public boolean isInFrontOf (Point3Deminsion other){
        return (other.isBehind (this)); //if you are behind me, i`m in front of you
    }

    /**
     * Moves the x coordinate by dx, the y coordinate by dy and the z coordinate by dz.
     * @param dx The amount to move in the x direction.
     * @param dy The amount to move in the y direction.
     * @param dz The amount to move in the z direction.
     */
    public void move (double dx, double dy, double dz){
        setX (_x + dx);
        setY (_y + dy);
        setZ (_z + dz);
    }

    /**
     * Caculate the distance between this 3D point and other 3D point.
     * @param p The 3D point to calculate the distance from.
     * @return The distance between this and p 3D points.
     */
    public double distance (Point3Deminsion p){
        return Math.sqrt (Math.pow((_x - p._x),2) + Math.pow((_y - p._y),2) + Math.pow((_z - p._z),2));
    }

} //end of class Point3D
