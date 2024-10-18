package model;

/**
 * Represents a coordinate with a location in 2D space and a BattleSalvo coord status.
 */
public class Coord {

  private int xVal;
  private int yVal;
  private CoordStatus status;

  /**
   * Creates a Coord object.
   *
   * @param x - x value of this Coord.
   * @param y - y value of this Coord.
   * @param status - CoordStatus of this Coord.
   */
  public Coord(int x, int y, CoordStatus status) {

    this.xVal = x;
    this.yVal = y;
    this.status = status;

  }

  /**
   * Gets this coord's status.
   *
   * @return - This coord's CoordStatus.
   */
  public CoordStatus getStatus() {
    return status;
  }

  /**
   * Gets this coord's x value.
   *
   * @return - This coord's integer x value.
   */
  public int getX() {
    return xVal;
  }

  /**
   * Gets this coord's y value.
   *
   * @return - This coord's integer y value.
   */
  public int getY() {
    return yVal;
  }

  /**
   * Mutates this coord's status to the given parameter CoordStatus.
   *
   * @param newStatus - This coord's desired new status.
   */
  public void changeStatus(CoordStatus newStatus) {
    status = newStatus;
  }

}
