/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.forms.dynamic.client.rendering.renderers.selectors.listBox;

import java.util.Map;

import com.google.gwtmockito.GwtMockitoTestRunner;
import org.gwtbootstrap3.client.ui.ValueListBox;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.junit.runner.RunWith;
import org.kie.workbench.common.forms.common.rendering.client.widgets.util.DefaultValueListBoxRenderer;
import org.kie.workbench.common.forms.dynamic.service.shared.BackendSelectorDataProviderService;
import org.kie.workbench.common.forms.dynamic.service.shared.SelectorDataProviderManager;
import org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.DecimalSelectorOption;
import org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.DecimalListBoxFieldDefinition;
import org.uberfire.mocks.CallerMock;

@RunWith(GwtMockitoTestRunner.class)
public class DecimalListBoxFieldRendererTest extends AbstractListBoxFieldRendererTest<DecimalListBoxFieldRenderer, DecimalListBoxFieldDefinition, DecimalSelectorOption, Double> {

    @Override
    protected DecimalListBoxFieldRenderer getRenderer(final TranslationService translationService,
                                                      final SelectorDataProviderManager clientProviderManagerParam,
                                                      final CallerMock<BackendSelectorDataProviderService> backendSelectorDataProviderServiceParam,
                                                      final DefaultValueListBoxRenderer<Double> optionsRendererParam) {
        return new DecimalListBoxFieldRenderer(translationService) {
            {
                clientProviderManager = clientProviderManagerParam;
                backendSelectorDataProviderService = backendSelectorDataProviderServiceParam;
                optionsRenderer = optionsRendererParam;
            }

            @Override
            protected ValueListBox<Double> getListWidget() {
                return valueListBox;
            }
        };
    }

    @Override
    protected void fillOptions(Map<Double, String> options) {
        options.put(0.0,
                    "0.0");
        options.put(1.0,
                    "1.0");
        options.put(2.0,
                    "2.0");
        options.put(3.0,
                    "3.0");
    }
}
