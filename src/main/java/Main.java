public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(0,0);

        robot.printCurrentLocation();
        robot.moveRobotToTargetLocation(robot, -24, 17);
        robot.printCurrentLocation();

    }
}
