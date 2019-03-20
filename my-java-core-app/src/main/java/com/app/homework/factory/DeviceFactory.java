package com.app.homework.factory;

import com.app.homework.Device;
import com.app.homework.devices.Laptop;
import com.app.homework.devices.Phone;
import com.app.homework.devices.Tv;
import com.app.homework.enums.DeviceTypes;

/**
 * Factory to create different types of Devices
 */
public class DeviceFactory {

    public Device createDevice(DeviceTypes deviceTypes){
        Device device = null;
        switch (deviceTypes){
            case LAPTOP: device = new Laptop();
            break;
            case PHONE: device = new Phone();
            break;
            case TV: device = new Tv();
            break;
            default: throw new IllegalArgumentException("incorrect device type");
        }
        return device;
    }


}
