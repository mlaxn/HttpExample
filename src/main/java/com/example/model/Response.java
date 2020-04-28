package com.example.model;


/**
 * Parsing Json as Array as object
 * String userJson = "[{'name': 'Alex','id': 1}, "
 *                 + "{'name': 'Brian','id':2}, "
 *                 + "{'name': 'Charles','id': 3}]";
 */
public class Response {
    int id;
    int userId;
    String title;
    String body;

    @Override
    public String toString() {
        return "Response {\n" + "id = " + id + ", " +
                "userId=" + userId + ", title='" +
                title + '\'' + ", body='" +
                body + '\'' + '}'+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
