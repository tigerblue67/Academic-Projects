package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.Comment;
import model.Newsletter;
import model.OutfitBreakdown;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class KimKardashianInglotMakeup extends DynamicWebPage
{
	public KimKardashianInglotMakeup(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("KimKardashianInglotMakeup.html"))
		{
			OutfitBreakdown outfit = new OutfitBreakdown();
			outfit.mainTitle = "Kim Kardashians Makeup Look";
			outfit.mainDesc = "This makeup look that you can see Kim Kardashian fashioning was created through the use of INGLOT exclusive tools and makeup products. The exact tools used and cosmetics to get this gorgeous look can be found down below!";
			outfit.mainIMG = "https://inglot.ie/media/wysiwyg/Kim_K_Bridal_Contour.jpg";
			outfit.sec1Desc = "A creamy transfer resistant concealer that blends perfectly without clogging pores. Superior mattifying agents ensure a long lasting matte finish, leaving the skin protected and textural differences smoothed. Also available in white, yellow, and green for the skin that needs special treatment.";
			outfit.sec1Title = "INGLOT Cream Concealer";
			outfit.sec1IMG = "CreamConcealer.png";
			outfit.sec1URL = "https://inglotuk.com/concealer/100-cream-concealer";
			outfit.sec2Desc = "An excellent bronzer that allows to develop an even bronze color on the skin without the sun. Long lasting, non streaking liquid which can be used all over the body without staining clothes. For a more subtle effect mix with a moisturizer.";
			outfit.sec2Title = "INGLOT AMC Face and Body Bronzer";
			outfit.sec2IMG = "AmcFaceBodyBronzer.png";
			outfit.sec2URL = "https://inglotuk.com/bronzer/94-amc-face-body-bronzer-150-ml";
			outfit.sec3Desc = "A universal eye shadow brush; perfect for application and blending.";
			outfit.sec3Title = "Makeup Brush 16PP";
			outfit.sec3IMG = "MakeupBrush16PP.png";
			outfit.sec3URL = "https://inglotuk.com/eye-brushes/121-makeup-brush-16pp";
			outfit.sec4Desc = "A light coloured highlight perfect for bringing out the contours!";
			outfit.sec4Title = "INGLOT AMC White Highlighting Powder";
			outfit.sec4IMG = "InglotAMCWhiteHighlightingPowder.png";
			outfit.sec4URL = "https://www.makeupalley.com/product/showreview.asp/ItemId=167020/AMC-white-highlighting-powder/Inglot/Pressed-Powders";
			outfit.sec5Desc = "This gentle brush is not only perfect for powder, but perfectly suitable for application of primer or foundation; apply in circular motion.";
			outfit.sec5Title = "Makeup Brush 27TG";
			outfit.sec5IMG = "MakeupBrush27TG.png";
			outfit.sec5URL = "https://inglotcosmetics.com/brushes/face-brushes/item/573-makeup-brush-27tg";
			outfit.sec6Desc = "Best used with INGLOT Face Blush, Pressed Powder, Bronzing Powder! This brush is double sided, multifunctional, perfect for contour lines.";
			outfit.sec6Title = "Face Brush 24SS";
			outfit.sec6IMG = "MakeupBrush24SS.png";
			outfit.sec6URL = "https://inglotuk.com/face-brushes/131-makeup-brush-24ss";
			
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title>Kim Kardashians Makeup</title>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"/KimKardashianInglotMakeup.css\"> </head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n";
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
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"AboutUs.html\">About Us</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"FAQ.html\">FAQ</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"NewsPage.html\">News</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "          <li class=\"nav-item\">\n";
			stringToSendToWebBrowser += "            <a class=\"nav-link\" href=\"SignIn.html\">Sign In/Sign Up</a>\n";
			stringToSendToWebBrowser += "          </li>\n";
			stringToSendToWebBrowser += "        </ul>\n";
			stringToSendToWebBrowser += "        <form class=\"form-inline m-0\">\n";
			stringToSendToWebBrowser += "          <input class=\"form-control mr-2\" type=\"text\" placeholder=\"Search\">\n";
			stringToSendToWebBrowser += "          <button class=\"btn btn-primary\" type=\"submit\">Search</button>\n";
			stringToSendToWebBrowser += "        </form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </nav>\n";
			stringToSendToWebBrowser += "  <div class=\"\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"display-1\">"+outfit.mainTitle+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.mainIMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-6\">\n";
			stringToSendToWebBrowser += "          <p class=\"\">"+outfit.mainDesc+"</p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec1Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec1IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec1Desc+"<br><a href=\""+outfit.sec1URL+"\" target=\"_blank\">"+outfit.sec1URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec2Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec2IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec2Desc+"<br><a href=\""+outfit.sec2URL+"\" target=\"_blank\">"+outfit.sec2URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec3Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec3IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec3Desc+"<br><a href=\""+outfit.sec3URL+"\" target=\"_blank\">"+outfit.sec3URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec4Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec4IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec4Desc+"<br><a href=\""+outfit.sec4URL+"\" target=\"_blank\">"+outfit.sec4URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec5Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec5IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec5Desc+"<br><a href=\""+outfit.sec5URL+"\" target=\"_blank\">"+outfit.sec5URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">"+outfit.sec6Title+"</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-3\">\n";
			stringToSendToWebBrowser += "          <img class=\"img-fluid d-block\" src=\""+outfit.sec6IMG+"\"> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-9\">\n";
			stringToSendToWebBrowser += "          <p class=\"lead\">"+outfit.sec6Desc+"<br><a href=\""+outfit.sec6URL+"\" target=\"_blank\">"+outfit.sec6URL+"</a></p>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "          <h1 class=\"\">Comments:</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\"> </div>\n";
			stringToSendToWebBrowser += "        <form action=\"/KimKardashianInglotMakeup.html/submit/comment\"> Username:\n";
			stringToSendToWebBrowser += "          <input type=\"text\" name=\"username\" class=\"username my-1\" maxlength=\"22\">\n";
			stringToSendToWebBrowser += "          <br> Comment:\n";
			stringToSendToWebBrowser += "          <textarea name=\"comment\" id=\"comment\" cols=\"130\" rows=\"3\"></textarea>\n";
			stringToSendToWebBrowser += "          <br>\n";
			stringToSendToWebBrowser += "          <input type=\"submit\" value=\"Submit\" class=\"submit-btn my-1\"></form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			
			MVMap<String, Comment> newComment = db.s.openMap("KimComments");
			List<String> commentKeys = newComment.keyList();
			
			for(int commentKeyIndex = 0; commentKeyIndex < commentKeys.size(); commentKeyIndex++)
			{
				String commentUniqueID = commentKeys.get(commentKeyIndex);
				Comment comments = newComment.get(commentUniqueID);
				stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
				stringToSendToWebBrowser += "    <div class=\"container\">\n";
				stringToSendToWebBrowser += "      <div class=\"row\">\n";
				stringToSendToWebBrowser += "        <div class=\"col-md-12\"> </div>\n";
				stringToSendToWebBrowser += "          <h1 class=\"\">"+comments.username+"</h1>\n";
				stringToSendToWebBrowser += "        	<div class=\"col-md-12\">\n";
				stringToSendToWebBrowser += "          <p>"+comments.comment+"</p>\n";
				stringToSendToWebBrowser += "      	</div>\n";
				stringToSendToWebBrowser += "      </div>\n";
				stringToSendToWebBrowser += "    </div>\n";
				stringToSendToWebBrowser += "  </div>\n";
			}
			
			{
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
				stringToSendToWebBrowser += "            <a href=\"https://goo.gl/maps/AUq7b9W7yYJ2\" class=\"text-white\" target=\"_blank\"><i class=\"fa d-inline mr-3 fa-map-marker text-secondary\"></i>3</a>7 Malone Road, Suite 89, &nbsp; &nbsp; &nbsp; &nbsp; Belfast</p>\n";
				stringToSendToWebBrowser += "        </div>\n";
				stringToSendToWebBrowser += "        <div class=\"p-4 col-md-3\">\n";
				stringToSendToWebBrowser += "          <h2 class=\"mb-4 text-light\">Subscribe</h2>\n";
				stringToSendToWebBrowser += "           <fieldset class=\"form-group text-white\"> <label for=\"exampleInputEmail1\">Get our newsletter</label>\n";
				stringToSendToWebBrowser += "               <form action=\"/NewsletterPage.html/submit/newsletter\"><input type=\"email\" class=\"form-control\" placeholder=\"Enter email\"> </fieldset>\n";
				stringToSendToWebBrowser += "            <button type=\"submit\" class=\"btn btn-outline-secondary\">Submit</button>\n";
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
			}
			
			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\">\n";
			stringToSendToWebBrowser += "  </pingendo>\n";
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		
		else if(toProcess.path.equalsIgnoreCase("KimKardashianInglotMakeup.html/submit/comment"))
		{
			Comment newComment = new Comment();
			newComment.uniqueid = "comment"+System.currentTimeMillis();
			newComment.username = toProcess.params.get("username");
			newComment.comment = toProcess.params.get("comment");
			
			MVMap<String, Comment> commentsMap = db.s.openMap("KimComments");
			commentsMap.put(newComment.uniqueid, newComment);
			
			db.commit();
			
			String url = "/KimKardashianInglotMakeup.html";
			toProcess.r = new WebResponse(WebResponse.HTTP_REDIRECT, WebResponse.MIME_HTML, "<html><body>Redirected: <a href=\""+url+"\">" + url + "</a></body></html>");
			toProcess.r.addHeader("Location", url);
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