package com.app.homework;

import com.app.homework.exceptions.DeviceArrayEmptyException;
import com.app.homework.exceptions.DeviceArrayFullException;
import com.app.homework.interfaces.IStorage;

import java.util.Arrays;

/**
 * DeviceArrayStorage class for handling devices in array. Array data structure is used.
 */
public class DeviceArrayStorage implements IStorage {

    private Device[] devicesStorage;
    private int size = 0;
    private int arrayInitialLength = 10;

    public DeviceArrayStorage(){
        // initialize default length of device array
        devicesStorage = new Device[arrayInitialLength];
    }

    public Device[] getDevicesStorage() {
        return devicesStorage;
    }

    @Override
    public void add(Device device) {
        if(size >= arrayInitialLength){
            throw new DeviceArrayFullException("Device Storage is full");
        } else {
            devicesStorage[size] = device;
            size++;
        }
    }

    @Override
    public void remove(int index) throws DeviceArrayEmptyException {
        // not implemented
    }

    @Override
    public Device getValue(int index) {
        return devicesStorage[index];
    }

    @Override
    public int size() {
        return devicesStorage.length;
    }

    public boolean compareArrays(Device[] array){
       return Arrays.equals(this.devicesStorage, array);
    }
}
