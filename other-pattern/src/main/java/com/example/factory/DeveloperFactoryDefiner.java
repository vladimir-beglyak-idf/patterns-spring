package com.example.factory;

import java.util.HashMap;
import java.util.Map;

import static com.example.factory.DeveloperType.*;

public class DeveloperFactoryDefiner {
    private static Map<DeveloperType, DeveloperFactory> map = new HashMap<>();

    static {
        map.put(JAVA, new JavaDeveloperFactory());
        map.put(CPP, new CppDeveloperFactory());
        map.put(PHP, new PhpDeveloperFactory());
    }

    public static DeveloperFactory define(DeveloperType type) {
        return map.get(type);
    }
}
