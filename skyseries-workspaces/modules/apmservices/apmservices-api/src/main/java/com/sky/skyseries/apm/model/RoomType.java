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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the RoomType service. Represents a row in the &quot;apm_room_type&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RoomTypeModel
 * @see com.sky.skyseries.apm.model.impl.RoomTypeImpl
 * @see com.sky.skyseries.apm.model.impl.RoomTypeModelImpl
 * @generated
 */
@ImplementationClassName("com.sky.skyseries.apm.model.impl.RoomTypeImpl")
@ProviderType
public interface RoomType extends RoomTypeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.sky.skyseries.apm.model.impl.RoomTypeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RoomType, Long> ROOM_TYPE_ID_ACCESSOR = new Accessor<RoomType, Long>() {
			@Override
			public Long get(RoomType roomType) {
				return roomType.getRoomTypeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RoomType> getTypeClass() {
				return RoomType.class;
			}
		};
}