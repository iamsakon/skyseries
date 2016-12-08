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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RoomType service. Represents a row in the &quot;apm_room_type&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.sky.skyseries.apm.model.impl.RoomTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.sky.skyseries.apm.model.impl.RoomTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomType
 * @see com.sky.skyseries.apm.model.impl.RoomTypeImpl
 * @see com.sky.skyseries.apm.model.impl.RoomTypeModelImpl
 * @generated
 */
@ProviderType
public interface RoomTypeModel extends BaseModel<RoomType>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a room type model instance should use the {@link RoomType} interface instead.
	 */

	/**
	 * Returns the primary key of this room type.
	 *
	 * @return the primary key of this room type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this room type.
	 *
	 * @param primaryKey the primary key of this room type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this room type.
	 *
	 * @return the uuid of this room type
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this room type.
	 *
	 * @param uuid the uuid of this room type
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the room type ID of this room type.
	 *
	 * @return the room type ID of this room type
	 */
	public long getRoomTypeId();

	/**
	 * Sets the room type ID of this room type.
	 *
	 * @param roomTypeId the room type ID of this room type
	 */
	public void setRoomTypeId(long roomTypeId);

	/**
	 * Returns the group ID of this room type.
	 *
	 * @return the group ID of this room type
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this room type.
	 *
	 * @param groupId the group ID of this room type
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this room type.
	 *
	 * @return the company ID of this room type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this room type.
	 *
	 * @param companyId the company ID of this room type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this room type.
	 *
	 * @return the user ID of this room type
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this room type.
	 *
	 * @param userId the user ID of this room type
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this room type.
	 *
	 * @return the user uuid of this room type
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this room type.
	 *
	 * @param userUuid the user uuid of this room type
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this room type.
	 *
	 * @return the user name of this room type
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this room type.
	 *
	 * @param userName the user name of this room type
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this room type.
	 *
	 * @return the create date of this room type
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this room type.
	 *
	 * @param createDate the create date of this room type
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this room type.
	 *
	 * @return the modified date of this room type
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this room type.
	 *
	 * @param modifiedDate the modified date of this room type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this room type.
	 *
	 * @return the name of this room type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this room type.
	 *
	 * @param name the name of this room type
	 */
	public void setName(String name);

	/**
	 * Returns the description of this room type.
	 *
	 * @return the description of this room type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this room type.
	 *
	 * @param description the description of this room type
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RoomType roomType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RoomType> toCacheModel();

	@Override
	public RoomType toEscapedModel();

	@Override
	public RoomType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}