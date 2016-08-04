package com.larmic.springboot.swagger.rest;

import com.larmic.springboot.swagger.rest.dto.MessageDto;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageResource {

    @ApiOperation(value = "simple message resource")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "message", value = "Message to send", required = true, dataType = "com.larmic.springboot.swagger.rest.dto.MessageDto", paramType = "body")
    })
    @RequestMapping(value = "/api/message", method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"})
    public void sendMessageToGroup(@RequestBody MessageDto message) {
        System.out.println("ping");
    }
}