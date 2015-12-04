import java.lang.*;

public class Coordinate {

  private float x, y;

  public Coordinate() {
    this(0, 0);
  }

  public Coordinate(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return this.x;
  }

  public Coordinate setX(float x) {
    this.x = x;
    return this;
  }

  public float getY() {
    return this.y;
  }

  public Coordinate setY(float y) {
    this.y = y;
    return this;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public double distToOrigin(Coordinate other) {
    return Math.sqrt((this.getX() - other.getX()) * (this.getX() - other.getX()) +
        (this.getY() - other.getY()) * (this.getY() - other.getY()));
  }
}
