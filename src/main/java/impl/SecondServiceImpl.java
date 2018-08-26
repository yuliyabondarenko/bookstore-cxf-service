package impl;

import api.ExampleModel;
import api.ExampleService;

public class SecondServiceImpl implements ExampleService {
    public ExampleModel get(String id) {
        return new ExampleModel("cassandra", 78);
    }
}
