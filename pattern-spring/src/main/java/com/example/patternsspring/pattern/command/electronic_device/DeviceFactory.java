package com.example.patternsspring.pattern.command.electronic_device;

public interface DeviceFactory<T, E> {
    T get(E e);
}
