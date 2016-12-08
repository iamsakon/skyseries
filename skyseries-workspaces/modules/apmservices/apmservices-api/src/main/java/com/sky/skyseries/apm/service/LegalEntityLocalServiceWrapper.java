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
 * Provides a wrapper for {@link LegalEntityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntityLocalService
 * @generated
 */
@ProviderType
public class LegalEntityLocalServiceWrapper implements LegalEntityLocalService,
	ServiceWrapper<LegalEntityLocalService> {
	public LegalEntityLocalServiceWrapper(
		LegalEntityLocalService legalEntityLocalService) {
		_legalEntityLocalService = legalEntityLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _legalEntityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _legalEntityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _legalEntityLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _legalEntityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _legalEntityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _legalEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the legal entity to the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was added
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity addLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return _legalEntityLocalService.addLegalEntity(legalEntity);
	}

	/**
	* Creates a new legal entity with the primary key. Does not add the legal entity to the database.
	*
	* @param legalEntityId the primary key for the new legal entity
	* @return the new legal entity
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity createLegalEntity(
		long legalEntityId) {
		return _legalEntityLocalService.createLegalEntity(legalEntityId);
	}

	/**
	* Deletes the legal entity from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was removed
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity deleteLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return _legalEntityLocalService.deleteLegalEntity(legalEntity);
	}

	/**
	* Deletes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity that was removed
	* @throws PortalException if a legal entity with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity deleteLegalEntity(
		long legalEntityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _legalEntityLocalService.deleteLegalEntity(legalEntityId);
	}

	@Override
	public com.sky.skyseries.apm.model.LegalEntity fetchLegalEntity(
		long legalEntityId) {
		return _legalEntityLocalService.fetchLegalEntity(legalEntityId);
	}

	/**
	* Returns the legal entity matching the UUID and group.
	*
	* @param uuid the legal entity's UUID
	* @param groupId the primary key of the group
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity fetchLegalEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _legalEntityLocalService.fetchLegalEntityByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the legal entity with the primary key.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity
	* @throws PortalException if a legal entity with the primary key could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity getLegalEntity(
		long legalEntityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _legalEntityLocalService.getLegalEntity(legalEntityId);
	}

	/**
	* Returns the legal entity matching the UUID and group.
	*
	* @param uuid the legal entity's UUID
	* @param groupId the primary key of the group
	* @return the matching legal entity
	* @throws PortalException if a matching legal entity could not be found
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity getLegalEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _legalEntityLocalService.getLegalEntityByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the legal entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was updated
	*/
	@Override
	public com.sky.skyseries.apm.model.LegalEntity updateLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return _legalEntityLocalService.updateLegalEntity(legalEntity);
	}

	/**
	* Returns the number of legal entities.
	*
	* @return the number of legal entities
	*/
	@Override
	public int getLegalEntitiesCount() {
		return _legalEntityLocalService.getLegalEntitiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _legalEntityLocalService.getOSGiServiceIdentifier();
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
		return _legalEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _legalEntityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _legalEntityLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the legal entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @return the range of legal entities
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntities(
		int start, int end) {
		return _legalEntityLocalService.getLegalEntities(start, end);
	}

	/**
	* Returns all the legal entities matching the UUID and company.
	*
	* @param uuid the UUID of the legal entities
	* @param companyId the primary key of the company
	* @return the matching legal entities, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _legalEntityLocalService.getLegalEntitiesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of legal entities matching the UUID and company.
	*
	* @param uuid the UUID of the legal entities
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of legal entities
	* @param end the upper bound of the range of legal entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching legal entities, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.LegalEntity> orderByComparator) {
		return _legalEntityLocalService.getLegalEntitiesByUuidAndCompanyId(uuid,
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
		return _legalEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _legalEntityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public LegalEntityLocalService getWrappedService() {
		return _legalEntityLocalService;
	}

	@Override
	public void setWrappedService(
		LegalEntityLocalService legalEntityLocalService) {
		_legalEntityLocalService = legalEntityLocalService;
	}

	private LegalEntityLocalService _legalEntityLocalService;
}