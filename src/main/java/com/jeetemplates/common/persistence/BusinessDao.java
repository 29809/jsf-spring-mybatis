/**
 * 
 */
package com.jeetemplates.common.persistence;

import java.util.List;

import com.jeetemplates.common.model.BusinessEntity;

/**
 * Generic DAO Interface. CRUD methods.
 * 
 * @author jeetemplates
 */
public interface BusinessDao<BE extends BusinessEntity> {

	/**
	 * Create in database
	 * 
	 * @param entity
	 * @return entity persisted
	 */
	Long create(BE entity);

	/**
	 * Retrieve from database by id
	 * 
	 * @param id
	 * @return
	 */
	BE retrieveById(Long id);

	/**
	 * Retrieve all entries from database
	 * 
	 * @return
	 */
	List<BE> retrieveAll();

	/**
	 * Update entity in database
	 * 
	 * @param entity
	 *            : entity to update
	 * @return persisted entity
	 */
	BE update(BE entity);

	/**
	 * Delete from database by id
	 * 
	 * @param id
	 *            : entity's id to delete
	 */
	void deleteById(Long id);

}
