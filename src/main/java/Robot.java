public class Robot {
    protected enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    private int x;
    private int y;
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public void printDirection() {
        System.out.println(this.getDirection());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnToLeft() {
        if(direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if(direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if(direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        } else if(direction == Direction.RIGHT) {
            direction = Direction.UP;
        }
    }

    public void turnToRight() {
        if(direction == Direction.UP) {
            direction = Direction.RIGHT;
        } else if(direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        } else if(direction == Direction.DOWN) {
            direction = Direction.LEFT;
        } else if(direction == Direction.LEFT) {
            direction = Direction.UP;
        }
    }

    public void stepForward() {
        if(direction == Direction.UP) {
            y++;
        } else if(direction == Direction.RIGHT) {
            x++;
        } else if(direction == Direction.DOWN) {
            y--;
        } else if(direction == Direction.LEFT) {
            x--;
        }
    }

    public void printCurrentLocation() {
        System.out.println("x=" + this.x + " y=" + this.y);
    }


    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public void moveRobotToTargetLocation(Robot robot, int toX, int toY){

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnToRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnToLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnToRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnToLeft();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
