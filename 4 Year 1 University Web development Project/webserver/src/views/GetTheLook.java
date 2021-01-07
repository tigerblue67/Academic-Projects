package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;
import model.OutfitSubmission;

import java.util.List;

import org.h2.mvstore.MVMap;

import model.Components;

public class GetTheLook extends DynamicWebPage
{

	public GetTheLook(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}
	public static String outfitUniqueID;
	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("GetTheLook.html"))
		{
			String stringToSendToWebBrowser = "";
			stringToSendToWebBrowser += "<!DOCTYPE html>\n";
			stringToSendToWebBrowser += "<html>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<head>\n";
			stringToSendToWebBrowser += "  <title>Get The Look</title>\n";
			stringToSendToWebBrowser += "  <meta charset=\"utf-8\">\n";
			stringToSendToWebBrowser += "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"https://v40.pingendo.com/assets/4.0.0/default/theme.css\" type=\"text/css\">\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.1.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\n";
			stringToSendToWebBrowser += "  <link rel=\"stylesheet\" href=\"/GetTheLook.css\"> </head>\n";			
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <nav class=\"navbar navbar-expand-md bg-secondary navbar-dark\">\n";
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
			stringToSendToWebBrowser += "          <h1 class=\"\">Get The Look\n";
			stringToSendToWebBrowser += "            <br> </h1>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "    </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"\">\n";
			stringToSendToWebBrowser += "    <div class=\"container\">\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "            <div>\n";
			stringToSendToWebBrowser += "              <a class=\"Kim Kardashians Makeup\" href=\"KimKardashianInglotMakeup.html\"><img class=\"Kim Kardashians Makeup home-image\" src=\"https://inglot.ie/media/wysiwyg/Kim_K_Bridal_Contour.jpg\" alt=\"Card image cap\"></a></div>\n";
			stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "              <a class=\"Kim Kardashians Makeup\" href=\"KimKardashianInglotMakeup.html\"><h5 class=\"card-title\">Kim Kardashians Makeup</h5></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "            <div>\n";
			stringToSendToWebBrowser += "               <a class=\"Chris Evans Hairstyle\" href=\"ChrisEvansHairstyle.html\"><img class=\"Chris Evans Hairstyle  home-image\" alt=\"Card image cap\" src=\"https://media1.popsugar-assets.com/files/thumbor/1moJFVCQtRzJ-KenuQvX6jHvr5U/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2016/05/05/861/n/1922398/8f460f64_edit_img_image_41205891_1462473507/i/Chris-Evans-Hot-Pictures.jpg\"></a></div>\n";
			stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "              <a class=\"Chris Evans Hairstyle\" href=\"ChrisEvansHairstyle.html\"><h5 class=\"card-title\">Chris Evans Hairstyle</h5></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "            <div>\n";
			stringToSendToWebBrowser += "              <a class=\"Hipster Look\" href=\"HipsterLook.html\"><img class=\"Hipster Look home-image\" src=\"http://www2.pictures.zimbio.com/pc/Shia+LaBeouf+Shia+LaBeouf+Beard+Sweater+LA+eQUw3TDZOs_l.jpg\" alt=\"Card image cap\"></a>\n";
			stringToSendToWebBrowser += "              <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "                <a class=\"Hipster Look\" href=\"HipsterLook.html\"><h5 class=\"card-title\">Hipster Look</h5></a>\n";
			stringToSendToWebBrowser += "              </div>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "      </div>\n";
			stringToSendToWebBrowser += "      <div class=\"row\">\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "            <div>\n";
			stringToSendToWebBrowser += "              <a class=\"Summer Look\" href=\"SummerLook.html\"><img class=\"Summer Look home-image\" src=\"https://thefashiontag.com/wp-content/uploads/2015/05/cutoffs-summer-looks-styles-6.jpg\" alt=\"Card image cap\"> </div></a>\n";
			stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "              <a class=\"Summer Look\" href=\"SummerLook.html\"><h5 class=\"card-title\">Summer Look</h5></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "           <a class=\"Jeff Winger Style\" href=\"JeffWingerStyle.html\"> <img class=\"Jeff Winger Style home-image\" src=\"http://images5.fanpop.com/image/photos/31300000/Jeff-jeff-winger-31304349-500-500.gif\" alt=\"Card image cap\"></a>\n";
			stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "              <a class=\"Jeff Winger Style\" href=\"JeffWingerStyle.html\"><h5 class=\"card-title\">Jeff Winger Style</h5></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			stringToSendToWebBrowser += "        <div class=\"col-md-4\">\n";
			stringToSendToWebBrowser += "          <div class=\"card\">\n";
			stringToSendToWebBrowser += "           <a class=\"Dwight Schrute Look\" href=\"DwightSchruteLook.html\"> <img class=\"Dwight Schrute Look home-image\" src=\"https://pbs.twimg.com/profile_images/549268771484229632/WnatiHzT_400x400.jpeg\" alt=\"Card image cap\"></a>\n";
			stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
			stringToSendToWebBrowser += "              <a class=\"Dwight Schrute Look\" href=\"DwightSchruteLook.html\"><h5 class=\"card-title\">Dwight Schrute Look</h5></a>\n";
			stringToSendToWebBrowser += "            </div>\n";
			stringToSendToWebBrowser += "          </div>\n";
			stringToSendToWebBrowser += "        </div>\n";
			
			MVMap<String, OutfitSubmission> outfits = db.s.openMap("outfits");
			List<String> outfitKeys = outfits.keyList();
			for(int keyIndex=0; keyIndex<outfitKeys.size();keyIndex++)
			{
				outfitUniqueID = outfitKeys.get(keyIndex);
				OutfitSubmission outfit = outfits.get(outfitUniqueID);
				
				{
					
					stringToSendToWebBrowser += "        <div id=\"Outfit Card\">\n";
					stringToSendToWebBrowser += "          <div class=\"card\">\n";
					stringToSendToWebBrowser += "           <a class=\"\" href=\"Template.html/?outID="+outfitUniqueID+"\"> <img class=\"\" src=\"" +outfit.picture+ "\" alt=\"Card image cap\"></a>\n";
					stringToSendToWebBrowser += "            <div class=\"card-body\">\n";
					stringToSendToWebBrowser += "              <a class=\"\" href=\"Template.html/?outID="+outfitUniqueID+"\"><h5 class=\"card-title\">" + outfit.title + "</h5></a>\n";
					stringToSendToWebBrowser += "            </div>\n";
					stringToSendToWebBrowser += "          </div>\n";
					stringToSendToWebBrowser += "        </div>\n";	
					
				}
				
				
			}

			
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