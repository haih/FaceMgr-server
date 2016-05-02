package  com.faceMgr.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.faceMgr.pojo.User;
import com.faceMgr.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/showName")
    @ResponseBody
    public String Index(HttpServletRequest request,Model model){
    	String resultString = "OK";
    	return resultString;
//
//    	LOG.info("Index begin!");
//    	String tracking = (String)request.getAttribute("trackingID");
//        int userId = Integer.valueOf(request.getParameter("id"));
//        User user = userService.getUserById(userId);
//        model.addAttribute("user", user);
//        return "show";
    }
    
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(User user){
        //User user = new User.Builder(1, "hh","3424145",23).build();
        userService.insertUser(user);
        return "OK";
    }
}