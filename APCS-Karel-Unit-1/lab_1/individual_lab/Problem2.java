package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        clockwise();
        counterclockwise();
        counterclockwise();
        clockwise();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void clockwise() {
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    public void counterclockwise() {
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
    }
}