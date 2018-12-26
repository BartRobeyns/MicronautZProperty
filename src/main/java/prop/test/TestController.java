package prop.test;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
@Context
public class TestController {

    @Value("${z}")
    int z;
}
