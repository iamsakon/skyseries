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

import com.sky.skyseries.apm.model.Room;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Room in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Room
 * @generated
 */
@ProviderType
public class RoomCacheModel implements CacheModel<Room>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomCacheModel)) {
			return false;
		}

		RoomCacheModel roomCacheModel = (RoomCacheModel)obj;

		if (roomId == roomCacheModel.roomId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roomId=");
		sb.append(roomId);
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
		sb.append(", floorId=");
		sb.append(floorId);
		sb.append(", roomStatusId=");
		sb.append(roomStatusId);
		sb.append(", roomTypeId=");
		sb.append(roomTypeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Room toEntityModel() {
		RoomImpl roomImpl = new RoomImpl();

		if (uuid == null) {
			roomImpl.setUuid(StringPool.BLANK);
		}
		else {
			roomImpl.setUuid(uuid);
		}

		roomImpl.setRoomId(roomId);
		roomImpl.setGroupId(groupId);
		roomImpl.setCompanyId(companyId);
		roomImpl.setUserId(userId);

		if (userName == null) {
			roomImpl.setUserName(StringPool.BLANK);
		}
		else {
			roomImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomImpl.setCreateDate(null);
		}
		else {
			roomImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomImpl.setModifiedDate(null);
		}
		else {
			roomImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			roomImpl.setName(StringPool.BLANK);
		}
		else {
			roomImpl.setName(name);
		}

		roomImpl.setFloorId(floorId);
		roomImpl.setRoomStatusId(roomStatusId);
		roomImpl.setRoomTypeId(roomTypeId);

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roomId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		floorId = objectInput.readLong();

		roomStatusId = objectInput.readLong();

		roomTypeId = objectInput.readLong();
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

		objectOutput.writeLong(roomId);

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

		objectOutput.writeLong(floorId);

		objectOutput.writeLong(roomStatusId);

		objectOutput.writeLong(roomTypeId);
	}

	public String uuid;
	public long roomId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long floorId;
	public long roomStatusId;
	public long roomTypeId;
}