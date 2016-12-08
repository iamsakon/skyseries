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
 * This class is used by SOAP remote services, specifically {@link com.sky.skyseries.apm.service.http.RoomServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.http.RoomServiceSoap
 * @generated
 */
@ProviderType
public class RoomSoap implements Serializable {
	public static RoomSoap toSoapModel(Room model) {
		RoomSoap soapModel = new RoomSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRoomId(model.getRoomId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setFloorId(model.getFloorId());
		soapModel.setRoomStatusId(model.getRoomStatusId());
		soapModel.setRoomTypeId(model.getRoomTypeId());

		return soapModel;
	}

	public static RoomSoap[] toSoapModels(Room[] models) {
		RoomSoap[] soapModels = new RoomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[][] toSoapModels(Room[][] models) {
		RoomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[] toSoapModels(List<Room> models) {
		List<RoomSoap> soapModels = new ArrayList<RoomSoap>(models.size());

		for (Room model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomSoap[soapModels.size()]);
	}

	public RoomSoap() {
	}

	public long getPrimaryKey() {
		return _roomId;
	}

	public void setPrimaryKey(long pk) {
		setRoomId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRoomId() {
		return _roomId;
	}

	public void setRoomId(long roomId) {
		_roomId = roomId;
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

	public long getFloorId() {
		return _floorId;
	}

	public void setFloorId(long floorId) {
		_floorId = floorId;
	}

	public long getRoomStatusId() {
		return _roomStatusId;
	}

	public void setRoomStatusId(long roomStatusId) {
		_roomStatusId = roomStatusId;
	}

	public long getRoomTypeId() {
		return _roomTypeId;
	}

	public void setRoomTypeId(long roomTypeId) {
		_roomTypeId = roomTypeId;
	}

	private String _uuid;
	private long _roomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _floorId;
	private long _roomStatusId;
	private long _roomTypeId;
}