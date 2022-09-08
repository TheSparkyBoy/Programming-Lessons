public class Bicycle {
    private double speed;
    private int gear;

    public Bicycle(){//defualt constructor
        speed = 0;
        gear = 1;
    }

    public Bicycle(double speed, int gear){//parameterized constructor
        this.speed = speed;
        this.gear = gear;
    }

    public Bicycle(double speed){
        this.speed = speed;
    }

    public void changeSpeed(double speedChange, boolean increase){//speedChange is positive
        if(increase == true){
            speed = speed + speedChange;
        }else{
            speed = speed - speedChange;
        }
    }

    public void changeGear(int changeGear, boolean increase){
        if(increase == true){
            gear = gear + changeGear;
        }else{
            gear = gear - changeGear;
        }
    }
}
