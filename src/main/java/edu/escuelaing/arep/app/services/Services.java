package edu.escuelaing.arep.app.services;

import edu.escuelaing.arep.app.model.Raiz;

/**
 * Interface that generate the services of the App.
 */
public interface Services {

	/**
     * Does the square root calculation
     *
     * @param number The number to be calculate.
     * @return The Raiz Object with the response.
     */
	Raiz getSquareRoot(Double number);

}
