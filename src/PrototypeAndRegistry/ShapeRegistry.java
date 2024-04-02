package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private final Map<String, Shape> registry = new HashMap< >();

    public Shape get(String key){
        return registry.get(key);
    }

    public void add(String key, Shape shape){
        registry.put(key, shape);
    }
}
