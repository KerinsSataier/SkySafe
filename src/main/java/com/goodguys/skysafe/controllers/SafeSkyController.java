package com.goodguys.skysafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by poznokos on 12/3/15.
 */
@Controller
public class SafeSkyController
{

  @RequestMapping(value = "/start", method = RequestMethod.GET)
  public String start()
  {
    return "index";
  }

}
