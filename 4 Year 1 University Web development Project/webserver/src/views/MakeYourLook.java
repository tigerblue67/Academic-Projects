package views;

import model.Components;
import model.OutfitSubmission;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.h2.mvstore.MVStore;
import org.h2.mvstore.db.MVTable;
import org.h2.mvstore.MVMap;;


public class MakeYourLook extends DynamicWebPage
{
	String stringToSendToWebBrowser = "";
	public static OutfitSubmission newSubmission = new OutfitSubmission();

	public MakeYourLook(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);

	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("MakeYourLook.html"))
		{
			OutfitSubmission outfit1 = new OutfitSubmission();
			
			String title = "Make your Look";

			stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title>MakeYourLook</title>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"/theme.css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			
			stringToSendToWebBrowser += "  <script>\n";
			stringToSendToWebBrowser += "function asyncLoad(){\n";
			stringToSendToWebBrowser += "    if (window.XMLHttpRequest)\n";
			stringToSendToWebBrowser += "    {// code for IE7+, Firefox, Chrome, Opera, Safari\n";
			stringToSendToWebBrowser += "        xmlhttp=new XMLHttpRequest();\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "    else\n";
			stringToSendToWebBrowser += "    {// code for IE6, IE5\n";
			stringToSendToWebBrowser += "        xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "    xmlhttp.onreadystatechange=myDataLoadedFunction;\n";
			stringToSendToWebBrowser += "    //This line actually makes the request to the server\n";
			stringToSendToWebBrowser += "    xmlhttp.open(\"GET\",'/MakeYourLook.html',true);\n";
			stringToSendToWebBrowser += "    xmlhttp.send();\n";
			stringToSendToWebBrowser += "}\n";

			stringToSendToWebBrowser += "function myDataLoadedFunction()\n";
			stringToSendToWebBrowser += "{\n";
			stringToSendToWebBrowser += "  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n";
			stringToSendToWebBrowser += "  {\n";
			stringToSendToWebBrowser += "    //This line will set the html between the <body> tags\n";
			stringToSendToWebBrowser += "    //with what was returned by the webserver\n";
			stringToSendToWebBrowser += "    //this will make the page redraw\n";
			stringToSendToWebBrowser += "    var i;\n";
			stringToSendToWebBrowser += "    var iframeCmp = document.createElement(\"IFRAME\");\n";
			stringToSendToWebBrowser += "    var frames = window.frames;\n";
			stringToSendToWebBrowser += "    document.getElementById(\"NewCmp\").appendChild(iframeCmp);\n";
			stringToSendToWebBrowser += "    for(i = 0; i < frames.length; i++){\n";
			stringToSendToWebBrowser += "    window.frames[i].location = \"/Component.html\";\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "  }\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "  </script>\n";
			stringToSendToWebBrowser += "\n";
			
			stringToSendToWebBrowser += "  <script>\n";
			stringToSendToWebBrowser += "function outfitSend(){\n";
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
			stringToSendToWebBrowser += "    xmlhttp.open(\"GET\",'/MakeYourLook.html/outfitSubmission?title='+document.getElementById(\"title\").value+'&description='+document.getElementById(\"description\").value+'&image='+document.getElementById(\"submit image\").value,true);\n";
			//stringToSendToWebBrowser += "    xmlhttp.open(\"GET\",'/MakeYourLook.html',true);\n";
			stringToSendToWebBrowser += "    xmlhttp.send();\n";
			stringToSendToWebBrowser += "}\n";

			stringToSendToWebBrowser += "function outfitLoadedFunction()\n";
			stringToSendToWebBrowser += "{\n";
			stringToSendToWebBrowser += "  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n";
			stringToSendToWebBrowser += "  {\n";
			stringToSendToWebBrowser += "    //This line will set the html between the <body> tags\n";
			stringToSendToWebBrowser += "    //with what was returned by the webserver\n";
			stringToSendToWebBrowser += "    //this will make the page redraw\n";
			stringToSendToWebBrowser += "    //var i;\n";
			stringToSendToWebBrowser += "    //var iframeCmp = document.createElement(\"IFRAME\");\n";
			stringToSendToWebBrowser += "    //var frames = window.frames;\n";
			stringToSendToWebBrowser += "    //document.getElementById(\"NewCmp\").appendChild(iframeCmp);\n";
			stringToSendToWebBrowser += "    //for(i = 0; i < frames.length; i++){\n";
			stringToSendToWebBrowser += "    //window.frames[i].location = \"/Component.html\";\n";
			stringToSendToWebBrowser += "    }\n";
			stringToSendToWebBrowser += "  }\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "  </script>\n";
			stringToSendToWebBrowser += "\n";

			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <a class=\"navbar-brand\" href=\"Index.html\">FAME</a>\n";
			stringToSendToWebBrowser += "      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n";
			stringToSendToWebBrowser += "      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n";
			stringToSendToWebBrowser += "        <ul class=\"navbar-nav mr-auto\">\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"GetTheLook.html\">Get The Look</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"MakeYourLook.html\">Submit Your Look</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"ContactUs.html\">Contact Us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"AboutUs.html\">About Us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"FAQ.html\">FAQ</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"NewsPage.html\">News</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"SignIn.html\">Sign In</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "        </ul>\n";
			stringToSendToWebBrowser += "        <form class=\"form-inline m-0\">\n";
			stringToSendToWebBrowser += "          <input class=\"form-control mr-2\" type=\"text\" placeholder=\"Search\">\n";
			stringToSendToWebBrowser += "          <button class=\"btn btn-secondary\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "        </form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </nav>\n";
			stringToSendToWebBrowser += "  <h1>" + title + "</h1>\n";
			stringToSendToWebBrowser += "  <h1> </h1>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "  </pingendo>\n";
			stringToSendToWebBrowser += "  <form action=\"MakeYourLook.html/outfitSubmission\">\n";
			stringToSendToWebBrowser += "  <div class=\"py-5\" id=\"makeYourLookForm\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "            <div class=\"form-group\"> <label>Look title</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" class=\"form-control\" name=\"title\" id=\"title\" aria-describedby=\"emailHelp\" placeholder=\"Enter title\"> \n";
			stringToSendToWebBrowser += "    		<div class=\"container\">\n";
			//stringToSendToWebBrowser += "          <form action=\"upload.php\" method=\"post\" enctype=\"multipart/form-data\"> Select image to upload:\n";
			//stringToSendToWebBrowser += "            <input type=\"file\" name=\"fileToUpload\" id=\"fileToUpload\">\n";
			stringToSendToWebBrowser += "            <input type=\"text\" placeholder=\"Upload Image\" name=\"submit image\" id=\"submit image\"> <small>This Should be an image url to be displayed on the Get Their Look Page</small> </form>\n";
			stringToSendToWebBrowser += "    		</div>\n";
			stringToSendToWebBrowser += "            <div class=\"form-group\"> <label>Look Description</label>\n";
			stringToSendToWebBrowser += "              <input type=\"text\" class=\"form-control h-50 text-justify\" name=\"description\"id=\"description\" aria-describedby=\"emailHelp\" placeholder=\"Enter description\"> </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\" id=\"NewCmp\">\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div id=\"addCmp\" class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "            <form action=\"/MakeYourLook.java\" method=\"post\"><button type=\"button\" value=\"AddComponent\" name=\"component\" onclick=\"asyncLoad();\">Add New Component</button></form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div>\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <!--this will lead to a form similar to the one above, loading it into the webpage allowing them to add components of clothing-->\n";
			stringToSendToWebBrowser += "          <button onclick='outfitSend();'>Submit</button>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += " </form>\n";
			stringToSendToWebBrowser += " <div class=\"py-5 bg-dark text-white\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6 text-center align-self-center\">\n";
			stringToSendToWebBrowser += "          <p class=\"mb-5\"> <strong>FAME</strong>\n";
			stringToSendToWebBrowser += "            <br>17 Malone Road, Suite 89\n";
			stringToSendToWebBrowser += "           <br>Belfast, BT7 7PD\n";
			stringToSendToWebBrowser += "			            <br> <abbr title=\"Phone\">P:</abbr> (028) 9147-9872 </p>\n";
			stringToSendToWebBrowser += "			          <div class=\"my-3 row\">\n";
			stringToSendToWebBrowser += "            <div class=\"col-4\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://www.facebook.com\" target=\"_blank\"><i class=\"fa fa-3x fa-facebook\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"col-4\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://twitter.com/CSC1009_FAME\" target=\"_blank\"><i class=\"fa fa-3x fa-twitter\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"col-4\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://www.instagram.com/fame_vevo/\" target=\"_blank\"><i class=\"fa fa-3x fa-instagram\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6 p-0\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid\" src=\"TempMap.jpg\"> </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
			
			
			
		}
			else
			if(toProcess.path.equalsIgnoreCase("MakeYourLook.html/outfitSubmission"))
			{
				System.out.println("test");
				newSubmission.uniqueID = ""+System.currentTimeMillis();
				newSubmission.title = toProcess.params.get("title");
				newSubmission.description = toProcess.params.get("description");
				newSubmission.picture = toProcess.params.get("submit image");
				MVMap<String, OutfitSubmission> outfits = db.s.openMap("outfits");
				outfits.put(newSubmission.uniqueID, newSubmission);
				//Commit the changes to save to disk
				db.commit();


				
				

				toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
				return true;

			}
		
		
		return false;
	}


}