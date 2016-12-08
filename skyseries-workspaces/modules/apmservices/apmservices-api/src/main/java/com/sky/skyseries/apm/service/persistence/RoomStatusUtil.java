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

import com.sky.skyseries.apm.model.RoomStatus;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the room status service. This utility wraps {@link com.sky.skyseries.apm.service.persistence.impl.RoomStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatusPersistence
 * @see com.sky.skyseries.apm.service.persistence.impl.RoomStatusPersistenceImpl
 * @generated
 */
@ProviderType
public class RoomStatusUtil {
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
	public static void clearCache(RoomStatus roomStatus) {
		getPersistence().clearCache(roomStatus);
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
	public static List<RoomStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RoomStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RoomStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RoomStatus update(RoomStatus roomStatus) {
		return getPersistence().update(roomStatus);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RoomStatus update(RoomStatus roomStatus,
		ServiceContext serviceContext) {
		return getPersistence().update(roomStatus, serviceContext);
	}

	/**
	* Returns all the room statuses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching room statuses
	*/
	public static List<RoomStatus> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the room statuses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @return the range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the room statuses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the room statuses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<RoomStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first room status in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room status
	* @throws NoSuchRoomStatusException if a matching room status could not be found
	*/
	public static RoomStatus findByUuid_First(java.lang.String uuid,
		OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first room status in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last room status in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room status
	* @throws NoSuchRoomStatusException if a matching room status could not be found
	*/
	public static RoomStatus findByUuid_Last(java.lang.String uuid,
		OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last room status in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the room statuses before and after the current room status in the ordered set where uuid = &#63;.
	*
	* @param roomStatusId the primary key of the current room status
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next room status
	* @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	*/
	public static RoomStatus[] findByUuid_PrevAndNext(long roomStatusId,
		java.lang.String uuid, OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence()
				   .findByUuid_PrevAndNext(roomStatusId, uuid, orderByComparator);
	}

	/**
	* Removes all the room statuses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of room statuses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching room statuses
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the room status where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchRoomStatusException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching room status
	* @throws NoSuchRoomStatusException if a matching room status could not be found
	*/
	public static RoomStatus findByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the room status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the room status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the room status where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the room status that was removed
	*/
	public static RoomStatus removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of room statuses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching room statuses
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the room statuses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching room statuses
	*/
	public static List<RoomStatus> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the room statuses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @return the range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the room statuses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the room statuses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching room statuses
	*/
	public static List<RoomStatus> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<RoomStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first room status in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room status
	* @throws NoSuchRoomStatusException if a matching room status could not be found
	*/
	public static RoomStatus findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first room status in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last room status in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room status
	* @throws NoSuchRoomStatusException if a matching room status could not be found
	*/
	public static RoomStatus findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last room status in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static RoomStatus fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the room statuses before and after the current room status in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param roomStatusId the primary key of the current room status
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next room status
	* @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	*/
	public static RoomStatus[] findByUuid_C_PrevAndNext(long roomStatusId,
		java.lang.String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(roomStatusId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the room statuses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of room statuses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching room statuses
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the room status in the entity cache if it is enabled.
	*
	* @param roomStatus the room status
	*/
	public static void cacheResult(RoomStatus roomStatus) {
		getPersistence().cacheResult(roomStatus);
	}

	/**
	* Caches the room statuses in the entity cache if it is enabled.
	*
	* @param roomStatuses the room statuses
	*/
	public static void cacheResult(List<RoomStatus> roomStatuses) {
		getPersistence().cacheResult(roomStatuses);
	}

	/**
	* Creates a new room status with the primary key. Does not add the room status to the database.
	*
	* @param roomStatusId the primary key for the new room status
	* @return the new room status
	*/
	public static RoomStatus create(long roomStatusId) {
		return getPersistence().create(roomStatusId);
	}

	/**
	* Removes the room status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomStatusId the primary key of the room status
	* @return the room status that was removed
	* @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	*/
	public static RoomStatus remove(long roomStatusId)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().remove(roomStatusId);
	}

	public static RoomStatus updateImpl(RoomStatus roomStatus) {
		return getPersistence().updateImpl(roomStatus);
	}

	/**
	* Returns the room status with the primary key or throws a {@link NoSuchRoomStatusException} if it could not be found.
	*
	* @param roomStatusId the primary key of the room status
	* @return the room status
	* @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	*/
	public static RoomStatus findByPrimaryKey(long roomStatusId)
		throws com.sky.skyseries.apm.exception.NoSuchRoomStatusException {
		return getPersistence().findByPrimaryKey(roomStatusId);
	}

	/**
	* Returns the room status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomStatusId the primary key of the room status
	* @return the room status, or <code>null</code> if a room status with the primary key could not be found
	*/
	public static RoomStatus fetchByPrimaryKey(long roomStatusId) {
		return getPersistence().fetchByPrimaryKey(roomStatusId);
	}

	public static java.util.Map<java.io.Serializable, RoomStatus> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the room statuses.
	*
	* @return the room statuses
	*/
	public static List<RoomStatus> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the room statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @return the range of room statuses
	*/
	public static List<RoomStatus> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the room statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of room statuses
	*/
	public static List<RoomStatus> findAll(int start, int end,
		OrderByComparator<RoomStatus> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the room statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of room statuses
	*/
	public static List<RoomStatus> findAll(int start, int end,
		OrderByComparator<RoomStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the room statuses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of room statuses.
	*
	* @return the number of room statuses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RoomStatusPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RoomStatusPersistence, RoomStatusPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RoomStatusPersistence.class);
}