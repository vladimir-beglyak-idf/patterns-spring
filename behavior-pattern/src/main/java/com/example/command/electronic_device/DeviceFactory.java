package com.example.command.electronic_device;

public interface DeviceFactory<T, E> {
    T get(E e);
}
