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
 * This class is a wrapper for {@link Building}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Building
 * @generated
 */
@ProviderType
public class BuildingWrapper implements Building, ModelWrapper<Building> {
	public BuildingWrapper(Building building) {
		_building = building;
	}

	@Override
	public Class<?> getModelClass() {
		return Building.class;
	}

	@Override
	public String getModelClassName() {
		return Building.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("buildingId", getBuildingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("name2", getName2());
		attributes.put("legalEntityId", getLegalEntityId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long buildingId = (Long)attributes.get("buildingId");

		if (buildingId != null) {
			setBuildingId(buildingId);
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

		String name2 = (String)attributes.get("name2");

		if (name2 != null) {
			setName2(name2);
		}

		Long legalEntityId = (Long)attributes.get("legalEntityId");

		if (legalEntityId != null) {
			setLegalEntityId(legalEntityId);
		}
	}

	@Override
	public Building toEscapedModel() {
		return new BuildingWrapper(_building.toEscapedModel());
	}

	@Override
	public Building toUnescapedModel() {
		return new BuildingWrapper(_building.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _building.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _building.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _building.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _building.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Building> toCacheModel() {
		return _building.toCacheModel();
	}

	@Override
	public int compareTo(Building building) {
		return _building.compareTo(building);
	}

	@Override
	public int hashCode() {
		return _building.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _building.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BuildingWrapper((Building)_building.clone());
	}

	/**
	* Returns the name of this building.
	*
	* @return the name of this building
	*/
	@Override
	public java.lang.String getName() {
		return _building.getName();
	}

	/**
	* Returns the name2 of this building.
	*
	* @return the name2 of this building
	*/
	@Override
	public java.lang.String getName2() {
		return _building.getName2();
	}

	/**
	* Returns the user name of this building.
	*
	* @return the user name of this building
	*/
	@Override
	public java.lang.String getUserName() {
		return _building.getUserName();
	}

	/**
	* Returns the user uuid of this building.
	*
	* @return the user uuid of this building
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _building.getUserUuid();
	}

	/**
	* Returns the uuid of this building.
	*
	* @return the uuid of this building
	*/
	@Override
	public java.lang.String getUuid() {
		return _building.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _building.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _building.toXmlString();
	}

	/**
	* Returns the create date of this building.
	*
	* @return the create date of this building
	*/
	@Override
	public Date getCreateDate() {
		return _building.getCreateDate();
	}

	/**
	* Returns the modified date of this building.
	*
	* @return the modified date of this building
	*/
	@Override
	public Date getModifiedDate() {
		return _building.getModifiedDate();
	}

	/**
	* Returns the building ID of this building.
	*
	* @return the building ID of this building
	*/
	@Override
	public long getBuildingId() {
		return _building.getBuildingId();
	}

	/**
	* Returns the company ID of this building.
	*
	* @return the company ID of this building
	*/
	@Override
	public long getCompanyId() {
		return _building.getCompanyId();
	}

	/**
	* Returns the group ID of this building.
	*
	* @return the group ID of this building
	*/
	@Override
	public long getGroupId() {
		return _building.getGroupId();
	}

	/**
	* Returns the legal entity ID of this building.
	*
	* @return the legal entity ID of this building
	*/
	@Override
	public long getLegalEntityId() {
		return _building.getLegalEntityId();
	}

	/**
	* Returns the primary key of this building.
	*
	* @return the primary key of this building
	*/
	@Override
	public long getPrimaryKey() {
		return _building.getPrimaryKey();
	}

	/**
	* Returns the user ID of this building.
	*
	* @return the user ID of this building
	*/
	@Override
	public long getUserId() {
		return _building.getUserId();
	}

	@Override
	public void persist() {
		_building.persist();
	}

	/**
	* Sets the building ID of this building.
	*
	* @param buildingId the building ID of this building
	*/
	@Override
	public void setBuildingId(long buildingId) {
		_building.setBuildingId(buildingId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_building.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this building.
	*
	* @param companyId the company ID of this building
	*/
	@Override
	public void setCompanyId(long companyId) {
		_building.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this building.
	*
	* @param createDate the create date of this building
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_building.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_building.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_building.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_building.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this building.
	*
	* @param groupId the group ID of this building
	*/
	@Override
	public void setGroupId(long groupId) {
		_building.setGroupId(groupId);
	}

	/**
	* Sets the legal entity ID of this building.
	*
	* @param legalEntityId the legal entity ID of this building
	*/
	@Override
	public void setLegalEntityId(long legalEntityId) {
		_building.setLegalEntityId(legalEntityId);
	}

	/**
	* Sets the modified date of this building.
	*
	* @param modifiedDate the modified date of this building
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_building.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this building.
	*
	* @param name the name of this building
	*/
	@Override
	public void setName(java.lang.String name) {
		_building.setName(name);
	}

	/**
	* Sets the name2 of this building.
	*
	* @param name2 the name2 of this building
	*/
	@Override
	public void setName2(java.lang.String name2) {
		_building.setName2(name2);
	}

	@Override
	public void setNew(boolean n) {
		_building.setNew(n);
	}

	/**
	* Sets the primary key of this building.
	*
	* @param primaryKey the primary key of this building
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_building.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_building.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this building.
	*
	* @param userId the user ID of this building
	*/
	@Override
	public void setUserId(long userId) {
		_building.setUserId(userId);
	}

	/**
	* Sets the user name of this building.
	*
	* @param userName the user name of this building
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_building.setUserName(userName);
	}

	/**
	* Sets the user uuid of this building.
	*
	* @param userUuid the user uuid of this building
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_building.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this building.
	*
	* @param uuid the uuid of this building
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_building.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuildingWrapper)) {
			return false;
		}

		BuildingWrapper buildingWrapper = (BuildingWrapper)obj;

		if (Objects.equals(_building, buildingWrapper._building)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _building.getStagedModelType();
	}

	@Override
	public Building getWrappedModel() {
		return _building;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _building.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _building.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_building.resetOriginalValues();
	}

	private final Building _building;
}