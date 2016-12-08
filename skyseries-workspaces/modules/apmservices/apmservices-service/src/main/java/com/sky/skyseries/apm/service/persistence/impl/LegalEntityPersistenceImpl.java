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

package com.sky.skyseries.apm.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.sky.skyseries.apm.exception.NoSuchLegalEntityException;
import com.sky.skyseries.apm.model.LegalEntity;
import com.sky.skyseries.apm.model.impl.LegalEntityImpl;
import com.sky.skyseries.apm.model.impl.LegalEntityModelImpl;
import com.sky.skyseries.apm.service.persistence.LegalEntityPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the legal entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntityPersistence
 * @see com.sky.skyseries.apm.service.persistence.LegalEntityUtil
 * @generated
 */
@ProviderType
public class LegalEntityPersistenceImpl extends BasePersistenceImpl<LegalEntity>
	implements LegalEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LegalEntityUtil} to access the legal entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LegalEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			LegalEntityModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the legal entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the legal entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @return the range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the legal entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid(String uuid, int start, int end,
		OrderByComparator<LegalEntity> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the legal entities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid(String uuid, int start, int end,
		OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<LegalEntity> list = null;

		if (retrieveFromCache) {
			list = (List<LegalEntity>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LegalEntity legalEntity : list) {
					if (!Objects.equals(uuid, legalEntity.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LegalEntityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first legal entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal entity
	 * @throws NoSuchLegalEntityException if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity findByUuid_First(String uuid,
		OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByUuid_First(uuid, orderByComparator);

		if (legalEntity != null) {
			return legalEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLegalEntityException(msg.toString());
	}

	/**
	 * Returns the first legal entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUuid_First(String uuid,
		OrderByComparator<LegalEntity> orderByComparator) {
		List<LegalEntity> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last legal entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal entity
	 * @throws NoSuchLegalEntityException if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity findByUuid_Last(String uuid,
		OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByUuid_Last(uuid, orderByComparator);

		if (legalEntity != null) {
			return legalEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLegalEntityException(msg.toString());
	}

	/**
	 * Returns the last legal entity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUuid_Last(String uuid,
		OrderByComparator<LegalEntity> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LegalEntity> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the legal entities before and after the current legal entity in the ordered set where uuid = &#63;.
	 *
	 * @param legalEntityId the primary key of the current legal entity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next legal entity
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity[] findByUuid_PrevAndNext(long legalEntityId,
		String uuid, OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = findByPrimaryKey(legalEntityId);

		Session session = null;

		try {
			session = openSession();

			LegalEntity[] array = new LegalEntityImpl[3];

			array[0] = getByUuid_PrevAndNext(session, legalEntity, uuid,
					orderByComparator, true);

			array[1] = legalEntity;

			array[2] = getByUuid_PrevAndNext(session, legalEntity, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LegalEntity getByUuid_PrevAndNext(Session session,
		LegalEntity legalEntity, String uuid,
		OrderByComparator<LegalEntity> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LEGALENTITY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LegalEntityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(legalEntity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LegalEntity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the legal entities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LegalEntity legalEntity : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(legalEntity);
		}
	}

	/**
	 * Returns the number of legal entities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching legal entities
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "legalEntity.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "legalEntity.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(legalEntity.uuid IS NULL OR legalEntity.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			LegalEntityModelImpl.UUID_COLUMN_BITMASK |
			LegalEntityModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the legal entity where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLegalEntityException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching legal entity
	 * @throws NoSuchLegalEntityException if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity findByUUID_G(String uuid, long groupId)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByUUID_G(uuid, groupId);

		if (legalEntity == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLegalEntityException(msg.toString());
		}

		return legalEntity;
	}

	/**
	 * Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the legal entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof LegalEntity) {
			LegalEntity legalEntity = (LegalEntity)result;

			if (!Objects.equals(uuid, legalEntity.getUuid()) ||
					(groupId != legalEntity.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<LegalEntity> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					LegalEntity legalEntity = list.get(0);

					result = legalEntity;

					cacheResult(legalEntity);

					if ((legalEntity.getUuid() == null) ||
							!legalEntity.getUuid().equals(uuid) ||
							(legalEntity.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, legalEntity);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (LegalEntity)result;
		}
	}

	/**
	 * Removes the legal entity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the legal entity that was removed
	 */
	@Override
	public LegalEntity removeByUUID_G(String uuid, long groupId)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = findByUUID_G(uuid, groupId);

		return remove(legalEntity);
	}

	/**
	 * Returns the number of legal entities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching legal entities
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "legalEntity.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "legalEntity.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(legalEntity.uuid IS NULL OR legalEntity.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "legalEntity.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, LegalEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			LegalEntityModelImpl.UUID_COLUMN_BITMASK |
			LegalEntityModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the legal entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the legal entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @return the range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the legal entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<LegalEntity> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the legal entities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching legal entities
	 */
	@Override
	public List<LegalEntity> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<LegalEntity> list = null;

		if (retrieveFromCache) {
			list = (List<LegalEntity>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LegalEntity legalEntity : list) {
					if (!Objects.equals(uuid, legalEntity.getUuid()) ||
							(companyId != legalEntity.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LegalEntityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal entity
	 * @throws NoSuchLegalEntityException if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (legalEntity != null) {
			return legalEntity;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLegalEntityException(msg.toString());
	}

	/**
	 * Returns the first legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator) {
		List<LegalEntity> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal entity
	 * @throws NoSuchLegalEntityException if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (legalEntity != null) {
			return legalEntity;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLegalEntityException(msg.toString());
	}

	/**
	 * Returns the last legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching legal entity, or <code>null</code> if a matching legal entity could not be found
	 */
	@Override
	public LegalEntity fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LegalEntity> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the legal entities before and after the current legal entity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param legalEntityId the primary key of the current legal entity
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next legal entity
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity[] findByUuid_C_PrevAndNext(long legalEntityId,
		String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = findByPrimaryKey(legalEntityId);

		Session session = null;

		try {
			session = openSession();

			LegalEntity[] array = new LegalEntityImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, legalEntity, uuid,
					companyId, orderByComparator, true);

			array[1] = legalEntity;

			array[2] = getByUuid_C_PrevAndNext(session, legalEntity, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LegalEntity getByUuid_C_PrevAndNext(Session session,
		LegalEntity legalEntity, String uuid, long companyId,
		OrderByComparator<LegalEntity> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_LEGALENTITY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LegalEntityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(legalEntity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LegalEntity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the legal entities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LegalEntity legalEntity : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(legalEntity);
		}
	}

	/**
	 * Returns the number of legal entities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching legal entities
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LEGALENTITY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "legalEntity.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "legalEntity.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(legalEntity.uuid IS NULL OR legalEntity.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "legalEntity.companyId = ?";

	public LegalEntityPersistenceImpl() {
		setModelClass(LegalEntity.class);
	}

	/**
	 * Caches the legal entity in the entity cache if it is enabled.
	 *
	 * @param legalEntity the legal entity
	 */
	@Override
	public void cacheResult(LegalEntity legalEntity) {
		entityCache.putResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityImpl.class, legalEntity.getPrimaryKey(), legalEntity);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { legalEntity.getUuid(), legalEntity.getGroupId() },
			legalEntity);

		legalEntity.resetOriginalValues();
	}

	/**
	 * Caches the legal entities in the entity cache if it is enabled.
	 *
	 * @param legalEntities the legal entities
	 */
	@Override
	public void cacheResult(List<LegalEntity> legalEntities) {
		for (LegalEntity legalEntity : legalEntities) {
			if (entityCache.getResult(
						LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
						LegalEntityImpl.class, legalEntity.getPrimaryKey()) == null) {
				cacheResult(legalEntity);
			}
			else {
				legalEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all legal entities.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LegalEntityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the legal entity.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LegalEntity legalEntity) {
		entityCache.removeResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityImpl.class, legalEntity.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LegalEntityModelImpl)legalEntity);
	}

	@Override
	public void clearCache(List<LegalEntity> legalEntities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LegalEntity legalEntity : legalEntities) {
			entityCache.removeResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
				LegalEntityImpl.class, legalEntity.getPrimaryKey());

			clearUniqueFindersCache((LegalEntityModelImpl)legalEntity);
		}
	}

	protected void cacheUniqueFindersCache(
		LegalEntityModelImpl legalEntityModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					legalEntityModelImpl.getUuid(),
					legalEntityModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				legalEntityModelImpl);
		}
		else {
			if ((legalEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						legalEntityModelImpl.getUuid(),
						legalEntityModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					legalEntityModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		LegalEntityModelImpl legalEntityModelImpl) {
		Object[] args = new Object[] {
				legalEntityModelImpl.getUuid(),
				legalEntityModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((legalEntityModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					legalEntityModelImpl.getOriginalUuid(),
					legalEntityModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new legal entity with the primary key. Does not add the legal entity to the database.
	 *
	 * @param legalEntityId the primary key for the new legal entity
	 * @return the new legal entity
	 */
	@Override
	public LegalEntity create(long legalEntityId) {
		LegalEntity legalEntity = new LegalEntityImpl();

		legalEntity.setNew(true);
		legalEntity.setPrimaryKey(legalEntityId);

		String uuid = PortalUUIDUtil.generate();

		legalEntity.setUuid(uuid);

		legalEntity.setCompanyId(companyProvider.getCompanyId());

		return legalEntity;
	}

	/**
	 * Removes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param legalEntityId the primary key of the legal entity
	 * @return the legal entity that was removed
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity remove(long legalEntityId)
		throws NoSuchLegalEntityException {
		return remove((Serializable)legalEntityId);
	}

	/**
	 * Removes the legal entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the legal entity
	 * @return the legal entity that was removed
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity remove(Serializable primaryKey)
		throws NoSuchLegalEntityException {
		Session session = null;

		try {
			session = openSession();

			LegalEntity legalEntity = (LegalEntity)session.get(LegalEntityImpl.class,
					primaryKey);

			if (legalEntity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLegalEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(legalEntity);
		}
		catch (NoSuchLegalEntityException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LegalEntity removeImpl(LegalEntity legalEntity) {
		legalEntity = toUnwrappedModel(legalEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(legalEntity)) {
				legalEntity = (LegalEntity)session.get(LegalEntityImpl.class,
						legalEntity.getPrimaryKeyObj());
			}

			if (legalEntity != null) {
				session.delete(legalEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (legalEntity != null) {
			clearCache(legalEntity);
		}

		return legalEntity;
	}

	@Override
	public LegalEntity updateImpl(LegalEntity legalEntity) {
		legalEntity = toUnwrappedModel(legalEntity);

		boolean isNew = legalEntity.isNew();

		LegalEntityModelImpl legalEntityModelImpl = (LegalEntityModelImpl)legalEntity;

		if (Validator.isNull(legalEntity.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			legalEntity.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (legalEntity.getCreateDate() == null)) {
			if (serviceContext == null) {
				legalEntity.setCreateDate(now);
			}
			else {
				legalEntity.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!legalEntityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				legalEntity.setModifiedDate(now);
			}
			else {
				legalEntity.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (legalEntity.isNew()) {
				session.save(legalEntity);

				legalEntity.setNew(false);
			}
			else {
				legalEntity = (LegalEntity)session.merge(legalEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LegalEntityModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((legalEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						legalEntityModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { legalEntityModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((legalEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						legalEntityModelImpl.getOriginalUuid(),
						legalEntityModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						legalEntityModelImpl.getUuid(),
						legalEntityModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
			LegalEntityImpl.class, legalEntity.getPrimaryKey(), legalEntity,
			false);

		clearUniqueFindersCache(legalEntityModelImpl);
		cacheUniqueFindersCache(legalEntityModelImpl, isNew);

		legalEntity.resetOriginalValues();

		return legalEntity;
	}

	protected LegalEntity toUnwrappedModel(LegalEntity legalEntity) {
		if (legalEntity instanceof LegalEntityImpl) {
			return legalEntity;
		}

		LegalEntityImpl legalEntityImpl = new LegalEntityImpl();

		legalEntityImpl.setNew(legalEntity.isNew());
		legalEntityImpl.setPrimaryKey(legalEntity.getPrimaryKey());

		legalEntityImpl.setUuid(legalEntity.getUuid());
		legalEntityImpl.setLegalEntityId(legalEntity.getLegalEntityId());
		legalEntityImpl.setGroupId(legalEntity.getGroupId());
		legalEntityImpl.setCompanyId(legalEntity.getCompanyId());
		legalEntityImpl.setUserId(legalEntity.getUserId());
		legalEntityImpl.setUserName(legalEntity.getUserName());
		legalEntityImpl.setCreateDate(legalEntity.getCreateDate());
		legalEntityImpl.setModifiedDate(legalEntity.getModifiedDate());
		legalEntityImpl.setName(legalEntity.getName());

		return legalEntityImpl;
	}

	/**
	 * Returns the legal entity with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the legal entity
	 * @return the legal entity
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLegalEntityException {
		LegalEntity legalEntity = fetchByPrimaryKey(primaryKey);

		if (legalEntity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLegalEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return legalEntity;
	}

	/**
	 * Returns the legal entity with the primary key or throws a {@link NoSuchLegalEntityException} if it could not be found.
	 *
	 * @param legalEntityId the primary key of the legal entity
	 * @return the legal entity
	 * @throws NoSuchLegalEntityException if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity findByPrimaryKey(long legalEntityId)
		throws NoSuchLegalEntityException {
		return findByPrimaryKey((Serializable)legalEntityId);
	}

	/**
	 * Returns the legal entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the legal entity
	 * @return the legal entity, or <code>null</code> if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
				LegalEntityImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LegalEntity legalEntity = (LegalEntity)serializable;

		if (legalEntity == null) {
			Session session = null;

			try {
				session = openSession();

				legalEntity = (LegalEntity)session.get(LegalEntityImpl.class,
						primaryKey);

				if (legalEntity != null) {
					cacheResult(legalEntity);
				}
				else {
					entityCache.putResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
						LegalEntityImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
					LegalEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return legalEntity;
	}

	/**
	 * Returns the legal entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param legalEntityId the primary key of the legal entity
	 * @return the legal entity, or <code>null</code> if a legal entity with the primary key could not be found
	 */
	@Override
	public LegalEntity fetchByPrimaryKey(long legalEntityId) {
		return fetchByPrimaryKey((Serializable)legalEntityId);
	}

	@Override
	public Map<Serializable, LegalEntity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LegalEntity> map = new HashMap<Serializable, LegalEntity>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LegalEntity legalEntity = fetchByPrimaryKey(primaryKey);

			if (legalEntity != null) {
				map.put(primaryKey, legalEntity);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
					LegalEntityImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LegalEntity)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LEGALENTITY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (LegalEntity legalEntity : (List<LegalEntity>)q.list()) {
				map.put(legalEntity.getPrimaryKeyObj(), legalEntity);

				cacheResult(legalEntity);

				uncachedPrimaryKeys.remove(legalEntity.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LegalEntityModelImpl.ENTITY_CACHE_ENABLED,
					LegalEntityImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the legal entities.
	 *
	 * @return the legal entities
	 */
	@Override
	public List<LegalEntity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the legal entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @return the range of legal entities
	 */
	@Override
	public List<LegalEntity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the legal entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of legal entities
	 */
	@Override
	public List<LegalEntity> findAll(int start, int end,
		OrderByComparator<LegalEntity> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the legal entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LegalEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of legal entities
	 * @param end the upper bound of the range of legal entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of legal entities
	 */
	@Override
	public List<LegalEntity> findAll(int start, int end,
		OrderByComparator<LegalEntity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<LegalEntity> list = null;

		if (retrieveFromCache) {
			list = (List<LegalEntity>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LEGALENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LEGALENTITY;

				if (pagination) {
					sql = sql.concat(LegalEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LegalEntity>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the legal entities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LegalEntity legalEntity : findAll()) {
			remove(legalEntity);
		}
	}

	/**
	 * Returns the number of legal entities.
	 *
	 * @return the number of legal entities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LEGALENTITY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LegalEntityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the legal entity persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LegalEntityImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LEGALENTITY = "SELECT legalEntity FROM LegalEntity legalEntity";
	private static final String _SQL_SELECT_LEGALENTITY_WHERE_PKS_IN = "SELECT legalEntity FROM LegalEntity legalEntity WHERE legalEntityId IN (";
	private static final String _SQL_SELECT_LEGALENTITY_WHERE = "SELECT legalEntity FROM LegalEntity legalEntity WHERE ";
	private static final String _SQL_COUNT_LEGALENTITY = "SELECT COUNT(legalEntity) FROM LegalEntity legalEntity";
	private static final String _SQL_COUNT_LEGALENTITY_WHERE = "SELECT COUNT(legalEntity) FROM LegalEntity legalEntity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "legalEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LegalEntity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LegalEntity exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LegalEntityPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}