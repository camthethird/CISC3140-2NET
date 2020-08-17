/* this was prepare my environemnt based on the instructions of spotify developer quick start guide:
https://developer.spotify.com/documentation/web-api/quick-start/ */
var http = require("http");

http.createServer(function(request,response){
    response.writeHead(200, {"Content-Tyep": "text/plain"});
    response.write("Hello World");
    response.end();
}).listen(8888);
