package org.wpposts.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ruixj on 17-5-14.
 */
@Controller
@RequestMapping("/postlinks")
public class PostLinkController {
    @RequestMapping(value="/page",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String list(@RequestParam(value="startpos") int offset, @RequestParam(value="count")int limit) {

        return null;
    }
}
