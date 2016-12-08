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
 * Provides a wrapper for {@link RoomTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomTypeLocalService
 * @generated
 */
@ProviderType
public class RoomTypeLocalServiceWrapper implements RoomTypeLocalService,
	ServiceWrapper<RoomTypeLocalService> {
	public RoomTypeLocalServiceWrapper(
		RoomTypeLocalService roomTypeLocalService) {
		_roomTypeLocalService = roomTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _roomTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _roomTypeLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _roomTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the room type to the database. Also notifies the appropriate model listeners.
	*
	* @param roomType the room type
	* @return the room type that was added
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType addRoomType(
		com.sky.skyseries.apm.model.RoomType roomType) {
		return _roomTypeLocalService.addRoomType(roomType);
	}

	/**
	* Creates a new room type with the primary key. Does not add the room type to the database.
	*
	* @param roomTypeId the primary key for the new room type
	* @return the new room type
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType createRoomType(long roomTypeId) {
		return _roomTypeLocalService.createRoomType(roomTypeId);
	}

	/**
	* Deletes the room type from the database. Also notifies the appropriate model listeners.
	*
	* @param roomType the room type
	* @return the room type that was removed
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType deleteRoomType(
		com.sky.skyseries.apm.model.RoomType roomType) {
		return _roomTypeLocalService.deleteRoomType(roomType);
	}

	/**
	* Deletes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomTypeId the primary key of the room type
	* @return the room type that was removed
	* @throws PortalException if a room type with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType deleteRoomType(long roomTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomTypeLocalService.deleteRoomType(roomTypeId);
	}

	@Override
	public com.sky.skyseries.apm.model.RoomType fetchRoomType(long roomTypeId) {
		return _roomTypeLocalService.fetchRoomType(roomTypeId);
	}

	/**
	* Returns the room type matching the UUID and group.
	*
	* @param uuid the room type's UUID
	* @param groupId the primary key of the group
	* @return the matching room type, or <code>null</code> if a matching room type could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType fetchRoomTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _roomTypeLocalService.fetchRoomTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the room type with the primary key.
	*
	* @param roomTypeId the primary key of the room type
	* @return the room type
	* @throws PortalException if a room type with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType getRoomType(long roomTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomTypeLocalService.getRoomType(roomTypeId);
	}

	/**
	* Returns the room type matching the UUID and group.
	*
	* @param uuid the room type's UUID
	* @param groupId the primary key of the group
	* @return the matching room type
	* @throws PortalException if a matching room type could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType getRoomTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomTypeLocalService.getRoomTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the room type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param roomType the room type
	* @return the room type that was updated
	*/
	@Override
	public com.sky.skyseries.apm.model.RoomType updateRoomType(
		com.sky.skyseries.apm.model.RoomType roomType) {
		return _roomTypeLocalService.updateRoomType(roomType);
	}

	/**
	* Returns the number of room types.
	*
	* @return the number of room types
	*/
	@Override
	public int getRoomTypesCount() {
		return _roomTypeLocalService.getRoomTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roomTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _roomTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _roomTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _roomTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the room types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @return the range of room types
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.RoomType> getRoomTypes(
		int start, int end) {
		return _roomTypeLocalService.getRoomTypes(start, end);
	}

	/**
	* Returns all the room types matching the UUID and company.
	*
	* @param uuid the UUID of the room types
	* @param companyId the primary key of the company
	* @return the matching room types, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.RoomType> getRoomTypesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _roomTypeLocalService.getRoomTypesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of room types matching the UUID and company.
	*
	* @param uuid the UUID of the room types
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of room types
	* @param end the upper bound of the range of room types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching room types, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.RoomType> getRoomTypesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.RoomType> orderByComparator) {
		return _roomTypeLocalService.getRoomTypesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _roomTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _roomTypeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public RoomTypeLocalService getWrappedService() {
		return _roomTypeLocalService;
	}

	@Override
	public void setWrappedService(RoomTypeLocalService roomTypeLocalService) {
		_roomTypeLocalService = roomTypeLocalService;
	}

	private RoomTypeLocalService _roomTypeLocalService;
}