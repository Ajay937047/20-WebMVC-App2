
package in.ashokit.controller;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.constant.WebConstant;
import in.ashokit.service.VideoService;

@Controller
public class VideoController {

	@Autowired
	private VideoService videoService;

	@GetMapping("/videos")
	public ModelAndView getVideoList() {
		System.out.println("getVideoList() :: called");
		//String directoryPath = "C:\\Ajay\\Ashok IT\\JRTP\\JRTP";
		List<String> videoList = videoService.getVideoFiles(WebConstant.DIRECTORY_PATH);
		ModelAndView md = new ModelAndView();
		md.addObject("videoslist", videoList);
		md.setViewName("videoslist");
		return md;

	}

	  @GetMapping(value = "/video", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	    @ResponseBody
		public Resource getVideo(@RequestParam String videoFileName) throws MalformedURLException {
			System.out.println("getVideo() ::Path::"+WebConstant.PLAY_PATH + videoFileName);
		  Path videoPath = Paths.get(WebConstant.PLAY_PATH + videoFileName);
			Resource video = new UrlResource(videoPath.toUri());
			if (!video.exists() || !video.isReadable()) {
				throw new RuntimeException("Video not found or not readable Path::"+WebConstant.PLAY_PATH + videoFileName);
			}
			return video;
		}
}
