package impl;

import api.ExampleModel;
import api.ExampleService;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


public class ExampleServiceImpl implements ExampleService {

    public ExampleModel get(String id) {
        return new ExampleModel("jubee", 25);
    }
}
