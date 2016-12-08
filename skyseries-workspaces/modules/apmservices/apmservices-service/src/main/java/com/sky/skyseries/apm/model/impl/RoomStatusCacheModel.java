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

import com.sky.skyseries.apm.model.RoomStatus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RoomStatus in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatus
 * @generated
 */
@ProviderType
public class RoomStatusCacheModel implements CacheModel<RoomStatus>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomStatusCacheModel)) {
			return false;
		}

		RoomStatusCacheModel roomStatusCacheModel = (RoomStatusCacheModel)obj;

		if (roomStatusId == roomStatusCacheModel.roomStatusId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomStatusId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roomStatusId=");
		sb.append(roomStatusId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RoomStatus toEntityModel() {
		RoomStatusImpl roomStatusImpl = new RoomStatusImpl();

		if (uuid == null) {
			roomStatusImpl.setUuid(StringPool.BLANK);
		}
		else {
			roomStatusImpl.setUuid(uuid);
		}

		roomStatusImpl.setRoomStatusId(roomStatusId);
		roomStatusImpl.setGroupId(groupId);
		roomStatusImpl.setCompanyId(companyId);
		roomStatusImpl.setUserId(userId);

		if (userName == null) {
			roomStatusImpl.setUserName(StringPool.BLANK);
		}
		else {
			roomStatusImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomStatusImpl.setCreateDate(null);
		}
		else {
			roomStatusImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomStatusImpl.setModifiedDate(null);
		}
		else {
			roomStatusImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			roomStatusImpl.setCode(StringPool.BLANK);
		}
		else {
			roomStatusImpl.setCode(code);
		}

		if (name == null) {
			roomStatusImpl.setName(StringPool.BLANK);
		}
		else {
			roomStatusImpl.setName(name);
		}

		roomStatusImpl.resetOriginalValues();

		return roomStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roomStatusId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
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

		objectOutput.writeLong(roomStatusId);

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

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String uuid;
	public long roomStatusId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public String name;
}