package qa.guru.restbackend;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import qa.guru.restbackend.domain.UserInfo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.with;

public class BankControllerTest {

    private static final String BASEURI = "http://localhost:8080";

    private RequestSpecification spec = with()
            .baseUri(BASEURI)
            .basePath("/");

    @Test
    void bankControllerTest() {
       UserInfo[] userInfos = spec.get("user/getAll")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(UserInfo[].class);

        Stream.of(userInfos)
                .filter(userInfo -> userInfo.getUsername().equals("Pasha"))
                .peek(userInfo -> System.out.println(userInfo.getUsername()))
                .map(userInfo -> userInfo.toString())
                .collect(Collectors.toList());
    }
}

