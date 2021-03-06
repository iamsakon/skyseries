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

package com.sky.skyseries.apm.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Room}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Room
 * @generated
 */
@ProviderType
public class RoomWrapper implements Room, ModelWrapper<Room> {
	public RoomWrapper(Room room) {
		_room = room;
	}

	@Override
	public Class<?> getModelClass() {
		return Room.class;
	}

	@Override
	public String getModelClassName() {
		return Room.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roomId", getRoomId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("floorId", getFloorId());
		attributes.put("roomStatusId", getRoomStatusId());
		attributes.put("roomTypeId", getRoomTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roomId = (Long)attributes.get("roomId");

		if (roomId != null) {
			setRoomId(roomId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long floorId = (Long)attributes.get("floorId");

		if (floorId != null) {
			setFloorId(floorId);
		}

		Long roomStatusId = (Long)attributes.get("roomStatusId");

		if (roomStatusId != null) {
			setRoomStatusId(roomStatusId);
		}

		Long roomTypeId = (Long)attributes.get("roomTypeId");

		if (roomTypeId != null) {
			setRoomTypeId(roomTypeId);
		}
	}

	@Override
	public Room toEscapedModel() {
		return new RoomWrapper(_room.toEscapedModel());
	}

	@Override
	public Room toUnescapedModel() {
		return new RoomWrapper(_room.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _room.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _room.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _room.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _room.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Room> toCacheModel() {
		return _room.toCacheModel();
	}

	@Override
	public int compareTo(Room room) {
		return _room.compareTo(room);
	}

	@Override
	public int hashCode() {
		return _room.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _room.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RoomWrapper((Room)_room.clone());
	}

	/**
	* Returns the name of this room.
	*
	* @return the name of this room
	*/
	@Override
	public java.lang.String getName() {
		return _room.getName();
	}

	/**
	* Returns the user name of this room.
	*
	* @return the user name of this room
	*/
	@Override
	public java.lang.String getUserName() {
		return _room.getUserName();
	}

	/**
	* Returns the user uuid of this room.
	*
	* @return the user uuid of this room
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _room.getUserUuid();
	}

	/**
	* Returns the uuid of this room.
	*
	* @return the uuid of this room
	*/
	@Override
	public java.lang.String getUuid() {
		return _room.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _room.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _room.toXmlString();
	}

	/**
	* Returns the create date of this room.
	*
	* @return the create date of this room
	*/
	@Override
	public Date getCreateDate() {
		return _room.getCreateDate();
	}

	/**
	* Returns the modified date of this room.
	*
	* @return the modified date of this room
	*/
	@Override
	public Date getModifiedDate() {
		return _room.getModifiedDate();
	}

	/**
	* Returns the company ID of this room.
	*
	* @return the company ID of this room
	*/
	@Override
	public long getCompanyId() {
		return _room.getCompanyId();
	}

	/**
	* Returns the floor ID of this room.
	*
	* @return the floor ID of this room
	*/
	@Override
	public long getFloorId() {
		return _room.getFloorId();
	}

	/**
	* Returns the group ID of this room.
	*
	* @return the group ID of this room
	*/
	@Override
	public long getGroupId() {
		return _room.getGroupId();
	}

	/**
	* Returns the primary key of this room.
	*
	* @return the primary key of this room
	*/
	@Override
	public long getPrimaryKey() {
		return _room.getPrimaryKey();
	}

	/**
	* Returns the room ID of this room.
	*
	* @return the room ID of this room
	*/
	@Override
	public long getRoomId() {
		return _room.getRoomId();
	}

	/**
	* Returns the room status ID of this room.
	*
	* @return the room status ID of this room
	*/
	@Override
	public long getRoomStatusId() {
		return _room.getRoomStatusId();
	}

	/**
	* Returns the room type ID of this room.
	*
	* @return the room type ID of this room
	*/
	@Override
	public long getRoomTypeId() {
		return _room.getRoomTypeId();
	}

	/**
	* Returns the user ID of this room.
	*
	* @return the user ID of this room
	*/
	@Override
	public long getUserId() {
		return _room.getUserId();
	}

	@Override
	public void persist() {
		_room.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_room.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this room.
	*
	* @param companyId the company ID of this room
	*/
	@Override
	public void setCompanyId(long companyId) {
		_room.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this room.
	*
	* @param createDate the create date of this room
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_room.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_room.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_room.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_room.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the floor ID of this room.
	*
	* @param floorId the floor ID of this room
	*/
	@Override
	public void setFloorId(long floorId) {
		_room.setFloorId(floorId);
	}

	/**
	* Sets the group ID of this room.
	*
	* @param groupId the group ID of this room
	*/
	@Override
	public void setGroupId(long groupId) {
		_room.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this room.
	*
	* @param modifiedDate the modified date of this room
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_room.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this room.
	*
	* @param name the name of this room
	*/
	@Override
	public void setName(java.lang.String name) {
		_room.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_room.setNew(n);
	}

	/**
	* Sets the primary key of this room.
	*
	* @param primaryKey the primary key of this room
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_room.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_room.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room ID of this room.
	*
	* @param roomId the room ID of this room
	*/
	@Override
	public void setRoomId(long roomId) {
		_room.setRoomId(roomId);
	}

	/**
	* Sets the room status ID of this room.
	*
	* @param roomStatusId the room status ID of this room
	*/
	@Override
	public void setRoomStatusId(long roomStatusId) {
		_room.setRoomStatusId(roomStatusId);
	}

	/**
	* Sets the room type ID of this room.
	*
	* @param roomTypeId the room type ID of this room
	*/
	@Override
	public void setRoomTypeId(long roomTypeId) {
		_room.setRoomTypeId(roomTypeId);
	}

	/**
	* Sets the user ID of this room.
	*
	* @param userId the user ID of this room
	*/
	@Override
	public void setUserId(long userId) {
		_room.setUserId(userId);
	}

	/**
	* Sets the user name of this room.
	*
	* @param userName the user name of this room
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_room.setUserName(userName);
	}

	/**
	* Sets the user uuid of this room.
	*
	* @param userUuid the user uuid of this room
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_room.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this room.
	*
	* @param uuid the uuid of this room
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_room.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomWrapper)) {
			return false;
		}

		RoomWrapper roomWrapper = (RoomWrapper)obj;

		if (Objects.equals(_room, roomWrapper._room)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _room.getStagedModelType();
	}

	@Override
	public Room getWrappedModel() {
		return _room;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _room.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _room.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_room.resetOriginalValues();
	}

	private final Room _room;
}