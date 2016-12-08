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

package com.sky.skyseries.apm.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.sky.skyseries.apm.model.RoomType;
import com.sky.skyseries.apm.service.RoomTypeLocalService;
import com.sky.skyseries.apm.service.persistence.BuildingPersistence;
import com.sky.skyseries.apm.service.persistence.FloorPersistence;
import com.sky.skyseries.apm.service.persistence.LegalEntityPersistence;
import com.sky.skyseries.apm.service.persistence.RoomPersistence;
import com.sky.skyseries.apm.service.persistence.RoomStatusPersistence;
import com.sky.skyseries.apm.service.persistence.RoomTypePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the room type local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.sky.skyseries.apm.service.impl.RoomTypeLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.sky.skyseries.apm.service.impl.RoomTypeLocalServiceImpl
 * @see com.sky.skyseries.apm.service.RoomTypeLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class RoomTypeLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements RoomTypeLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.sky.skyseries.apm.service.RoomTypeLocalServiceUtil} to access the room type local service.
	 */

	/**
	 * Adds the room type to the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomType the room type
	 * @return the room type that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RoomType addRoomType(RoomType roomType) {
		roomType.setNew(true);

		return roomTypePersistence.update(roomType);
	}

	/**
	 * Creates a new room type with the primary key. Does not add the room type to the database.
	 *
	 * @param roomTypeId the primary key for the new room type
	 * @return the new room type
	 */
	@Override
	public RoomType createRoomType(long roomTypeId) {
		return roomTypePersistence.create(roomTypeId);
	}

	/**
	 * Deletes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomTypeId the primary key of the room type
	 * @return the room type that was removed
	 * @throws PortalException if a room type with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RoomType deleteRoomType(long roomTypeId) throws PortalException {
		return roomTypePersistence.remove(roomTypeId);
	}

	/**
	 * Deletes the room type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomType the room type
	 * @return the room type that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RoomType deleteRoomType(RoomType roomType) {
		return roomTypePersistence.remove(roomType);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(RoomType.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return roomTypePersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return roomTypePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return roomTypePersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return roomTypePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return roomTypePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public RoomType fetchRoomType(long roomTypeId) {
		return roomTypePersistence.fetchByPrimaryKey(roomTypeId);
	}

	/**
	 * Returns the room type matching the UUID and group.
	 *
	 * @param uuid the room type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room type, or <code>null</code> if a matching room type could not be found
	 */
	@Override
	public RoomType fetchRoomTypeByUuidAndGroupId(String uuid, long groupId) {
		return roomTypePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room type with the primary key.
	 *
	 * @param roomTypeId the primary key of the room type
	 * @return the room type
	 * @throws PortalException if a room type with the primary key could not be found
	 */
	@Override
	public RoomType getRoomType(long roomTypeId) throws PortalException {
		return roomTypePersistence.findByPrimaryKey(roomTypeId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(roomTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RoomType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("roomTypeId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(roomTypeLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(RoomType.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("roomTypeId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(roomTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RoomType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("roomTypeId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<RoomType>() {
				@Override
				public void performAction(RoomType roomType)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						roomType);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(RoomType.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return roomTypeLocalService.deleteRoomType((RoomType)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return roomTypePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the room types matching the UUID and company.
	 *
	 * @param uuid the UUID of the room types
	 * @param companyId the primary key of the company
	 * @return the matching room types, or an empty list if no matches were found
	 */
	@Override
	public List<RoomType> getRoomTypesByUuidAndCompanyId(String uuid,
		long companyId) {
		return roomTypePersistence.findByUuid_C(uuid, companyId);
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
	public List<RoomType> getRoomTypesByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<RoomType> orderByComparator) {
		return roomTypePersistence.findByUuid_C(uuid, companyId, start, end,
			orderByComparator);
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
	public RoomType getRoomTypeByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {
		return roomTypePersistence.findByUUID_G(uuid, groupId);
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
	public List<RoomType> getRoomTypes(int start, int end) {
		return roomTypePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of room types.
	 *
	 * @return the number of room types
	 */
	@Override
	public int getRoomTypesCount() {
		return roomTypePersistence.countAll();
	}

	/**
	 * Updates the room type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param roomType the room type
	 * @return the room type that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RoomType updateRoomType(RoomType roomType) {
		return roomTypePersistence.update(roomType);
	}

	/**
	 * Returns the building local service.
	 *
	 * @return the building local service
	 */
	public com.sky.skyseries.apm.service.BuildingLocalService getBuildingLocalService() {
		return buildingLocalService;
	}

	/**
	 * Sets the building local service.
	 *
	 * @param buildingLocalService the building local service
	 */
	public void setBuildingLocalService(
		com.sky.skyseries.apm.service.BuildingLocalService buildingLocalService) {
		this.buildingLocalService = buildingLocalService;
	}

	/**
	 * Returns the building persistence.
	 *
	 * @return the building persistence
	 */
	public BuildingPersistence getBuildingPersistence() {
		return buildingPersistence;
	}

	/**
	 * Sets the building persistence.
	 *
	 * @param buildingPersistence the building persistence
	 */
	public void setBuildingPersistence(BuildingPersistence buildingPersistence) {
		this.buildingPersistence = buildingPersistence;
	}

	/**
	 * Returns the floor local service.
	 *
	 * @return the floor local service
	 */
	public com.sky.skyseries.apm.service.FloorLocalService getFloorLocalService() {
		return floorLocalService;
	}

	/**
	 * Sets the floor local service.
	 *
	 * @param floorLocalService the floor local service
	 */
	public void setFloorLocalService(
		com.sky.skyseries.apm.service.FloorLocalService floorLocalService) {
		this.floorLocalService = floorLocalService;
	}

	/**
	 * Returns the floor persistence.
	 *
	 * @return the floor persistence
	 */
	public FloorPersistence getFloorPersistence() {
		return floorPersistence;
	}

	/**
	 * Sets the floor persistence.
	 *
	 * @param floorPersistence the floor persistence
	 */
	public void setFloorPersistence(FloorPersistence floorPersistence) {
		this.floorPersistence = floorPersistence;
	}

	/**
	 * Returns the legal entity local service.
	 *
	 * @return the legal entity local service
	 */
	public com.sky.skyseries.apm.service.LegalEntityLocalService getLegalEntityLocalService() {
		return legalEntityLocalService;
	}

	/**
	 * Sets the legal entity local service.
	 *
	 * @param legalEntityLocalService the legal entity local service
	 */
	public void setLegalEntityLocalService(
		com.sky.skyseries.apm.service.LegalEntityLocalService legalEntityLocalService) {
		this.legalEntityLocalService = legalEntityLocalService;
	}

	/**
	 * Returns the legal entity persistence.
	 *
	 * @return the legal entity persistence
	 */
	public LegalEntityPersistence getLegalEntityPersistence() {
		return legalEntityPersistence;
	}

	/**
	 * Sets the legal entity persistence.
	 *
	 * @param legalEntityPersistence the legal entity persistence
	 */
	public void setLegalEntityPersistence(
		LegalEntityPersistence legalEntityPersistence) {
		this.legalEntityPersistence = legalEntityPersistence;
	}

	/**
	 * Returns the room local service.
	 *
	 * @return the room local service
	 */
	public com.sky.skyseries.apm.service.RoomLocalService getRoomLocalService() {
		return roomLocalService;
	}

	/**
	 * Sets the room local service.
	 *
	 * @param roomLocalService the room local service
	 */
	public void setRoomLocalService(
		com.sky.skyseries.apm.service.RoomLocalService roomLocalService) {
		this.roomLocalService = roomLocalService;
	}

	/**
	 * Returns the room persistence.
	 *
	 * @return the room persistence
	 */
	public RoomPersistence getRoomPersistence() {
		return roomPersistence;
	}

	/**
	 * Sets the room persistence.
	 *
	 * @param roomPersistence the room persistence
	 */
	public void setRoomPersistence(RoomPersistence roomPersistence) {
		this.roomPersistence = roomPersistence;
	}

	/**
	 * Returns the room rate local service.
	 *
	 * @return the room rate local service
	 */
	public com.sky.skyseries.apm.service.RoomRateLocalService getRoomRateLocalService() {
		return roomRateLocalService;
	}

	/**
	 * Sets the room rate local service.
	 *
	 * @param roomRateLocalService the room rate local service
	 */
	public void setRoomRateLocalService(
		com.sky.skyseries.apm.service.RoomRateLocalService roomRateLocalService) {
		this.roomRateLocalService = roomRateLocalService;
	}

	/**
	 * Returns the room status local service.
	 *
	 * @return the room status local service
	 */
	public com.sky.skyseries.apm.service.RoomStatusLocalService getRoomStatusLocalService() {
		return roomStatusLocalService;
	}

	/**
	 * Sets the room status local service.
	 *
	 * @param roomStatusLocalService the room status local service
	 */
	public void setRoomStatusLocalService(
		com.sky.skyseries.apm.service.RoomStatusLocalService roomStatusLocalService) {
		this.roomStatusLocalService = roomStatusLocalService;
	}

	/**
	 * Returns the room status persistence.
	 *
	 * @return the room status persistence
	 */
	public RoomStatusPersistence getRoomStatusPersistence() {
		return roomStatusPersistence;
	}

	/**
	 * Sets the room status persistence.
	 *
	 * @param roomStatusPersistence the room status persistence
	 */
	public void setRoomStatusPersistence(
		RoomStatusPersistence roomStatusPersistence) {
		this.roomStatusPersistence = roomStatusPersistence;
	}

	/**
	 * Returns the room type local service.
	 *
	 * @return the room type local service
	 */
	public RoomTypeLocalService getRoomTypeLocalService() {
		return roomTypeLocalService;
	}

	/**
	 * Sets the room type local service.
	 *
	 * @param roomTypeLocalService the room type local service
	 */
	public void setRoomTypeLocalService(
		RoomTypeLocalService roomTypeLocalService) {
		this.roomTypeLocalService = roomTypeLocalService;
	}

	/**
	 * Returns the room type persistence.
	 *
	 * @return the room type persistence
	 */
	public RoomTypePersistence getRoomTypePersistence() {
		return roomTypePersistence;
	}

	/**
	 * Sets the room type persistence.
	 *
	 * @param roomTypePersistence the room type persistence
	 */
	public void setRoomTypePersistence(RoomTypePersistence roomTypePersistence) {
		this.roomTypePersistence = roomTypePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.sky.skyseries.apm.model.RoomType",
			roomTypeLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.sky.skyseries.apm.model.RoomType");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return RoomTypeLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return RoomType.class;
	}

	protected String getModelClassName() {
		return RoomType.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = roomTypePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.sky.skyseries.apm.service.BuildingLocalService.class)
	protected com.sky.skyseries.apm.service.BuildingLocalService buildingLocalService;
	@BeanReference(type = BuildingPersistence.class)
	protected BuildingPersistence buildingPersistence;
	@BeanReference(type = com.sky.skyseries.apm.service.FloorLocalService.class)
	protected com.sky.skyseries.apm.service.FloorLocalService floorLocalService;
	@BeanReference(type = FloorPersistence.class)
	protected FloorPersistence floorPersistence;
	@BeanReference(type = com.sky.skyseries.apm.service.LegalEntityLocalService.class)
	protected com.sky.skyseries.apm.service.LegalEntityLocalService legalEntityLocalService;
	@BeanReference(type = LegalEntityPersistence.class)
	protected LegalEntityPersistence legalEntityPersistence;
	@BeanReference(type = com.sky.skyseries.apm.service.RoomLocalService.class)
	protected com.sky.skyseries.apm.service.RoomLocalService roomLocalService;
	@BeanReference(type = RoomPersistence.class)
	protected RoomPersistence roomPersistence;
	@BeanReference(type = com.sky.skyseries.apm.service.RoomRateLocalService.class)
	protected com.sky.skyseries.apm.service.RoomRateLocalService roomRateLocalService;
	@BeanReference(type = com.sky.skyseries.apm.service.RoomStatusLocalService.class)
	protected com.sky.skyseries.apm.service.RoomStatusLocalService roomStatusLocalService;
	@BeanReference(type = RoomStatusPersistence.class)
	protected RoomStatusPersistence roomStatusPersistence;
	@BeanReference(type = RoomTypeLocalService.class)
	protected RoomTypeLocalService roomTypeLocalService;
	@BeanReference(type = RoomTypePersistence.class)
	protected RoomTypePersistence roomTypePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}