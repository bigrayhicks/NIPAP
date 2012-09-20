package jnipap;

import java.util.HashMap;

import jnipap.Connection;

/**
 * Base class for all NIPAP object classes (VRF, Pool, Prefix).
 *
 * Maintains an XML-RPC connection to the NIPAP daemon.
 *
 * @author Lukas Garberg <lukas@spritelink.net>
 */
abstract public class Jnipap {

	public Integer id;

	protected Connection conn;

	/**
	 * Save the object to NIPAP
	 */
	abstract public void save(Connection auth) throws JnipapException;

	/**
	 * Remove object from NIPAP
	 */
	abstract public void remove(Connection auth) throws JnipapException;


	/**
	 * Add value to hash map unless null.
	 *
	 * Helper function which adds an element to a HashMap unless the value is
	 * null.
	 */
	protected void putUnlessNull(HashMap hash, Object key, Object value) {

		if (value != null) {
			hash.put(key, value);
		}

	}

}
