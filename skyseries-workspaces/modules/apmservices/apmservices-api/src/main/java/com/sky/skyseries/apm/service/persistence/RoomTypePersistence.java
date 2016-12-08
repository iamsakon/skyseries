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

import com.sky.skyseries.apm.exception.NoSuchRoomTypeException;
import com.sky.skyseries.apm.model.RoomType;

/**
 * The persistence interface for the room type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.persistence.impl.RoomTypePersistenceImpl
 * @see RoomTypeUtil
 * @generated
 */
@ProviderType
public interface RoomTypePersistence extends BasePersistence<RoomType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RoomTypeUtil} to access the room type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the room types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching room types
	*/
	public java.util.List<RoomType> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the room types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @return the range of matching room types
	*/
	public java.util.List<RoomType> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the room types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching room types
	*/
	public java.util.List<RoomType> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns an ordered range of all the room types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching room types
	*/
	public java.util.List<RoomType> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first room type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room type
	* @throws NoSuchRoomTypeException if a matching room type could not be found
	*/
	public RoomType findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Returns the first room type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns the last room type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room type
	* @throws NoSuchRoomTypeException if a matching room type could not be found
	*/
	public RoomType findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Returns the last room type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns the room types before and after the current room type in the ordered set where uuid = &#63;.
	*
	* @param roomTypeId the primary key of the current room type
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next room type
	* @throws NoSuchRoomTypeException if a room type with the primary key could not be found
	*/
	public RoomType[] findByUuid_PrevAndNext(long roomTypeId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Removes all the room types where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of room types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching room types
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the room type where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchRoomTypeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching room type
	* @throws NoSuchRoomTypeException if a matching room type could not be found
	*/
	public RoomType findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchRoomTypeException;

	/**
	* Returns the room type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the room type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the room type where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the room type that was removed
	*/
	public RoomType removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchRoomTypeException;

	/**
	* Returns the number of room types where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching room types
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the room types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching room types
	*/
	public java.util.List<RoomType> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the room types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @return the range of matching room types
	*/
	public java.util.List<RoomType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the room types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching room types
	*/
	public java.util.List<RoomType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns an ordered range of all the room types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching room types
	*/
	public java.util.List<RoomType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first room type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room type
	* @throws NoSuchRoomTypeException if a matching room type could not be found
	*/
	public RoomType findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Returns the first room type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns the last room type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room type
	* @throws NoSuchRoomTypeException if a matching room type could not be found
	*/
	public RoomType findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Returns the last room type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching room type, or <code>null</code> if a matching room type could not be found
	*/
	public RoomType fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns the room types before and after the current room type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param roomTypeId the primary key of the current room type
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next room type
	* @throws NoSuchRoomTypeException if a room type with the primary key could not be found
	*/
	public RoomType[] findByUuid_C_PrevAndNext(long roomTypeId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator)
		throws NoSuchRoomTypeException;

	/**
	* Removes all the room types where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of room types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching room types
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the room type in the entity cache if it is enabled.
	*
	* @param roomType the room type
	*/
	public void cacheResult(RoomType roomType);

	/**
	* Caches the room types in the entity cache if it is enabled.
	*
	* @param roomTypes the room types
	*/
	public void cacheResult(java.util.List<RoomType> roomTypes);

	/**
	* Creates a new room type with the primary key. Does not add the room type to the database.
	*
	* @param roomTypeId the primary key for the new room type
	* @return the new room type
	*/
	public RoomType create(long roomTypeId);

	/**
	* Removes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomTypeId the primary key of the room type
	* @return the room type that was removed
	* @throws NoSuchRoomTypeException if a room type with the primary key could not be found
	*/
	public RoomType remove(long roomTypeId) throws NoSuchRoomTypeException;

	public RoomType updateImpl(RoomType roomType);

	/**
	* Returns the room type with the primary key or throws a {@link NoSuchRoomTypeException} if it could not be found.
	*
	* @param roomTypeId the primary key of the room type
	* @return the room type
	* @throws NoSuchRoomTypeException if a room type with the primary key could not be found
	*/
	public RoomType findByPrimaryKey(long roomTypeId)
		throws NoSuchRoomTypeException;

	/**
	* Returns the room type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomTypeId the primary key of the room type
	* @return the room type, or <code>null</code> if a room type with the primary key could not be found
	*/
	public RoomType fetchByPrimaryKey(long roomTypeId);

	@Override
	public java.util.Map<java.io.Serializable, RoomType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the room types.
	*
	* @return the room types
	*/
	public java.util.List<RoomType> findAll();

	/**
	* Returns a range of all the room types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @return the range of room types
	*/
	public java.util.List<RoomType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the room types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of room types
	*/
	public java.util.List<RoomType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator);

	/**
	* Returns an ordered range of all the room types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of room types
	*/
	public java.util.List<RoomType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RoomType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the room types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of room types.
	*
	* @return the number of room types
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}