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

package com.sky.skyseries.apm.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.sky.skyseries.apm.model.Building;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Building in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Building
 * @generated
 */
@ProviderType
public class BuildingCacheModel implements CacheModel<Building>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuildingCacheModel)) {
			return false;
		}

		BuildingCacheModel buildingCacheModel = (BuildingCacheModel)obj;

		if (buildingId == buildingCacheModel.buildingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, buildingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", buildingId=");
		sb.append(buildingId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", name2=");
		sb.append(name2);
		sb.append(", legalEntityId=");
		sb.append(legalEntityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Building toEntityModel() {
		BuildingImpl buildingImpl = new BuildingImpl();

		if (uuid == null) {
			buildingImpl.setUuid(StringPool.BLANK);
		}
		else {
			buildingImpl.setUuid(uuid);
		}

		buildingImpl.setBuildingId(buildingId);
		buildingImpl.setGroupId(groupId);
		buildingImpl.setCompanyId(companyId);
		buildingImpl.setUserId(userId);

		if (userName == null) {
			buildingImpl.setUserName(StringPool.BLANK);
		}
		else {
			buildingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			buildingImpl.setCreateDate(null);
		}
		else {
			buildingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			buildingImpl.setModifiedDate(null);
		}
		else {
			buildingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			buildingImpl.setName(StringPool.BLANK);
		}
		else {
			buildingImpl.setName(name);
		}

		if (name2 == null) {
			buildingImpl.setName2(StringPool.BLANK);
		}
		else {
			buildingImpl.setName2(name2);
		}

		buildingImpl.setLegalEntityId(legalEntityId);

		buildingImpl.resetOriginalValues();

		return buildingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		buildingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		name2 = objectInput.readUTF();

		legalEntityId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(buildingId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (name2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name2);
		}

		objectOutput.writeLong(legalEntityId);
	}

	public String uuid;
	public long buildingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String name2;
	public long legalEntityId;
}