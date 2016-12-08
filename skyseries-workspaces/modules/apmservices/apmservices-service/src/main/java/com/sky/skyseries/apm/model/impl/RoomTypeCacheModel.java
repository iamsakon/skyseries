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

import com.sky.skyseries.apm.model.RoomType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RoomType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RoomType
 * @generated
 */
@ProviderType
public class RoomTypeCacheModel implements CacheModel<RoomType>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomTypeCacheModel)) {
			return false;
		}

		RoomTypeCacheModel roomTypeCacheModel = (RoomTypeCacheModel)obj;

		if (roomTypeId == roomTypeCacheModel.roomTypeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomTypeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roomTypeId=");
		sb.append(roomTypeId);
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
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RoomType toEntityModel() {
		RoomTypeImpl roomTypeImpl = new RoomTypeImpl();

		if (uuid == null) {
			roomTypeImpl.setUuid(StringPool.BLANK);
		}
		else {
			roomTypeImpl.setUuid(uuid);
		}

		roomTypeImpl.setRoomTypeId(roomTypeId);
		roomTypeImpl.setGroupId(groupId);
		roomTypeImpl.setCompanyId(companyId);
		roomTypeImpl.setUserId(userId);

		if (userName == null) {
			roomTypeImpl.setUserName(StringPool.BLANK);
		}
		else {
			roomTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomTypeImpl.setCreateDate(null);
		}
		else {
			roomTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomTypeImpl.setModifiedDate(null);
		}
		else {
			roomTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			roomTypeImpl.setName(StringPool.BLANK);
		}
		else {
			roomTypeImpl.setName(name);
		}

		if (description == null) {
			roomTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			roomTypeImpl.setDescription(description);
		}

		roomTypeImpl.resetOriginalValues();

		return roomTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roomTypeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
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

		objectOutput.writeLong(roomTypeId);

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

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long roomTypeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
}