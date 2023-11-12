package com.myblog.Service;

import com.myblog.Payload.PostDto;
import com.myblog.Payload.PostResponse;

public interface PostService {

        PostDto createPost(PostDto postDto);

        PostResponse getAllPost(int pageNo , int pageSize, String sortBy, String sortDir);

        PostDto getPostById(long id);

        PostDto updatePost(PostDto postDto, long id);
        void deletePostById(long id);
    }

