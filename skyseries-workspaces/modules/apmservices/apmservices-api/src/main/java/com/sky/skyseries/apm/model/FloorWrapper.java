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
 * This class is a wrapper for {@link Floor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Floor
 * @generated
 */
@ProviderType
public class FloorWrapper implements Floor, ModelWrapper<Floor> {
	public FloorWrapper(Floor floor) {
		_floor = floor;
	}

	@Override
	public Class<?> getModelClass() {
		return Floor.class;
	}

	@Override
	public String getModelClassName() {
		return Floor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("floorId", getFloorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("buildingId", getBuildingId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long floorId = (Long)attributes.get("floorId");

		if (floorId != null) {
			setFloorId(floorId);
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

		Long buildingId = (Long)attributes.get("buildingId");

		if (buildingId != null) {
			setBuildingId(buildingId);
		}
	}

	@Override
	public Floor toEscapedModel() {
		return new FloorWrapper(_floor.toEscapedModel());
	}

	@Override
	public Floor toUnescapedModel() {
		return new FloorWrapper(_floor.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _floor.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _floor.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _floor.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _floor.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Floor> toCacheModel() {
		return _floor.toCacheModel();
	}

	@Override
	public int compareTo(Floor floor) {
		return _floor.compareTo(floor);
	}

	@Override
	public int hashCode() {
		return _floor.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _floor.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FloorWrapper((Floor)_floor.clone());
	}

	/**
	* Returns the name of this floor.
	*
	* @return the name of this floor
	*/
	@Override
	public java.lang.String getName() {
		return _floor.getName();
	}

	/**
	* Returns the user name of this floor.
	*
	* @return the user name of this floor
	*/
	@Override
	public java.lang.String getUserName() {
		return _floor.getUserName();
	}

	/**
	* Returns the user uuid of this floor.
	*
	* @return the user uuid of this floor
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _floor.getUserUuid();
	}

	/**
	* Returns the uuid of this floor.
	*
	* @return the uuid of this floor
	*/
	@Override
	public java.lang.String getUuid() {
		return _floor.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _floor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _floor.toXmlString();
	}

	/**
	* Returns the create date of this floor.
	*
	* @return the create date of this floor
	*/
	@Override
	public Date getCreateDate() {
		return _floor.getCreateDate();
	}

	/**
	* Returns the modified date of this floor.
	*
	* @return the modified date of this floor
	*/
	@Override
	public Date getModifiedDate() {
		return _floor.getModifiedDate();
	}

	/**
	* Returns the building ID of this floor.
	*
	* @return the building ID of this floor
	*/
	@Override
	public long getBuildingId() {
		return _floor.getBuildingId();
	}

	/**
	* Returns the company ID of this floor.
	*
	* @return the company ID of this floor
	*/
	@Override
	public long getCompanyId() {
		return _floor.getCompanyId();
	}

	/**
	* Returns the floor ID of this floor.
	*
	* @return the floor ID of this floor
	*/
	@Override
	public long getFloorId() {
		return _floor.getFloorId();
	}

	/**
	* Returns the group ID of this floor.
	*
	* @return the group ID of this floor
	*/
	@Override
	public long getGroupId() {
		return _floor.getGroupId();
	}

	/**
	* Returns the primary key of this floor.
	*
	* @return the primary key of this floor
	*/
	@Override
	public long getPrimaryKey() {
		return _floor.getPrimaryKey();
	}

	/**
	* Returns the user ID of this floor.
	*
	* @return the user ID of this floor
	*/
	@Override
	public long getUserId() {
		return _floor.getUserId();
	}

	@Override
	public void persist() {
		_floor.persist();
	}

	/**
	* Sets the building ID of this floor.
	*
	* @param buildingId the building ID of this floor
	*/
	@Override
	public void setBuildingId(long buildingId) {
		_floor.setBuildingId(buildingId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_floor.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this floor.
	*
	* @param companyId the company ID of this floor
	*/
	@Override
	public void setCompanyId(long companyId) {
		_floor.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this floor.
	*
	* @param createDate the create date of this floor
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_floor.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_floor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_floor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_floor.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the floor ID of this floor.
	*
	* @param floorId the floor ID of this floor
	*/
	@Override
	public void setFloorId(long floorId) {
		_floor.setFloorId(floorId);
	}

	/**
	* Sets the group ID of this floor.
	*
	* @param groupId the group ID of this floor
	*/
	@Override
	public void setGroupId(long groupId) {
		_floor.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this floor.
	*
	* @param modifiedDate the modified date of this floor
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_floor.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this floor.
	*
	* @param name the name of this floor
	*/
	@Override
	public void setName(java.lang.String name) {
		_floor.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_floor.setNew(n);
	}

	/**
	* Sets the primary key of this floor.
	*
	* @param primaryKey the primary key of this floor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_floor.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_floor.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this floor.
	*
	* @param userId the user ID of this floor
	*/
	@Override
	public void setUserId(long userId) {
		_floor.setUserId(userId);
	}

	/**
	* Sets the user name of this floor.
	*
	* @param userName the user name of this floor
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_floor.setUserName(userName);
	}

	/**
	* Sets the user uuid of this floor.
	*
	* @param userUuid the user uuid of this floor
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_floor.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this floor.
	*
	* @param uuid the uuid of this floor
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_floor.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FloorWrapper)) {
			return false;
		}

		FloorWrapper floorWrapper = (FloorWrapper)obj;

		if (Objects.equals(_floor, floorWrapper._floor)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _floor.getStagedModelType();
	}

	@Override
	public Floor getWrappedModel() {
		return _floor;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _floor.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _floor.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_floor.resetOriginalValues();
	}

	private final Floor _floor;
}