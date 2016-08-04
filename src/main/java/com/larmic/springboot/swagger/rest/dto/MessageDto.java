package com.larmic.springboot.swagger.rest.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MessageDto")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(value = "MessageDto", description = "TODO")
public class MessageDto {

    @ApiModelProperty(value = "Message content text", required = true, example = "some demo message")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
