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

package com.sky.skyseries.apm.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the LegalEntity service. Represents a row in the &quot;legal_entity&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LegalEntityModel
 * @see com.sky.skyseries.apm.model.impl.LegalEntityImpl
 * @see com.sky.skyseries.apm.model.impl.LegalEntityModelImpl
 * @generated
 */
@ImplementationClassName("com.sky.skyseries.apm.model.impl.LegalEntityImpl")
@ProviderType
public interface LegalEntity extends LegalEntityModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.sky.skyseries.apm.model.impl.LegalEntityImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<LegalEntity, Long> LEGAL_ENTITY_ID_ACCESSOR = new Accessor<LegalEntity, Long>() {
			@Override
			public Long get(LegalEntity legalEntity) {
				return legalEntity.getLegalEntityId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<LegalEntity> getTypeClass() {
				return LegalEntity.class;
			}
		};
}