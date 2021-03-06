/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.jaxb.runtime.v2.model.annotation;

import org.glassfish.jaxb.core.v2.model.annotation.Locatable;
import jakarta.xml.bind.annotation.XmlElementDecl;

import java.lang.annotation.Annotation;


/**
 * <p><b>Auto-generated, do not edit.</b></p>
 * 
 */
final class XmlElementDeclQuick
    extends Quick
    implements XmlElementDecl
{

    private final XmlElementDecl core;

    public XmlElementDeclQuick(Locatable upstream, XmlElementDecl core) {
        super(upstream);
        this.core = core;
    }

    protected Annotation getAnnotation() {
        return core;
    }

    protected Quick newInstance(Locatable upstream, Annotation core) {
        return new XmlElementDeclQuick(upstream, ((XmlElementDecl) core));
    }

    public Class<XmlElementDecl> annotationType() {
        return XmlElementDecl.class;
    }

    public String name() {
        return core.name();
    }

    public Class scope() {
        return core.scope();
    }

    public String namespace() {
        return core.namespace();
    }

    public String defaultValue() {
        return core.defaultValue();
    }

    public String substitutionHeadNamespace() {
        return core.substitutionHeadNamespace();
    }

    public String substitutionHeadName() {
        return core.substitutionHeadName();
    }

}
