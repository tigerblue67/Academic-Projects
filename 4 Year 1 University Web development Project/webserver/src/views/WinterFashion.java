package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class WinterFashion extends DynamicWebPage
{

	public WinterFashion(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("WinterFashion.html"))
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
			stringToSendToWebBrowser += "  <title>Ultimate Guide Autumn/Winter 2018</title>\n";
			stringToSendToWebBrowser += "</head>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "<body>\n";
			stringToSendToWebBrowser += "  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n";
			stringToSendToWebBrowser += "  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:180px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo&nbsp;&nbsp;\n";
			stringToSendToWebBrowser += "    <img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\"> </pingendo>\n";
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
			stringToSendToWebBrowser += "    <h1> Ultimate Guide Autumn/Winter 2018 </h1>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"contaier\" id=\"img\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\" align=\"center\">\n";
			stringToSendToWebBrowser += "      <img class=\"img-responsive\" height=\"1215\" src=\"outfit.jpg\" width=\"810\"> </div>\n";
			stringToSendToWebBrowser += "  </div>\n";
			stringToSendToWebBrowser += "  <div class=\"container\" id=\"paragraph\">\n";
			stringToSendToWebBrowser += "    <div class=\"col-md-12\">\n";
			stringToSendToWebBrowser += "      <p> What drives the escalating fascination with haute couture in ready-to-wear? Ringing out the shows in New York, Marc Jacobs amplified his ongoing romance with the sculptural drama of savoir faire on Wednesday evening. His ceremonious collection -\n";
			stringToSendToWebBrowser += "        presented in a dark Park Lane Armory lit theatrically by spotlights, to a funereal Philip Glass choir score orchestrated by Steve Mackie - played all the polygonal keys, bending exaggerated sizes in and out of shape on the body. The heads of women\n";
			stringToSendToWebBrowser += "        were wrapped in scarves to 1980s Parisian heights, then crowned with wide-brimmed planter hats by Stephen Jones, their shoulders draped in great big scarves and stoles. Jacobs evades post-show comment, so you could only imagine what might have\n";
			stringToSendToWebBrowser += "        adorned his mood board: the broad-shouldered costumes and hoods of Grace Jones, the gargantuan suits of David Byrne, or the mummifying ensembles of Dominique Deveraux in Dynasty.\n";
			stringToSendToWebBrowser += "        <br>\n";
			stringToSendToWebBrowser += "        <br> Costume designer Nolan Miller imbued the boardroom feminists of that TV show with the cuts and styling of haute couture as well as the ideas of the 1980s\u00C3\u00A2\u00C2\u0080\u00C2\u0099 most radical designers such as Claude Montana, Thierry Mugler and Emanuel Ungaro to establish\n";
			stringToSendToWebBrowser += "        their power looks in Denver\u00C3\u00A2\u00C2\u0080\u00C2\u0099s male-driven oil industry. Jacobs\u00C3\u00A2\u00C2\u0080\u00C2\u0099 collection bore hints to all of the above, which brings us back to the question at hand: why is haute couture once again stomping its bombastic feet through the racks of ready-to-wear?\n";
			stringToSendToWebBrowser += "        The women\u00C3\u00A2\u00C2\u0080\u00C2\u0099s movements of recent months are an obvious factor - after all, couture rhymes with confidence - but trekking through endless New York Fashion Week collections this past week, designed from market strategy points of view and aimed so\n";
			stringToSendToWebBrowser += "        cynically at shifting product, Jacobs\u00C3\u00A2\u00C2\u0080\u00C2\u0099 fetish theatre of haute couture seemed positively rebellious.\n";
			stringToSendToWebBrowser += "        <br>\n";
			stringToSendToWebBrowser += "        <br> Tell this man he needs to sell more merchandise and he\u00C3\u00A2\u00C2\u0080\u00C2\u0099ll turn the other way, certain of the fact that the fantasy of fashion is what will save us all in the end. Marketeers will laugh at that notion, but if it\u00C3\u00A2\u00C2\u0080\u00C2\u0099s so ridiculous what is even the\n";
			stringToSendToWebBrowser += "        point of all these fashion shows in the first place? Nobody needs to see a plain shift dress or an office worker suit on a podium. It\u00C3\u00A2\u00C2\u0080\u00C2\u0099s not selling any more of them, and it\u00C3\u00A2\u00C2\u0080\u00C2\u0099s certainly not inspiring anything. The hallowed runways of fashion week\n";
			stringToSendToWebBrowser += "        were never meant to feature commercial daywear, deifying normality like that with bells on. You may look at Jacobs\u00C3\u00A2\u00C2\u0080\u00C2\u0099 show and think it unwearable but it\u00C3\u00A2\u00C2\u0080\u00C2\u0099s only because fashion hasn\u00C3\u00A2\u00C2\u0080\u00C2\u0099t lived up to the creative bar it set for itself in those glamorous,\n";
			stringToSendToWebBrowser += "        fabulous 1980s when even tailoring brands used their platforms to promote aspirational, avant-garde fashion to the masses. So rather than trapping this show in a box of crazy, why not embrace it as the new normal? Go on, give couture a chance.\n";
			stringToSendToWebBrowser += "        </p>\n";
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
			stringToSendToWebBrowser += "</body>\n";
			stringToSendToWebBrowser += "\n";
			stringToSendToWebBrowser += "</html>\n";
			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
			return true;
		}
		return false;
	}

}