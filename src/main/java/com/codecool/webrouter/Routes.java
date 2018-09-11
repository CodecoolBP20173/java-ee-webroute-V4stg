package com.codecool.webrouter;

import com.sun.net.httpserver.HttpExchange;

public class Routes {

    @WebRoute
    public static String index(HttpExchange exchange) {

        return "<!doctype html>" +
                "<html lang=\"en\">" +
                "<head><title>Index page</title></head>" +
                "<body>" +
                "<h1>WebRoute</h1>" +
                "<h2>Index page</h2>" +
                "<a href=\"/test\">Test page</a>" +
                "</body>" +
                "</html>";
    }

    @WebRoute(path = "/test")
    public static String test(HttpExchange exchange) {

        return "<!doctype html>" +
                "<html lang=\"en\">" +
                "<head><title>Test page</title></head>" +
                "<body>" +
                "<h2>Test page</h2>" +
                "<a href=\"/\">Back to main page</a>" +
                "</body>" +
                "</html>";
    }
}
