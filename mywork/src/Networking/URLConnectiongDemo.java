package Networking;


import java.io.IOException;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectiongDemo {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.hao123.com");
		URLConnection urlc=url.openConnection();
		System.out.println(urlc.getContentLength());
		System.out.println(urlc.getContentType());
		
		
	}

}
