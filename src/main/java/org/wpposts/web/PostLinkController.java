package org.wpposts.web;


 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wpposts.dto.LinkInsertResult;
import org.wpposts.dto.PostLinkPage;
import org.wpposts.entity.PostLink;
import org.wpposts.service.PostLinkService;

/**
 * Created by ruixj on 17-5-14.
 */
@Controller
@RequestMapping("/postlinks")
public class PostLinkController {
	
	 @Autowired
	private PostLinkService postLinkService;
	 
    @RequestMapping(value="/page",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public PostLinkPage GetPage(@RequestParam(value="startpos") int offset, 
    		                      @RequestParam(value="count")int limit) {
    	return postLinkService.getPostLinkList(offset, limit);
         
    }
    
    @RequestMapping(value="/postlink",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public  LinkInsertResult PutPage(@RequestBody PostLink postlink) {
    	return postLinkService.insertPostLink(postlink);
         
    }
}
