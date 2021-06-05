package BoxAndPoint;

/**
 * This class represents a three-dimensional box.
 * The box is represented by its lower-left-front point and three integers for the length (x axis), width (y axis) and height (z axis) of the box. 
 * the box dimensions must be equal or greater than 1.
 *
 * @author Ziv Grinblat
 * @version 16-04-2021
 */
public class Box3D{

    //declarations
    private Point3Deminsion _base;
    private int _length;
    private int _width;
    private int _height;
    private final int DEFAULT_VAL = 1;

    //constructors
    /**
     * Constructs and initializes a box with a default base point3D and all dimensions to 1.
     */
    public Box3D(){
        _base = new Point3Deminsion();
        _length = DEFAULT_VAL;
        _width = DEFAULT_VAL;
        _height = DEFAULT_VAL;
    }

    /**
     * Constructs and initializes a box object from a given base point and 3 integers as the dimentions of the Box.
     * @param point The given 3D point to initializes a base point.
     * @param length The length dimentions.
     * @param width The width dimentions.
     * @param height The height dimentions.
     */
    public Box3D (Point3Deminsion point, int length, int width, int height){
        _base = new Point3Deminsion (point);
        _length = (length >= DEFAULT_VAL) ? length : DEFAULT_VAL;
        _width = (width >= DEFAULT_VAL) ? width : DEFAULT_VAL;
        _height = (height >= DEFAULT_VAL) ? height : DEFAULT_VAL;
    }

    /**
     * Constructs and initializes a Box3D object from a given Box3D.
     * @param other The Box3D object from which to construct the new Box3D
     */
    public Box3D (Box3D other){
        if (other != null){  //check that the given object is initialized
            _base = new Point3Deminsion (other._base);
            _length = other._length;
            _width = other._width;
            _height = other._height;
        }
    }

    //getters
    /**
     * returns the length dimension
     * @return the length of the box
     */
    public int getLength(){
        return (_length);
    }

    /**
     * returns the width dimension
     * @return the width of the box
     */
    public int getWidth(){
        return (_width);
    }

    /**
     * returns the height dimension
     * @return the height of the box
     */
    public int getHeight(){
        return (_height);
    }

    /**
     * returns the lower-left-front (base) Point3D of the box
     * @return the base point of the box
     */
    public Point3Deminsion getBase(){
        return new Point3Deminsion (_base);
    }

    //Setters
    /**
     * Sets the length of the box only if the given value is equal or greater than 1.
     * @param num The length to set.
     */
    public void setLength (int num){
        _length = (num >= DEFAULT_VAL) ? num : _length;
    }

    /**
     * Sets the width of the box only if the given value is equal or greater than 1.
     * @param num The width to set.
     */
    public void setWidth (int num){
        _width = (num >= DEFAULT_VAL) ? num : _width;
    }

    /**
     * Sets the height of the box only if the given value is equal or greater than 1.
     * @param num The height to set.
     */
    public void setHeight (int num){
        _height = (num >= DEFAULT_VAL) ? num : _height;
    }

    /**
     * Sets the base point of the box.
     * @param p The Point3D to set.
     */
    public void setBase (Point3Deminsion p){
        _base = new Point3Deminsion (p);
    }

    //Methods
    /**
     * Returns a string representation of this Box3D object.
     * @return String representation of this Box3D object.
     */
    public String toString(){
        return "The base point is " + _base + ", length = " +
                _length + ", width = " + _width + ", height = " + _height;
    }

    /**
     * Determines whether or not the two boxes are equal.
     * @param other a Box3D object to be compared with this Box3D
     * @return true if the boxes are equal.
     */
    public boolean equals (Box3D other){
        return (_base.equals (other._base) && _length == other._length &&
                _width == other._width && _height == other._height);
    }

    /**
     * Moves the box in the (x,y,z) coordinate system to (x+dx,y+dy,z+dz) without changing the box dimensions.
     * @param dx The amount to move in the x direction.
     * @param dy The amount to move in the y direction.
     * @param dz The amount to move in the z direction.
     * @return the new box in its new location.
     */
    public Box3D move (double dx, double dy, double dz){
        Box3D newBox3D = new Box3D(this); //creat a new copy of box object
        newBox3D._base.move (dx, dy, dz); //move the base of the new box
        return newBox3D;
    }

    /**
     * Calculates and returns the upper-right-back point of this box.
     * @return the upper-right-back point of this box.
     */
    public Point3Deminsion getUpRightBackPoint(){
        double x = _base.getX() - _length;
        double y = _base.getY() + _width;
        double z = _base.getZ() + _height;
        return new Point3Deminsion (x, y, z);
    }

    /**
     * Calculates and returns the center point of the box.
     * @return the center point of the box.
     */
    public Point3Deminsion getCenter(){
        double x = _base.getX() - _length/2.0;
        double y = _base.getY() + _width/2.0;
        double z = _base.getZ() + _height/2.0;
        return new Point3Deminsion (x, y, z);
    }

    /**
     * Computes the distance between two boxes based on the distance of their center points.
     * @param other The other Box3D to caculate the distance from.
     * @return the distance between two Box3D objects.
     */
    public double distance(Box3D other){
        return this.getCenter().distance(other.getCenter());
    }

    /**
     * Computes the volume of the box.
     * @return volume of the Box3D object.
     */

    public int getVolume(){
        return _length * _width * _height;
    }

    /**
     * Computes the surface area of a box.
     * @return the surface area of a Box3D object.
     */
    public int getSurfaceArea(){
        return ((2 * _length * _width) + (2 * _length * _height) + (2 * _width * _height));
    }

    /**
     * Determines whether this box has a greater volume in compare to other box.
     * @param other a Box3D object whose volume will be compared with the volume of this Box3D.
     * @return true if this box has a greater volume in compare to other box.
     */
    public boolean isLargerCapacity (Box3D other){
        return (this.getVolume() > other.getVolume());
    }

    /**
     * Determines whether this box can contain the other box.
     * @param other a Box3D object to check if it can be contained within this box.
     * @return true if this box can contain the other box.
     */
    public boolean contains (Box3D other){
        return (_length > other._length && _width > other._width && _height > other._height);
    }

    /**
     * Checks if this box is above the other box.
     * @param other The box to check if this box is above it.
     * @return true if this box is above the other box, false otherwise.
     */
    public boolean isAbove (Box3D other){
        return _base.isAbove(other.getUpRightBackPoint());
    }

} //end of Box3D class
