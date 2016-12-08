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
 * Provides the local service utility for LegalEntity. This utility wraps
 * {@link com.sky.skyseries.apm.service.impl.LegalEntityLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntityLocalService
 * @see com.sky.skyseries.apm.service.base.LegalEntityLocalServiceBaseImpl
 * @see com.sky.skyseries.apm.service.impl.LegalEntityLocalServiceImpl
 * @generated
 */
@ProviderType
public class LegalEntityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.sky.skyseries.apm.service.impl.LegalEntityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the legal entity to the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was added
	*/
	public static com.sky.skyseries.apm.model.LegalEntity addLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return getService().addLegalEntity(legalEntity);
	}

	/**
	* Creates a new legal entity with the primary key. Does not add the legal entity to the database.
	*
	* @param legalEntityId the primary key for the new legal entity
	* @return the new legal entity
	*/
	public static com.sky.skyseries.apm.model.LegalEntity createLegalEntity(
		long legalEntityId) {
		return getService().createLegalEntity(legalEntityId);
	}

	/**
	* Deletes the legal entity from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was removed
	*/
	public static com.sky.skyseries.apm.model.LegalEntity deleteLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return getService().deleteLegalEntity(legalEntity);
	}

	/**
	* Deletes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity that was removed
	* @throws PortalException if a legal entity with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.LegalEntity deleteLegalEntity(
		long legalEntityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLegalEntity(legalEntityId);
	}

	public static com.sky.skyseries.apm.model.LegalEntity fetchLegalEntity(
		long legalEntityId) {
		return getService().fetchLegalEntity(legalEntityId);
	}

	/**
	* Returns the legal entity matching the UUID and group.
	*
	* @param uuid the legal entity's UUID
	* @param groupId the primary key of the group
	* @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	*/
	public static com.sky.skyseries.apm.model.LegalEntity fetchLegalEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchLegalEntityByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the legal entity with the primary key.
	*
	* @param legalEntityId the primary key of the legal entity
	* @return the legal entity
	* @throws PortalException if a legal entity with the primary key could not be found
	*/
	public static com.sky.skyseries.apm.model.LegalEntity getLegalEntity(
		long legalEntityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLegalEntity(legalEntityId);
	}

	/**
	* Returns the legal entity matching the UUID and group.
	*
	* @param uuid the legal entity's UUID
	* @param groupId the primary key of the group
	* @return the matching legal entity
	* @throws PortalException if a matching legal entity could not be found
	*/
	public static com.sky.skyseries.apm.model.LegalEntity getLegalEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLegalEntityByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the legal entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param legalEntity the legal entity
	* @return the legal entity that was updated
	*/
	public static com.sky.skyseries.apm.model.LegalEntity updateLegalEntity(
		com.sky.skyseries.apm.model.LegalEntity legalEntity) {
		return getService().updateLegalEntity(legalEntity);
	}

	/**
	* Returns the number of legal entities.
	*
	* @return the number of legal entities
	*/
	public static int getLegalEntitiesCount() {
		return getService().getLegalEntitiesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sky.skyseries.apm.model.impl.LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntities(
		int start, int end) {
		return getService().getLegalEntities(start, end);
	}

	/**
	* Returns all the legal entities matching the UUID and company.
	*
	* @param uuid the UUID of the legal entities
	* @param companyId the primary key of the company
	* @return the matching legal entities, or an empty list if no matches were found
	*/
	public static java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getLegalEntitiesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.sky.skyseries.apm.model.LegalEntity> getLegalEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.sky.skyseries.apm.model.LegalEntity> orderByComparator) {
		return getService()
				   .getLegalEntitiesByUuidAndCompanyId(uuid, companyId, start,
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

	public static LegalEntityLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LegalEntityLocalService, LegalEntityLocalService> _serviceTracker =
		ServiceTrackerFactory.open(LegalEntityLocalService.class);
}