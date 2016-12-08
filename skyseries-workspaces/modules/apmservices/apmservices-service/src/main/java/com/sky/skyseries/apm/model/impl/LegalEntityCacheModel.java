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

import com.sky.skyseries.apm.model.LegalEntity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LegalEntity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntity
 * @generated
 */
@ProviderType
public class LegalEntityCacheModel implements CacheModel<LegalEntity>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LegalEntityCacheModel)) {
			return false;
		}

		LegalEntityCacheModel legalEntityCacheModel = (LegalEntityCacheModel)obj;

		if (legalEntityId == legalEntityCacheModel.legalEntityId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, legalEntityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", legalEntityId=");
		sb.append(legalEntityId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LegalEntity toEntityModel() {
		LegalEntityImpl legalEntityImpl = new LegalEntityImpl();

		if (uuid == null) {
			legalEntityImpl.setUuid(StringPool.BLANK);
		}
		else {
			legalEntityImpl.setUuid(uuid);
		}

		legalEntityImpl.setLegalEntityId(legalEntityId);
		legalEntityImpl.setGroupId(groupId);
		legalEntityImpl.setCompanyId(companyId);
		legalEntityImpl.setUserId(userId);

		if (userName == null) {
			legalEntityImpl.setUserName(StringPool.BLANK);
		}
		else {
			legalEntityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			legalEntityImpl.setCreateDate(null);
		}
		else {
			legalEntityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			legalEntityImpl.setModifiedDate(null);
		}
		else {
			legalEntityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			legalEntityImpl.setName(StringPool.BLANK);
		}
		else {
			legalEntityImpl.setName(name);
		}

		legalEntityImpl.resetOriginalValues();

		return legalEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		legalEntityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
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

		objectOutput.writeLong(legalEntityId);

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
	}

	public String uuid;
	public long legalEntityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
}