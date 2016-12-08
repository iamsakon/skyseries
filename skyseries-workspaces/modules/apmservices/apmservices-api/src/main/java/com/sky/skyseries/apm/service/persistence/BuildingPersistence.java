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

import com.sky.skyseries.apm.exception.NoSuchBuildingException;
import com.sky.skyseries.apm.model.Building;

/**
 * The persistence interface for the building service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.persistence.impl.BuildingPersistenceImpl
 * @see BuildingUtil
 * @generated
 */
@ProviderType
public interface BuildingPersistence extends BasePersistence<Building> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BuildingUtil} to access the building persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the buildings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching buildings
	*/
	public java.util.List<Building> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the buildings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @return the range of matching buildings
	*/
	public java.util.List<Building> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the buildings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns an ordered range of all the buildings where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first building in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the first building in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the last building in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the last building in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the buildings before and after the current building in the ordered set where uuid = &#63;.
	*
	* @param buildingId the primary key of the current building
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next building
	* @throws NoSuchBuildingException if a building with the primary key could not be found
	*/
	public Building[] findByUuid_PrevAndNext(long buildingId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Removes all the buildings where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of buildings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching buildings
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the building where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBuildingException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBuildingException;

	/**
	* Returns the building where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the building where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the building where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the building that was removed
	*/
	public Building removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBuildingException;

	/**
	* Returns the number of buildings where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching buildings
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the buildings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching buildings
	*/
	public java.util.List<Building> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the buildings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @return the range of matching buildings
	*/
	public java.util.List<Building> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the buildings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns an ordered range of all the buildings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first building in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the first building in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the last building in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the last building in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the buildings before and after the current building in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param buildingId the primary key of the current building
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next building
	* @throws NoSuchBuildingException if a building with the primary key could not be found
	*/
	public Building[] findByUuid_C_PrevAndNext(long buildingId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Removes all the buildings where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of buildings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching buildings
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the buildings where name = &#63;.
	*
	* @param name the name
	* @return the matching buildings
	*/
	public java.util.List<Building> findByName(java.lang.String name);

	/**
	* Returns a range of all the buildings where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @return the range of matching buildings
	*/
	public java.util.List<Building> findByName(java.lang.String name,
		int start, int end);

	/**
	* Returns an ordered range of all the buildings where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns an ordered range of all the buildings where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buildings
	*/
	public java.util.List<Building> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first building in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the first building in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the last building in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building
	* @throws NoSuchBuildingException if a matching building could not be found
	*/
	public Building findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Returns the last building in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching building, or <code>null</code> if a matching building could not be found
	*/
	public Building fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns the buildings before and after the current building in the ordered set where name = &#63;.
	*
	* @param buildingId the primary key of the current building
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next building
	* @throws NoSuchBuildingException if a building with the primary key could not be found
	*/
	public Building[] findByName_PrevAndNext(long buildingId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator)
		throws NoSuchBuildingException;

	/**
	* Removes all the buildings where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of buildings where name = &#63;.
	*
	* @param name the name
	* @return the number of matching buildings
	*/
	public int countByName(java.lang.String name);

	/**
	* Caches the building in the entity cache if it is enabled.
	*
	* @param building the building
	*/
	public void cacheResult(Building building);

	/**
	* Caches the buildings in the entity cache if it is enabled.
	*
	* @param buildings the buildings
	*/
	public void cacheResult(java.util.List<Building> buildings);

	/**
	* Creates a new building with the primary key. Does not add the building to the database.
	*
	* @param buildingId the primary key for the new building
	* @return the new building
	*/
	public Building create(long buildingId);

	/**
	* Removes the building with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param buildingId the primary key of the building
	* @return the building that was removed
	* @throws NoSuchBuildingException if a building with the primary key could not be found
	*/
	public Building remove(long buildingId) throws NoSuchBuildingException;

	public Building updateImpl(Building building);

	/**
	* Returns the building with the primary key or throws a {@link NoSuchBuildingException} if it could not be found.
	*
	* @param buildingId the primary key of the building
	* @return the building
	* @throws NoSuchBuildingException if a building with the primary key could not be found
	*/
	public Building findByPrimaryKey(long buildingId)
		throws NoSuchBuildingException;

	/**
	* Returns the building with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param buildingId the primary key of the building
	* @return the building, or <code>null</code> if a building with the primary key could not be found
	*/
	public Building fetchByPrimaryKey(long buildingId);

	@Override
	public java.util.Map<java.io.Serializable, Building> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the buildings.
	*
	* @return the buildings
	*/
	public java.util.List<Building> findAll();

	/**
	* Returns a range of all the buildings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @return the range of buildings
	*/
	public java.util.List<Building> findAll(int start, int end);

	/**
	* Returns an ordered range of all the buildings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of buildings
	*/
	public java.util.List<Building> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator);

	/**
	* Returns an ordered range of all the buildings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of buildings
	*/
	public java.util.List<Building> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Building> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the buildings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of buildings.
	*
	* @return the number of buildings
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}