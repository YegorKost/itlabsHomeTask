package com.iegor.servlet;

import com.google.gson.Gson;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Iegor on 29.07.2014.
 * ServletReturnCookies class return cookies from request as JSON.
 * Google Gson library used for JSON generation.
 */
public class ServletReturnCookies extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        Cookie[] cookies = request.getCookies();
        String json = gson.toJson(cookies);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.write(json);
    }
}
