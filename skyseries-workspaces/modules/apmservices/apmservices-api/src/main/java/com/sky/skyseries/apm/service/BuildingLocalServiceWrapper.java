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
 * Provides a wrapper for {@link BuildingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BuildingLocalService
 * @generated
 */
@ProviderType
public class BuildingLocalServiceWrapper implements BuildingLocalService,
	ServiceWrapper<BuildingLocalService> {
	public BuildingLocalServiceWrapper(
		BuildingLocalService buildingLocalService) {
		_buildingLocalService = buildingLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _buildingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _buildingLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _buildingLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _buildingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buildingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buildingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the building to the database. Also notifies the appropriate model listeners.
	*
	* @param building the building
	* @return the building that was added
	*/
	@Override
	public com.sky.skyseries.apm.model.Building addBuilding(
		com.sky.skyseries.apm.model.Building building) {
		return _buildingLocalService.addBuilding(building);
	}

	/**
	* Creates a new building with the primary key. Does not add the building to the database.
	*
	* @param buildingId the primary key for the new building
	* @return the new building
	*/
	@Override
	public com.sky.skyseries.apm.model.Building createBuilding(long buildingId) {
		return _buildingLocalService.createBuilding(buildingId);
	}

	/**
	* Deletes the building from the database. Also notifies the appropriate model listeners.
	*
	* @param building the building
	* @return the building that was removed
	*/
	@Override
	public com.sky.skyseries.apm.model.Building deleteBuilding(
		com.sky.skyseries.apm.model.Building building) {
		return _buildingLocalService.deleteBuilding(building);
	}

	/**
	* Deletes the building with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param buildingId the primary key of the building
	* @return the building that was removed
	* @throws PortalException if a building with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.Building deleteBuilding(long buildingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buildingLocalService.deleteBuilding(buildingId);
	}

	@Override
	public com.sky.skyseries.apm.model.Building fetchBuilding(long buildingId) {
		return _buildingLocalService.fetchBuilding(buildingId);
	}

	/**
	* Returns the building matching the UUID and group.
	*
	* @param uuid the building's UUID
	* @param groupId the primary key of the group
	* @return the matching building, or <code>null</code> if a matching building could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.Building fetchBuildingByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _buildingLocalService.fetchBuildingByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the building with the primary key.
	*
	* @param buildingId the primary key of the building
	* @return the building
	* @throws PortalException if a building with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.Building getBuilding(long buildingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buildingLocalService.getBuilding(buildingId);
	}

	/**
	* Returns the building matching the UUID and group.
	*
	* @param uuid the building's UUID
	* @param groupId the primary key of the group
	* @return the matching building
	* @throws PortalException if a matching building could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.Building getBuildingByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buildingLocalService.getBuildingByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the building in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param building the building
	* @return the building that was updated
	*/
	@Override
	public com.sky.skyseries.apm.model.Building updateBuilding(
		com.sky.skyseries.apm.model.Building building) {
		return _buildingLocalService.updateBuilding(building);
	}

	/**
	* Returns the number of buildings.
	*
	* @return the number of buildings
	*/
	@Override
	public int getBuildingsCount() {
		return _buildingLocalService.getBuildingsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _buildingLocalService.getOSGiServiceIdentifier();
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
		return _buildingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buildingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buildingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the buildings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.BuildingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @return the range of buildings
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.Building> getBuildings(
		int start, int end) {
		return _buildingLocalService.getBuildings(start, end);
	}

	/**
	* Returns all the buildings matching the UUID and company.
	*
	* @param uuid the UUID of the buildings
	* @param companyId the primary key of the company
	* @return the matching buildings, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.Building> getBuildingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _buildingLocalService.getBuildingsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of buildings matching the UUID and company.
	*
	* @param uuid the UUID of the buildings
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of buildings
	* @param end the upper bound of the range of buildings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching buildings, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.Building> getBuildingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.Building> orderByComparator) {
		return _buildingLocalService.getBuildingsByUuidAndCompanyId(uuid,
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
		return _buildingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _buildingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public BuildingLocalService getWrappedService() {
		return _buildingLocalService;
	}

	@Override
	public void setWrappedService(BuildingLocalService buildingLocalService) {
		_buildingLocalService = buildingLocalService;
	}

	private BuildingLocalService _buildingLocalService;
}