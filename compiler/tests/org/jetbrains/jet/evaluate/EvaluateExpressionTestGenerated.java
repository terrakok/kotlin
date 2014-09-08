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

package org.jetbrains.jet.evaluate;

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
@InnerTestClasses({EvaluateExpressionTestGenerated.Constant.class, EvaluateExpressionTestGenerated.IsPure.class, EvaluateExpressionTestGenerated.UsesVariableAsConstant.class})
public class EvaluateExpressionTestGenerated extends AbstractEvaluateExpressionTest {
    @TestMetadata("compiler/testData/evaluate/constant")
    @TestDataPath("$PROJECT_ROOT")
    public static class Constant extends AbstractEvaluateExpressionTest {
        public void testAllFilesPresentInConstant() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/constant"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("classObjectProperty.kt")
        public void testClassObjectProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/classObjectProperty.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("compareTo.kt")
        public void testCompareTo() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/compareTo.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("differentTypes.kt")
        public void testDifferentTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/differentTypes.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("divideByZero.kt")
        public void testDivideByZero() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/divideByZero.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("equals.kt")
        public void testEquals() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/equals.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("exceptionWhenEvaluate.kt")
        public void testExceptionWhenEvaluate() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/exceptionWhenEvaluate.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("finalProperty.kt")
        public void testFinalProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/finalProperty.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("float.kt")
        public void testFloat() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/float.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("floatsAndDoubles.kt")
        public void testFloatsAndDoubles() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/floatsAndDoubles.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("integer.kt")
        public void testInteger() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/integer.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("integers.kt")
        public void testIntegers() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/integers.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("localVal.kt")
        public void testLocalVal() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/localVal.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("localVar.kt")
        public void testLocalVar() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/localVar.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("nonFinalProperty.kt")
        public void testNonFinalProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/nonFinalProperty.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("strings.kt")
        public void testStrings() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/strings.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("topLevelVal.kt")
        public void testTopLevelVal() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/topLevelVal.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("topLevelVar.kt")
        public void testTopLevelVar() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/topLevelVar.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/unaryMinusIndepWoExpType.kt");
            doConstantTest(fileName);
        }
        
        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/constant/unaryMinusIndependentExpType.kt");
            doConstantTest(fileName);
        }
        
    }
    
    @TestMetadata("compiler/testData/evaluate/isPure")
    @TestDataPath("$PROJECT_ROOT")
    public static class IsPure extends AbstractEvaluateExpressionTest {
        public void testAllFilesPresentInIsPure() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/isPure"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("innerToType.kt")
        public void testInnerToType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/innerToType.kt");
            doIsPureTest(fileName);
        }
        
        @TestMetadata("namedConstants.kt")
        public void testNamedConstants() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/namedConstants.kt");
            doIsPureTest(fileName);
        }
        
        @TestMetadata("toType.kt")
        public void testToType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/toType.kt");
            doIsPureTest(fileName);
        }
        
        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/unaryMinusIndepWoExpType.kt");
            doIsPureTest(fileName);
        }
        
        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/unaryMinusIndependentExpType.kt");
            doIsPureTest(fileName);
        }
        
    }
    
    @TestMetadata("compiler/testData/evaluate/usesVariableAsConstant")
    @TestDataPath("$PROJECT_ROOT")
    public static class UsesVariableAsConstant extends AbstractEvaluateExpressionTest {
        public void testAllFilesPresentInUsesVariableAsConstant() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/usesVariableAsConstant"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("binaryTypes.kt")
        public void testBinaryTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/binaryTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }
        
        @TestMetadata("NamedConstants.kt")
        public void testNamedConstants() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/NamedConstants.kt");
            doUsesVariableAsConstantTest(fileName);
        }
        
        @TestMetadata("OtherTypes.kt")
        public void testOtherTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/OtherTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }
        
        @TestMetadata("simpleTypes.kt")
        public void testSimpleTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/simpleTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("EvaluateExpressionTestGenerated");
        suite.addTestSuite(Constant.class);
        suite.addTestSuite(IsPure.class);
        suite.addTestSuite(UsesVariableAsConstant.class);
        return suite;
    }
}
