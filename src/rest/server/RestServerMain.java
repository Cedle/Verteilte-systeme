package rest.server;

import java.io.IOException;
import java.net.URISyntaxException;

public class RestServerMain {

	public static void main(String[] args) throws URISyntaxException, IOException {

		/*
		 * String baseUrl = "http://localhost:8090/rest"; // TODO Auto-generated method
		 * stub final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(new
		 * URI(baseUrl), new ResourceConfig(RestTaskService.class), false);
		 * server.start(); System.out.println("Server started with base-url=" + baseUrl
		 * + "..."); System.out.println("use for all users url=" + baseUrl +
		 * "/kundenservice/all");
		 */
		RestTaskService rest = new RestTaskService();
		System.out.println(rest.getKunde(2));
	}

}
