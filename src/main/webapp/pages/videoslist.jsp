<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Video List</title>
    <style>
        .video-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            grid-gap: 20px;
            list-style: none;
            padding: 0;
        }
        .video-item {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        
        button {
	padding: 0.5rem 1rem;
	font-size: 0.8rem;
	background-color: #ff0000;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	margin-bottom: 18px;
	
	

}
    </style>
    <script>
        function changeVideoSource(videoId, newSource) {
            var video = document.getElementById(videoId);
            var source = video.querySelector('source');
            source.src = newSource;
            video.load();
        }
    </script>
</head>
<a href="/webapp"><button>Go Back</button></a>
<body>
    <h1>VIDEO LIST BY ASHOKIT</h1>
    <ul class="video-grid">
        <% 
            ArrayList<String> videosList = (ArrayList<String>) request.getAttribute("videoslist");
            if (videosList != null) {
                for (String video : videosList) {
        %>
            <li class="video-item">
                <h3><%= video %></h3>
                <video id="video_<%= video %>" width="200" height="150" controls>
               
                </video>
                
               <a href="/webapp/video?videoFileName=<%= video %>"><button >play</button></a>         
                  </li>
        <% 
                }
            } else {
        %>
            <li class="video-item">No videos found.</li>
        <% 
            }
        %>
    </ul>
</body>
</html>
