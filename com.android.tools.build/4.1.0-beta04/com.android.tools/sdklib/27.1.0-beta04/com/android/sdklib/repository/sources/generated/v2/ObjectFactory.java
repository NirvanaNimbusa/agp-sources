
package com.android.sdklib.repository.sources.generated.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.android.repository.api.RemoteSource;


/**
 * DO NOT EDIT
 * This file was generated by xjc from sdk-sites-list-2.xsd. Any changes will be lost upon recompilation of the schema.
 * See the schema file for instructions on running xjc.
 *
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.android.sdklib.repository.sources.generated.v2 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
@SuppressWarnings("override")
public class ObjectFactory {

    private final static QName _SdkAddonsList_QNAME = new QName("http://schemas.android.com/sdk/android/addons-list/2", "sdk-addons-list");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.android.sdklib.repository.sources.generated.v2
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddonsListType }
     *
     */
    public com.android.repository.impl.sources.RemoteListSourceProviderImpl.SiteList createAddonsListType() {
        return new AddonsListType();
    }

    /**
     * Create an instance of {@link AddonSiteType }
     *
     */
    public RemoteSource createAddonSiteType() {
        return new AddonSiteType();
    }

    /**
     * Create an instance of {@link SysImgSiteType }
     *
     */
    public RemoteSource createSysImgSiteType() {
        return new SysImgSiteType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddonsListType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://schemas.android.com/sdk/android/addons-list/2", name = "sdk-addons-list")
    public JAXBElement<AddonsListType> createSdkAddonsList(AddonsListType value) {
        return new JAXBElement<AddonsListType>(_SdkAddonsList_QNAME, AddonsListType.class, null, value);
    }

    public JAXBElement<com.android.repository.impl.sources.RemoteListSourceProviderImpl.SiteList> generateElement(com.android.repository.impl.sources.RemoteListSourceProviderImpl.SiteList value) {
        return ((JAXBElement) createSdkAddonsList(((AddonsListType) value)));
    }

}
