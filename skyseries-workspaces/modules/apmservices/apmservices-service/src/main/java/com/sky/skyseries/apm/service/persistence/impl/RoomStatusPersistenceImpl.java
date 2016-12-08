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

import com.sky.skyseries.apm.exception.NoSuchRoomStatusException;
import com.sky.skyseries.apm.model.RoomStatus;
import com.sky.skyseries.apm.model.impl.RoomStatusImpl;
import com.sky.skyseries.apm.model.impl.RoomStatusModelImpl;
import com.sky.skyseries.apm.service.persistence.RoomStatusPersistence;

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
 * The persistence implementation for the room status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomStatusPersistence
 * @see com.sky.skyseries.apm.service.persistence.RoomStatusUtil
 * @generated
 */
@ProviderType
public class RoomStatusPersistenceImpl extends BasePersistenceImpl<RoomStatus>
	implements RoomStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RoomStatusUtil} to access the room status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RoomStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			RoomStatusModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the room statuses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the room statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @return the range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the room statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid(String uuid, int start, int end,
		OrderByComparator<RoomStatus> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the room statuses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid(String uuid, int start, int end,
		OrderByComparator<RoomStatus> orderByComparator,
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

		List<RoomStatus> list = null;

		if (retrieveFromCache) {
			list = (List<RoomStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RoomStatus roomStatus : list) {
					if (!Objects.equals(uuid, roomStatus.getUuid())) {
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

			query.append(_SQL_SELECT_ROOMSTATUS_WHERE);

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
				query.append(RoomStatusModelImpl.ORDER_BY_JPQL);
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
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first room status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room status
	 * @throws NoSuchRoomStatusException if a matching room status could not be found
	 */
	@Override
	public RoomStatus findByUuid_First(String uuid,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByUuid_First(uuid, orderByComparator);

		if (roomStatus != null) {
			return roomStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRoomStatusException(msg.toString());
	}

	/**
	 * Returns the first room status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUuid_First(String uuid,
		OrderByComparator<RoomStatus> orderByComparator) {
		List<RoomStatus> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last room status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room status
	 * @throws NoSuchRoomStatusException if a matching room status could not be found
	 */
	@Override
	public RoomStatus findByUuid_Last(String uuid,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByUuid_Last(uuid, orderByComparator);

		if (roomStatus != null) {
			return roomStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRoomStatusException(msg.toString());
	}

	/**
	 * Returns the last room status in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUuid_Last(String uuid,
		OrderByComparator<RoomStatus> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<RoomStatus> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the room statuses before and after the current room status in the ordered set where uuid = &#63;.
	 *
	 * @param roomStatusId the primary key of the current room status
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room status
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus[] findByUuid_PrevAndNext(long roomStatusId, String uuid,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = findByPrimaryKey(roomStatusId);

		Session session = null;

		try {
			session = openSession();

			RoomStatus[] array = new RoomStatusImpl[3];

			array[0] = getByUuid_PrevAndNext(session, roomStatus, uuid,
					orderByComparator, true);

			array[1] = roomStatus;

			array[2] = getByUuid_PrevAndNext(session, roomStatus, uuid,
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

	protected RoomStatus getByUuid_PrevAndNext(Session session,
		RoomStatus roomStatus, String uuid,
		OrderByComparator<RoomStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ROOMSTATUS_WHERE);

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
			query.append(RoomStatusModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(roomStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RoomStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the room statuses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (RoomStatus roomStatus : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(roomStatus);
		}
	}

	/**
	 * Returns the number of room statuses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching room statuses
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ROOMSTATUS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "roomStatus.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "roomStatus.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(roomStatus.uuid IS NULL OR roomStatus.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			RoomStatusModelImpl.UUID_COLUMN_BITMASK |
			RoomStatusModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the room status where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchRoomStatusException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room status
	 * @throws NoSuchRoomStatusException if a matching room status could not be found
	 */
	@Override
	public RoomStatus findByUUID_G(String uuid, long groupId)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByUUID_G(uuid, groupId);

		if (roomStatus == null) {
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

			throw new NoSuchRoomStatusException(msg.toString());
		}

		return roomStatus;
	}

	/**
	 * Returns the room status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the room status where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof RoomStatus) {
			RoomStatus roomStatus = (RoomStatus)result;

			if (!Objects.equals(uuid, roomStatus.getUuid()) ||
					(groupId != roomStatus.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ROOMSTATUS_WHERE);

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

				List<RoomStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					RoomStatus roomStatus = list.get(0);

					result = roomStatus;

					cacheResult(roomStatus);

					if ((roomStatus.getUuid() == null) ||
							!roomStatus.getUuid().equals(uuid) ||
							(roomStatus.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, roomStatus);
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
			return (RoomStatus)result;
		}
	}

	/**
	 * Removes the room status where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room status that was removed
	 */
	@Override
	public RoomStatus removeByUUID_G(String uuid, long groupId)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = findByUUID_G(uuid, groupId);

		return remove(roomStatus);
	}

	/**
	 * Returns the number of room statuses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching room statuses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ROOMSTATUS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "roomStatus.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "roomStatus.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(roomStatus.uuid IS NULL OR roomStatus.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "roomStatus.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, RoomStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			RoomStatusModelImpl.UUID_COLUMN_BITMASK |
			RoomStatusModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the room statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the room statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @return the range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the room statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<RoomStatus> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the room statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room statuses
	 */
	@Override
	public List<RoomStatus> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<RoomStatus> orderByComparator,
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

		List<RoomStatus> list = null;

		if (retrieveFromCache) {
			list = (List<RoomStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RoomStatus roomStatus : list) {
					if (!Objects.equals(uuid, roomStatus.getUuid()) ||
							(companyId != roomStatus.getCompanyId())) {
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

			query.append(_SQL_SELECT_ROOMSTATUS_WHERE);

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
				query.append(RoomStatusModelImpl.ORDER_BY_JPQL);
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
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first room status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room status
	 * @throws NoSuchRoomStatusException if a matching room status could not be found
	 */
	@Override
	public RoomStatus findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (roomStatus != null) {
			return roomStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRoomStatusException(msg.toString());
	}

	/**
	 * Returns the first room status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator) {
		List<RoomStatus> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last room status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room status
	 * @throws NoSuchRoomStatusException if a matching room status could not be found
	 */
	@Override
	public RoomStatus findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (roomStatus != null) {
			return roomStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRoomStatusException(msg.toString());
	}

	/**
	 * Returns the last room status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room status, or <code>null</code> if a matching room status could not be found
	 */
	@Override
	public RoomStatus fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<RoomStatus> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the room statuses before and after the current room status in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param roomStatusId the primary key of the current room status
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room status
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus[] findByUuid_C_PrevAndNext(long roomStatusId,
		String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = findByPrimaryKey(roomStatusId);

		Session session = null;

		try {
			session = openSession();

			RoomStatus[] array = new RoomStatusImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, roomStatus, uuid,
					companyId, orderByComparator, true);

			array[1] = roomStatus;

			array[2] = getByUuid_C_PrevAndNext(session, roomStatus, uuid,
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

	protected RoomStatus getByUuid_C_PrevAndNext(Session session,
		RoomStatus roomStatus, String uuid, long companyId,
		OrderByComparator<RoomStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ROOMSTATUS_WHERE);

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
			query.append(RoomStatusModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(roomStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RoomStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the room statuses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (RoomStatus roomStatus : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(roomStatus);
		}
	}

	/**
	 * Returns the number of room statuses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching room statuses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ROOMSTATUS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "roomStatus.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "roomStatus.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(roomStatus.uuid IS NULL OR roomStatus.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "roomStatus.companyId = ?";

	public RoomStatusPersistenceImpl() {
		setModelClass(RoomStatus.class);
	}

	/**
	 * Caches the room status in the entity cache if it is enabled.
	 *
	 * @param roomStatus the room status
	 */
	@Override
	public void cacheResult(RoomStatus roomStatus) {
		entityCache.putResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusImpl.class, roomStatus.getPrimaryKey(), roomStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { roomStatus.getUuid(), roomStatus.getGroupId() },
			roomStatus);

		roomStatus.resetOriginalValues();
	}

	/**
	 * Caches the room statuses in the entity cache if it is enabled.
	 *
	 * @param roomStatuses the room statuses
	 */
	@Override
	public void cacheResult(List<RoomStatus> roomStatuses) {
		for (RoomStatus roomStatus : roomStatuses) {
			if (entityCache.getResult(
						RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
						RoomStatusImpl.class, roomStatus.getPrimaryKey()) == null) {
				cacheResult(roomStatus);
			}
			else {
				roomStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all room statuses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RoomStatusImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the room status.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RoomStatus roomStatus) {
		entityCache.removeResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusImpl.class, roomStatus.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((RoomStatusModelImpl)roomStatus);
	}

	@Override
	public void clearCache(List<RoomStatus> roomStatuses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RoomStatus roomStatus : roomStatuses) {
			entityCache.removeResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
				RoomStatusImpl.class, roomStatus.getPrimaryKey());

			clearUniqueFindersCache((RoomStatusModelImpl)roomStatus);
		}
	}

	protected void cacheUniqueFindersCache(
		RoomStatusModelImpl roomStatusModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					roomStatusModelImpl.getUuid(),
					roomStatusModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				roomStatusModelImpl);
		}
		else {
			if ((roomStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						roomStatusModelImpl.getUuid(),
						roomStatusModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					roomStatusModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		RoomStatusModelImpl roomStatusModelImpl) {
		Object[] args = new Object[] {
				roomStatusModelImpl.getUuid(), roomStatusModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((roomStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					roomStatusModelImpl.getOriginalUuid(),
					roomStatusModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new room status with the primary key. Does not add the room status to the database.
	 *
	 * @param roomStatusId the primary key for the new room status
	 * @return the new room status
	 */
	@Override
	public RoomStatus create(long roomStatusId) {
		RoomStatus roomStatus = new RoomStatusImpl();

		roomStatus.setNew(true);
		roomStatus.setPrimaryKey(roomStatusId);

		String uuid = PortalUUIDUtil.generate();

		roomStatus.setUuid(uuid);

		roomStatus.setCompanyId(companyProvider.getCompanyId());

		return roomStatus;
	}

	/**
	 * Removes the room status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomStatusId the primary key of the room status
	 * @return the room status that was removed
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus remove(long roomStatusId)
		throws NoSuchRoomStatusException {
		return remove((Serializable)roomStatusId);
	}

	/**
	 * Removes the room status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the room status
	 * @return the room status that was removed
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus remove(Serializable primaryKey)
		throws NoSuchRoomStatusException {
		Session session = null;

		try {
			session = openSession();

			RoomStatus roomStatus = (RoomStatus)session.get(RoomStatusImpl.class,
					primaryKey);

			if (roomStatus == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRoomStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(roomStatus);
		}
		catch (NoSuchRoomStatusException nsee) {
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
	protected RoomStatus removeImpl(RoomStatus roomStatus) {
		roomStatus = toUnwrappedModel(roomStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(roomStatus)) {
				roomStatus = (RoomStatus)session.get(RoomStatusImpl.class,
						roomStatus.getPrimaryKeyObj());
			}

			if (roomStatus != null) {
				session.delete(roomStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (roomStatus != null) {
			clearCache(roomStatus);
		}

		return roomStatus;
	}

	@Override
	public RoomStatus updateImpl(RoomStatus roomStatus) {
		roomStatus = toUnwrappedModel(roomStatus);

		boolean isNew = roomStatus.isNew();

		RoomStatusModelImpl roomStatusModelImpl = (RoomStatusModelImpl)roomStatus;

		if (Validator.isNull(roomStatus.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			roomStatus.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (roomStatus.getCreateDate() == null)) {
			if (serviceContext == null) {
				roomStatus.setCreateDate(now);
			}
			else {
				roomStatus.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!roomStatusModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				roomStatus.setModifiedDate(now);
			}
			else {
				roomStatus.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (roomStatus.isNew()) {
				session.save(roomStatus);

				roomStatus.setNew(false);
			}
			else {
				roomStatus = (RoomStatus)session.merge(roomStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RoomStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((roomStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						roomStatusModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { roomStatusModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((roomStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						roomStatusModelImpl.getOriginalUuid(),
						roomStatusModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						roomStatusModelImpl.getUuid(),
						roomStatusModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
			RoomStatusImpl.class, roomStatus.getPrimaryKey(), roomStatus, false);

		clearUniqueFindersCache(roomStatusModelImpl);
		cacheUniqueFindersCache(roomStatusModelImpl, isNew);

		roomStatus.resetOriginalValues();

		return roomStatus;
	}

	protected RoomStatus toUnwrappedModel(RoomStatus roomStatus) {
		if (roomStatus instanceof RoomStatusImpl) {
			return roomStatus;
		}

		RoomStatusImpl roomStatusImpl = new RoomStatusImpl();

		roomStatusImpl.setNew(roomStatus.isNew());
		roomStatusImpl.setPrimaryKey(roomStatus.getPrimaryKey());

		roomStatusImpl.setUuid(roomStatus.getUuid());
		roomStatusImpl.setRoomStatusId(roomStatus.getRoomStatusId());
		roomStatusImpl.setGroupId(roomStatus.getGroupId());
		roomStatusImpl.setCompanyId(roomStatus.getCompanyId());
		roomStatusImpl.setUserId(roomStatus.getUserId());
		roomStatusImpl.setUserName(roomStatus.getUserName());
		roomStatusImpl.setCreateDate(roomStatus.getCreateDate());
		roomStatusImpl.setModifiedDate(roomStatus.getModifiedDate());
		roomStatusImpl.setCode(roomStatus.getCode());
		roomStatusImpl.setName(roomStatus.getName());

		return roomStatusImpl;
	}

	/**
	 * Returns the room status with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the room status
	 * @return the room status
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRoomStatusException {
		RoomStatus roomStatus = fetchByPrimaryKey(primaryKey);

		if (roomStatus == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRoomStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return roomStatus;
	}

	/**
	 * Returns the room status with the primary key or throws a {@link NoSuchRoomStatusException} if it could not be found.
	 *
	 * @param roomStatusId the primary key of the room status
	 * @return the room status
	 * @throws NoSuchRoomStatusException if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus findByPrimaryKey(long roomStatusId)
		throws NoSuchRoomStatusException {
		return findByPrimaryKey((Serializable)roomStatusId);
	}

	/**
	 * Returns the room status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the room status
	 * @return the room status, or <code>null</code> if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
				RoomStatusImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RoomStatus roomStatus = (RoomStatus)serializable;

		if (roomStatus == null) {
			Session session = null;

			try {
				session = openSession();

				roomStatus = (RoomStatus)session.get(RoomStatusImpl.class,
						primaryKey);

				if (roomStatus != null) {
					cacheResult(roomStatus);
				}
				else {
					entityCache.putResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
						RoomStatusImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
					RoomStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return roomStatus;
	}

	/**
	 * Returns the room status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomStatusId the primary key of the room status
	 * @return the room status, or <code>null</code> if a room status with the primary key could not be found
	 */
	@Override
	public RoomStatus fetchByPrimaryKey(long roomStatusId) {
		return fetchByPrimaryKey((Serializable)roomStatusId);
	}

	@Override
	public Map<Serializable, RoomStatus> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RoomStatus> map = new HashMap<Serializable, RoomStatus>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RoomStatus roomStatus = fetchByPrimaryKey(primaryKey);

			if (roomStatus != null) {
				map.put(primaryKey, roomStatus);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
					RoomStatusImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RoomStatus)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ROOMSTATUS_WHERE_PKS_IN);

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

			for (RoomStatus roomStatus : (List<RoomStatus>)q.list()) {
				map.put(roomStatus.getPrimaryKeyObj(), roomStatus);

				cacheResult(roomStatus);

				uncachedPrimaryKeys.remove(roomStatus.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RoomStatusModelImpl.ENTITY_CACHE_ENABLED,
					RoomStatusImpl.class, primaryKey, nullModel);
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
	 * Returns all the room statuses.
	 *
	 * @return the room statuses
	 */
	@Override
	public List<RoomStatus> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the room statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @return the range of room statuses
	 */
	@Override
	public List<RoomStatus> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the room statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of room statuses
	 */
	@Override
	public List<RoomStatus> findAll(int start, int end,
		OrderByComparator<RoomStatus> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the room statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RoomStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room statuses
	 * @param end the upper bound of the range of room statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of room statuses
	 */
	@Override
	public List<RoomStatus> findAll(int start, int end,
		OrderByComparator<RoomStatus> orderByComparator,
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

		List<RoomStatus> list = null;

		if (retrieveFromCache) {
			list = (List<RoomStatus>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ROOMSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROOMSTATUS;

				if (pagination) {
					sql = sql.concat(RoomStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RoomStatus>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the room statuses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RoomStatus roomStatus : findAll()) {
			remove(roomStatus);
		}
	}

	/**
	 * Returns the number of room statuses.
	 *
	 * @return the number of room statuses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ROOMSTATUS);

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
		return RoomStatusModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the room status persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RoomStatusImpl.class.getName());
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
	private static final String _SQL_SELECT_ROOMSTATUS = "SELECT roomStatus FROM RoomStatus roomStatus";
	private static final String _SQL_SELECT_ROOMSTATUS_WHERE_PKS_IN = "SELECT roomStatus FROM RoomStatus roomStatus WHERE roomStatusId IN (";
	private static final String _SQL_SELECT_ROOMSTATUS_WHERE = "SELECT roomStatus FROM RoomStatus roomStatus WHERE ";
	private static final String _SQL_COUNT_ROOMSTATUS = "SELECT COUNT(roomStatus) FROM RoomStatus roomStatus";
	private static final String _SQL_COUNT_ROOMSTATUS_WHERE = "SELECT COUNT(roomStatus) FROM RoomStatus roomStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "roomStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RoomStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RoomStatus exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(RoomStatusPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "code"
			});
}