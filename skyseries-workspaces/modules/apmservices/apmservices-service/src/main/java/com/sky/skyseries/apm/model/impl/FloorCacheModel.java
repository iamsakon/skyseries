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

import com.sky.skyseries.apm.model.Floor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Floor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Floor
 * @generated
 */
@ProviderType
public class FloorCacheModel implements CacheModel<Floor>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FloorCacheModel)) {
			return false;
		}

		FloorCacheModel floorCacheModel = (FloorCacheModel)obj;

		if (floorId == floorCacheModel.floorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, floorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", floorId=");
		sb.append(floorId);
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
		sb.append(", buildingId=");
		sb.append(buildingId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Floor toEntityModel() {
		FloorImpl floorImpl = new FloorImpl();

		if (uuid == null) {
			floorImpl.setUuid(StringPool.BLANK);
		}
		else {
			floorImpl.setUuid(uuid);
		}

		floorImpl.setFloorId(floorId);
		floorImpl.setGroupId(groupId);
		floorImpl.setCompanyId(companyId);
		floorImpl.setUserId(userId);

		if (userName == null) {
			floorImpl.setUserName(StringPool.BLANK);
		}
		else {
			floorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			floorImpl.setCreateDate(null);
		}
		else {
			floorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			floorImpl.setModifiedDate(null);
		}
		else {
			floorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			floorImpl.setName(StringPool.BLANK);
		}
		else {
			floorImpl.setName(name);
		}

		floorImpl.setBuildingId(buildingId);

		floorImpl.resetOriginalValues();

		return floorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		floorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		buildingId = objectInput.readLong();
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

		objectOutput.writeLong(floorId);

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

		objectOutput.writeLong(buildingId);
	}

	public String uuid;
	public long floorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long buildingId;
}