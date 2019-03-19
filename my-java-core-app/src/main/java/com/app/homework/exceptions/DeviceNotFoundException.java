package com.app.homework.exceptions;

import java.sql.SQLException;

public class DeviceNotFoundException extends SQLException {

    public DeviceNotFoundException(String message){
        super("Device not found in database: " + message);
    }
}
