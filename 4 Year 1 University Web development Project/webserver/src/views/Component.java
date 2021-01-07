package views;

import org.h2.mvstore.MVMap;

import model.Components;
import model.OutfitSubmission;
import views.MakeYourLook;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Component extends DynamicWebPage
{

	public Component(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}
	String stringToSendToWebBrowser = "";

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Component.html"))
		{
			stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title></title>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"/theme.css\"> </head>\n";


			stringToSendToWebBrowser += "  <script>\n";
			stringToSendToWebBrowser += "function componentSend(){\n";
			stringToSendToWebBrowser += "    if (window.XMLHttpRequest)\n";
			stringToSendToWebBrowser += "    {// code for IE7+, Firefox, Chrome, Opera, Safari\n";
			stringToSendToWebBrowser += "        xmlhttp=new XMLHttpRequest();\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "    else\n";
			stringToSendToWebBrowser += "    {// code for IE6, IE5\n";
			stringToSendToWebBrowser += "        xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "    xmlhttp.onreadystatechange=outfitLoadedFunction;\n";
			stringToSendToWebBrowser += "    //This line actually makes the request to the server\n";
			stringToSendToWebBrowser += "    xmlhttp.open(\"GET\",'/Component.html/componentSubmission?title='+document.getElementById(\"Component title\").value+'&description='+document.getElementById(\"Component description\").value+'&image='+document.getElementById(\"submit image\").value+'&link='+document.getElementById(\"link\").value,true);\n";
			stringToSendToWebBrowser += "    xmlhttp.open(\"GET\",'/MakeYourLook.html',true);\n";
			stringToSendToWebBrowser += "    xmlhttp.send();\n";
			stringToSendToWebBrowser += "}\n";

			stringToSendToWebBrowser += "function componentLoadedFunction()\n";
			stringToSendToWebBrowser += "{\n";
			stringToSendToWebBrowser += "  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n";
			stringToSendToWebBrowser += "  {\n";
			stringToSendToWebBrowser += "    //This line will set the html between the <body> tags\n";
			stringToSendToWebBrowser += "    //with what was returned by the webserver\n";
			stringToSendToWebBrowser += "    //this will make the page redraw\n";
			stringToSendToWebBrowser += "    var element = document.getElementById(\"button\");\n";
			stringToSendToWebBrowser += "    element.parentNode.removeChild(element);\n";
			stringToSendToWebBrowser += "    var text = document.getElementByID(\"newNode\");\n";
			stringToSendToWebBrowser += "    text.createTextNode(\"Submitted\");\n";
			stringToSendToWebBrowser += "  }\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "  </script>\n";
			stringToSendToWebBrowser += "\n";

			
			stringToSendToWebBrowser += "<body>\n";

			stringToSendToWebBrowser += "<div class=\"py-5\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <form class=\"\" action=\"Component.html/componentSubmission\">\n";
			stringToSendToWebBrowser += "            <div class=\"form-group\"> <label for=\"exampleInputEmail1\">Component</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" class=\"form-control\" aria-describedby=\"emailHelp\" placeholder=\"Enter title\" name=\"Component title\"id=\"Component title\">\n";
			stringToSendToWebBrowser += "              <div class=\"form-group\"> <label>Component Description</label>\n";
			stringToSendToWebBrowser += "                <input type=\"text\" class=\"form-control h-50 text-justify\" id=\"Component description\" name=\"Component description\" aria-describedby=\"emailHelp\" placeholder=\"Enter description\"> </div>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"form-link\"> <label>Picture of component</label>\n";
			stringToSendToWebBrowser += "            <input type=\"text\" value=\"Upload Image\" id=\"Component image\"name=\"Component image\"> <small>This Should be an image url</small> </form>\n";
			//stringToSendToWebBrowser += "              <input id=\"tComponentImg\" type=\"file\" name=\"image\" accept=\"image/jpeg, image/png\"> </div>\n";
			stringToSendToWebBrowser += "            <div class=\"form-link\"> <label>link to component:</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" name=\"link\" id=\"link\" accept=\"image/jpeg, image/png\"> </div>\n";
			stringToSendToWebBrowser += "            <div id=\"newNode\"class=\"form-link\">\n";
			stringToSendToWebBrowser += "            <button type=\"submit\" id=\"button\"class=\"btn btn-primary\" onclick=\"componentSend();\">Add</button>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "</body>\n";

			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		else
			if(toProcess.path.equalsIgnoreCase("Component.html/componentSubmission"))
			{

				Components componentSubmission = new Components();
				componentSubmission.title = toProcess.params.get("Component title");
				componentSubmission.description = toProcess.params.get("Component description");
				componentSubmission.picture = toProcess.params.get("Component image");
				componentSubmission.link = toProcess.params.get("link");
				MakeYourLook.newSubmission.outfitComponents.add(componentSubmission);


				
				

				toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
				return true;

			}
		
		
		return false;
	}

}