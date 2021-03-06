/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2018, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.thymeleaf.extras.springsecurity4.auth;

import org.springframework.expression.EvaluationContext;
import org.thymeleaf.expression.IExpressionObjects;
import org.thymeleaf.spring5.expression.IThymeleafEvaluationContext;
import org.thymeleaf.spring5.expression.ThymeleafEvaluationContextWrapper;


/**
 * 
 * @author Daniel Fern&aacute;ndez
 *
 * @since 3.0.2
 *
 */
final class Spring5VersionSpecificUtility implements ISpringVersionSpecificUtility {




    Spring5VersionSpecificUtility() {
        super();
    }



    public EvaluationContext wrapEvaluationContext(
            final EvaluationContext evaluationContext, final IExpressionObjects expresionObjects) {
        final IThymeleafEvaluationContext thymeleafEvaluationContext = new ThymeleafEvaluationContextWrapper(evaluationContext);
        thymeleafEvaluationContext.setExpressionObjects(expresionObjects);
        return thymeleafEvaluationContext;
    }


}
