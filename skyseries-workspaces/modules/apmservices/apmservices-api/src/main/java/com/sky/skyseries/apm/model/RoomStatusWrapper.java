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
 * This class is a wrapper for {@link RoomStatus}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatus
 * @generated
 */
@ProviderType
public class RoomStatusWrapper implements RoomStatus, ModelWrapper<RoomStatus> {
	public RoomStatusWrapper(RoomStatus roomStatus) {
		_roomStatus = roomStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return RoomStatus.class;
	}

	@Override
	public String getModelClassName() {
		return RoomStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roomStatusId", getRoomStatusId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roomStatusId = (Long)attributes.get("roomStatusId");

		if (roomStatusId != null) {
			setRoomStatusId(roomStatusId);
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

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public RoomStatus toEscapedModel() {
		return new RoomStatusWrapper(_roomStatus.toEscapedModel());
	}

	@Override
	public RoomStatus toUnescapedModel() {
		return new RoomStatusWrapper(_roomStatus.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _roomStatus.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _roomStatus.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _roomStatus.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _roomStatus.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RoomStatus> toCacheModel() {
		return _roomStatus.toCacheModel();
	}

	@Override
	public int compareTo(RoomStatus roomStatus) {
		return _roomStatus.compareTo(roomStatus);
	}

	@Override
	public int hashCode() {
		return _roomStatus.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _roomStatus.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RoomStatusWrapper((RoomStatus)_roomStatus.clone());
	}

	/**
	* Returns the code of this room status.
	*
	* @return the code of this room status
	*/
	@Override
	public java.lang.String getCode() {
		return _roomStatus.getCode();
	}

	/**
	* Returns the name of this room status.
	*
	* @return the name of this room status
	*/
	@Override
	public java.lang.String getName() {
		return _roomStatus.getName();
	}

	/**
	* Returns the user name of this room status.
	*
	* @return the user name of this room status
	*/
	@Override
	public java.lang.String getUserName() {
		return _roomStatus.getUserName();
	}

	/**
	* Returns the user uuid of this room status.
	*
	* @return the user uuid of this room status
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _roomStatus.getUserUuid();
	}

	/**
	* Returns the uuid of this room status.
	*
	* @return the uuid of this room status
	*/
	@Override
	public java.lang.String getUuid() {
		return _roomStatus.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _roomStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _roomStatus.toXmlString();
	}

	/**
	* Returns the create date of this room status.
	*
	* @return the create date of this room status
	*/
	@Override
	public Date getCreateDate() {
		return _roomStatus.getCreateDate();
	}

	/**
	* Returns the modified date of this room status.
	*
	* @return the modified date of this room status
	*/
	@Override
	public Date getModifiedDate() {
		return _roomStatus.getModifiedDate();
	}

	/**
	* Returns the company ID of this room status.
	*
	* @return the company ID of this room status
	*/
	@Override
	public long getCompanyId() {
		return _roomStatus.getCompanyId();
	}

	/**
	* Returns the group ID of this room status.
	*
	* @return the group ID of this room status
	*/
	@Override
	public long getGroupId() {
		return _roomStatus.getGroupId();
	}

	/**
	* Returns the primary key of this room status.
	*
	* @return the primary key of this room status
	*/
	@Override
	public long getPrimaryKey() {
		return _roomStatus.getPrimaryKey();
	}

	/**
	* Returns the room status ID of this room status.
	*
	* @return the room status ID of this room status
	*/
	@Override
	public long getRoomStatusId() {
		return _roomStatus.getRoomStatusId();
	}

	/**
	* Returns the user ID of this room status.
	*
	* @return the user ID of this room status
	*/
	@Override
	public long getUserId() {
		return _roomStatus.getUserId();
	}

	@Override
	public void persist() {
		_roomStatus.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_roomStatus.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this room status.
	*
	* @param code the code of this room status
	*/
	@Override
	public void setCode(java.lang.String code) {
		_roomStatus.setCode(code);
	}

	/**
	* Sets the company ID of this room status.
	*
	* @param companyId the company ID of this room status
	*/
	@Override
	public void setCompanyId(long companyId) {
		_roomStatus.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this room status.
	*
	* @param createDate the create date of this room status
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_roomStatus.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_roomStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_roomStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_roomStatus.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this room status.
	*
	* @param groupId the group ID of this room status
	*/
	@Override
	public void setGroupId(long groupId) {
		_roomStatus.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this room status.
	*
	* @param modifiedDate the modified date of this room status
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_roomStatus.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this room status.
	*
	* @param name the name of this room status
	*/
	@Override
	public void setName(java.lang.String name) {
		_roomStatus.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_roomStatus.setNew(n);
	}

	/**
	* Sets the primary key of this room status.
	*
	* @param primaryKey the primary key of this room status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_roomStatus.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_roomStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room status ID of this room status.
	*
	* @param roomStatusId the room status ID of this room status
	*/
	@Override
	public void setRoomStatusId(long roomStatusId) {
		_roomStatus.setRoomStatusId(roomStatusId);
	}

	/**
	* Sets the user ID of this room status.
	*
	* @param userId the user ID of this room status
	*/
	@Override
	public void setUserId(long userId) {
		_roomStatus.setUserId(userId);
	}

	/**
	* Sets the user name of this room status.
	*
	* @param userName the user name of this room status
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_roomStatus.setUserName(userName);
	}

	/**
	* Sets the user uuid of this room status.
	*
	* @param userUuid the user uuid of this room status
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_roomStatus.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this room status.
	*
	* @param uuid the uuid of this room status
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_roomStatus.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomStatusWrapper)) {
			return false;
		}

		RoomStatusWrapper roomStatusWrapper = (RoomStatusWrapper)obj;

		if (Objects.equals(_roomStatus, roomStatusWrapper._roomStatus)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _roomStatus.getStagedModelType();
	}

	@Override
	public RoomStatus getWrappedModel() {
		return _roomStatus;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _roomStatus.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _roomStatus.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_roomStatus.resetOriginalValues();
	}

	private final RoomStatus _roomStatus;
}