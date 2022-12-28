package com.example.patternsspring.pattern.command.electronic_device;

import java.util.List;

public class DeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice television = DefaultDeviceFactory.get(DeviceType.TV);
        TurnOnTvCommand turnOnTvCommand = new TurnOnTvCommand(television);
        DeviceButton button = new DeviceButton(turnOnTvCommand);
        button.press();
//        ********************************************************

        TurnUpTvVolumeCommand turnUpTvVolumeCommand = new TurnUpTvVolumeCommand(television);
        DeviceButton deviceButton = new DeviceButton(turnUpTvVolumeCommand);
        deviceButton.press();
        deviceButton.press();
        deviceButton.press();
        deviceButton.press();
//        *******************************************************
        ElectronicDevice television1 = DefaultDeviceFactory.get(DeviceType.TV);
        ElectronicDevice radio = DefaultDeviceFactory.get(DeviceType.RADIO);
        TurnOffDevicesCommand turnOffDevicesCommand = new TurnOffDevicesCommand(List.of(television1, radio));
        DeviceButton buttonOffAllDevices = new DeviceButton(turnOffDevicesCommand);
        buttonOffAllDevices.press();
    }
}
