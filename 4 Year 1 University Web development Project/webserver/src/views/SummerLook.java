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

public class SummerLook extends DynamicWebPage
{
	public SummerLook(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("SummerLook.html"))
		{
			OutfitBreakdown outfit = new OutfitBreakdown();
			outfit.mainTitle = "Summer Look";
			outfit.mainDesc = "You can achieve this beutiful, summer look by purchasing the items found below! This outfit will give you the freedom to move and let you feel cool, whilst still looking good!";
			outfit.mainIMG = "https://thefashiontag.com/wp-content/uploads/2015/05/cutoffs-summer-looks-styles-6.jpg";
			outfit.sec1Desc = "Wales Rugby T Shirt - Torn Shirt Design, Cymru, 6 Nations Rugby, White and Red, Small Medium Large XL XXL. T-Shirts are 100% cotton.";
			outfit.sec1Title = "Summer Shirt";
			outfit.sec1IMG = "SummerShirt.png";
			outfit.sec1URL = "https://www.amazon.co.uk/Wales-Rugby-Shirt-Design-Nations/dp/B079TRZCGZ/ref=sr_1_5?ie=UTF8&qid=1520290118&sr=8-5&keywords=white+design+t-shirt";
			outfit.sec2Desc = "100% Cotton Fat Face Boy's Bramber Check Shirt";
			outfit.sec2Title = "The Summer Look Blue Shirt";
			outfit.sec2IMG = "SummerBlueShirt.png";
			outfit.sec2URL = "https://www.amazon.co.uk/Fat-Face-Bramber-Check-Shirt/dp/B0745RGJTB/ref=sr_1_9?ie=UTF8&qid=1520290076&sr=8-9&keywords=Blue+checkered+shirt";
			outfit.sec3Desc = "Women's short shorts in washed denim.";
			outfit.sec3Title = "Denim Shorts";
			outfit.sec3IMG = "SummerShorts.png";
			outfit.sec3URL = "https://www.amazon.co.uk/Womens-Washed-Denim-Shorts-Stretch/dp/B01DAGDRDC/ref=sr_1_1?s=clothing&ie=UTF8&qid=1520290155&sr=1-1&keywords=denim%2Bshorts%2Bwomens&th=1";
			
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title>Summer Look</title>\n";
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
			stringToSendToWebBrowser += "      <a class=\"navbar-brand\" href=\"Index.html\">FAME</a>\n";
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
			stringToSendToWebBrowser += "          <h1 class=\"\">Comments:</h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"py-1\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-12\"> </div>\n";
			stringToSendToWebBrowser += "        <form action=\"/SummerLook.html/submit/comment\"> Username:\n";
			stringToSendToWebBrowser += "          <input type=\"text\" name=\"username\" class=\"username my-1\" maxlength=\"22\">\n";
			stringToSendToWebBrowser += "          <br> Comment:\n";
			stringToSendToWebBrowser += "          <textarea name=\"comment\" id=\"comment\" cols=\"130\" rows=\"3\"></textarea>\n";
			stringToSendToWebBrowser += "          <br>\n";
			stringToSendToWebBrowser += "          <input type=\"submit\" value=\"Submit\" class=\"submit-btn my-1\"></form>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			
			MVMap<String, Comment> newComment = db.s.openMap("SummerComments");
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
		
		else if(toProcess.path.equalsIgnoreCase("SummerLook.html/submit/comment"))
		{
			Comment newComment = new Comment();
			newComment.uniqueid = "comment"+System.currentTimeMillis();
			newComment.username = toProcess.params.get("username");
			newComment.comment = toProcess.params.get("comment");
			
			MVMap<String, Comment> commentsMap = db.s.openMap("SummerComments");
			commentsMap.put(newComment.uniqueid, newComment);
			
			db.commit();
			
			String url = "/SummerLook.html";
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