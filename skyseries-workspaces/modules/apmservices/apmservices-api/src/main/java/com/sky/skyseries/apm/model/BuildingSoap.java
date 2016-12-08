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
 * This class is used by SOAP remote services, specifically {@link com.sky.skyseries.apm.service.http.BuildingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.http.BuildingServiceSoap
 * @generated
 */
@ProviderType
public class BuildingSoap implements Serializable {
	public static BuildingSoap toSoapModel(Building model) {
		BuildingSoap soapModel = new BuildingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBuildingId(model.getBuildingId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setName2(model.getName2());
		soapModel.setLegalEntityId(model.getLegalEntityId());

		return soapModel;
	}

	public static BuildingSoap[] toSoapModels(Building[] models) {
		BuildingSoap[] soapModels = new BuildingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BuildingSoap[][] toSoapModels(Building[][] models) {
		BuildingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BuildingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BuildingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BuildingSoap[] toSoapModels(List<Building> models) {
		List<BuildingSoap> soapModels = new ArrayList<BuildingSoap>(models.size());

		for (Building model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BuildingSoap[soapModels.size()]);
	}

	public BuildingSoap() {
	}

	public long getPrimaryKey() {
		return _buildingId;
	}

	public void setPrimaryKey(long pk) {
		setBuildingId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBuildingId() {
		return _buildingId;
	}

	public void setBuildingId(long buildingId) {
		_buildingId = buildingId;
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

	public String getName2() {
		return _name2;
	}

	public void setName2(String name2) {
		_name2 = name2;
	}

	public long getLegalEntityId() {
		return _legalEntityId;
	}

	public void setLegalEntityId(long legalEntityId) {
		_legalEntityId = legalEntityId;
	}

	private String _uuid;
	private long _buildingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _name2;
	private long _legalEntityId;
}