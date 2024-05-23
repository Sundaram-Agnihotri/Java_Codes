package org.studyeasy;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Car() {
        doors = "Closed";
        engine = "off";
        driver = "away";
        speed = 0;
    }

    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }


    public void setEngine(String engine) {
        this.engine = engine;
    }


    public void setDriver(String driver) {
        this.driver = driver;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed >0	){
            return "running";
        }else{
            return "not running";
        }
    }
}
