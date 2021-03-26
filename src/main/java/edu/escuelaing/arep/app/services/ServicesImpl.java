package edu.escuelaing.arep.app.services;

import edu.escuelaing.arep.app.model.Raiz;

/**
 * Class that implements the services of the Services.
 */
public class ServicesImpl implements Services {

    /**
     * Does the square root calculation
     *
     * @param number The number to be calculate.
     * @return The Raiz Object with the response.
     */
    @Override
    public Raiz getSquareRoot(Double number) {
        Double sqrt = Math.sqrt(number);
        return new Raiz("sqrt", number, sqrt);
    }

}