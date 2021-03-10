package rest.server;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	public static void main(String[] args) throws URISyntaxException, IOException {

		String baseUrl = "http://localhost:8090/rest";
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(new URI(baseUrl),
				new ResourceConfig(RestService.class), false);
		server.start();
		System.out.println("Server started with base-url=" + baseUrl + "...");
		System.out.println("use for customer info url=" + baseUrl + "/kunde/{kundenNummer}");

		RestService rest = new RestService();
		System.out.println(rest.getKunde(2));
	}

}
