import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;
import static org.hamcrest.Matchers.equalTo;

public class ReqresTest {

    @Test
    void getListUsersTest() throws Exception {
        get("https://reqres.in/api/users?page=2").
                then().
                assertThat().
                body("page", equalTo(2));
    }

    @Test
    void getUserTest() throws JsonProcessingException {
        String json = get("https://reqres.in/api/users?page=2").asString();
        ObjectMapper objectMapper = new ObjectMapper();
        Page page = objectMapper.readValue(json,Page.class);



    }

    @Test
    void addUserTest() {
       RestAssured.given().
                spec(LoginSpecs.UsersRequestSpec)
                .body("{\"name\":\"morpheusd\",\"job\":\"leaderd\"}")
                .when()
                .post();
    }

}
