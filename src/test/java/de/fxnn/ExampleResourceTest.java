package de.fxnn;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ExampleResourceTest {

  @Test
  void create() {
    when().get("/findAll").then().statusCode(200).body(is("0"));
    given()
        .body(new ExampleDto())
        .contentType(ContentType.JSON)
        .when()
        .post("/create")
        .then()
        .statusCode(200)
        .body(is("ok"));
    when().get("/findAll").then().statusCode(200).body(is("1"));
  }
}
