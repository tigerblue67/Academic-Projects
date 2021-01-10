import http.server
import socketserver
import json
from urllib.parse import urlparse


port = 80

def multiply(x, y):
    return x*y

class MyHandler(http.server.BaseHTTPRequestHandler):

    def do_GET(self):
        """Respond to a GET request."""
        try:
            ParsedURL = self.path
            ParsedURL = ParsedURL[2:]
            ParsedURL = dict(qc.split("=") for qc in ParsedURL.split("&"))
            x = int(ParsedURL['x'])
            y = int(ParsedURL['y'])
            ans = multiply(x, y)
            ParsedURL['a'] = str(ans)
            if self.path != "":
                self.send_response(200)
                self.send_header("Content-type", "application/json")
                self.end_headers()
        except:
            print("Exception occured returning server error")
            if self.path != "":
                self.send_response(500)
                self.end_headers()
            

        ParsedURL = json.JSONEncoder().encode(ParsedURL)
        print(ParsedURL)
        self.wfile.write(ParsedURL.encode())


if __name__ == "__main__":
    webServer = http.server.HTTPServer(("", port), MyHandler)
    print("Server started http://%s:%s" % ("localhost", port))

    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        pass

    webServer.server_close()
    print("Server stopped.")
