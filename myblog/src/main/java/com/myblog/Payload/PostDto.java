package com.myblog.Payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min = 2,message = "Post title should at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 10,message = "Post Description should be at least 10 characters")
    private String description;
    @NotEmpty
    private String content;
}
