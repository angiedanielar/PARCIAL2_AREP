package edu.escuelaing.arep.app;

import com.google.gson.Gson;
import edu.escuelaing.arep.app.model.Raiz;
import edu.escuelaing.arep.app.services.Services;
import edu.escuelaing.arep.app.services.ServicesImpl;
import spark.Request;
import spark.Response;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Spark web App that calculates the square root
 */
public class App {

    private static final Services services = new ServicesImpl();
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        port(getPort());
        get("/sqrt", App::sqrtHandler);
    }

    /**
     * Does the square root calculation
     *
     * @param request The HTTP request.
     * @param response The HTTP response.
     * @return The square root of the number.
     */
    private static Object sqrtHandler(Request request, Response response) {
        Double value = Double.parseDouble(request.queryParams("value"));
        Raiz square = services.getSquareRoot(value);
        System.out.println("Square Root Request For " + request.ip());
        response.header("Content-Type", "application/json");
        return gson.toJson(square);
    }

    /**
     * Get the port of the web app.
     *
     * @return The value of the port configured in the system environment, returns 4567 by default.
     */
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}