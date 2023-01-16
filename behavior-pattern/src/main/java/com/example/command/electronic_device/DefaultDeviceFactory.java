package com.example.command.electronic_device;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DefaultDeviceFactory {

    private static final Map<DeviceType, Supplier<ElectronicDevice>> deviceTypeMap = new HashMap<>();

    static {
        deviceTypeMap.put(DeviceType.TV, Television::new);
        deviceTypeMap.put(DeviceType.RADIO, Radio::new);
    }

    private DefaultDeviceFactory() {

    }

    public static ElectronicDevice get(DeviceType deviceType) {
        return deviceTypeMap.get(deviceType).get();
    }
}
