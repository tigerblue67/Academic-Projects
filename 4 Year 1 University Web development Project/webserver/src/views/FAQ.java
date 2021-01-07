package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class FAQ extends DynamicWebPage
{

	public FAQ(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("FAQ.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"theme.css\" type=\"text/css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "<nav class=\"navbar navbar-expand-md bg-secondary navbar-dark\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <a class=\"navbar-brand\" href=\"index.html\">FAME</a>\n";
			stringToSendToWebBrowser += "      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n";
			stringToSendToWebBrowser += "      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n";
			stringToSendToWebBrowser += "        <ul class=\"navbar-nav mr-auto\">\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"GetTheLook.html\">GetThatLook</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"MakeYourLook.html\">SubmitYourLook</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"AboutUs.html\">About</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"ContactUs.html\">Contact us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"NewsPage.html\">News Page</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"FAQ.html\">FAQ</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link text-white\" href=\"SignIn.html\">Sign In / SIgn Up</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "        </ul>\n";
			stringToSendToWebBrowser += "        <form class=\"form-inline m-0\">\n";
			stringToSendToWebBrowser += "          <input class=\"form-control mr-2\" type=\"text\" placeholder=\"Search\">\n";
			stringToSendToWebBrowser += "          <button class=\"btn btn-primary\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "        </form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </nav>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">This is the FAQ page where the generic questions for the user will be displayed</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-5\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <p class=\"\">Paragraph. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"text-white bg-dark\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"p-5 col-md-3\"> <i class=\"fa fa-5x mb-5 fa-diamond\"></i>\n";
			stringToSendToWebBrowser += "          <h3 class=\"mb-4\">FAME</h3>\n";
			stringToSendToWebBrowser += "          <ul class=\"list-unstyled\">\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">Home</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">About us</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">Our services</a>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <a href=\"#\" class=\"text-white\">Testimonials</a>\n";
			stringToSendToWebBrowser += "          </ul>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-5 col-md-4\">\n";
			stringToSendToWebBrowser += "          <h3 class=\"mb-4\">Latest post</h3>\n";
			stringToSendToWebBrowser += "          <p>\"<i>Here you can insert the latest news from your business. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</i>\" &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <br>\n";
			stringToSendToWebBrowser += "            <br>\"<i>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat</i>\"</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"p-5 col-md-5\">\n";
			stringToSendToWebBrowser += "          <h3>Get in touch</h3>\n";
			stringToSendToWebBrowser += "          <form class=\"my-4\">\n";
			stringToSendToWebBrowser += "            <fieldset class=\"form-group\"> <label for=\"exampleInputEmail1\">Get monthly updates</label>\n";
			stringToSendToWebBrowser += "              <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Enter email\"> </fieldset>\n";
			stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-outline-light\">Submit</button>\n";
			stringToSendToWebBrowser += "          </form>\n";
			stringToSendToWebBrowser += "          <h3 class=\"mt-5\">Social</h3>\n";
			stringToSendToWebBrowser += "          <div class=\"align-self-center col-12 my-4\">\n";
			stringToSendToWebBrowser += "            <a href=\"https://www.facebook.com\" target=\"_blank\"><i class=\"fa fa-facebook d-inline fa-lg mr-3 text-white\"></i></a>\n";
			stringToSendToWebBrowser += "            <a href=\"https://twitter.com\" target=\"_blank\"><i class=\"fa fa-twitter d-inline mx-3 fa-lg text-white\"></i></a>\n";
			stringToSendToWebBrowser += "            <a href=\"https://www.instagram.com\" target=\"_blank\"><i class=\"fa fa-instagram d-inline mx-3 fa-lg text-white\"></i></a>\n";
			stringToSendToWebBrowser += "            <a href=\"https://plus.google.com\" target=\"_blank\"><i class=\"fa fa-google-plus-official d-inline mx-3 fa-lg text-white\"></i></a>\n";
			stringToSendToWebBrowser += "            <a href=\"https://pinterest.com\" target=\"_blank\"><i class=\"fa fa-pinterest-p d-inline mx-3 fa-lg text-white\"></i></a>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12 mt-3\">\n";
			stringToSendToWebBrowser += "          <p class=\"text-center\">\u00C3\u0082\u00C2\u00A9 Copyright 2017 Pingendo - All rights reserved. </p>\n";
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
		return false;
	}

}