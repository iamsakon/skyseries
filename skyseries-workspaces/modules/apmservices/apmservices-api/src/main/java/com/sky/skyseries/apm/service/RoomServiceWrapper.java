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

package com.sky.skyseries.apm.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RoomService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomService
 * @generated
 */
@ProviderType
public class RoomServiceWrapper implements RoomService,
	ServiceWrapper<RoomService> {
	public RoomServiceWrapper(RoomService roomService) {
		_roomService = roomService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roomService.getOSGiServiceIdentifier();
	}

	@Override
	public RoomService getWrappedService() {
		return _roomService;
	}

	@Override
	public void setWrappedService(RoomService roomService) {
		_roomService = roomService;
	}

	private RoomService _roomService;
}