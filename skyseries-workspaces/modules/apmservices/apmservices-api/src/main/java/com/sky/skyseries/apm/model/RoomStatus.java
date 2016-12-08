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
 * The extended model interface for the RoomStatus service. Represents a row in the &quot;apm_room_status&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatusModel
 * @see com.sky.skyseries.apm.model.impl.RoomStatusImpl
 * @see com.sky.skyseries.apm.model.impl.RoomStatusModelImpl
 * @generated
 */
@ImplementationClassName("com.sky.skyseries.apm.model.impl.RoomStatusImpl")
@ProviderType
public interface RoomStatus extends RoomStatusModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.sky.skyseries.apm.model.impl.RoomStatusImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RoomStatus, Long> ROOM_STATUS_ID_ACCESSOR = new Accessor<RoomStatus, Long>() {
			@Override
			public Long get(RoomStatus roomStatus) {
				return roomStatus.getRoomStatusId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RoomStatus> getTypeClass() {
				return RoomStatus.class;
			}
		};
}