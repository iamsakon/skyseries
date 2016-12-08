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
 * This class is a wrapper for {@link RoomType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomType
 * @generated
 */
@ProviderType
public class RoomTypeWrapper implements RoomType, ModelWrapper<RoomType> {
	public RoomTypeWrapper(RoomType roomType) {
		_roomType = roomType;
	}

	@Override
	public Class<?> getModelClass() {
		return RoomType.class;
	}

	@Override
	public String getModelClassName() {
		return RoomType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roomTypeId", getRoomTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roomTypeId = (Long)attributes.get("roomTypeId");

		if (roomTypeId != null) {
			setRoomTypeId(roomTypeId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public RoomType toEscapedModel() {
		return new RoomTypeWrapper(_roomType.toEscapedModel());
	}

	@Override
	public RoomType toUnescapedModel() {
		return new RoomTypeWrapper(_roomType.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _roomType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _roomType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _roomType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _roomType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RoomType> toCacheModel() {
		return _roomType.toCacheModel();
	}

	@Override
	public int compareTo(RoomType roomType) {
		return _roomType.compareTo(roomType);
	}

	@Override
	public int hashCode() {
		return _roomType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _roomType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RoomTypeWrapper((RoomType)_roomType.clone());
	}

	/**
	* Returns the description of this room type.
	*
	* @return the description of this room type
	*/
	@Override
	public java.lang.String getDescription() {
		return _roomType.getDescription();
	}

	/**
	* Returns the name of this room type.
	*
	* @return the name of this room type
	*/
	@Override
	public java.lang.String getName() {
		return _roomType.getName();
	}

	/**
	* Returns the user name of this room type.
	*
	* @return the user name of this room type
	*/
	@Override
	public java.lang.String getUserName() {
		return _roomType.getUserName();
	}

	/**
	* Returns the user uuid of this room type.
	*
	* @return the user uuid of this room type
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _roomType.getUserUuid();
	}

	/**
	* Returns the uuid of this room type.
	*
	* @return the uuid of this room type
	*/
	@Override
	public java.lang.String getUuid() {
		return _roomType.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _roomType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _roomType.toXmlString();
	}

	/**
	* Returns the create date of this room type.
	*
	* @return the create date of this room type
	*/
	@Override
	public Date getCreateDate() {
		return _roomType.getCreateDate();
	}

	/**
	* Returns the modified date of this room type.
	*
	* @return the modified date of this room type
	*/
	@Override
	public Date getModifiedDate() {
		return _roomType.getModifiedDate();
	}

	/**
	* Returns the company ID of this room type.
	*
	* @return the company ID of this room type
	*/
	@Override
	public long getCompanyId() {
		return _roomType.getCompanyId();
	}

	/**
	* Returns the group ID of this room type.
	*
	* @return the group ID of this room type
	*/
	@Override
	public long getGroupId() {
		return _roomType.getGroupId();
	}

	/**
	* Returns the primary key of this room type.
	*
	* @return the primary key of this room type
	*/
	@Override
	public long getPrimaryKey() {
		return _roomType.getPrimaryKey();
	}

	/**
	* Returns the room type ID of this room type.
	*
	* @return the room type ID of this room type
	*/
	@Override
	public long getRoomTypeId() {
		return _roomType.getRoomTypeId();
	}

	/**
	* Returns the user ID of this room type.
	*
	* @return the user ID of this room type
	*/
	@Override
	public long getUserId() {
		return _roomType.getUserId();
	}

	@Override
	public void persist() {
		_roomType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_roomType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this room type.
	*
	* @param companyId the company ID of this room type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_roomType.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this room type.
	*
	* @param createDate the create date of this room type
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_roomType.setCreateDate(createDate);
	}

	/**
	* Sets the description of this room type.
	*
	* @param description the description of this room type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_roomType.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_roomType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_roomType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_roomType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this room type.
	*
	* @param groupId the group ID of this room type
	*/
	@Override
	public void setGroupId(long groupId) {
		_roomType.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this room type.
	*
	* @param modifiedDate the modified date of this room type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_roomType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this room type.
	*
	* @param name the name of this room type
	*/
	@Override
	public void setName(java.lang.String name) {
		_roomType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_roomType.setNew(n);
	}

	/**
	* Sets the primary key of this room type.
	*
	* @param primaryKey the primary key of this room type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_roomType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_roomType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room type ID of this room type.
	*
	* @param roomTypeId the room type ID of this room type
	*/
	@Override
	public void setRoomTypeId(long roomTypeId) {
		_roomType.setRoomTypeId(roomTypeId);
	}

	/**
	* Sets the user ID of this room type.
	*
	* @param userId the user ID of this room type
	*/
	@Override
	public void setUserId(long userId) {
		_roomType.setUserId(userId);
	}

	/**
	* Sets the user name of this room type.
	*
	* @param userName the user name of this room type
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_roomType.setUserName(userName);
	}

	/**
	* Sets the user uuid of this room type.
	*
	* @param userUuid the user uuid of this room type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_roomType.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this room type.
	*
	* @param uuid the uuid of this room type
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_roomType.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomTypeWrapper)) {
			return false;
		}

		RoomTypeWrapper roomTypeWrapper = (RoomTypeWrapper)obj;

		if (Objects.equals(_roomType, roomTypeWrapper._roomType)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _roomType.getStagedModelType();
	}

	@Override
	public RoomType getWrappedModel() {
		return _roomType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _roomType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _roomType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_roomType.resetOriginalValues();
	}

	private final RoomType _roomType;
}