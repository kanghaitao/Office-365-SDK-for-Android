/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.exchange.services.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.exchange.services.model.*;

public class ItemAttachmentCollectionOperations extends ODataOperations {

    public ItemAttachmentCollectionOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }
}
