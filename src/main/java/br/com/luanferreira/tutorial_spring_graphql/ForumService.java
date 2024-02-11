package br.com.luanferreira.tutorial_spring_graphql;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
class PostService {
    Map<String, Post> posts = new HashMap<>();

    Collection<Post> creatPost(String content) {
        var newPost = new Post(UUID.randomUUID().toString(), content);
        posts.put(newPost.id(), newPost);
        return posts.values();
    }

    Post postById(String id) {
        return posts.get(id);
    }
    
}
@Service
class CommentService {
    
    Map<String, Comment> comments = new HashMap<>();
    
    Collection<Comment> creatComment(String content, String postId) {
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.id(), newComment);
        return comments.values();
    }
}
