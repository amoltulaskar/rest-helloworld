package com.training.component.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/v1/helloworld")
public class helloworld{
  @GET
  public String getHelloWorldMessage(){
    return "hi";
  }
}
