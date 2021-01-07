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