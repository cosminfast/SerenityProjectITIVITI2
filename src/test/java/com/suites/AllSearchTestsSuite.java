package com.suites;


import com.fasttrackit.features.CartTest;
import com.fasttrackit.features.SearchTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SearchTest.class
        })
public class AllSearchTestsSuite {
}
