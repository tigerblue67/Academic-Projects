package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class NYFW extends DynamicWebPage
{

	public NYFW(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("NYFW.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <title>Tectonic Plates Are Shifting In New York Fashion</title>\n";
			stringToSendToWebBrowser += "</head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
stringToSendToWebBrowser += "\t  <nav class=\"navbar navbar-expand-md bg-secondary navbar-dark\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <a class=\"navbar-brand\" href=\"Homepage.html\">FAME</a>\n";
			stringToSendToWebBrowser += "      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n";
			stringToSendToWebBrowser += "      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n";
			stringToSendToWebBrowser += "        <ul class=\"navbar-nav mr-auto\">\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"GetTheLook.html\">Get The Look</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"MakeYourLook.html\">Sumbit A Look</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"ContactUs.html\">Contact Us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"AboutUs.html\">About Us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"FAQ.html\">FAQ</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"NewsPage.html\">News</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"SignIn.html\">Sign In/Sign Up</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "        </ul>\n";
			stringToSendToWebBrowser += "        <form class=\"form-inline m-0\">\n";
			stringToSendToWebBrowser += "          <input class=\"form-control mr-2\" type=\"text\" placeholder=\"Search\">\n";
			stringToSendToWebBrowser += "          <button class=\"btn btn-primary\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "        </form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </nav>\n";
			
			stringToSendToWebBrowser += "  <div id=\"title\" class=\"container\" align=\"center\">\n";
			stringToSendToWebBrowser += "    <h1> Tectonic Plates Are Shifting In New York Fashion </h1>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"contaier\" id=\"img\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\" align=\"center\">\n";
			stringToSendToWebBrowser += "      <img class=\"img-responsive\" height=\"455\" src=\"NYFW.jpg\" width=\"810\"> </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"container\" id=\"paragraph\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "      <p> New designers at established houses, a fade-out of uptown style and a confusion of names jostling downtown - the New York fashion week was a hub of confusion.\n";
			stringToSendToWebBrowser += "        <br>\n";
			stringToSendToWebBrowser += "        <br> Yet this was only reflecting what has happened - or is on the way - in other cities, as long-established names pass the flame, often to young designers who want to keep their own-label businesses.\n";
			stringToSendToWebBrowser += "        <br>\n";
			stringToSendToWebBrowser += "        <br>Occasionally, this two-way designer plan works, as with Monse. After a strong showing as joint designers for Oscar de la Renta, a lively film shot among the funfair of Coney Island was the way that Fernando Garcia and Laura Kim presented their\n";
			stringToSendToWebBrowser += "        personal vision. With Nicki Minaj on the soundtrack and a carnival spirit, the clothes were mostly riffs on classic pieces, so that a plain beige raincoat might have a checkered jacket worked on top.\n";
			stringToSendToWebBrowser += "        <br>\n";
			stringToSendToWebBrowser += "        <br> Charming as these mix-and-meld effects might look in moving or still images, there is no substitute for seeing live what appeared to be half a zippered cardigan or a newspaper print (which John Galliano owns in fashion history). 'International\n";
			stringToSendToWebBrowser += "        Monse' was a tagline printed on some of the outfits. And with their quirky, fresh and individual look - and the exposure via the house of de la Renta - these two may make it internationally </p>\n";
			stringToSendToWebBrowser += "      <div class=\"bb-embed bb-embed--video \" align=\"center\">\n";
			stringToSendToWebBrowser += "        <iframe width=\"1120\" height=\"630\" src=\"https://www.youtube.com/embed/rn5q-ejStOc\" frameborder=\"0\" allowfullscreen=\"\"></iframe>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "  </pingendo>\n";
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
		return false;
	}

}