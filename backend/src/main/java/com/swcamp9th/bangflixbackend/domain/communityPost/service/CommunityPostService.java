package com.swcamp9th.bangflixbackend.domain.communityPost.service;

import com.swcamp9th.bangflixbackend.domain.communityPost.dto.CommunityPostCreateDTO;
import com.swcamp9th.bangflixbackend.domain.communityPost.dto.CommunityPostDTO;
import com.swcamp9th.bangflixbackend.domain.communityPost.dto.CommunityPostUpdateDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CommunityPostService {

    void createPost(String loginId, CommunityPostCreateDTO newPost, List<MultipartFile> images) throws IOException;

    void updatePost(String loginId, int communityPostCode,
                    CommunityPostUpdateDTO modifiedPost, List<MultipartFile> images);

    void deletePost(String loginId, int communityPostCode);

//    Page<CommunityPostDTO> findPostList(Pageable pageable);

    CommunityPostDTO findPostByCode(String loginId, int communityPostCode);

    List<CommunityPostDTO> getAllPosts(String loginId);

    List<CommunityPostDTO> getMyPosts(String loginId);
}
