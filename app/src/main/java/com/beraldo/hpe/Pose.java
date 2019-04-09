package com.beraldo.hpe;

import android.support.annotation.NonNull;

import java.util.Comparator;

/**
 * Copyright (c) 2019 Farmerline LTD. All rights reserved.
 * Created by Clement Osei Tano K on 03/04/2019.
 */
public class Pose implements Comparable {
    private double pitch;
    private double roll;
    private double yaw;

    public Pose(double pitch, double roll, double yaw) {
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    /**
     * @param o an object to compare this class instance to
     * @return -1 if o is greater than this instance, 1 if o is less than this instance and 0 for equality
     */
    @Override
    public int compareTo(@NonNull Object o) {
        if (o instanceof Pose) {
            Pose p = (Pose) o;
            if (p.getPitch() < pitch && p.getRoll() < roll && p.getYaw() < yaw) {
                return 1;// o is less
            } else if (p.getPitch() > pitch && p.getRoll() > roll && p.getYaw() > yaw) {
                return -1;// o is greater
            } else return 0;// equality
        } else
            throw new ClassCastException("Object of type " + o.getClass().getSimpleName() + " cannot be cast into " + Pose.class.getSimpleName() + ".");
    }
}
