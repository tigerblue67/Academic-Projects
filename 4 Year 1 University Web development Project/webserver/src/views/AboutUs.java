package views;

import org.h2.mvstore.MVMap;

import model.AboutUsModel;
import model.Newsletter;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class AboutUs extends DynamicWebPage
{

	public AboutUs(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("AboutUs.html"))
		{
			
			AboutUsModel aboutUs = new AboutUsModel();
			aboutUs.URL = "AboutUsBanner.jpg";
			
			
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<style>\n";
			stringToSendToWebBrowser += "* {\n";
			stringToSendToWebBrowser += "    box-sizing: border-box;\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += ".zoom {\n";
			stringToSendToWebBrowser += "    padding: 50px;\n";
			stringToSendToWebBrowser += "    background-color: bg-light;\n";
			stringToSendToWebBrowser += "    transition: transform .2s;\n";
			stringToSendToWebBrowser += "    width: auto;\n";
			stringToSendToWebBrowser += "    height: auto\n";
			stringToSendToWebBrowser += "    margin: 0 auto;\n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += ".zoom:hover {\n";
			stringToSendToWebBrowser += "    -ms-transform: scale(1.5); /* IE 9 */\n";
			stringToSendToWebBrowser += "    -webkit-transform: scale(1.5); /* Safari 3-8 */\n";
			stringToSendToWebBrowser += "    transform: scale(1.5); \n";
			stringToSendToWebBrowser += "}\n";
			stringToSendToWebBrowser += "</style>\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\"> </head>\n";
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
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"AboutUs.html\">About Us</a>\n";
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
			stringToSendToWebBrowser += "  <div class=\"py-5 text-center text-white opaque-overlay\" style=\"background-image: url('AboutUsBanner.jpg');background-size:cover;\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-6\"></div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6 p-4\">\n";
			stringToSendToWebBrowser += "          <p></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5 text-center bg-light\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h3 class=\"display-3\" contenteditable=\"true\">About Us</h3>\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">Shop the latest fashion clothing at FAME, keep on top of the latest trends, and find celeb inspired styles. FAME can help you find where your favourite celebrities buy their clothes and how you can get their look.</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 p-4\">\n";
			stringToSendToWebBrowser += "        <p><a href=\"GetTheLook.html\">\n";
			stringToSendToWebBrowser += "         <div class=\"zoom\"><img class=\"img-fluid d-block rounded-circle ml-auto mx-auto\" src=\"Image1.jpg\" width=\"250\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "250\" >\n";
			stringToSendToWebBrowser += "  <div class=\"middle\">\n";
			stringToSendToWebBrowser += "  </div></a></p></div>\n";
			stringToSendToWebBrowser += "          <p class=\"my-4\"><i>Browse through our wide collection of pre-set looks and keep on top of all the latest trends</i></p>\n";
			stringToSendToWebBrowser += "          <h1>Get The Look\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "          </h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 p-4\">\n";
			stringToSendToWebBrowser += "        <p><a href=\"MakeYourLook.html\">\n";
			stringToSendToWebBrowser += "          <div class=\"zoom\"><img class=\"img-fluid d-block rounded-circle mx-auto\" src=\"Image2.jpg\" width=\"250\">\n";
			stringToSendToWebBrowser += "  <div class=\"middle\">\n";
			stringToSendToWebBrowser += "  </a></p></div></div>\n";
			stringToSendToWebBrowser += "          <p class=\"my-4\"><i>Inspire others by submitting your own looks and style</i>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "          </p>\n";
			stringToSendToWebBrowser += "          <h1>Submit your Look\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "          </h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 p-4\">\n";
			stringToSendToWebBrowser += "        <p><a href=\"NewsPage.html\">\n";
			stringToSendToWebBrowser += "          <div class=\"zoom\"><img class=\"img-fluid d-block rounded-circle mx-auto\" src=\"Image3.jpg\" width=\"250\">\n";
			stringToSendToWebBrowser += "  <div class=\"middle\">\n";
			stringToSendToWebBrowser += "  </a></p></div></div>\n";
			stringToSendToWebBrowser += "          <p class=\"my-4\"><i>Keep up to date with the latest fashion news and celebrity trends</i></p>\n";
			stringToSendToWebBrowser += "          <h1>Fashion News\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "          </h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"bg-dark text-white\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h3 class=\"display-4\">&nbsp; &nbsp;FAME\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "          </h3>\n";
			stringToSendToWebBrowser += "          <div class=\"row\">\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-4  text-center align-self-center\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://www.facebook.com/\" target=\"_blank\"><i class=\"fa fa-fw fa-facebook fa-3x text-white mx-3\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-4  text-center align-self-center\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://twitter.com/CSC1009_FAME\" target=\"_blank\"><i class=\"fa fa-fw fa-twitter fa-3x text-white mx-3\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "            <div class=\"col-md-4  text-center align-self-center\">\n";
			stringToSendToWebBrowser += "              <a href=\"https://www.instagram.com/fame_vevo\" target=\"_blank\"><i class=\"fa fa-fw fa-instagram fa-3x text-white mx-3\"></i></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-secondary\"></h2>\n";
			stringToSendToWebBrowser += "          <ul class=\"list-unstyled\"></ul>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4\">Contact</h2>\n";
			stringToSendToWebBrowser += "          <p>\n";
			stringToSendToWebBrowser += "            <a href=\"tel:+246 - 542 550 5462\" class=\"text-white\"><i class=\"fa d-inline mr-3 text-secondary fa-phone\"></i>+(028)&nbsp;</a>9147-9872</p>\n";
			stringToSendToWebBrowser += "          <p>\n";
			stringToSendToWebBrowser += "            <a href=\"mailto:info@pingendo.com\" class=\"text-white\"><i class=\"fa d-inline mr-3 text-secondary fa-envelope-o\"></i>info@FAME.com</a>\n";
			stringToSendToWebBrowser += "          </p>\n";
			stringToSendToWebBrowser += "          <p>\n";
			stringToSendToWebBrowser += "            <a href=\"https://goo.gl/maps/AUq7b9W7yYJ2\" class=\"text-white\" target=\"_blank\"><i class=\"fa d-inline mr-3 fa-map-marker text-secondary\"></i></a>17 Malone Road, Suite 89, &nbsp; &nbsp; &nbsp; &nbsp; Belfast</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
			stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-light\">Subscribe</h2>\n";
			stringToSendToWebBrowser += "          <form action=\"/NewsletterPage.html/submit/newsletter\">\n";
			stringToSendToWebBrowser += "            <fieldset class=\"form-group text-white\"> <label for=\"exampleInputEmail1\">Get our newsletter</label>\n";
			stringToSendToWebBrowser += "              <input type=\"email\" class=\"form-control\" placeholder=\"Enter email\"> </fieldset>\n";
			stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-outline-secondary\">Submit</button>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12 mt-3\"> </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12 mt-3\">\n";
			stringToSendToWebBrowser += "          <p class=\"text-center text-white\">\u00C2\u00A9 Copyright 2018 FAME - All rights reserved. </p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		
		else if(toProcess.path.equalsIgnoreCase("NewsletterPage.html/submit/newsletter"))
		{
			Newsletter newLetter = new Newsletter();
			newLetter.uniqueid = "newsletter"+System.currentTimeMillis();
			newLetter.email = toProcess.params.get("email");
			
			MVMap<String, Newsletter> letterMap = db.s.openMap("Newsletter");
			letterMap.put(newLetter.uniqueid, newLetter);
			
			db.commit();
			
			String url = "/NewsletterPage.html";
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML, "<html><body>Redirected: <a href=\""+url+"\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
			return true;
		}
		
		return false;
	}

}