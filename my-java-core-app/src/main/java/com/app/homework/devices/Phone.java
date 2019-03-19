package com.app.homework.devices;

import com.app.homework.Device;
import com.app.homework.utils.DataGeneratorUtils;

public class Phone extends Device {

    private boolean monoBlock;

    public boolean isMonoBlock() {
        return monoBlock;
    }

    public void setMonoBlock(boolean monoBlock) {
        this.monoBlock = monoBlock;
    }

    /**
     *
     * @param o Object to compare with
     * @return true if object are equals by model and isMonoBlock property
     */
    @Override
    public boolean equals(Object o){
        // if compared object reference equals to the current object reference then return true
        if(o == this){
            return true;
        }
        // check if compared object is not null
        if(o == null){
            return false;
        }
        // check if compared object class equals to the current class
        if(o.getClass() == this.getClass()){
            // cast compated object to current object type - Phone
            Phone comparedPhone = (Phone) o;
            // check if model of compared object equals current object model
            if(comparedPhone.getModel().equalsIgnoreCase(this.getModel())){
                // compare object by isMonoBlock property
                return comparedPhone.isMonoBlock() == this.isMonoBlock();
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = super.hashCode() + DataGeneratorUtils.generateID();
        return hash;
    }
}
