/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.completion;

import com.intellij.testFramework.TestDataPath;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/keywords")
@TestDataPath("$PROJECT_ROOT")
public class KeywordCompletionTestGenerated extends AbstractKeywordCompletionTest {
    @TestMetadata("AfterClassProperty.kt")
    public void testAfterClassProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/AfterClassProperty.kt");
        doTest(fileName);
    }
    
    @TestMetadata("AfterDot.kt")
    public void testAfterDot() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/AfterDot.kt");
        doTest(fileName);
    }
    
    @TestMetadata("AfterSpaceAndDot.kt")
    public void testAfterSpaceAndDot() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/AfterSpaceAndDot.kt");
        doTest(fileName);
    }
    
    public void testAllFilesPresentInKeywords() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/keywords"), Pattern.compile("^(.+)\\.kt$"), false);
    }
    
    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/classObject.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InBlockComment.kt")
    public void testInBlockComment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InBlockComment.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InChar.kt")
    public void testInChar() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InChar.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassBeforeFun.kt")
    public void testInClassBeforeFun() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InClassBeforeFun.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassNoCompletionInValName.kt")
    public void testInClassNoCompletionInValName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InClassNoCompletionInValName.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassProperty.kt")
    public void testInClassProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InClassProperty.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassScope.kt")
    public void testInClassScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InClassScope.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InClassTypeParameters.kt")
    public void testInClassTypeParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InClassTypeParameters.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunctionName.kt")
    public void testInFunctionName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InFunctionName.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunctionNoCompletionInValName.kt")
    public void testInFunctionNoCompletionInValName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InFunctionNoCompletionInValName.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunctionScope.kt")
    public void testInFunctionScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InFunctionScope.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InFunctionTypeReference.kt")
    public void testInFunctionTypeReference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InFunctionTypeReference.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InMethodParametersList.kt")
    public void testInMethodParametersList() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InMethodParametersList.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InModifierListInsideClass.kt")
    public void testInModifierListInsideClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InModifierListInsideClass.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InNotFinishedGenericWithFunAfter.kt")
    public void testInNotFinishedGenericWithFunAfter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InNotFinishedGenericWithFunAfter.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InParametersList.kt")
    public void testInParametersList() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InParametersList.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InPropertyTypeReference.kt")
    public void testInPropertyTypeReference() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InPropertyTypeReference.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InString.kt")
    public void testInString() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InString.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InTopNoCompletionInVarName.kt")
    public void testInTopNoCompletionInVarName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InTopNoCompletionInVarName.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InTopProperty.kt")
    public void testInTopProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InTopProperty.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InTopScopeAfterPackage.kt")
    public void testInTopScopeAfterPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InTopScopeAfterPackage.kt");
        doTest(fileName);
    }
    
    @TestMetadata("InTypeScope.kt")
    public void testInTypeScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/InTypeScope.kt");
        doTest(fileName);
    }
    
    @TestMetadata("LineComment.kt")
    public void testLineComment() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/LineComment.kt");
        doTest(fileName);
    }
    
    @TestMetadata("NoCompletionForCapitalPrefix.kt")
    public void testNoCompletionForCapitalPrefix() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/NoCompletionForCapitalPrefix.kt");
        doTest(fileName);
    }
    
    @TestMetadata("PropertySetterGetter.kt")
    public void testPropertySetterGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/PropertySetterGetter.kt");
        doTest(fileName);
    }
    
    @TestMetadata("TopScope.kt")
    public void testTopScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/keywords/TopScope.kt");
        doTest(fileName);
    }
    
}
