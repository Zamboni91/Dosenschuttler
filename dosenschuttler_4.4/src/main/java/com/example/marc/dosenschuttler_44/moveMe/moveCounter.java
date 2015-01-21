package com.example.marc.dosenschuttler_44.moveMe;

import android.hardware.Sensor;

/**
 * Created by Marc on 20.01.2015.
 */
public class moveCounter {
    private int count;
    //If the device lies flat on the table the movement to the right is positive in the X-Axis
    private int motionX;

    private int motionY;
    private int motionZ;

    public moveCounter(){
        this.count = 0;

        motionX = Sensor.TYPE_LINEAR_ACCELERATION;


    }


}
