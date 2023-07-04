import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;

public class LoginSpecs {

    public static RequestSpecification UsersRequestSpec = with()
            .filter(new AllureRestAssured())
            .baseUri("https://reqres.in")
            .basePath("/api/users")
            .log().all()
            .contentType(ContentType.JSON);
}
