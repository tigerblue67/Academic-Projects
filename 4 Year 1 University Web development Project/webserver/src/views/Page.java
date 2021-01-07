package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Page extends DynamicWebPage
{

	public Page(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Page.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<div id=\"map\" style=\"width:100%;height:400px;\"></div>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<script>\n";
			stringToSendToWebBrowser += "function myMap() {\n";
			stringToSendToWebBrowser += "  var mapCanvas = document.getElementById(\"map\");\n";
			stringToSendToWebBrowser += "  var mapOptions = {\n";
			stringToSendToWebBrowser += "    center: new google.maps.LatLng(51.5, -0.2), zoom: 10\n";
			stringToSendToWebBrowser += "  };\n";
			stringToSendToWebBrowser += "  var map = new google.maps.Map(mapCanvas, mapOptions);\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "</script>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAY7H0VCCR0nsGhMe6MfjW4qqnR2T6w3pI&callback=myMap\"></script>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		return false;
	}

}