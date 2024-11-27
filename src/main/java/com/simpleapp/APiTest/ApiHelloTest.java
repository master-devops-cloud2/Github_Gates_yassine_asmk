package com.simpleapp.APiTest;

import com.simpleapp.API.HelloAPI;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiHelloTest {

    @Test
    public void testSayHello() {
        HelloAPI controller = new HelloAPI();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello, World!");
    }
}
