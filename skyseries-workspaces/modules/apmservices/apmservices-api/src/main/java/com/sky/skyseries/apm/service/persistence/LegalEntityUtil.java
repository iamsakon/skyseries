/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sky.skyseries.apm.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sky.skyseries.apm.model.LegalEntity;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the legal entity service. This utility wraps {@link com.sky.skyseries.apm.service.persistence.impl.LegalEntityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntityPersistence
 * @see com.sky.skyseries.apm.service.persistence.impl.LegalEntityPersistenceImpl
 * @generated
 */
@ProviderType
public class LegalEntityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LegalEntity legalEntity) {
		getPersistence().clearCache(legalEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LegalEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LegalEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LegalEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LegalEntity update(LegalEntity legalEntity) {
		return getPersistence().update(legalEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LegalEntity update(LegalEntity legalEntity,
		ServiceContext serviceContext) {
		return getPersistence().update(legalEntity, serviceContext);
	}

	/**
	* Returns all the legal entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching legal entities
	*/
	public static List<LegalEntity> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the legal entities where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @return the range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the legal entities where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the legal entities where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public static LegalEntity findByUuid_First(java.lang.String uuid,
		OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public static LegalEntity findByUuid_Last(java.lang.String uuid,
		OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the legal entities before and after the current legal entity in the ordered set where uuid = &#63;.
	*
	* @param legalEntityId the primary key of the current legal entity
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next legal entity
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public static LegalEntity[] findByUuid_PrevAndNext(long legalEntityId,
		java.lang.String uuid, OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence()
				   .findByUuid_PrevAndNext(legalEntityId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the legal entities where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of legal entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching legal entities
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLegalEntityException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public static LegalEntity findByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the legal entity where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the legal entity that was removed
	*/
	public static LegalEntity removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of legal entities where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching legal entities
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the legal entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching legal entities
	*/
	public static List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the legal entities where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @return the range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the legal entities where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the legal entities where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching legal entities
	*/
	public static List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public static LegalEntity findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public static LegalEntity findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static LegalEntity fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the legal entities before and after the current legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param legalEntityId the primary key of the current legal entity
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next legal entity
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public static LegalEntity[] findByUuid_C_PrevAndNext(long legalEntityId,
		java.lang.String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(legalEntityId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the legal entities where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of legal entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching legal entities
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the legal entity in the entity cache if it is enabled.
	*
	* @param legalEntity the legal entity
	*/
	public static void cacheResult(LegalEntity legalEntity) {
		getPersistence().cacheResult(legalEntity);
	}

	/**
	* Caches the legal entities in the entity cache if it is enabled.
	*
	* @param legalEntities the legal entities
	*/
	public static void cacheResult(List<LegalEntity> legalEntities) {
		getPersistence().cacheResult(legalEntities);
	}

	/**
	* Creates a new legal entity with the primary key. Does not add the legal entity to the database.
	*
	* @param legalEntityId the primary key for the new legal entity
	* @return the new legal entity
	*/
	public static LegalEntity create(long legalEntityId) {
		return getPersistence().create(legalEntityId);
	}

	/**
	* Removes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity that was removed
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public static LegalEntity remove(long legalEntityId)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().remove(legalEntityId);
	}

	public static LegalEntity updateImpl(LegalEntity legalEntity) {
		return getPersistence().updateImpl(legalEntity);
	}

	/**
	* Returns the legal entity with the primary key or throws a {@link NoSuchLegalEntityException} if it could not be found.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public static LegalEntity findByPrimaryKey(long legalEntityId)
		throws com.sky.skyseries.apm.exception.NoSuchLegalEntityException {
		return getPersistence().findByPrimaryKey(legalEntityId);
	}

	/**
	* Returns the legal entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity, or <code>null</code> if a legal entity with the primary key could not be found
	*/
	public static LegalEntity fetchByPrimaryKey(long legalEntityId) {
		return getPersistence().fetchByPrimaryKey(legalEntityId);
	}

	public static java.util.Map<java.io.Serializable, LegalEntity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the legal entities.
	*
	* @return the legal entities
	*/
	public static List<LegalEntity> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the legal entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @return the range of legal entities
	*/
	public static List<LegalEntity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the legal entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of legal entities
	*/
	public static List<LegalEntity> findAll(int start, int end,
		OrderByComparator<LegalEntity> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the legal entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of legal entities
	*/
	public static List<LegalEntity> findAll(int start, int end,
		OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the legal entities from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of legal entities.
	*
	* @return the number of legal entities
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LegalEntityPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LegalEntityPersistence, LegalEntityPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LegalEntityPersistence.class);
}