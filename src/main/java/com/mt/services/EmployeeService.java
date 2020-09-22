package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

  @RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
  @ResponseBody
  String uploadImage(HttpServletRequest request, HttpServletResponse response,
      HttpSession httpSession) throws JSONException {

    JSONObject js = new JSONObject();
    js.put("Name", "Athni Technologies");
    js.put("Calling Name", "Athni");
    js.put("DOB", "22-Sep-2020");
    js.put("Hobbies", "Reading blogs, playing Cricket, constant learning, helping the needy!");
    js.put("Places he like", "Native place");

    return js.toString();
  }
}
