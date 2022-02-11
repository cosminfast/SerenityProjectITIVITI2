package com.suites;


import com.fasttrackit.features.CompareTest;
import com.fasttrackit.features.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CompareTest.class,
        })
public class AllCompareTestsSuite {
}
