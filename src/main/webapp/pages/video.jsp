<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Video Player</title>
</head>
<body>
    <h2>Video Player</h2>
    
    <!-- Add a play button -->
    <button onclick="playVideo()">Play</button>
    
    <!-- Add the video player, initially hidden -->
    <video id="videoPlayer" width="640" height="360" controls style="display: none;">
        <!-- Add the source dynamically using JavaScript -->
    </video>
    
    <script>
        function playVideo() {
            var videoPlayer = document.getElementById('videoPlayer');
            // Set the source dynamically
            videoPlayer.innerHTML = '<source src="${pageContext.request.contextPath}/video" type="video/mp4">';
            // Show the video player
            videoPlayer.style.display = 'block';
            // Start playing the video
            videoPlayer.play();
        }
    </script>
</body>
</html>
