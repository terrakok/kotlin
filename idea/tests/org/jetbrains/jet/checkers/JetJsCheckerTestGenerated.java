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

package org.jetbrains.jet.checkers;

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
@TestMetadata("idea/testData/checker/js")
@TestDataPath("$PROJECT_ROOT")
public class JetJsCheckerTestGenerated extends AbstractJetJsCheckerTest {
    public void testAllFilesPresentInJs() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/checker/js"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("basic.kt")
    public void testBasic() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/checker/js/basic.kt");
        doTest(fileName);
    }
    
    @TestMetadata("helloWorld.kt")
    public void testHelloWorld() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/checker/js/helloWorld.kt");
        doTest(fileName);
    }
    
}
