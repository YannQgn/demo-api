package com.exo.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CoucouTest {
//     @LocalServerPort
//     private int port;

//     @Test
//     public void test_Get_Coucou() {
//         String result = new RestTemplate()
//                 .getForObject("http://localhost:" + port + "/coucou",
//                 String.class);
//                 Assertions.assertThat(result.contains("salut")).isTrue();
//     }
}
