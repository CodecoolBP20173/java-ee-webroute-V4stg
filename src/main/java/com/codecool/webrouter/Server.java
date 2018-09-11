package com.codecool.webrouter;

import com.sun.net.httpserver.HttpServer;

import java.lang.reflect.Method;
import java.net.InetSocketAddress;

public class Server {
    private static HttpServer server;

    public static void main(String[] args) throws Exception {
        server = HttpServer.create(new InetSocketAddress("localhost", 8000), 0);
        createRoutes();
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("server started on: " + server.getAddress());
    }

    private static void createRoutes() {
        for (Method method : Routes.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(WebRoute.class)) {
                String path = method.getAnnotation(WebRoute.class).path();
                Server.server.createContext(path, new Handler(method));
                System.out.println("Route created for path: " + path);
            }
        }
    }
}
