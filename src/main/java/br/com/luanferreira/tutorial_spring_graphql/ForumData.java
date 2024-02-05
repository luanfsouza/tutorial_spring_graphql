package br.com.luanferreira.tutorial_spring_graphql;

/**
 * ForumData
 */
record Post(String id, String content) {

    
}

 record Comment(String id, String content, String postId) {
    
}