package wsyumi.jetty;

import org.eclipse.jetty.server.Server;

public class Jetty {
	public static void main(String... args) throws Exception {
		Server server = new Server(8080);
		server.start();
	}
}
