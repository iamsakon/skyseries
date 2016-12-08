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
 * Provides the local service utility for Floor. This utility wraps
 * {@link com.sky.skyseries.apm.service.impl.FloorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FloorLocalService
 * @see com.sky.skyseries.apm.service.base.FloorLocalServiceBaseImpl
 * @see com.sky.skyseries.apm.service.impl.FloorLocalServiceImpl
 * @generated
 */
@ProviderType
public class FloorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.sky.skyseries.apm.service.impl.FloorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the floor to the database. Also notifies the appropriate model listeners.
	*
	* @param floor the floor
	* @return the floor that was added
	*/
	public static com.sky.skyseries.apm.model.Floor addFloor(
		com.sky.skyseries.apm.model.Floor floor) {
		return getService().addFloor(floor);
	}

	/**
	* Creates a new floor with the primary key. Does not add the floor to the database.
	*
	* @param floorId the primary key for the new floor
	* @return the new floor
	*/
	public static com.sky.skyseries.apm.model.Floor createFloor(long floorId) {
		return getService().createFloor(floorId);
	}

	/**
	* Deletes the floor from the database. Also notifies the appropriate model listeners.
	*
	* @param floor the floor
	* @return the floor that was removed
	*/
	public static com.sky.skyseries.apm.model.Floor deleteFloor(
		com.sky.skyseries.apm.model.Floor floor) {
		return getService().deleteFloor(floor);
	}

	/**
	* Deletes the floor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param floorId the primary key of the floor
	* @return the floor that was removed
	* @throws PortalException if a floor with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.Floor deleteFloor(long floorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFloor(floorId);
	}

	public static com.sky.skyseries.apm.model.Floor fetchFloor(long floorId) {
		return getService().fetchFloor(floorId);
	}

	/**
	* Returns the floor matching the UUID and group.
	*
	* @param uuid the floor's UUID
	* @param groupId the primary key of the group
	* @return the matching floor, or <code>null</code> if a matching floor could not be found
	*/
	public static com.sky.skyseries.apm.model.Floor fetchFloorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchFloorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the floor with the primary key.
	*
	* @param floorId the primary key of the floor
	* @return the floor
	* @throws PortalException if a floor with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.Floor getFloor(long floorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFloor(floorId);
	}

	/**
	* Returns the floor matching the UUID and group.
	*
	* @param uuid the floor's UUID
	* @param groupId the primary key of the group
	* @return the matching floor
	* @throws PortalException if a matching floor could not be found
	*/
	public static com.sky.skyseries.apm.model.Floor getFloorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFloorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the floor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param floor the floor
	* @return the floor that was updated
	*/
	public static com.sky.skyseries.apm.model.Floor updateFloor(
		com.sky.skyseries.apm.model.Floor floor) {
		return getService().updateFloor(floor);
	}

	/**
	* Returns the number of floors.
	*
	* @return the number of floors
	*/
	public static int getFloorsCount() {
		return getService().getFloorsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the floors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.FloorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @return the range of floors
	*/
	public static java.util.List<com.sky.skyseries.apm.model.Floor> getFloors(
		int start, int end) {
		return getService().getFloors(start, end);
	}

	/**
	* Returns all the floors matching the UUID and company.
	*
	* @param uuid the UUID of the floors
	* @param companyId the primary key of the company
	* @return the matching floors, or an empty list if no matches were found
	*/
	public static java.util.List<com.sky.skyseries.apm.model.Floor> getFloorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getFloorsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of floors matching the UUID and company.
	*
	* @param uuid the UUID of the floors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of floors
	* @param end the upper bound of the range of floors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching floors, or an empty list if no matches were found
	*/
	public static java.util.List<com.sky.skyseries.apm.model.Floor> getFloorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.Floor> orderByComparator) {
		return getService()
				   .getFloorsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
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

	public static FloorLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FloorLocalService, FloorLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FloorLocalService.class);
}