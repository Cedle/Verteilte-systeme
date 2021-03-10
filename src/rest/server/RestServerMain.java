package rest.server;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class RestServerMain {

	public static void main(String[] args) throws URISyntaxException, IOException {

		String baseUrl = "http://localhost:8090/rest"; // TODO Auto-generated method stub final
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(new URI(baseUrl),
				new ResourceConfig(RestTaskService.class), false);
		server.start();
		System.out.println("Server started with base-url=" + baseUrl + "...");
		System.out.println("use for all users url=" + baseUrl + "/kundenservice/all");

		RestTaskService rest = new RestTaskService();
		System.out.println(rest.getKunde(2));
	}

}
