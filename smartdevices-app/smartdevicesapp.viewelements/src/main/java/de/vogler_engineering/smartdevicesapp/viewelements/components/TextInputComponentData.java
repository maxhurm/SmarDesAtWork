/**
 * Copyright (c) Vogler Engineering GmbH. All rights reserved.
 * Licensed under the MIT License. See LICENSE.md in the project root for license information.
 */
package de.vogler_engineering.smartdevicesapp.viewelements.components;

import de.vogler_engineering.smartdevicesapp.model.entities.ui.UiComponent;
import de.vogler_engineering.smartdevicesapp.viewelements.components.base.ComponentData;
import de.vogler_engineering.smartdevicesapp.viewelements.components.base.ConfigurableViewModelFeatures;

/**
 * Created by vh on 23.03.2018.
 */

public class TextInputComponentData extends ComponentData<String> {

    public TextInputComponentData(UiComponent component, ConfigurableViewModelFeatures features) {
        super(component, features);
    }

    @Override
    public void setResourceValue(String s) {
        value.postValue(s);
    }

    @Override
    public String getResourceValue() {
        return value.getValue();
    }


}
