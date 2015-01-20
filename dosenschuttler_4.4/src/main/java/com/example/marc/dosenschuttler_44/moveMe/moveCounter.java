package com.example.marc.dosenschuttler_44.moveMe;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/**
 * Created by Marc on 20.01.2015.
 */
public class moveCounter {
    private int count;
    //If the device lies flat on the table the movement to the right is positive in the X-Axis
    private Sensor motionX;

    private Sensor motionY;
    private Sensor motionZ;

    public moveCounter(SensorEvent event){
        this.count = 0;
/*
        motionX = Sensor.TYPE_LINEAR_ACCELERATION.values[0];
        motionY = Sensor.TYPE_LINEAR_ACCELERATION.values[1];
        motionZ = Sensor.TYPE_LINEAR_ACCELERATION.values[2];

        SensorEvent.
*/
    }


}
