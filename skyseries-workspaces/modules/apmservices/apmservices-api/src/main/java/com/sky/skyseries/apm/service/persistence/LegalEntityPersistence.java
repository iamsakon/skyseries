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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sky.skyseries.apm.exception.NoSuchLegalEntityException;
import com.sky.skyseries.apm.model.LegalEntity;

/**
 * The persistence interface for the legal entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.persistence.impl.LegalEntityPersistenceImpl
 * @see LegalEntityUtil
 * @generated
 */
@ProviderType
public interface LegalEntityPersistence extends BasePersistence<LegalEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LegalEntityUtil} to access the legal entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the legal entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching legal entities
	*/
	public java.util.List<LegalEntity> findByUuid(java.lang.String uuid);

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
	public java.util.List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

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
	public java.util.List<LegalEntity> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public LegalEntity findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public LegalEntity findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

	/**
	* Returns the legal entities before and after the current legal entity in the ordered set where uuid = &#63;.
	*
	* @param legalEntityId the primary key of the current legal entity
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next legal entity
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public LegalEntity[] findByUuid_PrevAndNext(long legalEntityId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Removes all the legal entities where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of legal entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching legal entities
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLegalEntityException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public LegalEntity findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLegalEntityException;

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the legal entity where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the legal entity that was removed
	*/
	public LegalEntity removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLegalEntityException;

	/**
	* Returns the number of legal entities where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching legal entities
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the legal entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching legal entities
	*/
	public java.util.List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

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
	public java.util.List<LegalEntity> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public LegalEntity findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity
	* @throws NoSuchLegalEntityException if a matching legal entity could not be found
	*/
	public LegalEntity findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public LegalEntity fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

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
	public LegalEntity[] findByUuid_C_PrevAndNext(long legalEntityId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException;

	/**
	* Removes all the legal entities where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of legal entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching legal entities
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the legal entity in the entity cache if it is enabled.
	*
	* @param legalEntity the legal entity
	*/
	public void cacheResult(LegalEntity legalEntity);

	/**
	* Caches the legal entities in the entity cache if it is enabled.
	*
	* @param legalEntities the legal entities
	*/
	public void cacheResult(java.util.List<LegalEntity> legalEntities);

	/**
	* Creates a new legal entity with the primary key. Does not add the legal entity to the database.
	*
	* @param legalEntityId the primary key for the new legal entity
	* @return the new legal entity
	*/
	public LegalEntity create(long legalEntityId);

	/**
	* Removes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity that was removed
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public LegalEntity remove(long legalEntityId)
		throws NoSuchLegalEntityException;

	public LegalEntity updateImpl(LegalEntity legalEntity);

	/**
	* Returns the legal entity with the primary key or throws a {@link NoSuchLegalEntityException} if it could not be found.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity
	* @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	*/
	public LegalEntity findByPrimaryKey(long legalEntityId)
		throws NoSuchLegalEntityException;

	/**
	* Returns the legal entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity, or <code>null</code> if a legal entity with the primary key could not be found
	*/
	public LegalEntity fetchByPrimaryKey(long legalEntityId);

	@Override
	public java.util.Map<java.io.Serializable, LegalEntity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the legal entities.
	*
	* @return the legal entities
	*/
	public java.util.List<LegalEntity> findAll();

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
	public java.util.List<LegalEntity> findAll(int start, int end);

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
	public java.util.List<LegalEntity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator);

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
	public java.util.List<LegalEntity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the legal entities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of legal entities.
	*
	* @return the number of legal entities
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}