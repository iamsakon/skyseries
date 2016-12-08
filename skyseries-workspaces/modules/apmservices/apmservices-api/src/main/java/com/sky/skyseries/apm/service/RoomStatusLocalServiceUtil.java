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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for RoomStatus. This utility wraps
 * {@link com.sky.skyseries.apm.service.impl.RoomStatusLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatusLocalService
 * @see com.sky.skyseries.apm.service.base.RoomStatusLocalServiceBaseImpl
 * @see com.sky.skyseries.apm.service.impl.RoomStatusLocalServiceImpl
 * @generated
 */
@ProviderType
public class RoomStatusLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.sky.skyseries.apm.service.impl.RoomStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the room status to the database. Also notifies the appropriate model listeners.
	*
	* @param roomStatus the room status
	* @return the room status that was added
	*/
	public static com.sky.skyseries.apm.model.RoomStatus addRoomStatus(
		com.sky.skyseries.apm.model.RoomStatus roomStatus) {
		return getService().addRoomStatus(roomStatus);
	}

	/**
	* Creates a new room status with the primary key. Does not add the room status to the database.
	*
	* @param roomStatusId the primary key for the new room status
	* @return the new room status
	*/
	public static com.sky.skyseries.apm.model.RoomStatus createRoomStatus(
		long roomStatusId) {
		return getService().createRoomStatus(roomStatusId);
	}

	/**
	* Deletes the room status from the database. Also notifies the appropriate model listeners.
	*
	* @param roomStatus the room status
	* @return the room status that was removed
	*/
	public static com.sky.skyseries.apm.model.RoomStatus deleteRoomStatus(
		com.sky.skyseries.apm.model.RoomStatus roomStatus) {
		return getService().deleteRoomStatus(roomStatus);
	}

	/**
	* Deletes the room status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomStatusId the primary key of the room status
	* @return the room status that was removed
	* @throws PortalException if a room status with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.RoomStatus deleteRoomStatus(
		long roomStatusId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRoomStatus(roomStatusId);
	}

	public static com.sky.skyseries.apm.model.RoomStatus fetchRoomStatus(
		long roomStatusId) {
		return getService().fetchRoomStatus(roomStatusId);
	}

	/**
	* Returns the room status matching the UUID and group.
	*
	* @param uuid the room status's UUID
	* @param groupId the primary key of the group
	* @return the matching room status, or <code>null</code> if a matching room status could not be found
	*/
	public static com.sky.skyseries.apm.model.RoomStatus fetchRoomStatusByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchRoomStatusByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the room status with the primary key.
	*
	* @param roomStatusId the primary key of the room status
	* @return the room status
	* @throws PortalException if a room status with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.RoomStatus getRoomStatus(
		long roomStatusId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRoomStatus(roomStatusId);
	}

	/**
	* Returns the room status matching the UUID and group.
	*
	* @param uuid the room status's UUID
	* @param groupId the primary key of the group
	* @return the matching room status
	* @throws PortalException if a matching room status could not be found
	*/
	public static com.sky.skyseries.apm.model.RoomStatus getRoomStatusByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRoomStatusByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the room status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param roomStatus the room status
	* @return the room status that was updated
	*/
	public static com.sky.skyseries.apm.model.RoomStatus updateRoomStatus(
		com.sky.skyseries.apm.model.RoomStatus roomStatus) {
		return getService().updateRoomStatus(roomStatus);
	}

	/**
	* Returns the number of room statuses.
	*
	* @return the number of room statuses
	*/
	public static int getRoomStatusesCount() {
		return getService().getRoomStatusesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the room statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @return the range of room statuses
	*/
	public static java.util.List<com.sky.skyseries.apm.model.RoomStatus> getRoomStatuses(
		int start, int end) {
		return getService().getRoomStatuses(start, end);
	}

	/**
	* Returns all the room statuses matching the UUID and company.
	*
	* @param uuid the UUID of the room statuses
	* @param companyId the primary key of the company
	* @return the matching room statuses, or an empty list if no matches were found
	*/
	public static java.util.List<com.sky.skyseries.apm.model.RoomStatus> getRoomStatusesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getRoomStatusesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of room statuses matching the UUID and company.
	*
	* @param uuid the UUID of the room statuses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of room statuses
	* @param end the upper bound of the range of room statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching room statuses, or an empty list if no matches were found
	*/
	public static java.util.List<com.sky.skyseries.apm.model.RoomStatus> getRoomStatusesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.RoomStatus> orderByComparator) {
		return getService()
				   .getRoomStatusesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static RoomStatusLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RoomStatusLocalService, RoomStatusLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RoomStatusLocalService.class);
}