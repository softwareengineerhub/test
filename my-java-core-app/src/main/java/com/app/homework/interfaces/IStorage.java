package com.app.homework.interfaces;

import com.app.homework.Device;
import com.app.homework.exceptions.DeviceArrayEmptyException;

public interface IStorage {

    void add(Device device);
    void remove(int index) throws DeviceArrayEmptyException;
    Device getValue(int index);
    int size();
}
