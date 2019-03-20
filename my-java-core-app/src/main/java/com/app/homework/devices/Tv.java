package com.app.homework.devices;

import com.app.homework.Device;
import com.app.homework.utils.ConsoleOutputUtils;
import com.app.homework.utils.DataGeneratorUtils;

public class Tv extends Device {

    private boolean isMonochrome;

    public boolean isMonochrome() {
        return isMonochrome;
    }

    public void setMonochrome(boolean monochrome) {
        isMonochrome = monochrome;
    }

    /**
     *
     * @param o Object to compare with
     * @return true if objects are equals by model and isMonochrome properties
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() == this.getClass()) {
            Tv comparedTv = (Tv) o;
            if(comparedTv.getModel() == this.getModel()){
                return comparedTv.isMonochrome == this.isMonochrome;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = super.hashCode() + DataGeneratorUtils.generateID();
        return hash;
    }

    @Override
    public void on() {
        ConsoleOutputUtils.print("Turn TV on by press remote control red button");
    }

    @Override
    public void off() {
        // check it TV is on then -> execute off action
        ConsoleOutputUtils.print("Turn TV off by press remote control red button");
    }
}
