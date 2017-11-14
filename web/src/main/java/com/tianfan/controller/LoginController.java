package com.tianfan.controller;

import com.tianfan.entity.ServerResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping(value = "/login/{params}")
    @ResponseBody
    public ServerResponseEntity loginCheck(@MatrixVariable(pathVar = "params")Map<String,List<String>> params, Model model){
        ServerResponseEntity responseEntity = new ServerResponseEntity();
        return responseEntity;

    }
}
