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
 * Provides a wrapper for {@link RoomRateService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomRateService
 * @generated
 */
@ProviderType
public class RoomRateServiceWrapper implements RoomRateService,
	ServiceWrapper<RoomRateService> {
	public RoomRateServiceWrapper(RoomRateService roomRateService) {
		_roomRateService = roomRateService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roomRateService.getOSGiServiceIdentifier();
	}

	@Override
	public RoomRateService getWrappedService() {
		return _roomRateService;
	}

	@Override
	public void setWrappedService(RoomRateService roomRateService) {
		_roomRateService = roomRateService;
	}

	private RoomRateService _roomRateService;
}