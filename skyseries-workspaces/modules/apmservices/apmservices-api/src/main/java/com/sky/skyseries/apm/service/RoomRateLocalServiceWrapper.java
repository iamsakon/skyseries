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
 * Provides a wrapper for {@link RoomRateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomRateLocalService
 * @generated
 */
@ProviderType
public class RoomRateLocalServiceWrapper implements RoomRateLocalService,
	ServiceWrapper<RoomRateLocalService> {
	public RoomRateLocalServiceWrapper(
		RoomRateLocalService roomRateLocalService) {
		_roomRateLocalService = roomRateLocalService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roomRateLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public RoomRateLocalService getWrappedService() {
		return _roomRateLocalService;
	}

	@Override
	public void setWrappedService(RoomRateLocalService roomRateLocalService) {
		_roomRateLocalService = roomRateLocalService;
	}

	private RoomRateLocalService _roomRateLocalService;
}