package in.ashokit.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService{
	
	public List<String> getVideoFiles(String directoryPath) {
		List<String> videoList = new ArrayList<>();
		File directory = new File(directoryPath);
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile() && isVideoFile(file.getName())) {
					videoList.add(file.getName());
				}
			}
		}
		return videoList;
	}
	
	private boolean isVideoFile(String fileName) {
       
        return fileName.toLowerCase().endsWith(".mp4") ||
               fileName.toLowerCase().endsWith(".avi") ||
               fileName.toLowerCase().endsWith(".mov");
    }

}
