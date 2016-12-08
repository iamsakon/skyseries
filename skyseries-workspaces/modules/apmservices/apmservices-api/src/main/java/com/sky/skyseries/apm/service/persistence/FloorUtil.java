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

import com.sky.skyseries.apm.model.Floor;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the floor service. This utility wraps {@link com.sky.skyseries.apm.service.persistence.impl.FloorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FloorPersistence
 * @see com.sky.skyseries.apm.service.persistence.impl.FloorPersistenceImpl
 * @generated
 */
@ProviderType
public class FloorUtil {
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
	public static void clearCache(Floor floor) {
		getPersistence().clearCache(floor);
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
	public static List<Floor> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Floor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Floor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Floor> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Floor update(Floor floor) {
		return getPersistence().update(floor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Floor update(Floor floor, ServiceContext serviceContext) {
		return getPersistence().update(floor, serviceContext);
	}

	/**
	* Returns all the floors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching floors
	*/
	public static List<Floor> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the floors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @return the range of matching floors
	*/
	public static List<Floor> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the floors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Floor> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the floors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Floor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first floor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByUuid_First(java.lang.String uuid,
		OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first floor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the floors before and after the current floor in the ordered set where uuid = &#63;.
	*
	* @param floorId the primary key of the current floor
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next floor
	* @throws NoSuchFloorException if a floor with the primary key could not be found
	*/
	public static Floor[] findByUuid_PrevAndNext(long floorId,
		java.lang.String uuid, OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence()
				   .findByUuid_PrevAndNext(floorId, uuid, orderByComparator);
	}

	/**
	* Removes all the floors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of floors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching floors
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the floor where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFloorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the floor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the floor where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the floor where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the floor that was removed
	*/
	public static Floor removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of floors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching floors
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the floors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching floors
	*/
	public static List<Floor> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the floors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @return the range of matching floors
	*/
	public static List<Floor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the floors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the floors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Floor> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first floor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first floor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Floor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Floor> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the floors before and after the current floor in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param floorId the primary key of the current floor
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next floor
	* @throws NoSuchFloorException if a floor with the primary key could not be found
	*/
	public static Floor[] findByUuid_C_PrevAndNext(long floorId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(floorId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the floors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of floors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching floors
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the floors where name = &#63;.
	*
	* @param name the name
	* @return the matching floors
	*/
	public static List<Floor> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the floors where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @return the range of matching floors
	*/
	public static List<Floor> findByName(java.lang.String name, int start,
		int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the floors where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByName(java.lang.String name, int start,
		int end, OrderByComparator<Floor> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the floors where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching floors
	*/
	public static List<Floor> findByName(java.lang.String name, int start,
		int end, OrderByComparator<Floor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first floor in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByName_First(java.lang.String name,
		OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first floor in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByName_First(java.lang.String name,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor
	* @throws NoSuchFloorException if a matching floor could not be found
	*/
	public static Floor findByName_Last(java.lang.String name,
		OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last floor in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static Floor fetchByName_Last(java.lang.String name,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the floors before and after the current floor in the ordered set where name = &#63;.
	*
	* @param floorId the primary key of the current floor
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next floor
	* @throws NoSuchFloorException if a floor with the primary key could not be found
	*/
	public static Floor[] findByName_PrevAndNext(long floorId,
		java.lang.String name, OrderByComparator<Floor> orderByComparator)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence()
				   .findByName_PrevAndNext(floorId, name, orderByComparator);
	}

	/**
	* Removes all the floors where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of floors where name = &#63;.
	*
	* @param name the name
	* @return the number of matching floors
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the floor in the entity cache if it is enabled.
	*
	* @param floor the floor
	*/
	public static void cacheResult(Floor floor) {
		getPersistence().cacheResult(floor);
	}

	/**
	* Caches the floors in the entity cache if it is enabled.
	*
	* @param floors the floors
	*/
	public static void cacheResult(List<Floor> floors) {
		getPersistence().cacheResult(floors);
	}

	/**
	* Creates a new floor with the primary key. Does not add the floor to the database.
	*
	* @param floorId the primary key for the new floor
	* @return the new floor
	*/
	public static Floor create(long floorId) {
		return getPersistence().create(floorId);
	}

	/**
	* Removes the floor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param floorId the primary key of the floor
	* @return the floor that was removed
	* @throws NoSuchFloorException if a floor with the primary key could not be found
	*/
	public static Floor remove(long floorId)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().remove(floorId);
	}

	public static Floor updateImpl(Floor floor) {
		return getPersistence().updateImpl(floor);
	}

	/**
	* Returns the floor with the primary key or throws a {@link NoSuchFloorException} if it could not be found.
	*
	* @param floorId the primary key of the floor
	* @return the floor
	* @throws NoSuchFloorException if a floor with the primary key could not be found
	*/
	public static Floor findByPrimaryKey(long floorId)
		throws com.sky.skyseries.apm.exception.NoSuchFloorException {
		return getPersistence().findByPrimaryKey(floorId);
	}

	/**
	* Returns the floor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param floorId the primary key of the floor
	* @return the floor, or <code>null</code> if a floor with the primary key could not be found
	*/
	public static Floor fetchByPrimaryKey(long floorId) {
		return getPersistence().fetchByPrimaryKey(floorId);
	}

	public static java.util.Map<java.io.Serializable, Floor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the floors.
	*
	* @return the floors
	*/
	public static List<Floor> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the floors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @return the range of floors
	*/
	public static List<Floor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the floors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of floors
	*/
	public static List<Floor> findAll(int start, int end,
		OrderByComparator<Floor> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the floors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of floors
	*/
	public static List<Floor> findAll(int start, int end,
		OrderByComparator<Floor> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the floors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of floors.
	*
	* @return the number of floors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FloorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FloorPersistence, FloorPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FloorPersistence.class);
}