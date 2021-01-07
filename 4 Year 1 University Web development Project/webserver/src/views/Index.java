package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.OutfitSubmission;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Index extends DynamicWebPage
{

	public Index(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("Index.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title>FAME</title>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"/HomepageStyle.css\"> </head>\n";
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
			stringToSendToWebBrowser += "  <div class=\"py-5\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"container\"><p class=\"side-comments\"> DO YOU HAVE A STYLE TO SHARE? </p></div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <center>\n";
			stringToSendToWebBrowser += "             <div class=\"container\"><a class=\"btn btn-primary btn-style\" href=\"MakeYourLook.html\">Submit A Look!</a></div>\n";
			stringToSendToWebBrowser += "          </center>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "           <div class=\"container\"><p class=\"side-comments\"> DON'T HESITATE! JOIN THE COMMUNITY! </p></div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"\">\n";
			stringToSendToWebBrowser += "    <div class=\"\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"p-0 col-md-4 col-6\">\n";
			stringToSendToWebBrowser += "          <center><a class=\"Kim Kardashians Makeup\" href=\"KimKardashianInglotMakeup.html\"><img src=\"https://inglot.ie/media/wysiwyg/Kim_K_Bridal_Contour.jpg\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center></div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
			stringToSendToWebBrowser += "         <center><a class=\"Chris Evans Hairstyle\" href=\"ChrisEvansHairstyle.html\"><img src=\"https://media1.popsugar-assets.com/files/thumbor/1moJFVCQtRzJ-KenuQvX6jHvr5U/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2016/05/05/861/n/1922398/8f460f64_edit_img_image_41205891_1462473507/i/Chris-Evans-Hot-Pictures.jpg\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
			stringToSendToWebBrowser += "          <center><a class=\"Hipster Look\" href=\"HipsterLook.html\"><img src=\"http://www2.pictures.zimbio.com/pc/Shia+LaBeouf+Shia+LaBeouf+Beard+Sweater+LA+eQUw3TDZOs_l.jpg\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></center></a> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
			stringToSendToWebBrowser += "          <center><a class=\"Summer Look\" href=\"SummerLook.html\"><img src=\"https://thefashiontag.com/wp-content/uploads/2015/05/cutoffs-summer-looks-styles-6.jpg\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
			stringToSendToWebBrowser += "          <center><a class=\"Jeff Winger Look\" href=\"JeffWingerStyle.html\"><img src=\"http://images5.fanpop.com/image/photos/31300000/Jeff-jeff-winger-31304349-500-500.gif\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center> </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
			stringToSendToWebBrowser += "          <center><a class=\"Dwight Schrute Look\" href=\"DwightSchruteLook.html\"><img src=\"https://pbs.twimg.com/profile_images/549268771484229632/WnatiHzT_400x400.jpeg\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center> </div>\n";
/*
			MVMap<String, OutfitSubmission> outfits = db.s.openMap("outfits");
			List<String> outfitKeys = outfits.keyList();
			for(int keyIndex=0; keyIndex<outfitKeys.size();keyIndex++)
			{
				String outfitUniqueID = outfitKeys.get(keyIndex);
				OutfitSubmission outfit = outfits.get(outfitUniqueID);
				
				{
					
					stringToSendToWebBrowser += "        <div class=\"col-md-4 col-6 p-0\">\n";
					stringToSendToWebBrowser += "          <center><a class=\"\" href=\""+ outfitUniqueID +".html\"><img src=\""+ outfit.picture +"\" class=\"\" height=\"400\" width=\"350\" align=\"middle\" hspace=\"55\"></a></center> </div>\n";

				}
				
				
			}

		*/	
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
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