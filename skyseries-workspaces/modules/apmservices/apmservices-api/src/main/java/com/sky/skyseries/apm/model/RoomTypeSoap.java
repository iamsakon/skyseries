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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sky.skyseries.apm.service.http.RoomTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.http.RoomTypeServiceSoap
 * @generated
 */
@ProviderType
public class RoomTypeSoap implements Serializable {
	public static RoomTypeSoap toSoapModel(RoomType model) {
		RoomTypeSoap soapModel = new RoomTypeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRoomTypeId(model.getRoomTypeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static RoomTypeSoap[] toSoapModels(RoomType[] models) {
		RoomTypeSoap[] soapModels = new RoomTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomTypeSoap[][] toSoapModels(RoomType[][] models) {
		RoomTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomTypeSoap[] toSoapModels(List<RoomType> models) {
		List<RoomTypeSoap> soapModels = new ArrayList<RoomTypeSoap>(models.size());

		for (RoomType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomTypeSoap[soapModels.size()]);
	}

	public RoomTypeSoap() {
	}

	public long getPrimaryKey() {
		return _roomTypeId;
	}

	public void setPrimaryKey(long pk) {
		setRoomTypeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRoomTypeId() {
		return _roomTypeId;
	}

	public void setRoomTypeId(long roomTypeId) {
		_roomTypeId = roomTypeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _roomTypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
}