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
                "</body>" +
                "</html>";
    }
}
