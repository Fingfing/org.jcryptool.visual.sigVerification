//-----BEGIN DISCLAIMER-----
/*******************************************************************************
* Copyright (c) 2013 JCrypTool Team and Contributors
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
//-----END DISCLAIMER-----
package org.jcryptool.visual.sigVerification.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

/**
 * This class contains the page containing the file input composite. It is a part of the Input wizard.
 * 
 * @author Grebe
 */
public class InputKeyFileWizardPage extends WizardPage {
    private InputKeyFileComposite compositeFile;

    public InputKeyFileWizardPage(String pageName) {
        super(pageName);

        setTitle(Messages.InputKeyFileWizard_title);
        setDescription(Messages.InputKeyFileWizard_header);
    }

    public void createControl(Composite parent) {
        setPageComplete(false);
        compositeFile = new InputKeyFileComposite(parent, NONE, this);
        setControl(compositeFile);
    }

    /**
     * @return the compositeFile
     */
    public InputKeyFileComposite getCompositeFile() {
        return compositeFile;
    }
}