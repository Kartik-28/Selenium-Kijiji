package com.fdmgroup.testScript;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	AddPostTest.class,
	SearchPostTest.class,
	DeletePostTest.class
})
public class TestRunner {

}
