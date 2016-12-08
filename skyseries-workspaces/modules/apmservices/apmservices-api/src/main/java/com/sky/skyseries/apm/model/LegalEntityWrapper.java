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
 * This class is a wrapper for {@link LegalEntity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntity
 * @generated
 */
@ProviderType
public class LegalEntityWrapper implements LegalEntity,
	ModelWrapper<LegalEntity> {
	public LegalEntityWrapper(LegalEntity legalEntity) {
		_legalEntity = legalEntity;
	}

	@Override
	public Class<?> getModelClass() {
		return LegalEntity.class;
	}

	@Override
	public String getModelClassName() {
		return LegalEntity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("legalEntityId", getLegalEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long legalEntityId = (Long)attributes.get("legalEntityId");

		if (legalEntityId != null) {
			setLegalEntityId(legalEntityId);
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
	}

	@Override
	public LegalEntity toEscapedModel() {
		return new LegalEntityWrapper(_legalEntity.toEscapedModel());
	}

	@Override
	public LegalEntity toUnescapedModel() {
		return new LegalEntityWrapper(_legalEntity.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _legalEntity.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _legalEntity.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _legalEntity.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _legalEntity.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LegalEntity> toCacheModel() {
		return _legalEntity.toCacheModel();
	}

	@Override
	public int compareTo(LegalEntity legalEntity) {
		return _legalEntity.compareTo(legalEntity);
	}

	@Override
	public int hashCode() {
		return _legalEntity.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _legalEntity.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LegalEntityWrapper((LegalEntity)_legalEntity.clone());
	}

	/**
	* Returns the name of this legal entity.
	*
	* @return the name of this legal entity
	*/
	@Override
	public java.lang.String getName() {
		return _legalEntity.getName();
	}

	/**
	* Returns the user name of this legal entity.
	*
	* @return the user name of this legal entity
	*/
	@Override
	public java.lang.String getUserName() {
		return _legalEntity.getUserName();
	}

	/**
	* Returns the user uuid of this legal entity.
	*
	* @return the user uuid of this legal entity
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _legalEntity.getUserUuid();
	}

	/**
	* Returns the uuid of this legal entity.
	*
	* @return the uuid of this legal entity
	*/
	@Override
	public java.lang.String getUuid() {
		return _legalEntity.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _legalEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _legalEntity.toXmlString();
	}

	/**
	* Returns the create date of this legal entity.
	*
	* @return the create date of this legal entity
	*/
	@Override
	public Date getCreateDate() {
		return _legalEntity.getCreateDate();
	}

	/**
	* Returns the modified date of this legal entity.
	*
	* @return the modified date of this legal entity
	*/
	@Override
	public Date getModifiedDate() {
		return _legalEntity.getModifiedDate();
	}

	/**
	* Returns the company ID of this legal entity.
	*
	* @return the company ID of this legal entity
	*/
	@Override
	public long getCompanyId() {
		return _legalEntity.getCompanyId();
	}

	/**
	* Returns the group ID of this legal entity.
	*
	* @return the group ID of this legal entity
	*/
	@Override
	public long getGroupId() {
		return _legalEntity.getGroupId();
	}

	/**
	* Returns the legal entity ID of this legal entity.
	*
	* @return the legal entity ID of this legal entity
	*/
	@Override
	public long getLegalEntityId() {
		return _legalEntity.getLegalEntityId();
	}

	/**
	* Returns the primary key of this legal entity.
	*
	* @return the primary key of this legal entity
	*/
	@Override
	public long getPrimaryKey() {
		return _legalEntity.getPrimaryKey();
	}

	/**
	* Returns the user ID of this legal entity.
	*
	* @return the user ID of this legal entity
	*/
	@Override
	public long getUserId() {
		return _legalEntity.getUserId();
	}

	@Override
	public void persist() {
		_legalEntity.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_legalEntity.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this legal entity.
	*
	* @param companyId the company ID of this legal entity
	*/
	@Override
	public void setCompanyId(long companyId) {
		_legalEntity.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this legal entity.
	*
	* @param createDate the create date of this legal entity
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_legalEntity.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_legalEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_legalEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_legalEntity.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this legal entity.
	*
	* @param groupId the group ID of this legal entity
	*/
	@Override
	public void setGroupId(long groupId) {
		_legalEntity.setGroupId(groupId);
	}

	/**
	* Sets the legal entity ID of this legal entity.
	*
	* @param legalEntityId the legal entity ID of this legal entity
	*/
	@Override
	public void setLegalEntityId(long legalEntityId) {
		_legalEntity.setLegalEntityId(legalEntityId);
	}

	/**
	* Sets the modified date of this legal entity.
	*
	* @param modifiedDate the modified date of this legal entity
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_legalEntity.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this legal entity.
	*
	* @param name the name of this legal entity
	*/
	@Override
	public void setName(java.lang.String name) {
		_legalEntity.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_legalEntity.setNew(n);
	}

	/**
	* Sets the primary key of this legal entity.
	*
	* @param primaryKey the primary key of this legal entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_legalEntity.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_legalEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this legal entity.
	*
	* @param userId the user ID of this legal entity
	*/
	@Override
	public void setUserId(long userId) {
		_legalEntity.setUserId(userId);
	}

	/**
	* Sets the user name of this legal entity.
	*
	* @param userName the user name of this legal entity
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_legalEntity.setUserName(userName);
	}

	/**
	* Sets the user uuid of this legal entity.
	*
	* @param userUuid the user uuid of this legal entity
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_legalEntity.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this legal entity.
	*
	* @param uuid the uuid of this legal entity
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_legalEntity.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LegalEntityWrapper)) {
			return false;
		}

		LegalEntityWrapper legalEntityWrapper = (LegalEntityWrapper)obj;

		if (Objects.equals(_legalEntity, legalEntityWrapper._legalEntity)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _legalEntity.getStagedModelType();
	}

	@Override
	public LegalEntity getWrappedModel() {
		return _legalEntity;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _legalEntity.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _legalEntity.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_legalEntity.resetOriginalValues();
	}

	private final LegalEntity _legalEntity;
}