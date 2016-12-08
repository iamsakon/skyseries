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
 * Provides a wrapper for {@link FloorService}.
 *
 * @author Brian Wing Shun Chan
 * @see FloorService
 * @generated
 */
@ProviderType
public class FloorServiceWrapper implements FloorService,
	ServiceWrapper<FloorService> {
	public FloorServiceWrapper(FloorService floorService) {
		_floorService = floorService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _floorService.getOSGiServiceIdentifier();
	}

	@Override
	public FloorService getWrappedService() {
		return _floorService;
	}

	@Override
	public void setWrappedService(FloorService floorService) {
		_floorService = floorService;
	}

	private FloorService _floorService;
}